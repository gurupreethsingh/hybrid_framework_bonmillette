package pom.super_admin_pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class ChangeRolesPage extends Verification {

    @FindBy(xpath = "//h2[contains(text(),'Change User Roles')]")
    private WebElement changeRolesHeading;

    @FindBy(xpath = "//input[@placeholder='Search users...']")
    private WebElement searchInput;

    @FindBy(xpath = "//select")
    private WebElement roleDropdown;

    @FindBy(xpath = "//button[contains(text(),'Update Role')]")
    private WebElement updateRoleButton;

    @FindBy(xpath = "//div[contains(@class, 'relative')]//fa-search")
    private WebElement searchIcon;

    @FindBy(xpath = "//fa-th-list")
    private WebElement listViewIcon;

    @FindBy(xpath = "//fa-th-large")
    private WebElement cardViewIcon;

    @FindBy(xpath = "//fa-th")
    private WebElement gridViewIcon;

    @FindBy(xpath = "//div[contains(@class, 'grid') or contains(@class, 'list') or contains(@class, 'card')]//img")
    private List<WebElement> userAvatars;

    @FindBy(xpath = "//div[contains(@class, 'grid') or contains(@class, 'list') or contains(@class, 'card')]//h3")
    private List<WebElement> userNames;

    @FindBy(xpath = "//div[contains(@class, 'grid') or contains(@class, 'list') or contains(@class, 'card')]//p")
    private List<WebElement> userRoles;

    @FindBy(xpath = "//h3[contains(text(),'Update Role for')]")
    private WebElement updateRoleSectionHeading;

    @FindBy(xpath = "//h4[contains(text(),'Manage Page Privileges')]")
    private WebElement managePagePrivilegesHeading;

    @FindBy(xpath = "//div[contains(@class, 'mt-10')]//input[@type='checkbox']")
    private List<WebElement> privilegeCheckboxes;

    // Constructor to initialize elements
    public ChangeRolesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public String getChangeRolesHeading() {
        return changeRolesHeading.getText();
    }

    public void enterSearchQuery(String query) {
        searchInput.clear();
        searchInput.sendKeys(query);
    }

    public void selectRole(String role) {
        selectByVisibleText(roleDropdown, role);
    }

    public void clickUpdateRoleButton() {
        updateRoleButton.click();
    }

    public void clickListView() {
        listViewIcon.click();
    }

    public void clickCardView() {
        cardViewIcon.click();
    }

    public void clickGridView() {
        gridViewIcon.click();
    }

    public void clickUserByName(String name) {
        for (WebElement userName : userNames) {
            if (userName.getText().equalsIgnoreCase(name)) {
                userName.click();
                break;
            }
        }
    }

    public String getSelectedUserRole() {
        return roleDropdown.getAttribute("value");
    }

    public void clickPrivilegeCheckbox(String privilegeName) {
        for (WebElement checkbox : privilegeCheckboxes) {
            WebElement label = checkbox.findElement(org.openqa.selenium.By.xpath("./following-sibling::span"));
            if (label.getText().equalsIgnoreCase(privilegeName)) {
                checkbox.click();
                break;
            }
        }
    }

    public void verifyChangeRolesPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyChangeRolesPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
