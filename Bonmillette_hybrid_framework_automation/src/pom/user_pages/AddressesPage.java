package pom.user_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AddressesPage extends Verification {

    @FindBy(xpath = "//input[@type='text' and @placeholder='Search addresses...']")
    private WebElement searchInput;

    @FindBy(xpath = "//h2[contains(text(),'Manage Addresses')]")
    private WebElement manageAddressesHeader;

    @FindBy(xpath = "//h3[contains(text(),'Billing Address')]")
    private WebElement billingAddressHeader;

    @FindBy(xpath = "//h3[contains(text(),'Shipping Addresses')]")
    private WebElement shippingAddressesHeader;

    @FindBy(xpath = "//button[contains(text(),'Edit Billing Address')]")
    private WebElement editBillingAddressButton;

    @FindBy(xpath = "//button[contains(text(),'Delete Address')]")
    private WebElement deleteAddressButton;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    @FindBy(xpath = "//a[contains(@href, 'dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement ordersLink;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//a[contains(@href, 'profile')]")
    private WebElement accountDetailsLink;

    // Constructor to initialize elements
    public AddressesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the elements
    public void searchAddress(String address) {
        searchInput.sendKeys(address);
    }

    public void clickEditBillingAddress() {
        editBillingAddressButton.click();
    }

    public void clickDeleteAddress() {
        deleteAddressButton.click();
    }

    public void clickLogout() {
        logoutButton.click();
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

    public void verifyAddressesPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyAddressesPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
