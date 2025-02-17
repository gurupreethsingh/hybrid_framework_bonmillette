package pom.issue_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class SingleIssuePage extends Verification {

    // WebDriver initialization
    private WebDriver driver;

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//img[@class='w-20 h-20']")
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

    @FindBy(xpath = "//button[text()='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//button[@class='text-black']//svg")
    private WebElement searchIcon;

    @FindBy(xpath = "//button[@class='text-black relative']//svg")
    private WebElement cartIcon;

    // ========================== NAVIGATION MENU ==========================

    @FindBy(xpath = "//a[contains(@href, 'dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement myOrdersLink;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // ========================== ISSUE DETAILS ==========================

    @FindBy(xpath = "//h2[contains(text(),'Issue Details')]")
    private WebElement issueDetailsTitle;

    @FindBy(xpath = "//p[contains(text(),'Order ID')]/following-sibling::p")
    private WebElement orderIdText;

    @FindBy(xpath = "//p[contains(text(),'Title')]/following-sibling::p")
    private WebElement issueTitleText;

    @FindBy(xpath = "//p[contains(text(),'Description')]/following-sibling::p")
    private WebElement issueDescriptionText;

    @FindBy(xpath = "//p[contains(text(),'Customer Name')]/following-sibling::p")
    private WebElement customerNameText;

    @FindBy(xpath = "//p[contains(text(),'Complaint Raised Date')]/following-sibling::p")
    private WebElement complaintDateText;

    @FindBy(xpath = "//p[contains(text(),'Status')]/following-sibling::p")
    private WebElement issueStatusText;

    @FindBy(xpath = "//p[contains(text(),'Assigned To')]/following-sibling::p")
    private WebElement assignedToText;

    @FindBy(xpath = "//p[contains(text(),'Assigned By')]/following-sibling::p")
    private WebElement assignedByText;

    // ========================== ISSUE IMAGE SECTION ==========================

    @FindBy(xpath = "//h3[contains(text(),'Images')]")
    private WebElement imagesSectionTitle;

    @FindBy(xpath = "//div[contains(@class, 'grid grid-cols-4 gap-4')]/div/img")
    private List<WebElement> issueImages;

    // ========================== ADMIN ACTIONS ==========================

    @FindBy(xpath = "//select[contains(@class, 'border rounded-md') and contains(@class, 'Assign Employee')]")
    private WebElement assignEmployeeDropdown;

    @FindBy(xpath = "//button[contains(text(),'Assign')]")
    private WebElement assignButton;

    @FindBy(xpath = "//select[contains(@class, 'border rounded-md') and contains(@class, 'Change Status')]")
    private WebElement changeStatusDropdown;

    @FindBy(xpath = "//button[contains(text(),'Update Status')]")
    private WebElement updateStatusButton;

    // ========================== FOOTER ELEMENTS ==========================

    @FindBy(xpath = "//div[contains(@class, 'social_links')]//a[contains(@href, 'instagram')]")
    private WebElement instagramLink;

    @FindBy(xpath = "//div[contains(@class, 'social_links')]//a[contains(@href, 'linkedin')]")
    private WebElement linkedinLink;

    @FindBy(xpath = "//div[contains(@class, 'social_links')]//a[contains(@href, 'facebook')]")
    private WebElement facebookLink;

    @FindBy(xpath = "//div[contains(@class, 'social_links')]//a[contains(@href, 'twitter')]")
    private WebElement twitterLink;

    @FindBy(xpath = "//p[contains(text(),'Phone:')]")
    private WebElement contactPhoneText;

    @FindBy(xpath = "//p[contains(text(),'Bon Millette')]")
    private WebElement companyAddressText;

    @FindBy(xpath = "//a[contains(@href, 'privacy-policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//a[contains(@href, 'terms-and-conditions')]")
    private WebElement termsAndConditionsLink;

    @FindBy(xpath = "//a[contains(@href, 'return-policy')]")
    private WebElement returnPolicyLink;

    // ========================== CONSTRUCTOR ==========================

    public SingleIssuePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public void clickLogo() {
        logo.click();
    }

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

    public void clickMyAccount() {
        myAccountButton.click();
    }

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickMyOrdersLink() {
        myOrdersLink.click();
    }

    public void clickAddressesLink() {
        addressesLink.click();
    }

    public void clickLogout() {
        logoutButton.click();
    }

    public void selectEmployeeToAssign(String employeeName) {
        selectDropdownValue(assignEmployeeDropdown, employeeName);
    }

    public void clickAssignButton() {
        assignButton.click();
    }

    public void selectIssueStatus(String status) {
        selectDropdownValue(changeStatusDropdown, status);
    }

    public void clickUpdateStatusButton() {
        updateStatusButton.click();
    }

    public void clickInstagramLink() {
        instagramLink.click();
    }

    public void clickLinkedInLink() {
        linkedinLink.click();
    }

    public void clickFacebookLink() {
        facebookLink.click();
    }

    public void clickTwitterLink() {
        twitterLink.click();
    }

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}
