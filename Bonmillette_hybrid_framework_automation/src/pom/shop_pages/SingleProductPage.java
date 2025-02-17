package pom.shop_pages;

import generic.Verification;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import java.util.List;

public class SingleProductPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//a[contains(@href, '/home')]/img") 
    private WebElement headerLogo;

    @FindBy(xpath = "//button[contains(@class, 'text-black')]/span[contains(text(),'My Account')]")
    private WebElement myAccountButton;

    @FindBy(xpath = "//button[contains(@class, 'text-black')]/span[contains(text(),'Search')]")
    private WebElement searchIcon;

    @FindBy(xpath = "//button[contains(@class, 'text-black')]/span[contains(text(),'Cart')]")
    private WebElement cartIcon;

    // ========================== PRODUCT IMAGE ==========================

    @FindBy(xpath = "//div[contains(@class, 'image_wrapper')]//img")
    private WebElement mainProductImage;

    @FindBy(xpath = "//div[contains(@class, 'flex justify-center')]/div")
    private List<WebElement> productImageThumbnails;

    // ========================== PRODUCT DETAILS ==========================

    @FindBy(xpath = "//p[contains(@class, 'font-bold text-3xl')]")
    private WebElement productName;

    @FindBy(xpath = "//p[contains(@class, 'font-bold text-2xl')]")
    private WebElement productPrice;

    @FindBy(xpath = "//select[@id='volume']")
    private WebElement volumeDropdown;

    @FindBy(xpath = "//input[@type='number']")
    private WebElement quantityInput;

    @FindBy(xpath = "//button[contains(text(),'Add To Cart')]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//p[contains(text(), 'Category')]/span")
    private WebElement productCategory;

    @FindBy(xpath = "//p[contains(text(), 'Description')]/following-sibling::span")
    private WebElement productDescription;

    // ========================== SHIPPING INFORMATION ==========================

    @FindBy(xpath = "//div[contains(@class, 'shipping_section')]//h5[contains(text(), 'Free Shipping')]")
    private WebElement freeShipping;

    @FindBy(xpath = "//div[contains(@class, 'shipping_section')]//h5[contains(text(), 'Quality Guarantee')]")
    private WebElement qualityGuarantee;

    @FindBy(xpath = "//div[contains(@class, 'shipping_section')]//h5[contains(text(), 'Phone Order Supported')]")
    private WebElement phoneOrderSupported;

    @FindBy(xpath = "//div[contains(@class, 'shipping_section')]//h5[contains(text(), 'Secure Payment')]")
    private WebElement securePayment;

    // ========================== PRODUCT DETAILS SECTION ==========================

    @FindBy(xpath = "//span[contains(text(), 'Brand:')]/following-sibling::span")
    private WebElement productBrand;

    @FindBy(xpath = "//span[contains(text(), 'SKU:')]/following-sibling::span")
    private WebElement productSKU;

    @FindBy(xpath = "//span[contains(text(), 'Dimensions:')]/following-sibling::span")
    private WebElement productDimensions;

    @FindBy(xpath = "//span[contains(text(), 'Material:')]/following-sibling::span")
    private WebElement productMaterial;

    @FindBy(xpath = "//span[contains(text(), 'Availability:')]/following-sibling::span")
    private WebElement availabilityStatus;

    @FindBy(xpath = "//span[contains(text(), 'Discount:')]/following-sibling::span")
    private WebElement productDiscount;

    // ========================== RELATED PRODUCTS ==========================

    @FindBy(xpath = "//p[contains(text(), 'YOU MAY ALSO LIKE')]")
    private WebElement relatedProductsHeading;

    @FindBy(xpath = "//div[contains(@class, 'grid grid-cols-1')]//img")
    private List<WebElement> relatedProductImages;

    @FindBy(xpath = "//div[contains(@class, 'grid grid-cols-1')]//p[contains(@class, 'font-bold')]")
    private List<WebElement> relatedProductNames;

    @FindBy(xpath = "//div[contains(@class, 'grid grid-cols-1')]//button[contains(text(), 'Add to Cart')]")
    private List<WebElement> relatedProductAddToCartButtons;

    // ========================== REVIEWS SECTION ==========================

    @FindBy(xpath = "//h2[contains(text(), 'User Reviews')]")
    private WebElement reviewsSection;

    @FindBy(xpath = "//p[contains(text(), 'Sort by:')]/following-sibling::select")
    private WebElement reviewSortDropdown;

    @FindBy(xpath = "//button[contains(text(), 'Add Review')]")
    private WebElement addReviewButton;

    @FindBy(xpath = "//textarea")
    private WebElement reviewCommentBox;

    @FindBy(xpath = "//button[contains(text(), 'Submit')]")
    private WebElement submitReviewButton;

    @FindBy(xpath = "//button[contains(text(), 'Load More')]")
    private WebElement loadMoreReviewsButton;

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

    public SingleProductPage(WebDriver driver) {
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

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    public void selectVolume(String volume, SoftAssert softAssert) {
        selectDropdownByVisibleText(volumeDropdown, volume, softAssert);
    }

    public void enterQuantity(int quantity) {
        quantityInput.clear();
        quantityInput.sendKeys(String.valueOf(quantity));
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void clickRelatedProduct(int index) {
        relatedProductImages.get(index).click();
    }

    public void clickAddRelatedProductToCart(int index) {
        relatedProductAddToCartButtons.get(index).click();
    }

    public void clickAddReviewButton() {
        addReviewButton.click();
    }

    public void enterReviewComment(String comment) {
        reviewCommentBox.sendKeys(comment);
    }

    public void submitReview() {
        submitReviewButton.click();
    }

    public void loadMoreReviews() {
        loadMoreReviewsButton.click();
    }

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyProductName(String expectedName, SoftAssert softAssert) {
        return verifyTextPresent(expectedName, softAssert);
    }

    public boolean verifyProductPrice(String expectedPrice, SoftAssert softAssert) {
        return verifyTextPresent(expectedPrice, softAssert);
    }

    public boolean verifyCategory(String expectedCategory, SoftAssert softAssert) {
        return verifyTextPresent(expectedCategory, softAssert);
    }

    public boolean verifyAvailability(SoftAssert softAssert) {
        return verifyTextPresent("Available", softAssert);
    }

    public boolean verifyProductAddedToCart(SoftAssert softAssert) {
        return verifyTextPresent("Product added to cart successfully!", softAssert);
    }

    public boolean verifyFooterLinks(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link is missing!");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms and Conditions link is missing!");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link is missing!");
        return true;
    }
}

