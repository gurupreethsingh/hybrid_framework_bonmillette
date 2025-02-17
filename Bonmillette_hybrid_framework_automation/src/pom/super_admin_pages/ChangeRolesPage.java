package pom.super_admin_pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import java.time.Duration;
import java.util.List;

public class ChangeRolesPage extends Verification {

    WebDriverWait wait;

    // Constructor
    public ChangeRolesPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // **🔹 Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//header//h2[contains(text(),'Change User Roles')]")
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
    private List<WebElement> userRoles;

    // **🔹 Role Update Section**
    @FindBy(xpath = "//h3[contains(text(),'Update Role for')]")
    private WebElement updateRoleSection;

    @FindBy(xpath = "//select")
    private WebElement roleDropdown;

    @FindBy(xpath = "//button[contains(text(),'Update Role')]")
    private WebElement updateRoleButton;

    // **🔹 Privileges Section**
    @FindBy(xpath = "//h4[contains(text(),'Manage Page Privileges')]")
    private WebElement managePrivilegesSection;

    @FindBy(xpath = "//input[@type='checkbox']")
    private List<WebElement> privilegeCheckboxes;

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
     * Verifies the ChangeRoles page title.
     */
    public void verifyPageTitle(SoftAssert softAssert) {
        verifyTitle("Change User Roles", softAssert);
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
     * Selects a user by username.
     */
    public void selectUser(String username) {
        for (WebElement user : userNames) {
            if (user.getText().equalsIgnoreCase(username)) {
                user.click();
                break;
            }
        }
    }

    /**
     * Updates the role of the selected user.
     */
    public void updateUserRole(String newRole) {
        Select select = new Select(roleDropdown);
        select.selectByVisibleText(newRole);
        updateRoleButton.click();
    }

    /**
     * Toggles a privilege checkbox.
     */
    public void togglePrivilege(String privilegeName) {
        for (WebElement checkbox : privilegeCheckboxes) {
            String label = checkbox.findElement(By.xpath("following-sibling::span")).getText();
            if (label.equalsIgnoreCase(privilegeName)) {
                checkbox.click();
                break;
            }
        }
    }
}
