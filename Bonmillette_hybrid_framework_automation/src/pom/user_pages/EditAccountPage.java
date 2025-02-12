package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Verification;

 

public class EditAccountPage extends Verification {

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='profileImage']")
    private WebElement profileImageInput;

    @FindBy(xpath = "//input[@id='currentPassword']")
    private WebElement currentPasswordInput;

    @FindBy(xpath = "//input[@id='newPassword']")
    private WebElement newPasswordInput;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
    private WebElement saveChangesButton;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    @FindBy(xpath = "//a[contains(@href, 'dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement ordersLink;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//a[contains(@href, 'profile')]")
    private WebElement accountDetailsLink;

    // Constructor to initialize elements
    public EditAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the elements
    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void uploadProfileImage(String imagePath) {
        profileImageInput.sendKeys(imagePath);
    }

    public void enterCurrentPassword(String currentPassword) {
        currentPasswordInput.sendKeys(currentPassword);
    }

    public void enterNewPassword(String newPassword) {
        newPasswordInput.sendKeys(newPassword);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    public void clickSaveChanges() {
        saveChangesButton.click();
    }

    public void clickLogout() {
        logoutButton.click();
    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickOrdersLink() {
        ordersLink.click();
    }

    public void clickAddressesLink() {
        addressesLink.click();
    }

    public void clickAccountDetailsLink() {
        accountDetailsLink.click();
    }

    public void verifyEditAccountPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyEditAccountPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
