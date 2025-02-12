package pom.super_admin_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AllSuperadminsPage extends Verification {

    @FindBy(xpath = "//h2[contains(text(),'All Users')]")
    private WebElement allUsersHeading;

    @FindBy(xpath = "//input[@placeholder='Search users...']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[contains(@title,'Delete User')]")
    private WebElement deleteUserButton;

    @FindBy(xpath = "//i[contains(@class, 'fa-th-list')]")
    private WebElement listViewButton;

    @FindBy(xpath = "//i[contains(@class, 'fa-th-large')]")
    private WebElement cardViewButton;

    @FindBy(xpath = "//i[contains(@class, 'fa-th')]")
    private WebElement gridViewButton;

    @FindBy(xpath = "//div[contains(@class,'grid')]/div[contains(@class,'relative')]")
    private WebElement gridUserCard;

    @FindBy(xpath = "//div[contains(@class,'shadow')]/div[contains(@class,'relative')]")
    private WebElement cardUserContainer;

    @FindBy(xpath = "//div[contains(@class,'space-y-6')]/div[contains(@class,'shadow')]")
    private WebElement listUserContainer;

    // Constructor to initialize elements
    public AllSuperadminsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public String getAllUsersHeading() {
        return allUsersHeading.getText();
    }

    public void enterSearchQuery(String query) {
        searchInput.clear();
        searchInput.sendKeys(query);
    }

    public void clickListView() {
        listViewButton.click();
    }

    public void clickCardView() {
        cardViewButton.click();
    }

    public void clickGridView() {
        gridViewButton.click();
    }

    public boolean isGridUserCardDisplayed() {
        return gridUserCard.isDisplayed();
    }

    public boolean isCardUserContainerDisplayed() {
        return cardUserContainer.isDisplayed();
    }

    public boolean isListUserContainerDisplayed() {
        return listUserContainer.isDisplayed();
    }

    public void clickDeleteUserButton() {
        deleteUserButton.click();
    }

    public void verifyAllSuperadminsPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyAllSuperadminsPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}

