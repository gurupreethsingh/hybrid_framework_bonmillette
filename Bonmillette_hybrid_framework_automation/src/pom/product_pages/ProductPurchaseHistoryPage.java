package pom.product_pages;

import generic.Verification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ProductPurchaseHistoryPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//a[contains(@href,'/')]//img[contains(@alt,'Logo')]")
    private WebElement logo;

    @FindBy(xpath = "//nav//a[contains(text(),'Home')]")
    private WebElement homeLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Shop')]")
    private WebElement shopLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Our Story')]")
    private WebElement ourStoryLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Blog')]")
    private WebElement blogLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Testimonials')]")
    private WebElement testimonialsLink;

    @FindBy(xpath = "//nav//a[contains(text(),'Contact Us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//button[contains(text(),'My Account')]")
    private WebElement myAccountButton;

    @FindBy(xpath = "//button[@aria-label='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[contains(@class,'shopping-bag')]")
    private WebElement cartButton;

    @FindBy(xpath = "//button[contains(@class,'menu')]")
    private WebElement menuButton;

    // ========================== PAGE TITLE ==========================
    @FindBy(xpath = "//h4[contains(text(),'Product Purchase History')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//h6[contains(text(),'Total Sales')]")
    private WebElement totalSalesLabel;

    @FindBy(xpath = "//p[contains(text(),'Showing purchase history for')]")
    private WebElement selectedMonthsLabel;

    // ========================== FILTER ELEMENTS ==========================

    @FindBy(xpath = "//label[contains(text(),'Select Product')]/following-sibling::div//select")
    private WebElement productDropdown;

    @FindBy(xpath = "//label[contains(text(),'Start Date')]/following-sibling::input")
    private WebElement startDateField;

    @FindBy(xpath = "//label[contains(text(),'End Date')]/following-sibling::input")
    private WebElement endDateField;

    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    private WebElement applyButton;

    @FindBy(xpath = "//button[contains(text(),'Download Excel Report')]")
    private WebElement downloadReportButton;

    // ========================== CHART ELEMENTS ==========================

    @FindBy(xpath = "//h6[contains(text(),'Bar Chart')]/following-sibling::div")
    private WebElement barChart;

    @FindBy(xpath = "//h6[contains(text(),'Line Chart - Sales Trend')]/following-sibling::div")
    private WebElement lineChart;

    @FindBy(xpath = "//h6[contains(text(),'Doughnut Chart')]/following-sibling::div")
    private WebElement doughnutChart;

    @FindBy(xpath = "//h6[contains(text(),'Pie Chart')]/following-sibling::div")
    private WebElement pieChart;

    // ========================== TOAST NOTIFICATIONS ==========================
    @FindBy(xpath = "//div[contains(@class,'Toastify__toast-body')]")
    private WebElement toastNotification;

    // ========================== FOOTER ELEMENTS ==========================

    @FindBy(xpath = "//div[contains(@class,'social_links')]//img")
    private WebElement footerLogo;

    @FindBy(xpath = "//div[contains(@class,'social_links')]//a[contains(@href,'instagram')]")
    private WebElement instagramLink;

    @FindBy(xpath = "//div[contains(@class,'social_links')]//a[contains(@href,'linkedin')]")
    private WebElement linkedinLink;

    @FindBy(xpath = "//div[contains(@class,'social_links')]//a[contains(@href,'facebook')]")
    private WebElement facebookLink;

    @FindBy(xpath = "//div[contains(@class,'social_links')]//a[contains(@href,'twitter')]")
    private WebElement twitterLink;

    @FindBy(xpath = "//div[contains(@class,'quick_links')]//a[contains(text(),'Home')]")
    private WebElement footerHomeLink;

    @FindBy(xpath = "//div[contains(@class,'quick_links')]//a[contains(text(),'About Us')]")
    private WebElement footerAboutUsLink;

    @FindBy(xpath = "//div[contains(@class,'quick_links')]//a[contains(text(),'Products')]")
    private WebElement footerProductsLink;

    @FindBy(xpath = "//div[contains(@class,'quick_links')]//a[contains(text(),'Contact Us')]")
    private WebElement footerContactUsLink;

    @FindBy(xpath = "//p[contains(text(),'Privacy Policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//p[contains(text(),'Terms & Conditions')]")
    private WebElement termsAndConditionsLink;

    @FindBy(xpath = "//p[contains(text(),'Return Policy')]")
    private WebElement returnPolicyLink;

    // ========================== CONSTRUCTOR ==========================
    public ProductPurchaseHistoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== HEADER ACTION METHODS ==========================

    public void clickHomeLink() {
        homeLink.click();
    }

    public void clickShopLink() {
        shopLink.click();
    }

    public void clickOurStoryLink() {
        ourStoryLink.click();
    }

    public void clickBlogLink() {
        blogLink.click();
    }

    public void clickTestimonialsLink() {
        testimonialsLink.click();
    }

    public void clickContactUsLink() {
        contactUsLink.click();
    }

    public void clickMyAccountButton() {
        myAccountButton.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    // ========================== PAGE ACTION METHODS ==========================

    public void selectProduct(String product, SoftAssert softAssert) {
        selectDropdownByVisibleText(productDropdown, product, softAssert);
    }

    public void enterStartDate(String startDate) {
        startDateField.clear();
        startDateField.sendKeys(startDate);
    }

    public void enterEndDate(String endDate) {
        endDateField.clear();
        endDateField.sendKeys(endDate);
    }

    public void clickApplyButton() {
        applyButton.click();
    }

    public void clickDownloadReportButton() {
        downloadReportButton.click();
    }

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }

    public boolean verifyChartIsDisplayed(WebElement chart, String chartName, SoftAssert softAssert) {
        boolean isDisplayed = chart.isDisplayed();
        softAssert.assertTrue(isDisplayed, chartName + " is not displayed");
        return isDisplayed;
    }

    public boolean verifyBarChartDisplayed(SoftAssert softAssert) {
        return verifyChartIsDisplayed(barChart, "Bar Chart", softAssert);
    }

    public boolean verifyLineChartDisplayed(SoftAssert softAssert) {
        return verifyChartIsDisplayed(lineChart, "Line Chart", softAssert);
    }

    public boolean verifyDoughnutChartDisplayed(SoftAssert softAssert) {
        return verifyChartIsDisplayed(doughnutChart, "Doughnut Chart", softAssert);
    }

    public boolean verifyPieChartDisplayed(SoftAssert softAssert) {
        return verifyChartIsDisplayed(pieChart, "Pie Chart", softAssert);
    }

    public boolean verifyToastMessage(String expectedMessage, SoftAssert softAssert) {
        return verifyTextPresent(expectedMessage, softAssert);
    }
}
