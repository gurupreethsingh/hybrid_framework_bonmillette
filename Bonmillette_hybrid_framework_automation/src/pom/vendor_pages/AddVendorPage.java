package pom.vendor_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AddVendorPage extends Verification {

    // Constructor
    public AddVendorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Page Elements (Form Fields)
    @FindBy(name = "vendor_name")
    private WebElement vendorNameInput;

    @FindBy(name = "vendor_email")
    private WebElement vendorEmailInput;

    @FindBy(name = "vendor_phone")
    private WebElement vendorPhoneInput;

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

    @FindBy(name = "company_name")
    private WebElement companyNameInput;

    @FindBy(name = "company_registration_number")
    private WebElement registrationNumberInput;

    @FindBy(name = "bank_name")
    private WebElement bankNameInput;

    @FindBy(name = "account_number")
    private WebElement accountNumberInput;

    @FindBy(name = "ifsc_code")
    private WebElement ifscCodeInput;

    @FindBy(xpath = "//select[@name='status']")
    private WebElement statusDropdown;

    @FindBy(xpath = "//button[contains(text(),'Add Vendor')]")
    private WebElement addVendorButton;

    @FindBy(xpath = "//a[contains(@href, 'all-vendors')]")
    private WebElement viewAllVendorsLink;

    // Methods to interact with form fields
    public void enterVendorName(String name) {
        vendorNameInput.clear();
        vendorNameInput.sendKeys(name);
    }

    public void enterVendorEmail(String email) {
        vendorEmailInput.clear();
        vendorEmailInput.sendKeys(email);
    }

    public void enterVendorPhone(String phone) {
        vendorPhoneInput.clear();
        vendorPhoneInput.sendKeys(phone);
    }

    public void enterStreet(String street) {
        streetInput.clear();
        streetInput.sendKeys(street);
    }

    public void enterCity(String city) {
        cityInput.clear();
        cityInput.sendKeys(city);
    }

    public void enterState(String state) {
        stateInput.clear();
        stateInput.sendKeys(state);
    }

    public void enterZipCode(String zip) {
        zipCodeInput.clear();
        zipCodeInput.sendKeys(zip);
    }

    public void enterCountry(String country) {
        countryInput.clear();
        countryInput.sendKeys(country);
    }

    public void enterCompanyName(String companyName) {
        companyNameInput.clear();
        companyNameInput.sendKeys(companyName);
    }

    public void enterRegistrationNumber(String regNumber) {
        registrationNumberInput.clear();
        registrationNumberInput.sendKeys(regNumber);
    }

    public void enterBankName(String bankName) {
        bankNameInput.clear();
        bankNameInput.sendKeys(bankName);
    }

    public void enterAccountNumber(String accountNumber) {
        accountNumberInput.clear();
        accountNumberInput.sendKeys(accountNumber);
    }

    public void enterIFSCCode(String ifscCode) {
        ifscCodeInput.clear();
        ifscCodeInput.sendKeys(ifscCode);
    }

    public void selectStatus(String status) {
        Select select = new Select(statusDropdown);
        select.selectByVisibleText(status);
    }

    public void clickAddVendor() {
        addVendorButton.click();
    }

    public void clickViewAllVendors() {
        viewAllVendorsLink.click();
    }

    // Verification Methods using SoftAssert
    public void verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyPageUrl(String expectedUrl, SoftAssert softAssert) {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyVendorNameField(SoftAssert softAssert) {
        softAssert.assertTrue(vendorNameInput.isDisplayed(), "❌ Vendor Name input is missing.");
    }

    public void verifyVendorEmailField(SoftAssert softAssert) {
        softAssert.assertTrue(vendorEmailInput.isDisplayed(), "❌ Vendor Email input is missing.");
    }

    public void verifyVendorPhoneField(SoftAssert softAssert) {
        softAssert.assertTrue(vendorPhoneInput.isDisplayed(), "❌ Vendor Phone input is missing.");
    }

    public void verifyAddressFields(SoftAssert softAssert) {
        softAssert.assertTrue(streetInput.isDisplayed(), "❌ Street input is missing.");
        softAssert.assertTrue(cityInput.isDisplayed(), "❌ City input is missing.");
        softAssert.assertTrue(stateInput.isDisplayed(), "❌ State input is missing.");
        softAssert.assertTrue(zipCodeInput.isDisplayed(), "❌ Zip Code input is missing.");
        softAssert.assertTrue(countryInput.isDisplayed(), "❌ Country input is missing.");
    }

    public void verifyCompanyDetails(SoftAssert softAssert) {
        softAssert.assertTrue(companyNameInput.isDisplayed(), "❌ Company Name input is missing.");
        softAssert.assertTrue(registrationNumberInput.isDisplayed(), "❌ Registration Number input is missing.");
    }

    public void verifyBankDetails(SoftAssert softAssert) {
        softAssert.assertTrue(bankNameInput.isDisplayed(), "❌ Bank Name input is missing.");
        softAssert.assertTrue(accountNumberInput.isDisplayed(), "❌ Account Number input is missing.");
        softAssert.assertTrue(ifscCodeInput.isDisplayed(), "❌ IFSC Code input is missing.");
    }

    public void verifyStatusDropdown(SoftAssert softAssert) {
        softAssert.assertTrue(statusDropdown.isDisplayed(), "❌ Status dropdown is missing.");
    }

    public void verifyAddVendorButton(SoftAssert softAssert) {
        softAssert.assertTrue(addVendorButton.isDisplayed(), "❌ Add Vendor button is missing.");
    }

    public void verifyViewAllVendorsLink(SoftAssert softAssert) {
        softAssert.assertTrue(viewAllVendorsLink.isDisplayed(), "❌ View All Vendors link is missing.");
    }
}
