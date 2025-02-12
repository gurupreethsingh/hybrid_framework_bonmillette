package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AllUsersPage extends Verification {

    @FindBy(xpath = "//h2[contains(text(),'All Users')]")
    private WebElement allUsersHeader;

    @FindBy(xpath = "//input[@type='text' and @placeholder='Search users...']")
    private WebElement searchInput;

    @FindBy(xpath = "//svg[contains(@class,'cursor-pointer') and contains(@class, 'text-xl')]")
    private WebElement viewToggleButton;

    @FindBy(xpath = "//div[contains(@class,'grid-cols-1')]")
    private WebElement usersGridView;

    @FindBy(xpath = "//div[contains(@class,'grid-cols-3')]")
    private WebElement usersCardView;

    @FindBy(xpath = "//div[contains(@class,'space-y-6')]")
    private WebElement usersListView;

    @FindBy(xpath = "//a[contains(@href, 'single-user')]")
    private WebElement singleUserLink;

    @FindBy(xpath = "//button[contains(@title, 'Delete User')]")
    private WebElement deleteUserButton;

    // Constructor to initialize elements
    public AllUsersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the elements
    public void searchUser(String username) {
        searchInput.sendKeys(username);
    }

    public void clickToggleViewButton() {
        viewToggleButton.click();
    }

    public void clickGridView() {
        usersGridView.click();
    }

    public void clickCardView() {
        usersCardView.click();
    }

    public void clickListView() {
        usersListView.click();
    }

    public void clickSingleUser() {
        singleUserLink.click();
    }

    public void clickDeleteUser() {
        deleteUserButton.click();
    }

    public void verifyAllUsersPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyAllUsersPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
