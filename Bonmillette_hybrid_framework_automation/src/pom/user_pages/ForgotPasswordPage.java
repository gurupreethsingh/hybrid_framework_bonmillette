package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends Verification {

    // Constructor to initialize elements
    public ForgotPasswordPage(WebDriver driver) {
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

    // Forgot Password Page Elements
    @FindBy(xpath = "//h2[contains(text(),'Forgot Password')]")
    private WebElement forgotPasswordHeader;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[contains(text(),'Send OTP')]")
    private WebElement sendOtpButton;

    @FindBy(xpath = "//input[@id='otp']")
    private WebElement otpInput;

    @FindBy(xpath = "//button[contains(text(),'Verify OTP')]")
    private WebElement verifyOtpButton;

    @FindBy(xpath = "//p[contains(@class, 'text-red-600')]")
    private WebElement errorMessage;

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

    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void clickSendOtp() {
        sendOtpButton.click();
    }

    public void enterOtp(String otp) {
        otpInput.clear();
        otpInput.sendKeys(otp);
    }

    public void clickVerifyOtp() {
        verifyOtpButton.click();
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
    public void verifyForgotPasswordPageTitle(String expectedTitle, SoftAssert softAssert) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyForgotPasswordPageUrl(String expectedUrl, SoftAssert softAssert) throws IOException {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyForgotPasswordHeader(SoftAssert softAssert) {
        softAssert.assertTrue(forgotPasswordHeader.isDisplayed(), "❌ Forgot Password header is not visible.");
    }

    public void verifyEmailInputVisible(SoftAssert softAssert) {
        softAssert.assertTrue(emailInput.isDisplayed(), "❌ Email input is not visible.");
    }

    public void verifySendOtpButtonVisible(SoftAssert softAssert) {
        softAssert.assertTrue(sendOtpButton.isDisplayed(), "❌ Send OTP button is not visible.");
    }

    public void verifyOtpInputVisible(SoftAssert softAssert) {
        softAssert.assertTrue(otpInput.isDisplayed(), "❌ OTP input is not visible.");
    }

    public void verifyVerifyOtpButtonVisible(SoftAssert softAssert) {
        softAssert.assertTrue(verifyOtpButton.isDisplayed(), "❌ Verify OTP button is not visible.");
    }

    public void verifyErrorMessageVisible(SoftAssert softAssert) {
        softAssert.assertTrue(errorMessage.isDisplayed(), "❌ Error message is not visible.");
    }

    public void verifyFooterElements(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link is not visible.");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms & Conditions link is not visible.");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link is not visible.");
        softAssert.assertTrue(copyrightText.isDisplayed(), "❌ Copyright text is missing.");
    }
}
