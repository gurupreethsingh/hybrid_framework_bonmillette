package pom.product_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import java.util.List;

public class AddProductPage extends Verification {

    // ========================== PAGE TITLE ==========================
    @FindBy(xpath = "//h2[contains(text(),'Add New Product')]")
    private WebElement addProductTitle;

    // ========================== FORM FIELDS ==========================

    @FindBy(name = "product_name")
    private WebElement productNameField;

    @FindBy(name = "description")
    private WebElement descriptionField;

    @FindBy(name = "category")
    private WebElement categoryDropdown;

    @FindBy(name = "outlet")
    private WebElement outletDropdown;

    @FindBy(name = "vendor")
    private WebElement vendorDropdown;

    @FindBy(name = "stock")
    private WebElement stockField;

    @FindBy(name = "brand")
    private WebElement brandField;

    @FindBy(name = "SKU")
    private WebElement skuField;

    @FindBy(name = "color")
    private WebElement colorField;

    @FindBy(name = "material")
    private WebElement materialField;

    @FindBy(name = "tags")
    private WebElement tagsField;

    @FindBy(name = "discount")
    private WebElement discountField;

    @FindBy(name = "availability_status")
    private WebElement availabilityStatusDropdown;

    @FindBy(name = "dimensions")
    private List<WebElement> dimensionFields;

    @FindBy(name = "product_image")
    private WebElement mainProductImageUpload;

    @FindBy(name = "all_product_images")
    private WebElement additionalProductImagesUpload;

    // ========================== VOLUME DETAILS ==========================

    @FindBy(xpath = "//input[contains(@placeholder, 'Volume')]")
    private List<WebElement> volumeFields;

    @FindBy(xpath = "//input[contains(@placeholder, 'Selling Price')]")
    private List<WebElement> sellingPriceFields;

    @FindBy(xpath = "//input[contains(@placeholder, 'Display Price')]")
    private List<WebElement> displayPriceFields;

    @FindBy(xpath = "//button[contains(@class, 'text-success')]")
    private WebElement addVolumeButton;

    @FindBy(xpath = "//button[contains(@class, 'text-danger')]")
    private List<WebElement> removeVolumeButtons;

    // ========================== SUBMIT BUTTON ==========================

    @FindBy(xpath = "//button[contains(text(),'Add Product')]")
    private WebElement addProductButton;

    // ========================== CONSTRUCTOR ==========================

    public AddProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public String getAddProductTitle() {
        return addProductTitle.getText();
    }

    public void enterProductName(String productName) {
        productNameField.sendKeys(productName);
    }

    public void enterDescription(String description) {
        descriptionField.sendKeys(description);
    }

    public void selectCategory(String category, SoftAssert softAssert) {
        selectDropdownByVisibleText(categoryDropdown, category, softAssert);
    }

    public void selectOutlet(String outlet, SoftAssert softAssert) {
        selectDropdownByVisibleText(outletDropdown, outlet, softAssert);
    }

    public void selectVendor(String vendor, SoftAssert softAssert) {
        selectDropdownByVisibleText(vendorDropdown, vendor, softAssert);
    }

    public void enterStock(String stock) {
        stockField.sendKeys(stock);
    }

    public void enterBrand(String brand) {
        brandField.sendKeys(brand);
    }

    public void enterSKU(String sku) {
        skuField.sendKeys(sku);
    }

    public void enterColor(String color) {
        colorField.sendKeys(color);
    }

    public void enterMaterial(String material) {
        materialField.sendKeys(material);
    }

    public void enterTags(String tags) {
        tagsField.sendKeys(tags);
    }

    public void enterDiscount(String discount) {
        discountField.sendKeys(discount);
    }

    public void selectAvailabilityStatus(String status, SoftAssert softAssert) {
        selectDropdownByVisibleText(availabilityStatusDropdown, status, softAssert);
    }


    public void enterDimensions(String length, String width, String height) {
        dimensionFields.get(0).sendKeys(length);
        dimensionFields.get(1).sendKeys(width);
        dimensionFields.get(2).sendKeys(height);
    }

    public void uploadMainProductImage(String filePath) {
        mainProductImageUpload.sendKeys(filePath);
    }

    public void uploadAdditionalProductImages(String... filePaths) {
        for (String filePath : filePaths) {
            additionalProductImagesUpload.sendKeys(filePath);
        }
    }

    public void addVolume(String volume, String sellingPrice, String displayPrice) {
        volumeFields.get(volumeFields.size() - 1).sendKeys(volume);
        sellingPriceFields.get(sellingPriceFields.size() - 1).sendKeys(sellingPrice);
        displayPriceFields.get(displayPriceFields.size() - 1).sendKeys(displayPrice);
    }

    public void clickAddVolumeButton() {
        addVolumeButton.click();
    }

    public void clickRemoveVolumeButton(int index) {
        removeVolumeButtons.get(index).click();
    }

    public void clickAddProductButton() {
        addProductButton.click();
    }

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }

    public boolean verifyProductAdded(SoftAssert softAssert) {
        return verifySuccessMessage("Product added successfully!", softAssert);
    }
}
