package pom.outlet_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import java.util.List;

public class SingleOutletPage extends Verification {

    // ========================== PAGE TITLE ==========================
    @FindBy(xpath = "//h3[contains(text(),'Outlet Information')]")
    private WebElement outletInfoTitle;

    @FindBy(xpath = "//h3[contains(text(),'Products')]")
    private WebElement productsSectionTitle;

    // ========================== NAVIGATION ==========================

    @FindBy(xpath = "//a[contains(@href, 'all-outlets')]")
    private WebElement allOutletsButton;

    // ========================== OUTLET INFORMATION ==========================

    @FindBy(xpath = "//dt[contains(text(),'Outlet Name')]/following-sibling::dd")
    private WebElement outletName;

    @FindBy(xpath = "//dt[contains(text(),'Company Name')]/following-sibling::dd")
    private WebElement companyName;

    // ========================== PRODUCT LIST ==========================

    @FindBy(xpath = "//div[contains(@class,'grid')]/div[contains(@class,'shadow')]")
    private List<WebElement> productList;

    @FindBy(xpath = "//div[contains(@class,'grid')]/div[contains(@class,'shadow')]//p[1]")
    private List<WebElement> productNames;

    @FindBy(xpath = "//div[contains(@class,'grid')]/div[contains(@class,'shadow')]//p[2]")
    private List<WebElement> productStocks;

    // ========================== CONSTRUCTOR ==========================

    public SingleOutletPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public String getOutletInfoTitle() {
        return outletInfoTitle.getText();
    }

    public String getProductsSectionTitle() {
        return productsSectionTitle.getText();
    }

    public void clickAllOutletsButton() {
        allOutletsButton.click();
    }

    public String getOutletName() {
        return outletName.getText();
    }

    public String getCompanyName() {
        return companyName.getText();
    }

    public int getProductsCount() {
        return productList.size();
    }

    public String getProductName(int index) {
        return productNames.get(index).getText();
    }

    public String getProductStock(int index) {
        return productStocks.get(index).getText();
    }

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }

    public boolean isProductListDisplayed() {
        return !productList.isEmpty();
    }
}

