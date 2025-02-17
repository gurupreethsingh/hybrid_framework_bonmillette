package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import org.openqa.selenium.WebDriver;

public class SingleUserPage extends Verification {

    // Constructor to initialize elements
    public SingleUserPage(WebDriver driver) {
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

    // Single User Page Elements
    @FindBy(xpath = "//h1[contains(text(),\"'s Profile\")]")
    private WebElement userProfileHeader;

    @FindBy(xpath = "//p[contains(text(),'Name:')]")
    private WebElement userName;

    @FindBy(xpath = "//p[contains(text(),'Email:')]")
    private WebElement userEmail;

    @FindBy(xpath = "//p[contains(text(),'Role:')]")
    private WebElement userRole;

    @FindBy(xpath = "//select[@class='border w-full p-2 rounded']")
    private WebElement roleDropdown;

    @FindBy(xpath = "//button[contains(text(),'Update Role')]")
    private WebElement updateRoleButton;

    @FindBy(xpath = "//div[contains(@class,'bg-green-100')]")
    private WebElement successMessage;

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

    public String getUserName() {
        return userName.getText();
    }

    public String getUserEmail() {
        return userEmail.getText();
    }

    public String getUserRole() {
        return userRole.getText();
    }

    public void selectUserRole(String role) {
        selectDropdownValue(roleDropdown, role);
    }

    public void clickUpdateRoleButton() {
        updateRoleButton.click();
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }

    public String getSuccessMessageText() {
        return successMessage.getText();
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
    public void verifySingleUserPageTitle(String expectedTitle, SoftAssert softAssert) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifySingleUserPageUrl(String expectedUrl, SoftAssert softAssert) throws IOException {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyUserProfileHeader(SoftAssert softAssert) {
        softAssert.assertTrue(userProfileHeader.isDisplayed(), "❌ User Profile header is not visible.");
    }

    public void verifyUpdateRoleButton(SoftAssert softAssert) {
        softAssert.assertTrue(updateRoleButton.isDisplayed(), "❌ Update Role button is not visible.");
    }

    public void verifyFooterElements(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link is not visible.");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms & Conditions link is not visible.");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link is not visible.");
        softAssert.assertTrue(copyrightText.isDisplayed(), "❌ Copyright text is missing.");
    }
}
