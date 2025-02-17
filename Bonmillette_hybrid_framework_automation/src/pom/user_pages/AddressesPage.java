package pom.user_pages;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;
import org.testng.asserts.SoftAssert;

public class AddressesPage extends Verification {
    private SoftAssert softAssert;

    // **🔹 Constructor**
    public AddressesPage(WebDriver driver, SoftAssert softAssert) {
        super(driver);
        this.softAssert = softAssert;
        PageFactory.initElements(driver, this);
    }

    // **🔹 Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//header//a[contains(text(),'Home')]")
    private WebElement homeLink;

    @FindBy(xpath = "//header//a[contains(text(),'Shop')]")
    private WebElement shopLink;

    @FindBy(xpath = "//header//a[contains(text(),'My Account')]")
    private WebElement myAccountLink;

    @FindBy(xpath = "//header//a[contains(text(),'Contact Us')]")
    private WebElement contactUsLink;

    // **🔹 Manage Addresses Section**
    @FindBy(xpath = "//input[@type='text' and @placeholder='Search addresses...']")
    private WebElement searchInput;

    @FindBy(xpath = "//h2[contains(text(),'Manage Addresses')]")
    private WebElement manageAddressesHeader;

    @FindBy(xpath = "//h3[contains(text(),'Billing Address')]")
    private WebElement billingAddressHeader;

    @FindBy(xpath = "//h3[contains(text(),'Shipping Addresses')]")
    private WebElement shippingAddressesHeader;

    @FindBy(xpath = "//button[contains(text(),'Edit Billing Address')]")
    private WebElement editBillingAddressButton;

    @FindBy(xpath = "//button[contains(text(),'Delete Address')]")
    private WebElement deleteAddressButton;

    @FindBy(xpath = "//div[contains(@class, 'grid')]/div")
    private WebElement addressGrid;

    // **🔹 Sidebar Navigation**
    @FindBy(xpath = "//a[contains(@href, 'dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement ordersLink;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//a[contains(@href, 'profile')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // **🔹 Footer Elements**
    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "//footer//a[contains(text(),'Privacy Policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//footer//a[contains(text(),'Terms & Conditions')]")
    private WebElement termsConditionsLink;

    @FindBy(xpath = "//footer//a[contains(text(),'Return Policy')]")
    private WebElement returnPolicyLink;

    // **🔹 Verification Methods**

    /**
     * Verifies the Addresses page title using SoftAssert.
     */
    public void verifyPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    /**
     * Verifies the Addresses page URL using SoftAssert.
     */
    public void verifyPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl, softAssert);
    }

    /**
     * Verifies that header and footer are present.
     */
    public void verifyHeaderAndFooter() {
        softAssert.assertTrue(header.isDisplayed(), "❌ Header is not displayed.");
        softAssert.assertTrue(footer.isDisplayed(), "❌ Footer is not displayed.");
    }

    /**
     * Verifies the sidebar navigation links.
     */
    public void verifySidebarNavigation() {
        softAssert.assertTrue(dashboardLink.isDisplayed(), "❌ Dashboard link is missing.");
        softAssert.assertTrue(ordersLink.isDisplayed(), "❌ Orders link is missing.");
        softAssert.assertTrue(addressesLink.isDisplayed(), "❌ Addresses link is missing.");
        softAssert.assertTrue(accountDetailsLink.isDisplayed(), "❌ Account Details link is missing.");
    }

    /**
     * Verifies that the billing and shipping addresses are displayed.
     */
    public void verifyAddressSections() {
        softAssert.assertTrue(billingAddressHeader.isDisplayed(), "❌ Billing Address header is missing.");
        softAssert.assertTrue(shippingAddressesHeader.isDisplayed(), "❌ Shipping Addresses header is missing.");
    }

    // **🔹 Actions**

    /**
     * Searches for an address.
     */
    public void searchAddress(String address) {
        searchInput.clear();
        searchInput.sendKeys(address);
    }

    /**
     * Clicks on the Edit Billing Address button.
     */
    public void clickEditBillingAddress() {
        editBillingAddressButton.click();
    }

    /**
     * Clicks on the Delete Address button.
     */
    public void clickDeleteAddress() {
        deleteAddressButton.click();
    }

    /**
     * Clicks on the Logout button.
     */
    public void clickLogout() {
        logoutButton.click();
    }

    /**
     * Clicks on Dashboard link in the sidebar.
     */
    public void clickDashboardLink() {
        dashboardLink.click();
    }

    /**
     * Clicks on Orders link in the sidebar.
     */
    public void clickOrdersLink() {
        ordersLink.click();
    }

    /**
     * Clicks on Addresses link in the sidebar.
     */
    public void clickAddressesLink() {
        addressesLink.click();
    }

    /**
     * Clicks on Account Details link in the sidebar.
     */
    public void clickAccountDetailsLink() {
        accountDetailsLink.click();
    }

    /**
     * Verifies if a success message is displayed.
     */
    public void verifySuccessMessage(String expectedMessage) throws IOException {
        verifySuccessMessage(expectedMessage, softAssert);
    }
}
