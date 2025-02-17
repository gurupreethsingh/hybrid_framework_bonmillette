package pom.product_pages;

import generic.Verification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import java.util.List;

public class StockAnalysisPage extends Verification {

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
    @FindBy(xpath = "//h4[contains(text(),'Stock Analysis')]")
    private WebElement pageTitle;

    // ========================== FORM ELEMENTS ==========================

    @FindBy(xpath = "//select[contains(@aria-label,'Select Product')]")
    private WebElement productDropdown;

    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    private WebElement applyButton;

    @FindBy(xpath = "//button[contains(text(),'Download Excel Report')]")
    private WebElement downloadReportButton;

    // ========================== CHART ELEMENTS ==========================

    @FindBy(xpath = "//canvas[contains(@id,'bar-chart')]")
    private WebElement barChart;

    @FindBy(xpath = "//canvas[contains(@id,'line-chart')]")
    private WebElement lineChart;

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
    public StockAnalysisPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public void clickApplyButton() {
        applyButton.click();
    }

    public void clickDownloadReportButton() {
        downloadReportButton.click();
    }

    public void selectProduct(String product, SoftAssert softAssert) {
        selectDropdownByVisibleText(productDropdown, product, softAssert);
    }

    public boolean isBarChartDisplayed() {
        return barChart.isDisplayed();
    }

    public boolean isLineChartDisplayed() {
        return lineChart.isDisplayed();
    }

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }

    public boolean verifyToastMessage(String expectedMessage, SoftAssert softAssert) {
        return verifyTextPresent(expectedMessage, softAssert);
    }

    public boolean verifyProductDropdownExists(SoftAssert softAssert) {
        boolean isDisplayed = productDropdown.isDisplayed();
        softAssert.assertTrue(isDisplayed, "Product Dropdown is not displayed");
        return isDisplayed;
    }

    public boolean verifyApplyButtonExists(SoftAssert softAssert) {
        boolean isDisplayed = applyButton.isDisplayed();
        softAssert.assertTrue(isDisplayed, "Apply Button is not displayed");
        return isDisplayed;
    }

    public boolean verifyBarChartExists(SoftAssert softAssert) {
        boolean isDisplayed = barChart.isDisplayed();
        softAssert.assertTrue(isDisplayed, "Bar Chart is not displayed");
        return isDisplayed;
    }

    public boolean verifyLineChartExists(SoftAssert softAssert) {
        boolean isDisplayed = lineChart.isDisplayed();
        softAssert.assertTrue(isDisplayed, "Line Chart is not displayed");
        return isDisplayed;
    }

    public boolean verifyFooterLinks(SoftAssert softAssert) {
        boolean isPrivacyDisplayed = privacyPolicyLink.isDisplayed();
        boolean isTermsDisplayed = termsAndConditionsLink.isDisplayed();
        boolean isReturnPolicyDisplayed = returnPolicyLink.isDisplayed();

        softAssert.assertTrue(isPrivacyDisplayed, "Privacy Policy link is missing.");
        softAssert.assertTrue(isTermsDisplayed, "Terms & Conditions link is missing.");
        softAssert.assertTrue(isReturnPolicyDisplayed, "Return Policy link is missing.");

        return isPrivacyDisplayed && isTermsDisplayed && isReturnPolicyDisplayed;
    }
}

