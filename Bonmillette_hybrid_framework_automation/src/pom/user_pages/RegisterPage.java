package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Verification {

    // Constructor to initialize elements
    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Header Elements
    @FindBy(xpath = "//nav//a[contains(@href, 'home')]")
    private WebElement homeLink;

    @FindBy(xpath = "//nav//a[contains(@href, 'shop')]")
    private WebElement shopLink;

    @FindBy(xpath = "//nav//a[contains(@href, 'contact-us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//nav//button[contains(text(),'My Account')]")
    private WebElement myAccountButton;

    @FindBy(xpath = "//nav//button[contains(@aria-label, 'Cart')]")
    private WebElement cartButton;

    // Registration Form Elements
    @FindBy(xpath = "//h2[contains(text(),'Create a new account')]")
    private WebElement registerHeader;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement nameInput;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='registerWithGST']")
    private WebElement registerWithGSTCheckbox;

    @FindBy(xpath = "//input[@id='companyName']")
    private WebElement companyNameInput;

    @FindBy(xpath = "//input[@id='companyAddress']")
    private WebElement companyAddressInput;

    @FindBy(xpath = "//input[@id='gstNumber']")
    private WebElement gstNumberInput;

    @FindBy(xpath = "//input[@id='promotionalConsent']")
    private WebElement promotionalConsentCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signUpButton;

    @FindBy(xpath = "//a[contains(@href, 'my-account')]")
    private WebElement signInLink;

    // Footer Elements
    @FindBy(xpath = "//footer//a[contains(@href, 'privacy-policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//footer//a[contains(@href, 'terms-and-conditions')]")
    private WebElement termsConditionsLink;

    @FindBy(xpath = "//footer//a[contains(@href, 'return-policy')]")
    private WebElement returnPolicyLink;

    @FindBy(xpath = "//footer//p[contains(text(),'©')]")
    private WebElement copyrightText;

    // Methods to interact with elements
    public void clickHomeLink() {
        homeLink.click();
    }

    public void clickShopLink() {
        shopLink.click();
    }

    public void clickContactUsLink() {
        contactUsLink.click();
    }

    public void clickMyAccount() {
        myAccountButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void enterName(String name) {
        nameInput.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void selectRegisterWithGST() {
        if (!registerWithGSTCheckbox.isSelected()) {
            registerWithGSTCheckbox.click();
        }
    }

    public void enterCompanyName(String companyName) {
        companyNameInput.sendKeys(companyName);
    }

    public void enterCompanyAddress(String companyAddress) {
        companyAddressInput.sendKeys(companyAddress);
    }

    public void enterGSTNumber(String gstNumber) {
        gstNumberInput.sendKeys(gstNumber);
    }

    public void selectPromotionalConsent() {
        if (!promotionalConsentCheckbox.isSelected()) {
            promotionalConsentCheckbox.click();
        }
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public void clickPrivacyPolicy() {
        privacyPolicyLink.click();
    }

    public void clickTermsAndConditions() {
        termsConditionsLink.click();
    }

    public void clickReturnPolicy() {
        returnPolicyLink.click();
    }

    // Verification Methods using SoftAssert
    public void verifyRegisterPageTitle(String expectedTitle, SoftAssert softAssert) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyRegisterPageUrl(String expectedUrl, SoftAssert softAssert) throws IOException {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyRegisterHeader(SoftAssert softAssert) {
        softAssert.assertTrue(registerHeader.isDisplayed(), "❌ Register header is not visible.");
    }

    public void verifyRegisterWithGSTCheckbox(SoftAssert softAssert) {
        softAssert.assertTrue(registerWithGSTCheckbox.isDisplayed(), "❌ Register with GST checkbox is not visible.");
    }

    public void verifySignUpButton(SoftAssert softAssert) {
        softAssert.assertTrue(signUpButton.isDisplayed(), "❌ Sign-up button is not visible.");
    }

    public void verifyFooterElements(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link is not visible.");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms & Conditions link is not visible.");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link is not visible.");
        softAssert.assertTrue(copyrightText.isDisplayed(), "❌ Copyright text is missing.");
    }
}
