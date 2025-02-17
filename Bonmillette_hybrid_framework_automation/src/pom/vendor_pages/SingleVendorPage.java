package pom.vendor_pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

import java.util.List;

public class SingleVendorPage extends Verification {

    // Constructor - Initialize elements using PageFactory
    public SingleVendorPage(WebDriver driver) {
        super(driver); // Calling parent class constructor
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//h2[contains(text(),'Vendor Details')]")
    private WebElement vendorDetailsHeading;

    @FindBy(xpath = "//h2[contains(text(),'Vendor Products')]")
    private WebElement vendorProductsHeading;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    private WebElement editButton;

    @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
    private WebElement saveChangesButton;

    @FindBy(xpath = "//span[contains(text(),'Vendor Name:')]/following-sibling::span")
    private WebElement vendorNameText;

    @FindBy(xpath = "//span[contains(text(),'Email:')]/following-sibling::span")
    private WebElement vendorEmailText;

    @FindBy(xpath = "//span[contains(text(),'Phone:')]/following-sibling::span")
    private WebElement vendorPhoneText;

    @FindBy(xpath = "//span[contains(text(),'Company Name:')]/following-sibling::span")
    private WebElement vendorCompanyNameText;

    @FindBy(xpath = "//input[@type='text']")
    private List<WebElement> editInputs;

    @FindBy(xpath = "//ul[contains(@class,'divide-y')]/li")
    private List<WebElement> vendorProductsList;

    @FindBy(xpath = "//button[contains(@class,'text-red-500')]")
    private WebElement deleteVendorButton;

    // Actions

    /** Get Vendor Details */
    public String getVendorName() {
        return vendorNameText.getText();
    }

    public String getVendorEmail() {
        return vendorEmailText.getText();
    }

    public String getVendorPhone() {
        return vendorPhoneText.getText();
    }

    public String getCompanyName() {
        return vendorCompanyNameText.getText();
    }

    /** Click Edit Button */
    public void clickEditButton() {
        waitForElementToBeClickable(editButton).click();
    }

    /** Update Vendor Details */
    public void updateVendorDetails(String vendorName, String email, String phone, String companyName) {
        clickEditButton();
        waitForElementsToBeVisible(editInputs);

        // Fill input fields
        editInputs.get(0).clear();
        editInputs.get(0).sendKeys(vendorName);

        editInputs.get(1).clear();
        editInputs.get(1).sendKeys(email);

        editInputs.get(2).clear();
        editInputs.get(2).sendKeys(phone);

        editInputs.get(3).clear();
        editInputs.get(3).sendKeys(companyName);

        // Click Save Changes
        saveChangesButton.click();
    }

    /** Get List of Vendor Products */
    public int getVendorProductsCount() {
        return vendorProductsList.size();
    }

    /** Delete Vendor */
    public void deleteVendor() {
        waitForElementToBeClickable(deleteVendorButton).click();
        acceptAlert(); // Inherited from Verification class
    }

    /** Verify if Vendor Details Page is Opened */
    public boolean isVendorDetailsPageDisplayed(SoftAssert softAssert) {
        return verifyTextPresent("Vendor Details", softAssert);
    }

    /** Verify if Vendor Products Section is Opened */
    public boolean isVendorProductsSectionDisplayed(SoftAssert softAssert) {
        return verifyTextPresent("Vendor Products", softAssert);
    }
}
