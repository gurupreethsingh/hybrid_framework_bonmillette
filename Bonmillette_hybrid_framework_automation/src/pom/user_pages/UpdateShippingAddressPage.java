package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class UpdateShippingAddressPage extends Verification {

    @FindBy(xpath = "//h3[contains(text(),'Edit Shipping Address') or contains(text(),'Add New Shipping Address')]")
    private WebElement shippingAddressHeading;

    @FindBy(xpath = "//input[@id='street']")
    private WebElement streetInput;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement cityInput;

    @FindBy(xpath = "//input[@id='state']")
    private WebElement stateInput;

    @FindBy(xpath = "//input[@id='postalCode']")
    private WebElement postalCodeInput;

    @FindBy(xpath = "//input[@id='country']")
    private WebElement countryInput;

    @FindBy(xpath = "//button[contains(text(),'Add New Address')]")
    private WebElement addNewAddressButton;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElement saveButton;

    // Constructor to initialize elements
    public UpdateShippingAddressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public String getShippingAddressHeading() {
        return shippingAddressHeading.getText();
    }

    public void enterStreet(String street) {
        streetInput.clear();
        streetInput.sendKeys(street);
    }

    public void enterCity(String city) {
        cityInput.clear();
        cityInput.sendKeys(city);
    }

    public void enterState(String state) {
        stateInput.clear();
        stateInput.sendKeys(state);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeInput.clear();
        postalCodeInput.sendKeys(postalCode);
    }

    public void enterCountry(String country) {
        countryInput.clear();
        countryInput.sendKeys(country);
    }

    public void clickAddNewAddressButton() {
        addNewAddressButton.click();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void verifyUpdateShippingAddressPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyUpdateShippingAddressPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
