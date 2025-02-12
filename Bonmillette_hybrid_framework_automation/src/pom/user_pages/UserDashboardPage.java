package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class UserDashboardPage extends Verification {

    @FindBy(xpath = "//h2[contains(text(),'User Dashboard')]")
    private WebElement userDashboardHeading;

    @FindBy(xpath = "//input[@placeholder='Search cards...']")
    private WebElement searchInput;

    @FindBy(xpath = "//a[contains(text(),'Recent Orders')]")
    private WebElement recentOrdersLink;

    @FindBy(xpath = "//a[contains(text(),'Shipping/Billing Address')]")
    private WebElement shippingBillingAddressLink;

    @FindBy(xpath = "//a[contains(text(),'Change Password')]")
    private WebElement changePasswordLink;

    @FindBy(xpath = "//a[contains(text(),'Raise Complaint')]")
    private WebElement raiseComplaintLink;

    @FindBy(xpath = "//span[contains(text(),'Dashboard')]/parent::a")
    private WebElement dashboardLink;

    @FindBy(xpath = "//span[contains(text(),'Orders')]/parent::a")
    private WebElement ordersLink;

    @FindBy(xpath = "//span[contains(text(),'Addresses')]/parent::a")
    private WebElement addressesLink;

    @FindBy(xpath = "//span[contains(text(),'Account Details')]/parent::a")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//span[contains(text(),'Logout')]/parent::button")
    private WebElement logoutButton;

    @FindBy(xpath = "//div[contains(@class,'card-title') and contains(text(),'Total Orders')]")
    private WebElement totalOrdersCard;

    @FindBy(xpath = "//div[contains(@class,'card-title') and contains(text(),'Raised Issues')]")
    private WebElement raisedIssuesCard;

    // Constructor to initialize elements
    public UserDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public String getUserDashboardHeading() {
        return userDashboardHeading.getText();
    }

    public void enterSearchTerm(String searchTerm) {
        searchInput.clear();
        searchInput.sendKeys(searchTerm);
    }

    public void clickRecentOrdersLink() {
        recentOrdersLink.click();
    }

    public void clickShippingBillingAddressLink() {
        shippingBillingAddressLink.click();
    }

    public void clickChangePasswordLink() {
        changePasswordLink.click();
    }

    public void clickRaiseComplaintLink() {
        raiseComplaintLink.click();
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

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public String getTotalOrdersCount() {
        return totalOrdersCard.getText();
    }

    public String getRaisedIssuesCount() {
        return raisedIssuesCard.getText();
    }

    public void verifyUserDashboardPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyUserDashboardPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
