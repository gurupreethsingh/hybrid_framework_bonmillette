package pom.admin_pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AllAdminsPage extends Verification {

    @FindBy(xpath = "//h2[contains(text(),'All Users')]")
    private WebElement allUsersHeading;

    @FindBy(xpath = "//input[@placeholder='Search users...']")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(@class,'bg-red-500')]")
    private List<WebElement> deleteButtons;

    @FindBy(xpath = "//div[contains(@class,'grid-cols-1') or contains(@class,'grid-cols-2') or contains(@class,'grid-cols-3')]//h3")
    private List<WebElement> userNames;

    @FindBy(xpath = "//div[contains(@class,'grid-cols-1') or contains(@class,'grid-cols-2') or contains(@class,'grid-cols-3')]//p[1]")
    private List<WebElement> userEmails;

    @FindBy(xpath = "//div[contains(@class,'grid-cols-1') or contains(@class,'grid-cols-2') or contains(@class,'grid-cols-3')]//p[2]")
    private List<WebElement> userRoles;

    @FindBy(xpath = "//svg[@data-icon='th-list']")
    private WebElement listViewButton;

    @FindBy(xpath = "//svg[@data-icon='th-large']")
    private WebElement cardViewButton;

    @FindBy(xpath = "//svg[@data-icon='th']")
    private WebElement gridViewButton;

    // Constructor to initialize elements
    public AllAdminsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public String getAllUsersHeading() {
        return allUsersHeading.getText();
    }

    public void searchUser(String userName) {
        searchField.clear();
        searchField.sendKeys(userName);
    }

    public void deleteFirstUser() {
        if (!deleteButtons.isEmpty()) {
            deleteButtons.get(0).click();
        }
    }

    public List<String> getAllUserNames() {
        return getElementsText(userNames);
    }

    public List<String> getAllUserEmails() {
        return getElementsText(userEmails);
    }

    public List<String> getAllUserRoles() {
        return getElementsText(userRoles);
    }

    public void switchToListView() {
        listViewButton.click();
    }

    public void switchToCardView() {
        cardViewButton.click();
    }

    public void switchToGridView() {
        gridViewButton.click();
    }

    public void verifyAllAdminsPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyAllAdminsPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
