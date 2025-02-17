package pom.super_admin_pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import java.time.Duration;
import java.util.List;

public class SuperAdminDashboardPage extends Verification {
    WebDriverWait wait;

    // Constructor
    public SuperAdminDashboardPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // **🔹 Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//header//nav//a[contains(text(),'Home')]")
    private WebElement homeLink;

    @FindBy(xpath = "//header//nav//a[contains(text(),'Shop')]")
    private WebElement shopLink;

    @FindBy(xpath = "//header//nav//a[contains(text(),'My Account')]")
    private WebElement myAccountLink;

    @FindBy(xpath = "//header//nav//a[contains(text(),'Contact Us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//header//input[@placeholder='Search for blogs...']")
    private WebElement searchField;

    @FindBy(xpath = "//header//button[contains(@class, 'search')]")
    private WebElement searchButton;

    // **🔹 Sidebar Navigation Elements**
    @FindBy(xpath = "//aside//a[contains(text(),'Dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//aside//a[contains(text(),'Orders')]")
    private WebElement ordersLink;

    @FindBy(xpath = "//aside//a[contains(text(),'Addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//aside//a[contains(text(),'Account Details')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//aside//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // **🔹 Search Box**
    @FindBy(xpath = "//input[@placeholder='Search cards...']")
    private WebElement cardSearchField;

    @FindBy(xpath = "//span[@class='absolute top-1/2 right-3']")
    private WebElement searchIcon;

    // **🔹 Dashboard Cards**
    @FindBy(xpath = "//div[contains(@class, 'grid-cols-3') or contains(@class, 'grid-cols-2')]/a")
    private List<WebElement> dashboardCards;

    @FindBy(xpath = "//div[contains(@class, 'grid-cols-3') or contains(@class, 'grid-cols-2')]/a//h5")
    private List<WebElement> cardTitles;

    @FindBy(xpath = "//div[contains(@class, 'grid-cols-3') or contains(@class, 'grid-cols-2')]/a//p")
    private List<WebElement> cardValues;

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
     * Verifies the Superadmin Dashboard page title.
     */
    public void verifyPageTitle(SoftAssert softAssert) {
        verifyTitle("Super Admin", softAssert);
    }

    /**
     * Verifies that header and footer are present.
     */
    public void verifyHeaderAndFooter(SoftAssert softAssert) {
        softAssert.assertTrue(header.isDisplayed(), "❌ Header is not displayed.");
        softAssert.assertTrue(footer.isDisplayed(), "❌ Footer is not displayed.");
    }

    /**
     * Verifies that navigation links in the header are displayed.
     */
    public void verifyHeaderNavigation(SoftAssert softAssert) {
        softAssert.assertTrue(homeLink.isDisplayed(), "❌ Home link not found.");
        softAssert.assertTrue(shopLink.isDisplayed(), "❌ Shop link not found.");
        softAssert.assertTrue(myAccountLink.isDisplayed(), "❌ My Account link not found.");
        softAssert.assertTrue(contactUsLink.isDisplayed(), "❌ Contact Us link not found.");
    }

    /**
     * Verifies that sidebar navigation is displayed.
     */
    public void verifySidebarNavigation(SoftAssert softAssert) {
        softAssert.assertTrue(dashboardLink.isDisplayed(), "❌ Dashboard link not found.");
        softAssert.assertTrue(ordersLink.isDisplayed(), "❌ Orders link not found.");
        softAssert.assertTrue(addressesLink.isDisplayed(), "❌ Addresses link not found.");
        softAssert.assertTrue(accountDetailsLink.isDisplayed(), "❌ Account Details link not found.");
    }

    /**
     * Verifies that dashboard cards are loaded.
     */
    public boolean isDashboardCardsNotEmpty() {
        return !dashboardCards.isEmpty();
    }

    /**
     * Verifies that footer links are displayed.
     */
    public void verifyFooterNavigation(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link not found.");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms & Conditions link not found.");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link not found.");
    }

    // **🔹 Actions**

    /**
     * Searches for a dashboard card.
     */
    public void searchDashboardCard(String keyword) {
        cardSearchField.clear();
        cardSearchField.sendKeys(keyword);
        searchIcon.click();
    }

    /**
     * Clicks a specific card based on title.
     */
    public void clickCard(String cardTitle) {
        for (WebElement card : dashboardCards) {
            if (card.getText().contains(cardTitle)) {
                card.click();
                break;
            }
        }
    }

    /**
     * Clicks on a sidebar navigation link.
     */
    public void navigateToSidebarOption(String option) {
        switch (option.toLowerCase()) {
            case "dashboard":
                dashboardLink.click();
                break;
            case "orders":
                ordersLink.click();
                break;
            case "addresses":
                addressesLink.click();
                break;
            case "account details":
                accountDetailsLink.click();
                break;
            case "logout":
                logoutButton.click();
                break;
            default:
                throw new IllegalArgumentException("Invalid sidebar option: " + option);
        }
    }
}
