package pom.shop_pages;

import generic.Verification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import java.util.List;

public class AllProductsPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//a[contains(@href, '/home')]/img") 
    private WebElement headerLogo;

    @FindBy(xpath = "//button[contains(@class, 'text-black')]/span[contains(text(),'My Account')]")
    private WebElement myAccountButton;

    @FindBy(xpath = "//button[contains(@class, 'text-black')]/span[contains(text(),'Search')]")
    private WebElement searchIcon;

    @FindBy(xpath = "//button[contains(@class, 'text-black')]/span[contains(text(),'Cart')]")
    private WebElement cartIcon;

    // ========================== SEARCH BAR ==========================

    @FindBy(xpath = "//input[@placeholder='Search Here']")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(@class, 'bg-red-500')]")
    private WebElement searchButton;

    // ========================== FILTERS ==========================

    @FindBy(xpath = "//p[contains(text(), 'Product Categories')]")
    private WebElement productCategoriesHeader;

    @FindBy(xpath = "//ul[contains(@class, 'mt-4 space-y-2')]/li")
    private List<WebElement> categoryList;

    @FindBy(xpath = "//p[contains(text(), 'Choose Price')]")
    private WebElement priceFilterHeader;

    @FindBy(xpath = "//button[contains(text(),'Filter')]")
    private WebElement priceFilterButton;

    // ========================== SORTING ==========================

    @FindBy(xpath = "//select[contains(@class, 'bg-black')]")
    private WebElement sortingDropdown;

    @FindBy(xpath = "//option[@value='priceLowToHigh']")
    private WebElement sortByPriceLowToHigh;

    @FindBy(xpath = "//option[@value='priceHighToLow']")
    private WebElement sortByPriceHighToLow;

    @FindBy(xpath = "//option[@value='latest']")
    private WebElement sortByLatest;

    // ========================== PRODUCT LIST ==========================

    @FindBy(xpath = "//div[contains(@class, 'grid')]/div")
    private List<WebElement> productCards;

    @FindBy(xpath = "//p[contains(@class, 'text-lg font-semibold')]")
    private List<WebElement> productNames;

    @FindBy(xpath = "//img[contains(@class, 'w-full h-64')]")
    private List<WebElement> productImages;

    @FindBy(xpath = "//p[contains(@class, 'text-gray-900') and contains(text(), '₹')]")
    private List<WebElement> productPrices;

    @FindBy(xpath = "//button[contains(text(),'Add to Cart')]")
    private List<WebElement> addToCartButtons;

    // ========================== PAGINATION ==========================

    @FindBy(xpath = "//button[contains(@class, 'text-black hover:text-red-500') and contains(., '‹')]")
    private WebElement prevPageButton;

    @FindBy(xpath = "//button[contains(@class, 'text-black hover:text-red-500') and contains(., '›')]")
    private WebElement nextPageButton;

    @FindBy(xpath = "//button[contains(@class, 'bg-red-500 text-white')]")
    private WebElement currentPageButton;

    // ========================== FOOTER ELEMENTS ==========================

    @FindBy(xpath = "//div[contains(@class, 'bg-orange-800')]/p[contains(., '© 2024')]")
    private WebElement footerText;

    @FindBy(xpath = "//a[contains(@href, '/privacy-policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//a[contains(@href, '/terms-and-conditions')]")
    private WebElement termsConditionsLink;

    @FindBy(xpath = "//a[contains(@href, '/return-policy')]")
    private WebElement returnPolicyLink;

    // ========================== CONSTRUCTOR ==========================

    public AllProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public boolean isLogoDisplayed() {
        return headerLogo.isDisplayed();
    }

    public void clickMyAccountButton() {
        myAccountButton.click();
    }

    public void openSearch() {
        searchIcon.click();
    }

    public void enterSearchText(String searchText) {
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void selectCategory(String categoryName) {
        for (WebElement category : categoryList) {
            if (category.getText().equalsIgnoreCase(categoryName)) {
                category.click();
                break;
            }
        }
    }

    public void applyPriceFilter() {
        priceFilterButton.click();
    }

    public void sortBy(String sortOption) {
        sortingDropdown.click();
        switch (sortOption.toLowerCase()) {
            case "low to high":
                sortByPriceLowToHigh.click();
                break;
            case "high to low":
                sortByPriceHighToLow.click();
                break;
            case "latest":
                sortByLatest.click();
                break;
            default:
                break;
        }
    }

    public void clickProductByName(String productName) {
        for (WebElement product : productNames) {
            if (product.getText().equalsIgnoreCase(productName)) {
                product.click();
                break;
            }
        }
    }

    public void addProductToCart(String productName) {
        for (int i = 0; i < productNames.size(); i++) {
            if (productNames.get(i).getText().equalsIgnoreCase(productName)) {
                addToCartButtons.get(i).click();
                break;
            }
        }
    }

    public void goToNextPage() {
        nextPageButton.click();
    }

    public void goToPreviousPage() {
        prevPageButton.click();
    }

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyProductExists(String productName, SoftAssert softAssert) {
        boolean productFound = false;
        for (WebElement product : productNames) {
            if (product.getText().equalsIgnoreCase(productName)) {
                productFound = true;
                break;
            }
        }

        softAssert.assertTrue(productFound, "❌ Product not found: " + productName);
        return productFound;
    }

    public boolean verifySuccessfulCartAddition(SoftAssert softAssert) {
        boolean successMessagePresent = verifyTextPresent("Product added to cart successfully!", softAssert);
        return successMessagePresent;
    }

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return super.verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return super.verifyUrl(expectedURL, softAssert);
    }

    public boolean verifyFooterLinks(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link is missing!");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms and Conditions link is missing!");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link is missing!");
        return true;
    }
}
