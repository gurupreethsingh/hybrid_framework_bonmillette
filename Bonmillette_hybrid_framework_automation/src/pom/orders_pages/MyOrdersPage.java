package pom.orders_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

import java.util.List;

public class MyOrdersPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//nav//a[contains(text(),'Dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Orders')]")
    private WebElement ordersLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Account Details')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // ========================== ORDERS TABLE ==========================

    @FindBy(xpath = "//h2[contains(text(),'My Orders')]")
    private WebElement myOrdersTitle;

    @FindBy(xpath = "//table")
    private WebElement ordersTable;

    @FindBy(xpath = "//table//tr")
    private List<WebElement> orderRows;

    @FindBy(xpath = "//table//th[contains(text(),'Order ID')]")
    private WebElement orderIdHeader;

    @FindBy(xpath = "//table//th[contains(text(),'Date')]")
    private WebElement orderDateHeader;

    @FindBy(xpath = "//table//th[contains(text(),'Total')]")
    private WebElement orderTotalHeader;

    @FindBy(xpath = "//table//th[contains(text(),'Actions')]")
    private WebElement actionsHeader;

    @FindBy(xpath = "//p[contains(text(),'You have no orders yet.')]")
    private WebElement noOrdersMessage;

    // ========================== CONSTRUCTOR ==========================

    public MyOrdersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

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

    public boolean isMyOrdersTitleDisplayed() {
        return myOrdersTitle.isDisplayed();
    }

    public boolean isOrdersTableDisplayed() {
        return ordersTable.isDisplayed();
    }

    public int getOrderCount() {
        return orderRows.size() - 1; // Subtract header row
    }

    public boolean isNoOrdersMessageDisplayed() {
        return noOrdersMessage.isDisplayed();
    }

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}
