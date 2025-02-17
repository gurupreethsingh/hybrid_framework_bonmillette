package pom.product_pages;

import generic.Verification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SingleAddedProductPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//a[contains(@href,'/')]//img[contains(@alt,'Logo')]")
    private WebElement logo;

    @FindBy(xpath = "//nav//a[contains(text(),'Home')]")
    private WebElement homeLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Shop')]")
    private WebElement shopLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Our Story')]")
    private WebElement ourStoryLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Blog')]")
    private WebElement blogLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Testimonials')]")
    private WebElement testimonialsLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Contact Us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//button[contains(text(),'My Account')]")
    private WebElement myAccountButton;

    @FindBy(xpath = "//button[@aria-label='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[contains(@class,'shopping-bag')]")
    private WebElement cartButton;

    @FindBy(xpath = "//button[contains(@class,'menu')]")
    private WebElement menuButton;

    // ========================== PAGE TITLE ==========================
    @FindBy(xpath = "//h2[contains(text(),'Product Details')]")
    private WebElement pageTitle;

    // ========================== PRODUCT DETAILS ==========================

    @FindBy(xpath = "//input[@type='file']")
    private WebElement productImageUpload;

    @FindBy(xpath = "//button[contains(text(),'Upload Image')]")
    private WebElement uploadImageButton;

    @FindBy(xpath = "//button[contains(text(),'Manage Images')]")
    private WebElement manageImagesButton;

    @FindBy(xpath = "//img[contains(@alt,'Product')]")
    private WebElement productMainImage;

    @FindBy(xpath = "//div[contains(@class,'additional-images')]//img")
    private List<WebElement> additionalProductImages;

    @FindBy(xpath = "//input[contains(@name,'product_name')]")
    private WebElement productNameField;

    @FindBy(xpath = "//textarea[contains(@name,'description')]")
    private WebElement descriptionField;

    @FindBy(xpath = "//input[contains(@name,'stock')]")
    private WebElement stockField;

    @FindBy(xpath = "//input[contains(@name,'brand')]")
    private WebElement brandField;

    @FindBy(xpath = "//input[contains(@name,'SKU')]")
    private WebElement skuField;

    @FindBy(xpath = "//input[contains(@name,'tags')]")
    private WebElement tagsField;

    @FindBy(xpath = "//input[contains(@name,'discount')]")
    private WebElement discountField;

    @FindBy(xpath = "//input[contains(@name,'availability_status')]")
    private WebElement availabilityStatusCheckbox;

    @FindBy(xpath = "//input[contains(@name,'dimensions.length')]")
    private WebElement lengthField;

    @FindBy(xpath = "//input[contains(@name,'dimensions.width')]")
    private WebElement widthField;

    @FindBy(xpath = "//input[contains(@name,'dimensions.height')]")
    private WebElement heightField;

    // ========================== BUTTONS ==========================

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    private WebElement editButton;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[contains(text(),'All Products')]")
    private WebElement allProductsButton;

    // ========================== TOAST NOTIFICATIONS ==========================

    @FindBy(xpath = "//div[contains(@class,'Toastify__toast-body')]")
    private WebElement toastNotification;

    // ========================== FOOTER ELEMENTS ==========================

    @FindBy(xpath = "//div[contains(@class,'social_links')]//img")
    private WebElement footerLogo;

    @FindBy(xpath = "//div[contains(@class,'social_links')]//a[contains(@href,'instagram')]")
    private WebElement instagramLink;

    @FindBy(xpath = "//div[contains(@class,'social_links')]//a[contains(@href,'linkedin')]")
    private WebElement linkedinLink;

    @FindBy(xpath = "//div[contains(@class,'social_links')]//a[contains(@href,'facebook')]")
    private WebElement facebookLink;

    @FindBy(xpath = "//div[contains(@class,'social_links')]//a[contains(@href,'twitter')]")
    private WebElement twitterLink;

    @FindBy(xpath = "//div[contains(@class,'quick_links')]//a[contains(text(),'Home')]")
    private WebElement footerHomeLink;

    @FindBy(xpath = "//div[contains(@class,'quick_links')]//a[contains(text(),'About Us')]")
    private WebElement footerAboutUsLink;

    @FindBy(xpath = "//div[contains(@class,'quick_links')]//a[contains(text(),'Products')]")
    private WebElement footerProductsLink;

    @FindBy(xpath = "//div[contains(@class,'quick_links')]//a[contains(text(),'Contact Us')]")
    private WebElement footerContactUsLink;

    @FindBy(xpath = "//p[contains(text(),'Privacy Policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//p[contains(text(),'Terms & Conditions')]")
    private WebElement termsAndConditionsLink;

    @FindBy(xpath = "//p[contains(text(),'Return Policy')]")
    private WebElement returnPolicyLink;

    // ========================== CONSTRUCTOR ==========================
    public SingleAddedProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public void clickEditButton() {
        editButton.click();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

    public void clickAllProductsButton() {
        allProductsButton.click();
    }

    public void enterProductName(String name) {
        productNameField.clear();
        productNameField.sendKeys(name);
    }

    public void enterDescription(String description) {
        descriptionField.clear();
        descriptionField.sendKeys(description);
    }

    public void enterStock(String stock) {
        stockField.clear();
        stockField.sendKeys(stock);
    }

    public void enterBrand(String brand) {
        brandField.clear();
        brandField.sendKeys(brand);
    }

    public void enterSKU(String sku) {
        skuField.clear();
        skuField.sendKeys(sku);
    }

    public void enterTags(String tags) {
        tagsField.clear();
        tagsField.sendKeys(tags);
    }

    public void enterDiscount(String discount) {
        discountField.clear();
        discountField.sendKeys(discount);
    }

    public void checkAvailabilityStatus(boolean status) {
        if (availabilityStatusCheckbox.isSelected() != status) {
            availabilityStatusCheckbox.click();
        }
    }

    public void enterDimensions(String length, String width, String height) {
        lengthField.clear();
        lengthField.sendKeys(length);
        widthField.clear();
        widthField.sendKeys(width);
        heightField.clear();
        heightField.sendKeys(height);
    }

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }

    public boolean verifyToastMessage(String expectedMessage, SoftAssert softAssert) {
        return verifyTextPresent(expectedMessage, softAssert);
    }

    public boolean verifyProductImageDisplayed(SoftAssert softAssert) {
        boolean isDisplayed = productMainImage.isDisplayed();
        softAssert.assertTrue(isDisplayed, "Product Image is not displayed");
        return isDisplayed;
    }

    public boolean verifyProductDetailsLoaded(SoftAssert softAssert) {
        boolean isDisplayed = productNameField.isDisplayed();
        softAssert.assertTrue(isDisplayed, "Product details not loaded properly");
        return isDisplayed;
    }
}

