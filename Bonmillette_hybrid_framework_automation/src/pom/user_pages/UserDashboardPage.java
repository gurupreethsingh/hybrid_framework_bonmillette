package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class UserDashboardPage extends Verification {

    // Constructor to initialize elements
    public UserDashboardPage(WebDriver driver) {
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

    // Sidebar Navigation
    @FindBy(xpath = "//a[contains(@href, 'user-dashboard')]")
    private WebElement dashboardNav;

    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement myOrdersNav;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement addressesNav;

    @FindBy(xpath = "//a[contains(@href, 'profile')]")
    private WebElement profileNav;

    @FindBy(xpath = "//button[contains(text(), 'Logout')]")
    private WebElement logoutButton;

    // Search Field
    @FindBy(xpath = "//input[@placeholder='Search cards...']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[contains(@aria-label, 'Search')]")
    private WebElement searchButton;

    // Dashboard Cards
    @FindBy(xpath = "//div[contains(@class, 'card-body')]//h5")
    private List<WebElement> dashboardCards;

    @FindBy(xpath = "//div[contains(@class, 'card-body')]//p")
    private List<WebElement> dashboardCardValues;

    // Tabs
    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement recentOrdersTab;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement shippingBillingTab;

    @FindBy(xpath = "//a[contains(@href, 'forgot-password')]")
    private WebElement changePasswordTab;

    @FindBy(xpath = "//a[contains(@href, 'add-issue')]")
    private WebElement raiseComplaintTab;

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

    public void enterSearchTerm(String searchTerm) {
        searchInput.clear();
        searchInput.sendKeys(searchTerm);
        searchButton.click();
    }

    public void clickDashboardNav() {
        dashboardNav.click();
    }

    public void clickMyOrdersNav() {
        myOrdersNav.click();
    }

    public void clickAddressesNav() {
        addressesNav.click();
    }

    public void clickProfileNav() {
        profileNav.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public void clickRecentOrdersTab() {
        recentOrdersTab.click();
    }

    public void clickShippingBillingTab() {
        shippingBillingTab.click();
    }

    public void clickChangePasswordTab() {
        changePasswordTab.click();
    }

    public void clickRaiseComplaintTab() {
        raiseComplaintTab.click();
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

    // Get Total Orders Count
    public int getTotalOrders() {
        for (WebElement card : dashboardCards) {
            if (card.getText().equals("Total Orders")) {
                return Integer.parseInt(dashboardCardValues.get(dashboardCards.indexOf(card)).getText());
            }
        }
        return 0;
    }

    // Get Raised Issues Count
    public int getUserIssuesCount() {
        for (WebElement card : dashboardCards) {
            if (card.getText().equals("Raised Issues")) {
                return Integer.parseInt(dashboardCardValues.get(dashboardCards.indexOf(card)).getText());
            }
        }
        return 0;
    }

    // Verification Methods using SoftAssert
    public void verifyUserDashboardTitle(String expectedTitle, SoftAssert softAssert) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyUserDashboardUrl(String expectedUrl, SoftAssert softAssert) throws IOException {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyDashboardNav(SoftAssert softAssert) {
        softAssert.assertTrue(dashboardNav.isDisplayed(), "❌ Dashboard navigation is not visible.");
    }

    public void verifyOrdersNav(SoftAssert softAssert) {
        softAssert.assertTrue(myOrdersNav.isDisplayed(), "❌ Orders navigation is not visible.");
    }

    public void verifyAddressesNav(SoftAssert softAssert) {
        softAssert.assertTrue(addressesNav.isDisplayed(), "❌ Addresses navigation is not visible.");
    }

    public void verifyProfileNav(SoftAssert softAssert) {
        softAssert.assertTrue(profileNav.isDisplayed(), "❌ Profile navigation is not visible.");
    }

    public void verifyLogoutButton(SoftAssert softAssert) {
        softAssert.assertTrue(logoutButton.isDisplayed(), "❌ Logout button is not visible.");
    }

    public void verifyDashboardCards(SoftAssert softAssert) {
        softAssert.assertTrue(dashboardCards.size() > 0, "❌ No dashboard cards are visible.");
    }

    public void verifyFooterElements(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link is not visible.");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms & Conditions link is not visible.");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link is not visible.");
        softAssert.assertTrue(copyrightText.isDisplayed(), "❌ Copyright text is missing.");
    }
}
