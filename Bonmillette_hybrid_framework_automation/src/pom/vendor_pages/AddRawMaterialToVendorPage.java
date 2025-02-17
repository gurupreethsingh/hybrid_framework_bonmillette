package pom.vendor_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class AddRawMaterialToVendorPage extends Verification {

    // Constructor
    public AddRawMaterialToVendorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Page Elements (Form Fields)
    @FindBy(name = "vendor")
    private WebElement vendorDropdown;

    @FindBy(name = "raw_material_name")
    private WebElement materialNameInput;

    @FindBy(name = "quantity")
    private WebElement quantityInput;

    @FindBy(name = "unit")
    private WebElement unitDropdown;

    @FindBy(name = "ordered_date")
    private WebElement orderedDateInput;

    @FindBy(name = "reorder_date")
    private WebElement reorderDateInput;

    @FindBy(name = "expire_date")
    private WebElement expireDateInput;

    @FindBy(name = "price_per_unit")
    private WebElement pricePerUnitInput;

    @FindBy(name = "notes")
    private WebElement notesInput;

    @FindBy(xpath = "//button[contains(text(),'Add Raw Material')]")
    private WebElement addRawMaterialButton;

    @FindBy(xpath = "//a[contains(@href, 'all-raw-materials')]")
    private WebElement viewAllRawMaterialsLink;

    // Methods to interact with form fields
    public void selectVendor(String vendorName) {
        Select vendorSelect = new Select(vendorDropdown);
        vendorSelect.selectByVisibleText(vendorName);
    }

    public void enterMaterialName(String materialName) {
        materialNameInput.clear();
        materialNameInput.sendKeys(materialName);
    }

    public void enterQuantity(String quantity) {
        quantityInput.clear();
        quantityInput.sendKeys(quantity);
    }

    public void selectUnit(String unit) {
        Select unitSelect = new Select(unitDropdown);
        unitSelect.selectByVisibleText(unit);
    }

    public void enterOrderedDate(String date) {
        orderedDateInput.sendKeys(date);
    }

    public void enterReorderDate(String date) {
        reorderDateInput.sendKeys(date);
    }

    public void enterExpireDate(String date) {
        expireDateInput.sendKeys(date);
    }

    public void enterPricePerUnit(String price) {
        pricePerUnitInput.clear();
        pricePerUnitInput.sendKeys(price);
    }

    public void enterNotes(String notes) {
        notesInput.clear();
        notesInput.sendKeys(notes);
    }

    public void clickAddRawMaterial() {
        addRawMaterialButton.click();
    }

    public void clickViewAllRawMaterials() {
        viewAllRawMaterialsLink.click();
    }

    // Verification Methods using SoftAssert
    public void verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyPageUrl(String expectedUrl, SoftAssert softAssert) {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyVendorDropdown(SoftAssert softAssert) {
        softAssert.assertTrue(vendorDropdown.isDisplayed(), "❌ Vendor dropdown is missing.");
    }

    public void verifyMaterialNameField(SoftAssert softAssert) {
        softAssert.assertTrue(materialNameInput.isDisplayed(), "❌ Material name input is missing.");
    }

    public void verifyQuantityField(SoftAssert softAssert) {
        softAssert.assertTrue(quantityInput.isDisplayed(), "❌ Quantity input is missing.");
    }

    public void verifyUnitDropdown(SoftAssert softAssert) {
        softAssert.assertTrue(unitDropdown.isDisplayed(), "❌ Unit dropdown is missing.");
    }

    public void verifyDateFields(SoftAssert softAssert) {
        softAssert.assertTrue(orderedDateInput.isDisplayed(), "❌ Ordered Date input is missing.");
        softAssert.assertTrue(reorderDateInput.isDisplayed(), "❌ Reorder Date input is missing.");
        softAssert.assertTrue(expireDateInput.isDisplayed(), "❌ Expiry Date input is missing.");
    }

    public void verifyPricePerUnitField(SoftAssert softAssert) {
        softAssert.assertTrue(pricePerUnitInput.isDisplayed(), "❌ Price per unit input is missing.");
    }

    public void verifyNotesField(SoftAssert softAssert) {
        softAssert.assertTrue(notesInput.isDisplayed(), "❌ Notes input is missing.");
    }

    public void verifyAddRawMaterialButton(SoftAssert softAssert) {
        softAssert.assertTrue(addRawMaterialButton.isDisplayed(), "❌ Add Raw Material button is missing.");
    }

    public void verifyViewAllRawMaterialsLink(SoftAssert softAssert) {
        softAssert.assertTrue(viewAllRawMaterialsLink.isDisplayed(), "❌ View All Raw Materials link is missing.");
    }
}
