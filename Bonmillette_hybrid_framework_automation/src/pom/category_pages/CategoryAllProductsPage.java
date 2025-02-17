package pom.category_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class CategoryAllProductsPage extends Verification {

    // **Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//img[@alt='Logo']")
    private WebElement headerLogo;

    @FindBy(xpath = "//nav//a[@href='/home']")
    private WebElement homeLink;

    @FindBy(xpath = "//nav//a[@href='/shop']")
    private WebElement shopLink;

    @FindBy(xpath = "//nav//a[@href='/our-story']")
    private WebElement ourStoryLink;

    @FindBy(xpath = "//nav//a[@href='/all-blogs']")
    private WebElement blogLink;

    @FindBy(xpath = "//nav//a[@href='/contact-us']")
    private WebElement contactUsLink;

    @FindBy(xpath = "//button[contains(@class, 'text-black font-bold text-lg')]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//*[name()='svg'])[1]")
    private WebElement searchIcon;

    @FindBy(xpath = "(//*[name()='svg'])[2]")
    private WebElement cartIcon;

    // **Page Elements**
    @FindBy(xpath = "//h1[contains(@class, 'text-2xl font-bold')]")
    private WebElement categoryNameTitle;

    @FindBy(xpath = "//input[@placeholder='Search products...']")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(text(),'Sort by Name')]")
    private WebElement sortByNameButton;

    @FindBy(xpath = "//button[contains(text(),'Sort by Price')]")
    private WebElement sortByPriceButton;

    @FindBy(xpath = "//button[contains(text(),'Filter')]")
    private WebElement filterButton;

    @FindBy(xpath = "//ul[contains(@class, 'subcategories-list')]//li")
    private List<WebElement> subcategoryList;

    @FindBy(xpath = "//div[contains(@class,'grid')]/div")
    private List<WebElement> productList;

    @FindBy(xpath = "//button[contains(@class, 'bg-gradient-to-r') and contains(text(),'Add to Cart')]")
    private List<WebElement> addToCartButtons;

    @FindBy(xpath = "//span[contains(@class, 'text-gray-500')]")
    private WebElement productCountText;

    // **Footer Elements**
    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "//img[@alt='company logo']")
    private WebElement footerLogo;

    @FindBy(xpath = "//a[contains(@href, 'instagram.com')]")
    private WebElement instagramLink;

    @FindBy(xpath = "//a[contains(@href, 'linkedin.com')]")
    private WebElement linkedinLink;

    @FindBy(xpath = "//a[contains(@href, 'facebook.com')]")
    private WebElement facebookLink;

    @FindBy(xpath = "//a[contains(@href, 'twitter.com')]")
    private WebElement twitterLink;

    @FindBy(xpath = "//a[@href='/privacy-policy']")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//a[@href='/terms-and-conditions']")
    private WebElement termsAndConditionsLink;

    @FindBy(xpath = "//a[@href='/return-policy']")
    private WebElement returnPolicyLink;

    // **Constructor for Initialization**
    public CategoryAllProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // **Header Methods**
    public boolean isHeaderDisplayed() {
        return header.isDisplayed();
    }

    public void clickOnLogo() {
        headerLogo.click();
    }

    public void clickHomeLink() {
        homeLink.click();
    }

    public void clickShopLink() {
        shopLink.click();
    }

    public void clickOurStoryLink() {
        ourStoryLink.click();
    }

    public void clickBlogLink() {
        blogLink.click();
    }

    public void clickContactUsLink() {
        contactUsLink.click();
    }

    public void clickMyAccountButton() {
        myAccountButton.click();
    }

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    // **Page Methods**
    public String getCategoryTitle() {
        return categoryNameTitle.getText();
    }

    public boolean verifyCategoryTitle(SoftAssert softAssert, String expectedTitle) {
        return verifyTextPresent(categoryNameTitle.getText(), softAssert);
    }

    public void enterSearchText(String productName) {
        searchField.clear();
        searchField.sendKeys(productName);
    }

    public void clickSortByName() {
        sortByNameButton.click();
    }

    public void clickSortByPrice() {
        sortByPriceButton.click();
    }

    public void clickFilter() {
        filterButton.click();
    }

    public void clickOnSubcategory(int index) {
        subcategoryList.get(index).click();
    }

    public void clickOnProduct(int index) {
        productList.get(index).click();
    }

    public void addToCart(int index) {
        addToCartButtons.get(index).click();
    }

    public String getProductCount() {
        return productCountText.getText();
    }

    // **Footer Methods**
    public boolean isFooterDisplayed() {
        return footer.isDisplayed();
    }

    public void clickInstagramLink() {
        instagramLink.click();
    }

    public void clickFacebookLink() {
        facebookLink.click();
    }

    public void clickLinkedInLink() {
        linkedinLink.click();
    }

    public void clickTwitterLink() {
        twitterLink.click();
    }

    public void clickPrivacyPolicyLink() {
        privacyPolicyLink.click();
    }

    public void clickTermsAndConditionsLink() {
        termsAndConditionsLink.click();
    }

    public void clickReturnPolicyLink() {
        returnPolicyLink.click();
    }
}
