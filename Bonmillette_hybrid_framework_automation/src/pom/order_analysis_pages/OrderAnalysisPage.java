package pom.order_analysis_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class OrderAnalysisPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//img[@class='w-20 h-20']")
    private WebElement logo;

    @FindBy(xpath = "//nav//a[contains(text(),'Dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Order Analysis')]")
    private WebElement orderAnalysisLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Sales Analysis')]")
    private WebElement salesAnalysisLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // ========================== DOWNLOAD REPORT BUTTON ==========================

    @FindBy(xpath = "//button[contains(text(),'Download Excel Report')]")
    private WebElement downloadReportButton;

    // ========================== CHARTS ==========================

    @FindBy(xpath = "//canvas[contains(@class,'chartjs-render-monitor')]")
    private WebElement pieChart;

    @FindBy(xpath = "//div[contains(@class,'MuiChartsContainer-root')]")
    private WebElement barChart;

    // ========================== ORDER COUNT CARDS ==========================

    @FindBy(xpath = "//div[contains(@class, 'flex-wrap')]//div[contains(@class, 'MuiCard-root')]")
    private List<WebElement> orderCountCards;

    @FindBy(xpath = "//div[contains(@class, 'MuiCard-root')][1]//h6[contains(text(),'Total Orders')]/following-sibling::h4")
    private WebElement totalOrdersCount;

    @FindBy(xpath = "//div[contains(@class, 'MuiCard-root')][2]//h6[contains(text(),'Weekly Orders')]/following-sibling::h4")
    private WebElement weeklyOrdersCount;

    @FindBy(xpath = "//div[contains(@class, 'MuiCard-root')][3]//h6[contains(text(),'Monthly Orders')]/following-sibling::h4")
    private WebElement monthlyOrdersCount;

    @FindBy(xpath = "//div[contains(@class, 'MuiCard-root')][4]//h6[contains(text(),'Yearly Orders')]/following-sibling::h4")
    private WebElement yearlyOrdersCount;

    // ========================== CONSTRUCTOR ==========================

    public OrderAnalysisPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public void clickLogo() {
        logo.click();
    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickOrderAnalysisLink() {
        orderAnalysisLink.click();
    }

    public void clickSalesAnalysisLink() {
        salesAnalysisLink.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public void clickDownloadReportButton() {
        downloadReportButton.click();
    }

    public boolean isPieChartDisplayed() {
        return pieChart.isDisplayed();
    }

    public boolean isBarChartDisplayed() {
        return barChart.isDisplayed();
    }

    public String getTotalOrdersCount() {
        return totalOrdersCount.getText();
    }

    public String getWeeklyOrdersCount() {
        return weeklyOrdersCount.getText();
    }

    public String getMonthlyOrdersCount() {
        return monthlyOrdersCount.getText();
    }

    public String getYearlyOrdersCount() {
        return yearlyOrdersCount.getText();
    }

    public int getTotalOrderCards() {
        return orderCountCards.size();
    }

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}

