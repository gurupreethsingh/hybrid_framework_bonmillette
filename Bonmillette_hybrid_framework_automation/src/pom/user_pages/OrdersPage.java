package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class OrdersPage extends Verification {

    @FindBy(xpath = "//h2[contains(text(),'My Orders')]")
    private WebElement myOrdersHeading;

    @FindBy(xpath = "//a[contains(@href, 'superadmin-dashboard') or contains(@href, 'user-dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement myOrdersLink;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//a[contains(@href, 'edit-account')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // Constructor to initialize elements
    public OrdersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the elements
    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickMyOrdersLink() {
        myOrdersLink.click();
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

    public boolean isMyOrdersHeadingDisplayed() {
        return myOrdersHeading.isDisplayed();
    }

    public void verifyOrdersPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyOrdersPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
