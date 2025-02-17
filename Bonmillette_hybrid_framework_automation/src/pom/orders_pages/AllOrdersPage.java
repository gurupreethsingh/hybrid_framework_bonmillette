package pom.orders_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AllOrdersPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//p[contains(text(),'All Orders')]")
    private WebElement allOrdersTitle;

    @FindBy(xpath = "//input[@type='text' and @placeholder='Search orders...']")
    private WebElement searchInput;

    @FindBy(xpath = "//span[contains(@class,'text-gray-400')]//svg")
    private WebElement searchIcon;

    @FindBy(xpath = "//a[contains(@href, 'assign-order-for-delivery')]")
    private WebElement assignOrderButton;

    // ========================== ORDER TABLE ELEMENTS ==========================

    @FindBy(xpath = "//table[contains(@class, 'min-w-full')]")
    private WebElement ordersTable;

    @FindBy(xpath = "//thead//th[contains(text(),'Order ID')]")
    private WebElement orderIdHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'User')]")
    private WebElement userHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Products & Quantity')]")
    private WebElement productsHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Total Cost')]")
    private WebElement totalCostHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Created At')]")
    private WebElement createdAtHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Dispatch')]")
    private WebElement dispatchStatusHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'Delivery')]")
    private WebElement deliveryStatusHeader;

    @FindBy(xpath = "//thead//th[contains(text(),'View Details')]")
    private WebElement viewDetailsHeader;

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> orderRows;

    @FindBy(xpath = "//tbody/tr/td[1]")
    private List<WebElement> orderIds;

    @FindBy(xpath = "//tbody/tr/td[2]")
    private List<WebElement> orderUsers;

    @FindBy(xpath = "//tbody/tr/td[3]")
    private List<WebElement> orderProducts;

    @FindBy(xpath = "//tbody/tr/td[4]")
    private List<WebElement> orderTotalCost;

    @FindBy(xpath = "//tbody/tr/td[5]")
    private List<WebElement> orderCreatedAt;

    @FindBy(xpath = "//tbody/tr/td[6]/select")
    private List<WebElement> dispatchStatusDropdowns;

    @FindBy(xpath = "//tbody/tr/td[7]/select")
    private List<WebElement> deliveryStatusDropdowns;

    @FindBy(xpath = "//tbody/tr/td[8]/a[contains(@href, 'all-user-orders')]")
    private List<WebElement> viewDetailsButtons;

    // ========================== CONSTRUCTOR ==========================

    public AllOrdersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public void enterSearchTerm(String searchText) {
        searchInput.clear();
        searchInput.sendKeys(searchText);
    }

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void clickAssignOrderButton() {
        assignOrderButton.click();
    }

    public int getTotalOrdersCount() {
        return orderRows.size();
    }

    public String getOrderId(int index) {
        return orderIds.get(index).getText();
    }

    public String getOrderUser(int index) {
        return orderUsers.get(index).getText();
    }

    public String getOrderProducts(int index) {
        return orderProducts.get(index).getText();
    }

    public String getOrderTotalCost(int index) {
        return orderTotalCost.get(index).getText();
    }

    public String getOrderCreatedAt(int index) {
        return orderCreatedAt.get(index).getText();
    }

    public void selectDispatchStatus(int index, String status) {
        selectDropdownValue(dispatchStatusDropdowns.get(index), status);
    }

    public void selectDeliveryStatus(int index, String status) {
        selectDropdownValue(deliveryStatusDropdowns.get(index), status);
    }

    public void clickViewDetails(int index) {
        viewDetailsButtons.get(index).click();
    }

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}

