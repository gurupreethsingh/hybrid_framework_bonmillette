package pom.super_admin_pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import java.time.Duration;
import java.util.List;

public class AllSuperadminsPage extends Verification {
    WebDriverWait wait;

    // Constructor
    public AllSuperadminsPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // **🔹 Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//header//h2[contains(text(),'All Users')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//header//input[@placeholder='Search users...']")
    private WebElement searchField;

    @FindBy(xpath = "//header//button[contains(@class, 'text-gray-400')]")
    private WebElement searchIcon;

    @FindBy(xpath = "//header//nav//a[contains(text(),'Dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//header//nav//a[contains(text(),'Settings')]")
    private WebElement settingsLink;

    @FindBy(xpath = "//header//nav//a[contains(text(),'Logout')]")
    private WebElement logoutLink;

    // **🔹 View Mode Buttons**
    @FindBy(xpath = "//header//*[name()='svg' and contains(@class, 'FaThList')]")
    private WebElement listViewButton;

    @FindBy(xpath = "//header//*[name()='svg' and contains(@class, 'FaThLarge')]")
    private WebElement cardViewButton;

    @FindBy(xpath = "//header//*[name()='svg' and contains(@class, 'FaTh')]")
    private WebElement gridViewButton;

    // **🔹 User Elements**
    @FindBy(xpath = "//div[contains(@class, 'grid-cols-5') or contains(@class, 'grid-cols-3') or contains(@class, 'space-y-6')]/div")
    private List<WebElement> userCards;

    @FindBy(xpath = "//div[contains(@class, 'text-left')]/h3")
    private List<WebElement> userNames;

    @FindBy(xpath = "//div[contains(@class, 'text-left')]/p[1]")
    private List<WebElement> userEmails;

    @FindBy(xpath = "//div[contains(@class, 'text-left')]/p[2]")
    private List<WebElement> userRoles;

    @FindBy(xpath = "//button[contains(@class, 'bg-red-500')]")
    private List<WebElement> deleteButtons;

    // **🔹 Footer Elements**
    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "//footer//a[contains(text(),'Privacy Policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//footer//a[contains(text(),'Terms & Conditions')]")
    private WebElement termsConditionsLink;

    @FindBy(xpath = "//footer//a[contains(text(),'Contact Us')]")
    private WebElement contactUsLink;

    // **🔹 Verification Methods**

    /**
     * Verifies the AllSuperadmins page title.
     */
    public void verifyPageTitle(SoftAssert softAssert) {
        verifyTitle("All Users", softAssert);
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
        softAssert.assertTrue(dashboardLink.isDisplayed(), "❌ Dashboard link not found.");
        softAssert.assertTrue(settingsLink.isDisplayed(), "❌ Settings link not found.");
        softAssert.assertTrue(logoutLink.isDisplayed(), "❌ Logout link not found.");
    }

    /**
     * Verifies that footer links are displayed.
     */
    public void verifyFooterNavigation(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link not found.");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms & Conditions link not found.");
        softAssert.assertTrue(contactUsLink.isDisplayed(), "❌ Contact Us link not found.");
    }

    /**
     * Verifies that users are loaded.
     */
    public boolean isUserListNotEmpty() {
        return !userCards.isEmpty();
    }

    /**
     * Verifies that the view options are clickable.
     */
    public void verifyViewOptionsClickable(SoftAssert softAssert) {
        softAssert.assertTrue(listViewButton.isEnabled(), "❌ List view button is not clickable.");
        softAssert.assertTrue(cardViewButton.isEnabled(), "❌ Card view button is not clickable.");
        softAssert.assertTrue(gridViewButton.isEnabled(), "❌ Grid view button is not clickable.");
    }

    // **🔹 Actions**

    /**
     * Searches for a user.
     */
    public void searchUser(String username) {
        searchField.clear();
        searchField.sendKeys(username);
        searchIcon.click();
    }

    /**
     * Switches to the List view.
     */
    public void switchToListView() {
        listViewButton.click();
    }

    /**
     * Switches to the Card view.
     */
    public void switchToCardView() {
        cardViewButton.click();
    }

    /**
     * Switches to the Grid view.
     */
    public void switchToGridView() {
        gridViewButton.click();
    }

    /**
     * Finds the row for a given username and returns the corresponding row index.
     */
    private int getRowIndexByUserName(String name) {
        for (int i = 0; i < userNames.size(); i++) {
            if (userNames.get(i).getText().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1; // User not found
    }

    /**
     * Deletes a user by username.
     */
    public void deleteUser(String username, SoftAssert softAssert) {
        int rowIndex = getRowIndexByUserName(username);
        if (rowIndex == -1) {
            softAssert.fail("❌ User not found: " + username);
            return;
        }

        WebElement deleteButton = deleteButtons.get(rowIndex);
        deleteButton.click();

        // Handle confirmation popup
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        softAssert.assertTrue(!isUserPresent(username), "❌ User deletion failed: " + username);
    }

    /**
     * Checks if a user is present in the list.
     */
    public boolean isUserPresent(String username) {
        return getRowIndexByUserName(username) != -1;
    }

}
