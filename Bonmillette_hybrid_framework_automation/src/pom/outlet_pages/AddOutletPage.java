package pom.outlet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AddOutletPage extends Verification {

    // Page Heading
    @FindBy(xpath = "//h2[contains(text(),'Add New Outlet')]")
    private WebElement addOutletHeading;

    // Outlet Name Input Field
    @FindBy(name = "outlet_name")
    private WebElement outletNameInput;

    // Location Input Field
    @FindBy(name = "location")
    private WebElement locationInput;

    // Outlet Email Input Field
    @FindBy(name = "outlet_email")
    private WebElement outletEmailInput;

    // Outlet Phone Input Field
    @FindBy(name = "outlet_phone")
    private WebElement outletPhoneInput;

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

    // Company Details
    @FindBy(name = "company_name")
    private WebElement companyNameInput;

    @FindBy(name = "company_registration_number")
    private WebElement companyRegistrationNumberInput;

    // Bank Details
    @FindBy(name = "bank_name")
    private WebElement bankNameInput;

    @FindBy(name = "account_number")
    private WebElement accountNumberInput;

    @FindBy(name = "ifsc_code")
    private WebElement ifscCodeInput;

    // Status Dropdown
    @FindBy(name = "status")
    private WebElement statusDropdown;

    // Submit Button
    @FindBy(xpath = "//button[contains(text(),'Add Outlet')]")
    private WebElement addOutletButton;

    // View All Outlets Button
    @FindBy(xpath = "//button[contains(text(),'View All Outlets')]")
    private WebElement viewAllOutletsButton;

    // Constructor
    public AddOutletPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Get Add Outlet Page Heading
    public String getAddOutletHeading() {
        return addOutletHeading.getText();
    }

    // Enter Outlet Name
    public void enterOutletName(String outletName) {
        outletNameInput.clear();
        outletNameInput.sendKeys(outletName);
    }

    // Enter Location
    public void enterLocation(String location) {
        locationInput.clear();
        locationInput.sendKeys(location);
    }

    // Enter Outlet Email
    public void enterOutletEmail(String email) {
        outletEmailInput.clear();
        outletEmailInput.sendKeys(email);
    }

    // Enter Outlet Phone
    public void enterOutletPhone(String phone) {
        outletPhoneInput.clear();
        outletPhoneInput.sendKeys(phone);
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
    public void enterCompanyRegistrationNumber(String regNumber) {
        companyRegistrationNumberInput.clear();
        companyRegistrationNumberInput.sendKeys(regNumber);
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

    // Select Status
    public void selectStatus(String status) {
        selectDropdownOption(statusDropdown, status);
    }

    // Click Add Outlet Button
    public void clickAddOutletButton() {
        addOutletButton.click();
    }

    // Click View All Outlets Button
    public void clickViewAllOutletsButton() {
        viewAllOutletsButton.click();
    }

    // Verify Add Outlet Page Title
    public void verifyAddOutletTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    // Verify Add Outlet Page URL
    public void verifyAddOutletUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
