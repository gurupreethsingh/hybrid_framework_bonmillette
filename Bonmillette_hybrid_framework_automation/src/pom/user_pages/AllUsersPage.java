package pom.user_pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AllUsersPage extends Verification {
    private SoftAssert softAssert;

    // **🔹 Constructor**
    public AllUsersPage(WebDriver driver, SoftAssert softAssert) {
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

    // **🔹 User Table Elements**
    @FindBy(xpath = "//h2[contains(text(),'All Users')]")
    private WebElement allUsersHeader;

    @FindBy(xpath = "//input[@type='text' and @placeholder='Search users...']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[contains(text(),'Delete User')]")
    private WebElement deleteUserButton;

    @FindBy(xpath = "//table//tr")
    private List<WebElement> userRows;

    @FindBy(xpath = "//div[contains(@class,'grid')]")
    private WebElement gridView;

    @FindBy(xpath = "//div[contains(@class,'list')]")
    private WebElement listView;

    @FindBy(xpath = "//div[contains(@class,'card')]")
    private WebElement cardView;

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
     * Verifies the All Users page title using SoftAssert.
     */
    public void verifyPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    /**
     * Verifies the All Users page URL using SoftAssert.
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
     * Verifies that the users table is displayed.
     */
    public void verifyUsersTable() {
        softAssert.assertTrue(allUsersHeader.isDisplayed(), "❌ 'All Users' header is missing.");
        softAssert.assertFalse(userRows.isEmpty(), "❌ No users found in the table.");
    }

    /**
     * Verifies that the search field is working.
     */
    public void verifySearchFunctionality(String query) {
        searchInput.clear();
        searchInput.sendKeys(query);
        softAssert.assertTrue(!userRows.isEmpty(), "❌ No results found for query: " + query);
    }

    /**
     * Verifies the view modes (Grid, List, Card).
     */
    public void verifyViewModes() {
        softAssert.assertTrue(gridView.isDisplayed(), "❌ Grid view is not displayed.");
        softAssert.assertTrue(listView.isDisplayed(), "❌ List view is not displayed.");
        softAssert.assertTrue(cardView.isDisplayed(), "❌ Card view is not displayed.");
    }

    // **🔹 Actions**

    /**
     * Searches for a user.
     */
    public void searchUser(String userName) {
        searchInput.clear();
        searchInput.sendKeys(userName);
    }

    /**
     * Clicks on the Delete User button.
     */
    public void clickDeleteUser() {
        deleteUserButton.click();
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
