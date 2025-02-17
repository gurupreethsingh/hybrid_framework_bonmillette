package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Verification {

    // Constructor to initialize elements
    public LoginPage(WebDriver driver) {
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

    // Login Page Elements
    @FindBy(xpath = "//h2[contains(text(),'Log in to your account')]")
    private WebElement loginHeader;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    private WebElement signInButton;

    @FindBy(xpath = "//button[contains(text(),'Sign in with Google')]")
    private WebElement googleSignInButton;

    @FindBy(xpath = "//p[contains(text(),'Don't have an account')]//a[contains(@href, 'register')]")
    private WebElement signUpLink;

    @FindBy(xpath = "//div[contains(@class, 'text-red-600')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//button[contains(@class, 'cursor-pointer')]")
    private WebElement togglePasswordVisibility;

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

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public void clickGoogleSignIn() {
        googleSignInButton.click();
    }

    public void clickSignUpLink() {
        signUpLink.click();
    }

    public void togglePasswordVisibility() {
        togglePasswordVisibility.click();
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
    public void verifyLoginPageTitle(String expectedTitle, SoftAssert softAssert) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyLoginPageUrl(String expectedUrl, SoftAssert softAssert) throws IOException {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyLoginHeader(SoftAssert softAssert) {
        softAssert.assertTrue(loginHeader.isDisplayed(), "❌ Login header is not visible.");
    }

    public void verifyEmailInputVisible(SoftAssert softAssert) {
        softAssert.assertTrue(emailInput.isDisplayed(), "❌ Email input is not visible.");
    }

    public void verifyPasswordInputVisible(SoftAssert softAssert) {
        softAssert.assertTrue(passwordInput.isDisplayed(), "❌ Password input is not visible.");
    }

    public void verifySignInButtonVisible(SoftAssert softAssert) {
        softAssert.assertTrue(signInButton.isDisplayed(), "❌ Sign-in button is not visible.");
    }

    public void verifyGoogleSignInButtonVisible(SoftAssert softAssert) {
        softAssert.assertTrue(googleSignInButton.isDisplayed(), "❌ Google Sign-in button is not visible.");
    }

    public void verifySignUpLinkVisible(SoftAssert softAssert) {
        softAssert.assertTrue(signUpLink.isDisplayed(), "❌ Sign-up link is not visible.");
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
