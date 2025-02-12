package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class LoginPage extends Verification {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//div[contains(@class, 'absolute right-3')]")
    private WebElement togglePasswordVisibility;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    @FindBy(xpath = "//button[contains(text(),'Sign in with Google')]")
    private WebElement googleSignInButton;

    @FindBy(xpath = "//p[contains(text(), 'Don\'t have an account?')]/a")
    private WebElement signUpLink;

    @FindBy(xpath = "//div[contains(@class, 'text-red-600')]")
    private WebElement errorMessage;

    // Constructor to initialize elements
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the elements
    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickTogglePasswordVisibility() {
        togglePasswordVisibility.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickGoogleSignInButton() {
        googleSignInButton.click();
    }

    public void clickSignUpLink() {
        signUpLink.click();
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }

    public void verifyLoginPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyLoginPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}