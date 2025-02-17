package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import org.openqa.selenium.WebDriver;

public class OrdersPage extends Verification {

    // Constructor to initialize elements
    public OrdersPage(WebDriver driver) {
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

    @FindBy(xpath = "//a[contains(@href, 'edit-account')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // Orders Page Elements
    @FindBy(xpath = "//h2[contains(text(),'My Orders')]")
    private WebElement myOrdersHeader;

    @FindBy(xpath = "//table[contains(@class, 'order-table')]")
    private WebElement ordersTable;

    @FindBy(xpath = "//button[contains(text(),'View Details')]")
    private WebElement viewDetailsButton;

    @FindBy(xpath = "//button[contains(text(),'Cancel Order')]")
    private WebElement cancelOrderButton;

    @FindBy(xpath = "//div[contains(@class, 'text-red-600')]")
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

    public void clickViewOrderDetails() {
        viewDetailsButton.click();
    }

    public void clickCancelOrder() {
        cancelOrderButton.click();
    }

    public boolean isOrdersTableDisplayed() {
        return ordersTable.isDisplayed();
    }

    public boolean isViewDetailsButtonDisplayed() {
        return viewDetailsButton.isDisplayed();
    }

    public boolean isCancelOrderButtonDisplayed() {
        return cancelOrderButton.isDisplayed();
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
    public void verifyOrdersPageTitle(String expectedTitle, SoftAssert softAssert) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyOrdersPageUrl(String expectedUrl, SoftAssert softAssert) throws IOException {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyOrdersHeader(SoftAssert softAssert) {
        softAssert.assertTrue(myOrdersHeader.isDisplayed(), "❌ Orders header is not visible.");
    }

    public void verifyOrdersTableVisible(SoftAssert softAssert) {
        softAssert.assertTrue(ordersTable.isDisplayed(), "❌ Orders table is not visible.");
    }

    public void verifyViewDetailsButtonVisible(SoftAssert softAssert) {
        softAssert.assertTrue(viewDetailsButton.isDisplayed(), "❌ View Details button is not visible.");
    }

    public void verifyCancelOrderButtonVisible(SoftAssert softAssert) {
        softAssert.assertTrue(cancelOrderButton.isDisplayed(), "❌ Cancel Order button is not visible.");
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
