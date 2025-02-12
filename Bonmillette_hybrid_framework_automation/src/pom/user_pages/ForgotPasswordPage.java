package pom.user_pages;


	

	import java.io.IOException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import generic.Verification;
	

	public class ForgotPasswordPage extends Verification {

	    @FindBy(xpath = "//input[@id='email']")
	    private WebElement emailInput;

	    @FindBy(xpath = "//button[contains(text(),'Send OTP')]")
	    private WebElement sendOtpButton;

	    @FindBy(xpath = "//input[@id='otp']")
	    private WebElement otpInput;

	    @FindBy(xpath = "//button[contains(text(),'Verify OTP')]")
	    private WebElement verifyOtpButton;

	    @FindBy(xpath = "//p[contains(@class, 'text-red-600')]")
	    private WebElement errorMessage;

	    // Constructor to initialize elements
	    public ForgotPasswordPage(WebDriver driver) {
	        super(driver);
	        PageFactory.initElements(driver, this);
	    }

	    // Methods to interact with the elements
	    public void enterEmail(String email) {
	        emailInput.sendKeys(email);
	    }

	    public void clickSendOtpButton() {
	        sendOtpButton.click();
	    }

	    public void enterOtp(String otp) {
	        otpInput.sendKeys(otp);
	    }

	    public void clickVerifyOtpButton() {
	        verifyOtpButton.click();
	    }

	    public String getErrorMessage() {
	        return errorMessage.getText();
	    }

	    public void verifyForgotPasswordPageTitle(String expectedTitle) throws IOException {
	        verifyTitle(expectedTitle);
	    }

	    public void verifyForgotPasswordPageUrl(String expectedUrl) throws IOException {
	        verifyUrl(expectedUrl);
	    }
	}

	


