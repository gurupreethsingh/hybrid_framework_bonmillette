package pom.vendor_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AddRawMaterialToVendorPage extends Verification {

    // Page Heading
    @FindBy(xpath = "//h2[contains(text(),'Add Raw Material')]")
    private WebElement addRawMaterialHeading;

    // Vendor Dropdown
    @FindBy(name = "vendor")
    private WebElement vendorDropdown;

    // Raw Material Name
    @FindBy(name = "raw_material_name")
    private WebElement rawMaterialNameInput;

    // Quantity
    @FindBy(name = "quantity")
    private WebElement quantityInput;

    // Unit Dropdown
    @FindBy(name = "unit")
    private WebElement unitDropdown;

    // Ordered Date
    @FindBy(name = "ordered_date")
    private WebElement orderedDateInput;

    // Reorder Date
    @FindBy(name = "reorder_date")
    private WebElement reorderDateInput;

    // Expiry Date
    @FindBy(name = "expire_date")
    private WebElement expireDateInput;

    // Price Per Unit
    @FindBy(name = "price_per_unit")
    private WebElement pricePerUnitInput;

    // Notes
    @FindBy(name = "notes")
    private WebElement notesInput;

    // Submit Button
    @FindBy(xpath = "//button[contains(text(),'Add Raw Material')]")
    private WebElement addRawMaterialButton;

    // View All Raw Materials Button
    @FindBy(xpath = "//button[contains(text(),'View All Raw Materials')]")
    private WebElement viewAllRawMaterialsButton;

    // Constructor
    public AddRawMaterialToVendorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Get Add Raw Material Page Heading
    public String getAddRawMaterialHeading() {
        return addRawMaterialHeading.getText();
    }

    // Select Vendor
    public void selectVendor(String vendorName) {
        selectDropdownByVisibleText(vendorDropdown, vendorName);
    }

    // Enter Raw Material Name
    public void enterRawMaterialName(String materialName) {
        rawMaterialNameInput.clear();
        rawMaterialNameInput.sendKeys(materialName);
    }

    // Enter Quantity
    public void enterQuantity(String quantity) {
        quantityInput.clear();
        quantityInput.sendKeys(quantity);
    }

    // Select Unit
    public void selectUnit(String unit) {
        selectDropdownByVisibleText(unitDropdown, unit);
    }

    // Enter Ordered Date
    public void enterOrderedDate(String orderedDate) {
        orderedDateInput.clear();
        orderedDateInput.sendKeys(orderedDate);
    }

    // Enter Reorder Date
    public void enterReorderDate(String reorderDate) {
        reorderDateInput.clear();
        reorderDateInput.sendKeys(reorderDate);
    }

    // Enter Expiry Date
    public void enterExpireDate(String expireDate) {
        expireDateInput.clear();
        expireDateInput.sendKeys(expireDate);
    }

    // Enter Price Per Unit
    public void enterPricePerUnit(String pricePerUnit) {
        pricePerUnitInput.clear();
        pricePerUnitInput.sendKeys(pricePerUnit);
    }

    // Enter Notes
    public void enterNotes(String notes) {
        notesInput.clear();
        notesInput.sendKeys(notes);
    }

    // Click Add Raw Material Button
    public void clickAddRawMaterialButton() {
        addRawMaterialButton.click();
    }

    // Click View All Raw Materials Button
    public void clickViewAllRawMaterialsButton() {
        viewAllRawMaterialsButton.click();
    }

    // Verify Add Raw Material Page Title
    public void verifyAddRawMaterialTitle(String expectedTitle) {
        verifyTitle(expectedTitle);
    }

    // Verify Add Raw Material Page URL
    public void verifyAddRawMaterialUrl(String expectedUrl) {
        verifyUrl(expectedUrl);
    }
}
