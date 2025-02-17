package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class SingleUserPage extends Verification {

    @FindBy(xpath = "//h1[contains(@class, 'text-3xl') and contains(text(), \"'s Profile\")]")
    private WebElement userProfileHeading;

    @FindBy(xpath = "//p/strong[text()='Name:']/following-sibling::text()")
    private WebElement userName;

    @FindBy(xpath = "//p/strong[text()='Email:']/following-sibling::text()")
    private WebElement userEmail;

    @FindBy(xpath = "//p/strong[text()='Role:']/following-sibling::text()")
    private WebElement userRole;

    @FindBy(xpath = "//select[@class='border w-full p-2 rounded']")
    private WebElement roleDropdown;

    @FindBy(xpath = "//button[contains(text(),'Update Role')]")
    private WebElement updateRoleButton;

    @FindBy(xpath = "//div[contains(@class,'bg-green-100') and contains(text(),'Success!')]")
    private WebElement successMessage;

    // Constructor to initialize elements
    public SingleUserPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public String getUserName() {
        return userName.getText();
    }

    public String getUserEmail() {
        return userEmail.getText();
    }

    public String getUserRole() {
        return userRole.getText();
    }

    public void clickUpdateRoleButton() {
        updateRoleButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public void verifySingleUserPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifySingleUserPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
