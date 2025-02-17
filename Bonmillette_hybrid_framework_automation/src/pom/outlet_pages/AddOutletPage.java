package pom.outlet_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AddOutletPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================
    
    @FindBy(xpath = "//h2[contains(text(),'Add New Outlet')]")
    private WebElement addOutletTitle;

    @FindBy(xpath = "//button[contains(text(),'View All Outlets')]")
    private WebElement viewAllOutletsButton;

    // ========================== OUTLET DETAILS ==========================

    @FindBy(name = "outlet_name")
    private WebElement outletNameInput;

    @FindBy(name = "location")
    private WebElement locationInput;

    @FindBy(name = "outlet_email")
    private WebElement outletEmailInput;

    @FindBy(name = "outlet_phone")
    private WebElement outletPhoneInput;

    // ========================== ADDRESS DETAILS ==========================

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

    // ========================== COMPANY DETAILS ==========================

    @FindBy(name = "company_name")
    private WebElement companyNameInput;

    @FindBy(name = "company_registration_number")
    private WebElement companyRegistrationNumberInput;

    // ========================== BANK DETAILS ==========================

    @FindBy(name = "bank_name")
    private WebElement bankNameInput;

    @FindBy(name = "account_number")
    private WebElement accountNumberInput;

    @FindBy(name = "ifsc_code")
    private WebElement ifscCodeInput;

    // ========================== STATUS DROPDOWN ==========================

    @FindBy(name = "status")
    private WebElement statusDropdown;

    // ========================== BUTTONS ==========================

    @FindBy(xpath = "//button[contains(text(),'Add Outlet')]")
    private WebElement addOutletButton;

    // ========================== CONSTRUCTOR ==========================

    public AddOutletPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public String getAddOutletTitle() {
        return addOutletTitle.getText();
    }

    public void clickViewAllOutlets() {
        viewAllOutletsButton.click();
    }

    public void enterOutletName(String outletName) {
        outletNameInput.clear();
        outletNameInput.sendKeys(outletName);
    }

    public void enterLocation(String location) {
        locationInput.clear();
        locationInput.sendKeys(location);
    }

    public void enterOutletEmail(String email) {
        outletEmailInput.clear();
        outletEmailInput.sendKeys(email);
    }

    public void enterOutletPhone(String phone) {
        outletPhoneInput.clear();
        outletPhoneInput.sendKeys(phone);
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

    public void enterZipCode(String zipCode) {
        zipCodeInput.clear();
        zipCodeInput.sendKeys(zipCode);
    }

    public void enterCountry(String country) {
        countryInput.clear();
        countryInput.sendKeys(country);
    }

    public void enterCompanyName(String companyName) {
        companyNameInput.clear();
        companyNameInput.sendKeys(companyName);
    }

    public void enterCompanyRegistrationNumber(String registrationNumber) {
        companyRegistrationNumberInput.clear();
        companyRegistrationNumberInput.sendKeys(registrationNumber);
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
        selectDropdownValue(statusDropdown, status);
    }

    public void clickAddOutletButton() {
        addOutletButton.click();
    }

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}
