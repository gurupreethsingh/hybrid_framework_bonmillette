package pom.vendor_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AddVendorPage extends Verification {

    // Page Heading
    @FindBy(xpath = "//h2[contains(text(),'Add New Vendor')]")
    private WebElement addVendorHeading;

    // Vendor Name
    @FindBy(name = "vendor_name")
    private WebElement vendorNameInput;

    // Email
    @FindBy(name = "vendor_email")
    private WebElement vendorEmailInput;

    // Phone
    @FindBy(name = "vendor_phone")
    private WebElement vendorPhoneInput;

    // Address Fields
    @FindBy(name = "street")
    private WebElement streetInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "state")
    private WebElement stateInput;

    @FindBy(name = "zip_code")
    private WebElement zipCodeInput;

    @FindBy(name = "country")
    private WebElement countryInput;

    // Company Name
    @FindBy(name = "company_name")
    private WebElement companyNameInput;

    // Company Registration Number
    @FindBy(name = "company_registration_number")
    private WebElement registrationNumberInput;

    // Bank Details
    @FindBy(name = "bank_name")
    private WebElement bankNameInput;

    @FindBy(name = "account_number")
    private WebElement accountNumberInput;

    @FindBy(name = "ifsc_code")
    private WebElement ifscCodeInput;

    // Submit Button
    @FindBy(xpath = "//button[contains(text(),'Add Vendor')]")
    private WebElement addVendorButton;

    // View All Vendors Button
    @FindBy(xpath = "//button[contains(text(),'View All Vendors')]")
    private WebElement viewAllVendorsButton;

    // Constructor
    public AddVendorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Get Add Vendor Page Heading
    public String getAddVendorHeading() {
        return addVendorHeading.getText();
    }

    // Enter Vendor Name
    public void enterVendorName(String vendorName) {
        vendorNameInput.clear();
        vendorNameInput.sendKeys(vendorName);
    }

    // Enter Vendor Email
    public void enterVendorEmail(String email) {
        vendorEmailInput.clear();
        vendorEmailInput.sendKeys(email);
    }

    // Enter Vendor Phone
    public void enterVendorPhone(String phone) {
        vendorPhoneInput.clear();
        vendorPhoneInput.sendKeys(phone);
    }

    // Enter Street Address
    public void enterStreet(String street) {
        streetInput.clear();
        streetInput.sendKeys(street);
    }

    // Enter City
    public void enterCity(String city) {
        cityInput.clear();
        cityInput.sendKeys(city);
    }

    // Enter State
    public void enterState(String state) {
        stateInput.clear();
        stateInput.sendKeys(state);
    }

    // Enter Zip Code
    public void enterZipCode(String zipCode) {
        zipCodeInput.clear();
        zipCodeInput.sendKeys(zipCode);
    }

    // Enter Country
    public void enterCountry(String country) {
        countryInput.clear();
        countryInput.sendKeys(country);
    }

    // Enter Company Name
    public void enterCompanyName(String companyName) {
        companyNameInput.clear();
        companyNameInput.sendKeys(companyName);
    }

    // Enter Company Registration Number
    public void enterRegistrationNumber(String registrationNumber) {
        registrationNumberInput.clear();
        registrationNumberInput.sendKeys(registrationNumber);
    }

    // Enter Bank Name
    public void enterBankName(String bankName) {
        bankNameInput.clear();
        bankNameInput.sendKeys(bankName);
    }

    // Enter Account Number
    public void enterAccountNumber(String accountNumber) {
        accountNumberInput.clear();
        accountNumberInput.sendKeys(accountNumber);
    }

    // Enter IFSC Code
    public void enterIfscCode(String ifscCode) {
        ifscCodeInput.clear();
        ifscCodeInput.sendKeys(ifscCode);
    }

    // Click Add Vendor Button
    public void clickAddVendorButton() {
        addVendorButton.click();
    }

    // Click View All Vendors Button
    public void clickViewAllVendorsButton() {
        viewAllVendorsButton.click();
    }

    // Verify Add Vendor Page Title
    public void verifyAddVendorTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    // Verify Add Vendor Page URL
    public void verifyAddVendorUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
