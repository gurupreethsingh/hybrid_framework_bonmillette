package pom.vendor_pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AllRawMaterialsPage extends Verification {

    // Page Header
    @FindBy(xpath = "//h1[contains(text(),'All Raw Materials')]")
    private WebElement allRawMaterialsHeading;

    // Search Field
    @FindBy(xpath = "//input[@placeholder='Search raw material...']")
    private WebElement searchField;

    // List of Raw Materials
    @FindBy(xpath = "//ul/li[contains(@class,'cursor-pointer')]")
    private List<WebElement> rawMaterialsList;

    // Selected Raw Material Details
    @FindBy(xpath = "//h2[contains(@class,'text-xl')]")
    private WebElement selectedMaterialTitle;

    @FindBy(xpath = "//p[strong[contains(text(),'Vendor:')]]")
    private WebElement vendorDetails;

    @FindBy(xpath = "//p[strong[contains(text(),'Quantity:')]]")
    private WebElement quantityDetails;

    @FindBy(xpath = "//p[strong[contains(text(),'Expire Date:')]]")
    private WebElement expireDateDetails;

    @FindBy(xpath = "//p[strong[contains(text(),'Price Per Unit:')]]")
    private WebElement pricePerUnitDetails;

    @FindBy(xpath = "//p[strong[contains(text(),'Total Cost:')]]")
    private WebElement totalCostDetails;

    @FindBy(xpath = "//p[strong[contains(text(),'Notes:')]]")
    private WebElement notesDetails;

    @FindBy(xpath = "//p[strong[contains(text(),'Status:')]]")
    private WebElement statusDetails;

    // Ordered History
    @FindBy(xpath = "//li[strong[contains(text(),'Ordered History:')]]/following-sibling::li")
    private List<WebElement> orderedHistoryList;

    // Reorder History
    @FindBy(xpath = "//li[strong[contains(text(),'Reorder History:')]]/following-sibling::li")
    private List<WebElement> reorderHistoryList;

    // Refilling History
    @FindBy(xpath = "//li[strong[contains(text(),'Refilling History:')]]/following-sibling::li")
    private List<WebElement> refillingHistoryList;

    // Status History
    @FindBy(xpath = "//li[strong[contains(text(),'Status History:')]]/following-sibling::li")
    private List<WebElement> statusHistoryList;

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

    // Save Changes Button
    @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
    private WebElement saveChangesButton;

    // Constructor
    public AllRawMaterialsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Get All Raw Materials Heading
    public String getAllRawMaterialsHeading() {
        return allRawMaterialsHeading.getText();
    }

    // Enter Search Query
    public void enterSearchQuery(String query) {
        searchField.clear();
        searchField.sendKeys(query);
    }

    // Get Raw Material Count
    public int getRawMaterialCount() {
        return rawMaterialsList.size();
    }

    // Select a Raw Material
    public void selectRawMaterial(int index) {
        if (rawMaterialsList.size() > index) {
            rawMaterialsList.get(index).click();
        }
    }

    // Get Selected Material Title
    public String getSelectedMaterialTitle() {
        return selectedMaterialTitle.getText();
    }

    // Get Raw Material Details
    public String getVendorDetails() {
        return vendorDetails.getText();
    }

    public String getQuantityDetails() {
        return quantityDetails.getText();
    }

    public String getExpireDateDetails() {
        return expireDateDetails.getText();
    }

    public String getPricePerUnitDetails() {
        return pricePerUnitDetails.getText();
    }

    public String getTotalCostDetails() {
        return totalCostDetails.getText();
    }

    public String getNotesDetails() {
        return notesDetails.getText();
    }

    public String getStatusDetails() {
        return statusDetails.getText();
    }

    // Get Ordered History Count
    public int getOrderedHistoryCount() {
        return orderedHistoryList.size();
    }

    // Get Reorder History Count
    public int getReorderHistoryCount() {
        return reorderHistoryList.size();
    }

    // Get Refilling History Count
    public int getRefillingHistoryCount() {
        return refillingHistoryList.size();
    }

    // Get Status History Count
    public int getStatusHistoryCount() {
        return statusHistoryList.size();
    }

    // Update Raw Material Details
    public void updateRawMaterialDetails(String quantity, String unit, String pricePerUnit, String expireDate, String notes) {
        quantityInput.clear();
        quantityInput.sendKeys(quantity);

        unitInput.clear();
        unitInput.sendKeys(unit);

        pricePerUnitInput.clear();
        pricePerUnitInput.sendKeys(pricePerUnit);

        expireDateInput.clear();
        expireDateInput.sendKeys(expireDate);

        notesInput.clear();
        notesInput.sendKeys(notes);
    }

    // Click Save Changes Button
    public void clickSaveChangesButton() {
        saveChangesButton.click();
    }

    // Verify All Raw Materials Page Title
    public void verifyAllRawMaterialsTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    // Verify All Raw Materials Page URL
    public void verifyAllRawMaterialsUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
