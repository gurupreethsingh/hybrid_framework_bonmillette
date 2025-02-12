package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class RegisterPage extends Verification {

    @FindBy(xpath = "//input[@id='name']")
    private WebElement nameInput;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='registerWithGST']")
    private WebElement registerWithGSTCheckbox;

    @FindBy(xpath = "//input[@id='companyName']")
    private WebElement companyNameInput;

    @FindBy(xpath = "//input[@id='companyAddress']")
    private WebElement companyAddressInput;

    @FindBy(xpath = "//input[@id='gstNumber']")
    private WebElement gstNumberInput;

    @FindBy(xpath = "//input[@id='promotionalConsent']")
    private WebElement promotionalConsentCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signUpButton;

    @FindBy(xpath = "//p[contains(text(), 'Already have an account?')]/a")
    private WebElement signInLink;

    // Constructor to initialize elements
    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the elements
    public void enterName(String name) {
        nameInput.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickRegisterWithGST() {
        registerWithGSTCheckbox.click();
    }

    public void enterCompanyName(String companyName) {
        companyNameInput.sendKeys(companyName);
    }

    public void enterCompanyAddress(String companyAddress) {
        companyAddressInput.sendKeys(companyAddress);
    }

    public void enterGstNumber(String gstNumber) {
        gstNumberInput.sendKeys(gstNumber);
    }

    public void clickPromotionalConsent() {
        promotionalConsentCheckbox.click();
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public void verifyRegisterPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyRegisterPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
