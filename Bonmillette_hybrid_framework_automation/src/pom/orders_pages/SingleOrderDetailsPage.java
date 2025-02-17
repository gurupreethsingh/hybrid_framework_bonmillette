package pom.orders_pages;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class SingleOrderDetailsPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//h1[contains(text(),'Order Details')]")
    private WebElement orderDetailsTitle;

    // ========================== NAVIGATION LINKS ==========================

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(text(),'Orders')]")
    private WebElement ordersLink;

    @FindBy(xpath = "//a[contains(text(),'Addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//a[contains(text(),'Account Details')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // ========================== USER DETAILS SECTION ==========================

    @FindBy(xpath = "//h2[contains(text(),'User Information')]")
    private WebElement userInfoSection;

    @FindBy(xpath = "//p[contains(text(),'Name:')]/strong")
    private WebElement userName;

    @FindBy(xpath = "//p[contains(text(),'Email:')]/strong")
    private WebElement userEmail;

    @FindBy(xpath = "//p[contains(text(),'Phone:')]/strong")
    private WebElement userPhone;

    @FindBy(xpath = "//p[contains(text(),'Billing Address:')]/strong")
    private WebElement billingAddress;

    @FindBy(xpath = "//p[contains(text(),'Shipping Address:')]/strong")
    private WebElement shippingAddress;

    // ========================== ORDER INFORMATION SECTION ==========================

    @FindBy(xpath = "//h2[contains(text(),'Order Information')]")
    private WebElement orderInfoSection;

    @FindBy(xpath = "//p[contains(text(),'Order ID:')]/strong")
    private WebElement orderId;

    @FindBy(xpath = "//p[contains(text(),'Order Date:')]/strong")
    private WebElement orderDate;

    @FindBy(xpath = "//p[contains(text(),'Total Cost:')]/strong")
    private WebElement totalCost;

    @FindBy(xpath = "//p[contains(text(),'Status:')]/strong")
    private WebElement orderStatus;

    // ========================== PRODUCT DETAILS SECTION ==========================

    @FindBy(xpath = "//h2[contains(text(),'Products')]")
    private WebElement productDetailsSection;

    @FindBy(xpath = "//table[contains(@class,'w-full')]")
    private WebElement productTable;

    @FindBy(xpath = "//thead//th[contains(text(),'Product Name')]")
    private WebElement productNameHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Price')]")
    private WebElement productPriceHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Quantity')]")
    private WebElement productQuantityHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Total')]")
    private WebElement productTotalHeader;

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> productRows;

    @FindBy(xpath = "//tbody/tr/td[1]")
    private List<WebElement> productNames;

    @FindBy(xpath = "//tbody/tr/td[2]")
    private List<WebElement> productPrices;

    @FindBy(xpath = "//tbody/tr/td[3]")
    private List<WebElement> productQuantities;

    @FindBy(xpath = "//tbody/tr/td[4]")
    private List<WebElement> productTotals;

    // ========================== CONSTRUCTOR ==========================

    public SingleOrderDetailsPage(WebDriver driver) {
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

    public String getUserName() {
        return userName.getText();
    }

    public String getUserEmail() {
        return userEmail.getText();
    }

    public String getUserPhone() {
        return userPhone.getText();
    }

    public String getBillingAddress() {
        return billingAddress.getText();
    }

    public String getShippingAddress() {
        return shippingAddress.getText();
    }

    public String getOrderId() {
        return orderId.getText();
    }

    public String getOrderDate() {
        return orderDate.getText();
    }

    public String getTotalCost() {
        return totalCost.getText();
    }

    public String getOrderStatus() {
        return orderStatus.getText();
    }

    public int getTotalProducts() {
        return productRows.size();
    }

    public String getProductName(int index) {
        return productNames.get(index).getText();
    }

    public String getProductPrice(int index) {
        return productPrices.get(index).getText();
    }

    public String getProductQuantity(int index) {
        return productQuantities.get(index).getText();
    }

    public String getProductTotal(int index) {
        return productTotals.get(index).getText();
    }

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}

