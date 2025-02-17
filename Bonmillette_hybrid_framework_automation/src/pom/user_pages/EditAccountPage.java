package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import org.openqa.selenium.WebDriver;

public class EditAccountPage extends Verification {

    // Constructor to initialize elements
    public EditAccountPage(WebDriver driver) {
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

    // Account Page Elements
    @FindBy(xpath = "//h3[contains(text(),'Navigation')]")
    private WebElement navigationHeader;

    @FindBy(xpath = "//a[contains(@href, 'superadmin-dashboard') or contains(@href, 'user-dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement ordersLink;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//a[contains(@href, 'profile')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // Form Elements
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='profileImage']")
    private WebElement profileImageUpload;

    @FindBy(xpath = "//input[@id='currentPassword']")
    private WebElement currentPasswordInput;

    @FindBy(xpath = "//input[@id='newPassword']")
    private WebElement newPasswordInput;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
    private WebElement saveChangesButton;

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

    public void enterFirstName(String firstName) {
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
    }

    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void uploadProfileImage(String filePath) {
        profileImageUpload.sendKeys(filePath);
    }

    public void enterCurrentPassword(String password) {
        currentPasswordInput.sendKeys(password);
    }

    public void enterNewPassword(String password) {
        newPasswordInput.sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
        confirmPasswordInput.sendKeys(password);
    }

    public void clickSaveChanges() {
        saveChangesButton.click();
    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickOrdersLink() {
        ordersLink.click();
    }

    public void clickAddressesLink() {
        addressesLink.click();
    }

    public void clickAccountDetailsLink() {
        accountDetailsLink.click();
    }

    public void clickLogout() {
        logoutButton.click();
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
    public void verifyEditAccountPageTitle(String expectedTitle, SoftAssert softAssert) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyEditAccountPageUrl(String expectedUrl, SoftAssert softAssert) throws IOException {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyFirstNameInputVisible(SoftAssert softAssert) {
        softAssert.assertTrue(firstNameInput.isDisplayed(), "❌ First Name input is not visible.");
    }

    public void verifyEmailInputVisible(SoftAssert softAssert) {
        softAssert.assertTrue(emailInput.isDisplayed(), "❌ Email input is not visible.");
    }

    public void verifySaveChangesButtonVisible(SoftAssert softAssert) {
        softAssert.assertTrue(saveChangesButton.isDisplayed(), "❌ Save Changes button is not visible.");
    }

    public void verifyLogoutButtonVisible(SoftAssert softAssert) {
        softAssert.assertTrue(logoutButton.isDisplayed(), "❌ Logout button is not visible.");
    }

    public void verifyNavigationHeader(SoftAssert softAssert) {
        softAssert.assertTrue(navigationHeader.isDisplayed(), "❌ Navigation header is not visible.");
    }

    public void verifyFooterElements(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link is not visible.");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms & Conditions link is not visible.");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link is not visible.");
        softAssert.assertTrue(copyrightText.isDisplayed(), "❌ Copyright text is missing.");
    }
}
