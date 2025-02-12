package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class ResetPasswordPage extends Verification {

    @FindBy(xpath = "//h2[contains(text(),'Reset Password')]")
    private WebElement resetPasswordHeading;

    @FindBy(xpath = "//input[@id='new-password']")
    private WebElement newPasswordInput;

    @FindBy(xpath = "//input[@id='confirm-password']")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[contains(text(),'Reset Password')]")
    private WebElement resetPasswordButton;

    @FindBy(xpath = "//p[contains(@class, 'text-red-600')]")
    private WebElement errorMessage;

    // Constructor to initialize elements
    public ResetPasswordPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public void enterNewPassword(String password) {
        newPasswordInput.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    public void clickResetPasswordButton() {
        resetPasswordButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public boolean isResetPasswordHeadingDisplayed() {
        return resetPasswordHeading.isDisplayed();
    }

    public void verifyResetPasswordPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyResetPasswordPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
