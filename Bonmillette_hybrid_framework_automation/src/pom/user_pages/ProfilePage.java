package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends Verification {

    // Constructor to initialize elements
    public ProfilePage(WebDriver driver) {
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

    // Sidebar Navigation Elements
    @FindBy(xpath = "//a[contains(@href, 'dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement myOrdersLink;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//a[contains(@href, 'profile')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // Profile Page Elements
    @FindBy(xpath = "//h3[contains(text(),'Profile Information')]")
    private WebElement profileHeader;

    @FindBy(xpath = "//dt[contains(text(),'Full Name')]/following-sibling::dd")
    private WebElement fullName;

    @FindBy(xpath = "//dt[contains(text(),'Email Address')]/following-sibling::dd")
    private WebElement emailAddress;

    @FindBy(xpath = "//dt[contains(text(),'Phone')]/following-sibling::dd")
    private WebElement phoneNumber;

    @FindBy(xpath = "//dt[contains(text(),'Role')]/following-sibling::dd")
    private WebElement userRole;

    @FindBy(xpath = "//dt[contains(text(),'Street')]/following-sibling::dd")
    private WebElement street;

    @FindBy(xpath = "//dt[contains(text(),'City')]/following-sibling::dd")
    private WebElement city;

    @FindBy(xpath = "//dt[contains(text(),'State')]/following-sibling::dd")
    private WebElement state;

    @FindBy(xpath = "//dt[contains(text(),'Postal Code')]/following-sibling::dd")
    private WebElement postalCode;

    @FindBy(xpath = "//dt[contains(text(),'Country')]/following-sibling::dd")
    private WebElement country;

    @FindBy(xpath = "//button[contains(text(),'Update Billing Address')]")
    private WebElement updateBillingAddressButton;

    @FindBy(xpath = "//img[contains(@class, 'object-cover')]")
    private WebElement profileImage;

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

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickMyOrdersLink() {
        myOrdersLink.click();
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

    public void clickUpdateBillingAddress() {
        updateBillingAddressButton.click();
    }

    public boolean isProfileHeaderDisplayed() {
        return profileHeader.isDisplayed();
    }

    public boolean isProfileImageDisplayed() {
        return profileImage.isDisplayed();
    }

    public String getFullName() {
        return fullName.getText();
    }

    public String getEmailAddress() {
        return emailAddress.getText();
    }

    public String getPhoneNumber() {
        return phoneNumber.getText();
    }

    public String getUserRole() {
        return userRole.getText();
    }

    public String getStreet() {
        return street.getText();
    }

    public String getCity() {
        return city.getText();
    }

    public String getState() {
        return state.getText();
    }

    public String getPostalCode() {
        return postalCode.getText();
    }

    public String getCountry() {
        return country.getText();
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
    public void verifyProfilePageTitle(String expectedTitle, SoftAssert softAssert) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyProfilePageUrl(String expectedUrl, SoftAssert softAssert) throws IOException {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyProfileHeader(SoftAssert softAssert) {
        softAssert.assertTrue(profileHeader.isDisplayed(), "❌ Profile header is not visible.");
    }

    public void verifyProfileImage(SoftAssert softAssert) {
        softAssert.assertTrue(profileImage.isDisplayed(), "❌ Profile image is not visible.");
    }

    public void verifyFullName(String expectedName, SoftAssert softAssert) {
        softAssert.assertEquals(getFullName(), expectedName, "❌ Full name does not match.");
    }

    public void verifyEmailAddress(String expectedEmail, SoftAssert softAssert) {
        softAssert.assertEquals(getEmailAddress(), expectedEmail, "❌ Email does not match.");
    }

    public void verifyPhoneNumber(String expectedPhone, SoftAssert softAssert) {
        softAssert.assertEquals(getPhoneNumber(), expectedPhone, "❌ Phone number does not match.");
    }

    public void verifyUserRole(String expectedRole, SoftAssert softAssert) {
        softAssert.assertEquals(getUserRole(), expectedRole, "❌ User role does not match.");
    }

    public void verifyAddressDetails(String expectedStreet, String expectedCity, String expectedState,
                                     String expectedPostalCode, String expectedCountry, SoftAssert softAssert) {
        softAssert.assertEquals(getStreet(), expectedStreet, "❌ Street does not match.");
        softAssert.assertEquals(getCity(), expectedCity, "❌ City does not match.");
        softAssert.assertEquals(getState(), expectedState, "❌ State does not match.");
        softAssert.assertEquals(getPostalCode(), expectedPostalCode, "❌ Postal code does not match.");
        softAssert.assertEquals(getCountry(), expectedCountry, "❌ Country does not match.");
    }

    public void verifyFooterElements(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link is not visible.");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms & Conditions link is not visible.");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link is not visible.");
        softAssert.assertTrue(copyrightText.isDisplayed(), "❌ Copyright text is missing.");
    }
}
