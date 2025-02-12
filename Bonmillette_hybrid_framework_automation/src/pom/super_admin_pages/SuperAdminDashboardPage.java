package pom.super_admin_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class SuperAdminDashboardPage extends Verification {

    @FindBy(xpath = "//p[contains(text(),'Super Admin')]")
    private WebElement superAdminHeading;

    @FindBy(xpath = "//input[@placeholder='Search cards...']")
    private WebElement searchInput;

    @FindBy(xpath = "//a[contains(@href,'all-users')]")
    private WebElement totalUsersCard;

    @FindBy(xpath = "//a[contains(@href,'all-customers')]")
    private WebElement customersCard;

    @FindBy(xpath = "//a[contains(@href,'all-employees')]")
    private WebElement employeesCard;

    @FindBy(xpath = "//a[contains(@href,'all-orders')]")
    private WebElement totalOrdersCard;

    @FindBy(xpath = "//a[contains(@href,'all-issues')]")
    private WebElement unresolvedIssuesCard;

    @FindBy(xpath = "//i[contains(@class, 'fi-home')]")
    private WebElement dashboardNavLink;

    @FindBy(xpath = "//i[contains(@class, 'fi-box')]")
    private WebElement ordersNavLink;

    @FindBy(xpath = "//i[contains(@class, 'fi-map-pin')]")
    private WebElement addressesNavLink;

    @FindBy(xpath = "//i[contains(@class, 'fi-user')]")
    private WebElement accountDetailsNavLink;

    @FindBy(xpath = "//i[contains(@class, 'fi-log-out')]")
    private WebElement logoutNavLink;

    // Constructor to initialize elements
    public SuperAdminDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public String getSuperAdminHeading() {
        return superAdminHeading.getText();
    }

    public void enterSearchQuery(String query) {
        searchInput.clear();
        searchInput.sendKeys(query);
    }

    public void clickTotalUsersCard() {
        totalUsersCard.click();
    }

    public void clickCustomersCard() {
        customersCard.click();
    }

    public void clickEmployeesCard() {
        employeesCard.click();
    }

    public void clickTotalOrdersCard() {
        totalOrdersCard.click();
    }

    public void clickUnresolvedIssuesCard() {
        unresolvedIssuesCard.click();
    }

    public void clickDashboardNav() {
        dashboardNavLink.click();
    }

    public void clickOrdersNav() {
        ordersNavLink.click();
    }

    public void clickAddressesNav() {
        addressesNavLink.click();
    }

    public void clickAccountDetailsNav() {
        accountDetailsNavLink.click();
    }

    public void clickLogoutNav() {
        logoutNavLink.click();
    }

    public void verifySuperAdminDashboardTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifySuperAdminDashboardUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
