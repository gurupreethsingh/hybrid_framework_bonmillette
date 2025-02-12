package pom.vendor_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class SingleVendorPage extends Verification {

    // Vendor Details Section
    @FindBy(xpath = "//h2[contains(text(),'Vendor Details')]")
    private WebElement vendorDetailsHeading;

    @FindBy(xpath = "//span[contains(text(),'Vendor Name:')]/following-sibling::span")
    private WebElement vendorName;

    @FindBy(xpath = "//span[contains(text(),'Email:')]/following-sibling::span")
    private WebElement vendorEmail;

    @FindBy(xpath = "//span[contains(text(),'Phone:')]/following-sibling::span")
    private WebElement vendorPhone;

    @FindBy(xpath = "//span[contains(text(),'Company Name:')]/following-sibling::span")
    private WebElement companyName;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    private WebElement editButton;

    @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
    private WebElement saveChangesButton;

    // Edit Fields
    @FindBy(xpath = "//input[@type='text' and contains(@class, 'border')]")
    private WebElement editField;

    // Vendor Products Section
    @FindBy(xpath = "//h2[contains(text(),'Vendor Products')]")
    private WebElement vendorProductsHeading;

    @FindBy(xpath = "//ul[contains(@class,'divide-y')]/li[1]//a")
    private WebElement firstProductLink;

    @FindBy(xpath = "//ul[contains(@class,'divide-y')]/li[1]//span[contains(text(),'Stock:')]")
    private WebElement firstProductStock;

    // Constructor
    public SingleVendorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Get Vendor Details Heading
    public String getVendorDetailsHeading() {
        return vendorDetailsHeading.getText();
    }

    // Get Vendor Details
    public String getVendorName() {
        return vendorName.getText();
    }

    public String getVendorEmail() {
        return vendorEmail.getText();
    }

    public String getVendorPhone() {
        return vendorPhone.getText();
    }

    public String getCompanyName() {
        return companyName.getText();
    }

    // Click Edit Button
    public void clickEditButton() {
        editButton.click();
    }

    // Click Save Changes Button
    public void clickSaveChangesButton() {
        saveChangesButton.click();
    }

    // Edit Vendor Details
    public void editVendorDetails(String newValue) {
        editField.clear();
        editField.sendKeys(newValue);
    }

    // Get Vendor Products Heading
    public String getVendorProductsHeading() {
        return vendorProductsHeading.getText();
    }

    // Click on the First Product Link
    public void clickFirstProductLink() {
        firstProductLink.click();
    }

    // Get First Product Stock Text
    public String getFirstProductStock() {
        return firstProductStock.getText();
    }

    // Verify Single Vendor Page Title
    public void verifySingleVendorTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    // Verify Single Vendor Page URL
    public void verifySingleVendorUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
