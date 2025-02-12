package pom.user_pages;






import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class ProfilePage extends Verification {

    @FindBy(xpath = "//h3[contains(text(),'Profile Information')]")
    private WebElement profileHeading;

    @FindBy(xpath = "//img[contains(@class,'rounded-lg') or contains(@class,'rounded-xl')]")
    private WebElement profileImage;

    @FindBy(xpath = "//dt[contains(text(),'Full Name')]/following-sibling::dd")
    private WebElement fullName;

    @FindBy(xpath = "//dt[contains(text(),'Email Address')]/following-sibling::dd")
    private WebElement emailAddress;

    @FindBy(xpath = "//dt[contains(text(),'Phone')]/following-sibling::dd")
    private WebElement phoneNumber;

    @FindBy(xpath = "//dt[contains(text(),'Role')]/following-sibling::dd")
    private WebElement role;

    @FindBy(xpath = "//dt[contains(text(),'Street')]/following-sibling::dd")
    private WebElement street;

    @FindBy(xpath = "//dt[contains(text(),'City')]/following-sibling::dd")
    private WebElement city;

    @FindBy(xpath = "//dt[contains(text(),'State')]/following-sibling::dd")
    private WebElement state;

    @FindBy(xpath = "//dt[contains(text(),'Postal Code')]/following-sibling::dd")
    private WebElement postalCode;

    @FindBy(xpath = "//dt[contains(text(),'Country')]/following-sibling::dd")
    private WebElement country;

    @FindBy(xpath = "//button[contains(text(),'Update Billing Address')]")
    private WebElement updateBillingAddressButton;

    // Constructor to initialize elements
    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public boolean isProfileHeadingDisplayed() {
        return profileHeading.isDisplayed();
    }

    public String getFullName() {
        return fullName.getText();
    }

    public String getEmailAddress() {
        return emailAddress.getText();
    }

    public String getPhoneNumber() {
        return phoneNumber.getText();
    }

    public String getRole() {
        return role.getText();
    }

    public String getStreet() {
        return street.getText();
    }

    public String getCity() {
        return city.getText();
    }

    public String getState() {
        return state.getText();
    }

    public String getPostalCode() {
        return postalCode.getText();
    }

    public String getCountry() {
        return country.getText();
    }

    public void clickUpdateBillingAddressButton() {
        updateBillingAddressButton.click();
    }

    public boolean isProfileImageDisplayed() {
        return profileImage.isDisplayed();
    }

    public void verifyProfilePageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyProfilePageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
