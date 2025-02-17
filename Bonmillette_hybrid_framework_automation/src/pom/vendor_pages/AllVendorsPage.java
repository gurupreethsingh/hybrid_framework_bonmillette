package pom.vendor_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import java.util.List;

import generic.Verification;

public class AllVendorsPage extends Verification {

    // Constructor
    public AllVendorsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Page Elements

    // Search Field
    @FindBy(xpath = "//input[@placeholder='Search vendors...']")
    private WebElement searchField;

    // View Controls
    @FindBy(xpath = "//fa-icon[contains(@class,'fa-th-list')]")
    private WebElement listViewButton;

    @FindBy(xpath = "//fa-icon[contains(@class,'fa-th-large')]")
    private WebElement cardViewButton;

    @FindBy(xpath = "//fa-icon[contains(@class,'fa-th')]")
    private WebElement gridViewButton;

    // Vendor List (Grid / Card / List)
    @FindBy(xpath = "//div[contains(@class,'grid')]//h3")
    private List<WebElement> vendorGridList;

    @FindBy(xpath = "//div[contains(@class,'shadow-lg')]//h3")
    private List<WebElement> vendorCardList;

    @FindBy(xpath = "//div[contains(@class,'space-y-6')]//h3")
    private List<WebElement> vendorListView;

    // Delete Vendor Buttons
    @FindBy(xpath = "//button[contains(@class,'text-red-500')]")
    private List<WebElement> deleteVendorButtons;

    // Add Vendor Button
    @FindBy(xpath = "//button[contains(text(),'Add Vendor')]")
    private WebElement addVendorButton;

    // Methods for Vendor Search
    public void enterSearchQuery(String query) {
        searchField.clear();
        searchField.sendKeys(query);
    }

    // Methods to Change Views
    public void switchToListView() {
        listViewButton.click();
    }

    public void switchToCardView() {
        cardViewButton.click();
    }

    public void switchToGridView() {
        gridViewButton.click();
    }

    // Methods to Interact with Vendors
    public void selectVendorFromGrid(int index) {
        if (!vendorGridList.isEmpty() && index < vendorGridList.size()) {
            vendorGridList.get(index).click();
        }
    }

    public void selectVendorFromCard(int index) {
        if (!vendorCardList.isEmpty() && index < vendorCardList.size()) {
            vendorCardList.get(index).click();
        }
    }

    public void selectVendorFromList(int index) {
        if (!vendorListView.isEmpty() && index < vendorListView.size()) {
            vendorListView.get(index).click();
        }
    }

    public void deleteVendor(int index) {
        if (!deleteVendorButtons.isEmpty() && index < deleteVendorButtons.size()) {
            deleteVendorButtons.get(index).click();
            acceptAlert(); // Handle confirmation popup
        }
    }

    public void clickAddVendorButton() {
        addVendorButton.click();
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

    public void verifyViewButtons(SoftAssert softAssert) {
        softAssert.assertTrue(listViewButton.isDisplayed(), "❌ List view button is missing.");
        softAssert.assertTrue(cardViewButton.isDisplayed(), "❌ Card view button is missing.");
        softAssert.assertTrue(gridViewButton.isDisplayed(), "❌ Grid view button is missing.");
    }

    public void verifyVendorList(SoftAssert softAssert) {
        softAssert.assertTrue(!vendorGridList.isEmpty() || !vendorCardList.isEmpty() || !vendorListView.isEmpty(), 
            "❌ No vendors found.");
    }

    public void verifyAddVendorButton(SoftAssert softAssert) {
        softAssert.assertTrue(addVendorButton.isDisplayed(), "❌ Add Vendor button is missing.");
    }
}
