package pom.issue_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AddIssuePage extends Verification {

    // **Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//img[@alt='Logo']")
    private WebElement headerLogo;

    @FindBy(xpath = "//nav//a[@href='/home']")
    private WebElement homeLink;

    @FindBy(xpath = "//nav//a[@href='/user-dashboard']")
    private WebElement userDashboardLink;

    @FindBy(xpath = "//nav//a[@href='/my-orders']")
    private WebElement myOrdersLink;

    @FindBy(xpath = "//nav//a[@href='/all-issues']")
    private WebElement allIssuesLink;

    @FindBy(xpath = "//nav//a[@href='/logout']")
    private WebElement logoutLink;

    @FindBy(xpath = "(//*[name()='svg'])[1]")
    private WebElement searchIcon;

    @FindBy(xpath = "(//*[name()='svg'])[2]")
    private WebElement cartIcon;

    // **Navigation Section**
    @FindBy(xpath = "//h3[contains(text(),'Navigation')]")
    private WebElement navigationTitle;

    @FindBy(xpath = "//a[contains(text(),'🏠 Dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(text(),'📦 Orders')]")
    private WebElement ordersLink;

    @FindBy(xpath = "//a[contains(text(),'🛠️ Issues')]")
    private WebElement issuesLink;

    @FindBy(xpath = "//button[contains(text(),'🚪 Logout')]")
    private WebElement logoutButton;

    // **Add Issue Page Elements**
    @FindBy(xpath = "//h2[contains(text(),'Report an Issue')]")
    private WebElement reportIssueTitle;

    @FindBy(xpath = "//label[contains(text(),'Title')]")
    private WebElement titleLabel;

    @FindBy(xpath = "//input[@placeholder='Enter issue title']")
    private WebElement titleInputField;

    @FindBy(xpath = "//label[contains(text(),'Order ID')]")
    private WebElement orderIdLabel;

    @FindBy(xpath = "//select[contains(@class,'border rounded-lg')]")
    private WebElement orderIdDropdown;

    @FindBy(xpath = "//label[contains(text(),'Description')]")
    private WebElement descriptionLabel;

    @FindBy(xpath = "//textarea[@placeholder='Describe the issue']")
    private WebElement descriptionTextarea;

    @FindBy(xpath = "//label[contains(text(),'Upload Images (Max 5)')]")
    private WebElement uploadImagesLabel;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement fileUploadInput;

    @FindBy(xpath = "//div[contains(@class,'bg-blue-50')]")
    private WebElement uploadButton;

    @FindBy(xpath = "//button[contains(text(),'Submit Issue')]")
    private WebElement submitIssueButton;

    @FindBy(xpath = "//div[contains(@class,'text-red-500')]")
    private WebElement errorMessage;

    // **Footer Elements**
    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "//img[@alt='company logo']")
    private WebElement footerLogo;

    @FindBy(xpath = "//a[contains(@href, 'instagram.com')]")
    private WebElement instagramLink;

    @FindBy(xpath = "//a[contains(@href, 'linkedin.com')]")
    private WebElement linkedinLink;

    @FindBy(xpath = "//a[contains(@href, 'facebook.com')]")
    private WebElement facebookLink;

    @FindBy(xpath = "//a[contains(@href, 'twitter.com')]")
    private WebElement twitterLink;

    @FindBy(xpath = "//a[@href='/privacy-policy']")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//a[@href='/terms-and-conditions']")
    private WebElement termsAndConditionsLink;

    @FindBy(xpath = "//a[@href='/return-policy']")
    private WebElement returnPolicyLink;

    // **Constructor for Initialization**
    public AddIssuePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // **Header Methods**
    public boolean isHeaderDisplayed() {
        return header.isDisplayed();
    }

    public void clickOnLogo() {
        headerLogo.click();
    }

    public void clickHomeLink() {
        homeLink.click();
    }

    public void clickUserDashboardLink() {
        userDashboardLink.click();
    }

    public void clickMyOrdersLink() {
        myOrdersLink.click();
    }

    public void clickAllIssuesLink() {
        allIssuesLink.click();
    }

    public void clickLogoutLink() {
        logoutLink.click();
    }

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    // **Navigation Methods**
    public boolean isNavigationDisplayed() {
        return navigationTitle.isDisplayed();
    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickOrdersLink() {
        ordersLink.click();
    }

    public void clickIssuesLink() {
        issuesLink.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    // **Add Issue Page Methods**
    public String getReportIssueTitle() {
        return reportIssueTitle.getText();
    }

    public void enterIssueTitle(String issueTitle) {
        titleInputField.clear();
        titleInputField.sendKeys(issueTitle);
    }

    public void selectOrder(String orderId) {
        orderIdDropdown.sendKeys(orderId);
    }

    public void enterIssueDescription(String issueDescription) {
        descriptionTextarea.clear();
        descriptionTextarea.sendKeys(issueDescription);
    }

    public void uploadImage(String imagePath) {
        fileUploadInput.sendKeys(imagePath);
    }

    public void clickSubmitIssueButton() {
        submitIssueButton.click();
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    // **Footer Methods**
    public boolean isFooterDisplayed() {
        return footer.isDisplayed();
    }

    public void clickInstagramLink() {
        instagramLink.click();
    }

    public void clickFacebookLink() {
        facebookLink.click();
    }

    public void clickLinkedInLink() {
        linkedinLink.click();
    }

    public void clickTwitterLink() {
        twitterLink.click();
    }

    public void clickPrivacyPolicyLink() {
        privacyPolicyLink.click();
    }

    public void clickTermsAndConditionsLink() {
        termsAndConditionsLink.click();
    }

    public void clickReturnPolicyLink() {
        returnPolicyLink.click();
    }
}

