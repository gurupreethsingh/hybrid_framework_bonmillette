package pom.vendor_pages;

import generic.Verification;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class VendorDashboardPage extends Verification {
    private SoftAssert softAssert = new SoftAssert(); // ✅ Fix: Initialize SoftAssert

    /** Constructor */
    public VendorDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /** ========================== PAGE ELEMENTS ========================== */

    // **Header Elements**
    @FindBy(xpath = "//header") 
    private WebElement header;

    @FindBy(xpath = "//input[@type='text' and @placeholder='Search']") 
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(@class,'search-icon')]") 
    private WebElement searchButton;

    // **Sidebar Navigation**
    @FindBy(xpath = "//span[contains(text(),'Dashboard')]") 
    private WebElement dashboardLink;

    @FindBy(xpath = "//span[contains(text(),'Account Details')]") 
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//span[contains(text(),'Logout')]") 
    private WebElement logoutButton;

    // **Cards Section**
    @FindBy(xpath = "//h3[contains(text(), 'Products')]/following-sibling::p/span") 
    private WebElement totalProducts;

    @FindBy(xpath = "//h3[contains(text(), 'Raw Materials')]/following-sibling::p/span") 
    private WebElement totalRawMaterials;

    @FindBy(xpath = "//a[contains(text(),'View Products')]") 
    private WebElement viewProductsLink;

    @FindBy(xpath = "//a[contains(text(),'View Raw Materials')]") 
    private WebElement viewRawMaterialsLink;

    // **Footer Elements**
    @FindBy(xpath = "//footer") 
    private WebElement footer;

    /** ========================== PAGE ACTIONS ========================== */

    /** Get total products count */
    public int getTotalProducts() {
        try {
            String productText = waitForElementToBeVisible(totalProducts).getText().replaceAll("[^0-9]", "");
            return productText.isEmpty() ? 0 : Integer.parseInt(productText);
        } catch (NoSuchElementException e) {
            return 0;
        }
    }

    /** Get total raw materials count */
    public int getTotalRawMaterials() {
        try {
            String rawMaterialText = waitForElementToBeVisible(totalRawMaterials).getText().replaceAll("[^0-9]", "");
            return rawMaterialText.isEmpty() ? 0 : Integer.parseInt(rawMaterialText);
        } catch (NoSuchElementException e) {
            return 0;
        }
    }

    /** Click View Products */
    public void clickViewProducts() {
        waitForElementToBeClickable(viewProductsLink).click();
    }

    /** Click View Raw Materials */
    public void clickViewRawMaterials() {
        waitForElementToBeClickable(viewRawMaterialsLink).click();
    }

    /** Click Dashboard Link */
    public void clickDashboard() {
        waitForElementToBeClickable(dashboardLink).click();
    }

    /** Click Account Details */
    public void clickAccountDetails() {
        waitForElementToBeClickable(accountDetailsLink).click();
    }

    /** Click Logout */
    public void logout() {
        waitForElementToBeClickable(logoutButton).click();
        acceptAlert();  // Ensure logout confirmation alert is handled
    }

    /** ========================== VERIFICATION METHODS ========================== */

    /** Verify if header is displayed */
    public boolean isHeaderDisplayed() {
        try {
            return waitForElementToBeVisible(header).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /** Verify if footer is displayed */
    public boolean isFooterDisplayed() {
        try {
            return waitForElementToBeVisible(footer).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /** Verify Dashboard title */
    public boolean verifyDashboardTitle(String expectedTitle) {
        return verifyTitle(expectedTitle, softAssert);
    }

    /** Verify Dashboard URL */
    public boolean verifyDashboardUrl(String expectedUrl) {
        return verifyUrl(expectedUrl, softAssert);
    }

    /** Verify if the search field is present */
    public boolean isSearchFieldPresent() {
        try {
            return waitForElementToBeVisible(searchField).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /** Verify if a search returns results */
    public boolean performSearch(String keyword) {
        try {
            waitForElementToBeVisible(searchField).sendKeys(keyword);
            waitForElementToBeClickable(searchButton).click();
            return verifyTextPresent(keyword, softAssert);
        } catch (Exception e) {
            return false;
        }
    }
}
