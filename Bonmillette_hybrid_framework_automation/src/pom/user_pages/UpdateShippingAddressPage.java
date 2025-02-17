package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import org.openqa.selenium.WebDriver;

public class UpdateShippingAddressPage extends Verification {

    // Constructor to initialize elements
    public UpdateShippingAddressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Header Elements
    @FindBy(xpath = "//nav//a[contains(@href, 'home')]")
    private WebElement homeLink;

    @FindBy(xpath = "//nav//a[contains(@href, 'shop')]")
    private WebElement shopLink;

    @FindBy(xpath = "//nav//a[contains(@href, 'contact-us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//nav//button[contains(text(),'My Account')]")
    private WebElement myAccountButton;

    @FindBy(xpath = "//nav//button[contains(@aria-label, 'Cart')]")
    private WebElement cartButton;

    // Page Elements
    @FindBy(xpath = "//h3[contains(text(),'Shipping Address')]")
    private WebElement shippingAddressHeader;

    @FindBy(xpath = "//input[@name='street']")
    private WebElement streetField;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityField;

    @FindBy(xpath = "//input[@name='state']")
    private WebElement stateField;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement postalCodeField;

    @FindBy(xpath = "//input[@name='country']")
    private WebElement countryField;

    @FindBy(xpath = "//button[contains(text(),'Add New Address')]")
    private WebElement addNewAddressButton;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(@class,'alert-success')]")
    private WebElement successMessage;

    // Footer Elements
    @FindBy(xpath = "//footer//a[contains(@href, 'privacy-policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//footer//a[contains(@href, 'terms-and-conditions')]")
    private WebElement termsConditionsLink;

    @FindBy(xpath = "//footer//a[contains(@href, 'return-policy')]")
    private WebElement returnPolicyLink;

    @FindBy(xpath = "//footer//p[contains(text(),'©')]")
    private WebElement copyrightText;

    // Methods to interact with elements
    public void clickHomeLink() {
        homeLink.click();
    }

    public void clickShopLink() {
        shopLink.click();
    }

    public void clickContactUsLink() {
        contactUsLink.click();
    }

    public void clickMyAccount() {
        myAccountButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void enterStreet(String street) {
        streetField.clear();
        streetField.sendKeys(street);
    }

    public void enterCity(String city) {
        cityField.clear();
        cityField.sendKeys(city);
    }

    public void enterState(String state) {
        stateField.clear();
        stateField.sendKeys(state);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeField.clear();
        postalCodeField.sendKeys(postalCode);
    }

    public void enterCountry(String country) {
        countryField.clear();
        countryField.sendKeys(country);
    }

    public void clickAddNewAddressButton() {
        addNewAddressButton.click();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }

    public String getSuccessMessageText() {
        return successMessage.getText();
    }

    public void clickPrivacyPolicy() {
        privacyPolicyLink.click();
    }

    public void clickTermsAndConditions() {
        termsConditionsLink.click();
    }

    public void clickReturnPolicy() {
        returnPolicyLink.click();
    }

    // Verification Methods using SoftAssert
    public void verifyShippingAddressPageTitle(String expectedTitle, SoftAssert softAssert) throws IOException {
        verifyTitle(expectedTitle, softAssert);
    }

    public void verifyShippingAddressPageUrl(String expectedUrl, SoftAssert softAssert) throws IOException {
        verifyUrl(expectedUrl, softAssert);
    }

    public void verifyShippingAddressHeader(SoftAssert softAssert) {
        softAssert.assertTrue(shippingAddressHeader.isDisplayed(), "❌ Shipping Address header is not visible.");
    }

    public void verifySaveButton(SoftAssert softAssert) {
        softAssert.assertTrue(saveButton.isDisplayed(), "❌ Save button is not visible.");
    }

    public void verifyFooterElements(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link is not visible.");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms & Conditions link is not visible.");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link is not visible.");
        softAssert.assertTrue(copyrightText.isDisplayed(), "❌ Copyright text is missing.");
    }
}
