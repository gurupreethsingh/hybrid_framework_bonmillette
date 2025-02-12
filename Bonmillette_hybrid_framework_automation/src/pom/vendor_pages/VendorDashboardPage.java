package pom.vendor_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class VendorDashboardPage extends Verification {

    // Header
    @FindBy(xpath = "//p[contains(text(),'Vendor Dashboard')]")
    private WebElement vendorDashboardHeading;

    // Navigation Links
    @FindBy(xpath = "//a[contains(@href,'vendor-dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href,'profile')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // Vendor Statistics Cards
    @FindBy(xpath = "//h3[contains(text(),'Products')]/following-sibling::p/span")
    private WebElement totalProductsCount;

    @FindBy(xpath = "//h3[contains(text(),'Raw Materials')]/following-sibling::p/span")
    private WebElement totalRawMaterialsCount;

    @FindBy(xpath = "//a[contains(@href,'vendor-products')]")
    private WebElement viewProductsLink;

    @FindBy(xpath = "//a[contains(@href,'vendor-raw-materials')]")
    private WebElement viewRawMaterialsLink;

    // Constructor
    public VendorDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Get the Vendor Dashboard Heading
    public String getVendorDashboardHeading() {
        return vendorDashboardHeading.getText();
    }

    // Navigate to Dashboard
    public void clickDashboardLink() {
        dashboardLink.click();
    }

    // Navigate to Account Details
    public void clickAccountDetailsLink() {
        accountDetailsLink.click();
    }

    // Click Logout
    public void clickLogoutButton() {
        logoutButton.click();
    }

    // Get Total Products Count
    public String getTotalProductsCount() {
        return totalProductsCount.getText();
    }

    // Get Total Raw Materials Count
    public String getTotalRawMaterialsCount() {
        return totalRawMaterialsCount.getText();
    }

    // Navigate to Products Page
    public void clickViewProductsLink() {
        viewProductsLink.click();
    }

    // Navigate to Raw Materials Page
    public void clickViewRawMaterialsLink() {
        viewRawMaterialsLink.click();
    }

    // Verify Vendor Dashboard Page Title
    public void verifyVendorDashboardTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    // Verify Vendor Dashboard Page URL
    public void verifyVendorDashboardUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}

