package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class UpdateProfilePage extends Verification {

    @FindBy(xpath = "//h3[contains(text(),'Update Profile')]")
    private WebElement updateProfileHeading;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement fullNameInput;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phoneInput;

    @FindBy(xpath = "//input[@name='street']")
    private WebElement addressStreetInput;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement addressCityInput;

    @FindBy(xpath = "//input[@name='state']")
    private WebElement addressStateInput;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement addressPostalCodeInput;

    @FindBy(xpath = "//input[@name='country']")
    private WebElement addressCountryInput;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement avatarUpload;

    @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
    private WebElement saveChangesButton;

    // Constructor to initialize elements
    public UpdateProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public String getUpdateProfileHeading() {
        return updateProfileHeading.getText();
    }

    public void enterFullName(String fullName) {
        fullNameInput.clear();
        fullNameInput.sendKeys(fullName);
    }

    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPhone(String phone) {
        phoneInput.clear();
        phoneInput.sendKeys(phone);
    }

    public void enterAddressStreet(String street) {
        addressStreetInput.clear();
        addressStreetInput.sendKeys(street);
    }

    public void enterAddressCity(String city) {
        addressCityInput.clear();
        addressCityInput.sendKeys(city);
    }

    public void enterAddressState(String state) {
        addressStateInput.clear();
        addressStateInput.sendKeys(state);
    }

    public void enterAddressPostalCode(String postalCode) {
        addressPostalCodeInput.clear();
        addressPostalCodeInput.sendKeys(postalCode);
    }

    public void enterAddressCountry(String country) {
        addressCountryInput.clear();
        addressCountryInput.sendKeys(country);
    }

    public void uploadAvatar(String filePath) {
        avatarUpload.sendKeys(filePath);
    }

    public void clickSaveChangesButton() {
        saveChangesButton.click();
    }

    public void verifyUpdateProfilePageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyUpdateProfilePageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
