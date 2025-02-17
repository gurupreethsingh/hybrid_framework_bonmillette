package pom.orders_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class UserOrdersPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//h1[contains(text(),'Orders for')]")
    private WebElement ordersForUserTitle;

    @FindBy(xpath = "//p[contains(text(),'Email:')]")
    private WebElement userEmailText;

    // ========================== SEARCH & FILTER ELEMENTS ==========================

    @FindBy(xpath = "//input[@placeholder='Search by Order ID']")
    private WebElement searchOrderInput;

    @FindBy(xpath = "//select")
    private WebElement sortDropdown;

    @FindBy(xpath = "//button[contains(text(),'All')]")
    private WebElement allStatusFilterButton;

    @FindBy(xpath = "//button[contains(text(),'Pending')]")
    private WebElement pendingStatusFilterButton;

    @FindBy(xpath = "//button[contains(text(),'Shipped')]")
    private WebElement shippedStatusFilterButton;

    @FindBy(xpath = "//button[contains(text(),'Delivered')]")
    private WebElement deliveredStatusFilterButton;

    @FindBy(xpath = "//button[contains(text(),'Canceled')]")
    private WebElement canceledStatusFilterButton;

    // ========================== ORDER TABLE ELEMENTS ==========================

    @FindBy(xpath = "//table")
    private WebElement orderTable;

    @FindBy(xpath = "//thead//th[contains(text(),'Order ID')]")
    private WebElement orderIdHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Products')]")
    private WebElement productsHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Total Cost')]")
    private WebElement totalCostHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Order Date')]")
    private WebElement orderDateHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Dispatch Status')]")
    private WebElement dispatchStatusHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Delivery Status')]")
    private WebElement deliveryStatusHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Update')]")
    private WebElement updateHeader;

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> orderRows;

    @FindBy(xpath = "//tbody/tr/td[1]")
    private List<WebElement> orderIds;

    @FindBy(xpath = "//tbody/tr/td[2]")
    private List<WebElement> productDetails;

    @FindBy(xpath = "//tbody/tr/td[3]")
    private List<WebElement> totalCosts;

    @FindBy(xpath = "//tbody/tr/td[4]")
    private List<WebElement> orderDates;

    @FindBy(xpath = "//tbody/tr/td[5]")
    private List<WebElement> dispatchStatuses;

    @FindBy(xpath = "//tbody/tr/td[6]")
    private List<WebElement> deliveryStatuses;

    @FindBy(xpath = "//tbody/tr/td[7]//a")
    private List<WebElement> updateOrderButtons;

    // ========================== CONSTRUCTOR ==========================

    public UserOrdersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public String getOrdersForUserTitle() {
        return ordersForUserTitle.getText();
    }

    public String getUserEmail() {
        return userEmailText.getText();
    }

    public void enterSearchTerm(String searchTerm) {
        searchOrderInput.clear();
        searchOrderInput.sendKeys(searchTerm);
    }

    public void selectSortOption(String option) {
        selectDropdownValue(sortDropdown, option);
    }

    public void clickAllStatusFilter() {
        allStatusFilterButton.click();
    }

    public void clickPendingStatusFilter() {
        pendingStatusFilterButton.click();
    }

    public void clickShippedStatusFilter() {
        shippedStatusFilterButton.click();
    }

    public void clickDeliveredStatusFilter() {
        deliveredStatusFilterButton.click();
    }

    public void clickCanceledStatusFilter() {
        canceledStatusFilterButton.click();
    }

    public int getTotalOrders() {
        return orderRows.size();
    }

    public String getOrderId(int index) {
        return orderIds.get(index).getText();
    }

    public String getProductDetails(int index) {
        return productDetails.get(index).getText();
    }

    public String getTotalCost(int index) {
        return totalCosts.get(index).getText();
    }

    public String getOrderDate(int index) {
        return orderDates.get(index).getText();
    }

    public String getDispatchStatus(int index) {
        return dispatchStatuses.get(index).getText();
    }

    public String getDeliveryStatus(int index) {
        return deliveryStatuses.get(index).getText();
    }

    public void clickUpdateOrder(int index) {
        updateOrderButtons.get(index).click();
    }

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}
