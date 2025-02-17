package pom.vendor_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import java.util.List;

import generic.Verification;

public class AllRawMaterialsPage extends Verification {

    // Constructor
    public AllRawMaterialsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Search Bar
    @FindBy(xpath = "//input[@placeholder='Search raw material...']")
    private WebElement searchField;

    // Raw Material List
    @FindBy(xpath = "//ul/li[@class='cursor-pointer p-2 hover:bg-gray-200']")
    private List<WebElement> rawMaterialList;

    // Raw Material Details
    @FindBy(xpath = "//h2[contains(text(),'Details')]")
    private WebElement materialDetailsSection;

    @FindBy(xpath = "//p/strong[contains(text(),'Vendor:')]")
    private WebElement vendorName;

    @FindBy(xpath = "//p/strong[contains(text(),'Quantity:')]")
    private WebElement quantity;

    @FindBy(xpath = "//p/strong[contains(text(),'Expire Date:')]")
    private WebElement expireDate;

    @FindBy(xpath = "//p/strong[contains(text(),'Price Per Unit:')]")
    private WebElement pricePerUnit;

    @FindBy(xpath = "//p/strong[contains(text(),'Total Cost:')]")
    private WebElement totalCost;

    @FindBy(xpath = "//p/strong[contains(text(),'Status:')]")
    private WebElement status;

    // Update Form Fields
    @FindBy(name = "quantity")
    private WebElement quantityInput;

    @FindBy(name = "unit")
    private WebElement unitInput;

    @FindBy(name = "price_per_unit")
    private WebElement pricePerUnitInput;

    @FindBy(name = "expire_date")
    private WebElement expireDateInput;

    @FindBy(name = "notes")
    private WebElement notesInput;

    @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
    private WebElement saveChangesButton;

    // Methods for Search
    public void enterSearchQuery(String query) {
        searchField.clear();
        searchField.sendKeys(query);
    }

    public void selectRawMaterial(int index) {
        if (!rawMaterialList.isEmpty() && index < rawMaterialList.size()) {
            rawMaterialList.get(index).click();
        }
    }

    // Getters for Material Details
    public String getVendorName() {
        return vendorName.getText();
    }

    public String getQuantity() {
        return quantity.getText();
    }

    public String getExpireDate() {
        return expireDate.getText();
    }

    public String getPricePerUnit() {
        return pricePerUnit.getText();
    }

    public String getTotalCost() {
        return totalCost.getText();
    }

    public String getStatus() {
        return status.getText();
    }

    // Methods for Updating Material
    public void enterQuantity(String qty) {
        quantityInput.clear();
        quantityInput.sendKeys(qty);
    }

    public void enterUnit(String unit) {
        unitInput.clear();
        unitInput.sendKeys(unit);
    }

    public void enterPricePerUnit(String price) {
        pricePerUnitInput.clear();
        pricePerUnitInput.sendKeys(price);
    }

    public void enterExpireDate(String date) {
        expireDateInput.clear();
        expireDateInput.sendKeys(date);
    }

    public void enterNotes(String notes) {
        notesInput.clear();
        notesInput.sendKeys(notes);
    }

    public void clickSaveChanges() {
        saveChangesButton.click();
    }

    // Verification Methods using SoftAssert
    public void verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyPageUrl(String expectedUrl, SoftAssert softAssert) {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifySearchField(SoftAssert softAssert) {
        softAssert.assertTrue(searchField.isDisplayed(), "❌ Search field is missing.");
    }

    public void verifyRawMaterialList(SoftAssert softAssert) {
        softAssert.assertTrue(!rawMaterialList.isEmpty(), "❌ No raw materials found.");
    }

    public void verifyMaterialDetailsSection(SoftAssert softAssert) {
        softAssert.assertTrue(materialDetailsSection.isDisplayed(), "❌ Material details section is missing.");
    }

    public void verifyUpdateFormFields(SoftAssert softAssert) {
        softAssert.assertTrue(quantityInput.isDisplayed(), "❌ Quantity input field is missing.");
        softAssert.assertTrue(unitInput.isDisplayed(), "❌ Unit input field is missing.");
        softAssert.assertTrue(pricePerUnitInput.isDisplayed(), "❌ Price per unit input field is missing.");
        softAssert.assertTrue(expireDateInput.isDisplayed(), "❌ Expiry date input field is missing.");
        softAssert.assertTrue(notesInput.isDisplayed(), "❌ Notes input field is missing.");
    }

    public void verifySaveChangesButton(SoftAssert softAssert) {
        softAssert.assertTrue(saveChangesButton.isDisplayed(), "❌ Save Changes button is missing.");
    }
}
