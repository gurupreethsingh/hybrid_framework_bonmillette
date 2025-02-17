package pom.order_analysis_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class SalesAnalysisPage extends Verification {

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

    // ========================== DATE FILTERS ==========================

    @FindBy(xpath = "//input[@type='date' and @label='Start Date']")
    private WebElement startDateInput;

    @FindBy(xpath = "//input[@type='date' and @label='End Date']")
    private WebElement endDateInput;

    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    private WebElement applyFilterButton;

    // ========================== REPORT DOWNLOAD ==========================

    @FindBy(xpath = "//button[contains(text(),'Download Excel Report')]")
    private WebElement downloadReportButton;

    // ========================== CHARTS ==========================

    @FindBy(xpath = "//canvas[contains(@class,'chartjs-render-monitor')]")
    private WebElement barChart;

    @FindBy(xpath = "//canvas[contains(@class,'chartjs-render-monitor')]")
    private WebElement lineChart;

    // ========================== SALES DATA CARDS ==========================

    @FindBy(xpath = "//h4[contains(text(),'Sales Analysis Dashboard')]")
    private WebElement salesAnalysisTitle;

    // ========================== CONSTRUCTOR ==========================

    public SalesAnalysisPage(WebDriver driver) {
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

    public void enterStartDate(String date) {
        startDateInput.sendKeys(date);
    }

    public void enterEndDate(String date) {
        endDateInput.sendKeys(date);
    }

    public void clickApplyFilterButton() {
        applyFilterButton.click();
    }

    public void clickDownloadReportButton() {
        downloadReportButton.click();
    }

    public boolean isBarChartDisplayed() {
        return barChart.isDisplayed();
    }

    public boolean isLineChartDisplayed() {
        return lineChart.isDisplayed();
    }

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}

