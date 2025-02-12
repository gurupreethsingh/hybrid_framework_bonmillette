package pom.admin_pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AdminDashboardPage extends Verification {

    @FindBy(xpath = "//h2[contains(text(),'Hello,')]")
    private WebElement adminGreeting;

    @FindBy(xpath = "//h3[contains(text(),'Navigation')]")
    private WebElement navigationHeading;

    @FindBy(xpath = "//ul[@class='space-y-4']/li/a[contains(text(),'Dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//ul[@class='space-y-4']/li/a[contains(text(),'Manage Orders')]")
    private WebElement manageOrdersLink;

    @FindBy(xpath = "//ul[@class='space-y-4']/li/a[contains(text(),'Manage Users')]")
    private WebElement manageUsersLink;

    @FindBy(xpath = "//ul[@class='space-y-4']/li/a[contains(text(),'Account Details')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//ul[@class='space-y-4']/li/button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    @FindBy(xpath = "//p[contains(text(),'From your account dashboard')]")
    private WebElement dashboardDescription;

    @FindBy(xpath = "//a[contains(text(),'orders')]")
    private WebElement ordersLink;

    @FindBy(xpath = "//a[contains(text(),'users')]")
    private WebElement usersLink;

    @FindBy(xpath = "//a[contains(text(),'product categories')]")
    private WebElement productCategoriesLink;

    // Constructor to initialize elements
    public AdminDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public String getAdminGreeting() {
        return adminGreeting.getText();
    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickManageOrdersLink() {
        manageOrdersLink.click();
    }

    public void clickManageUsersLink() {
        manageUsersLink.click();
    }

    public void clickAccountDetailsLink() {
        accountDetailsLink.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public String getDashboardDescription() {
        return dashboardDescription.getText();
    }

    public void clickOrdersLink() {
        ordersLink.click();
    }

    public void clickUsersLink() {
        usersLink.click();
    }

    public void clickProductCategoriesLink() {
        productCategoriesLink.click();
    }

    public void verifyAdminDashboardPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyAdminDashboardPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
