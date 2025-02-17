package pom.issue_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import generic.Verification;

public class SingleIssuePage extends Verification {

    // **Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//img[@alt='Logo']")
    private WebElement headerLogo;

    @FindBy(xpath = "//nav//a[@href='/home']")
    private WebElement homeLink;

    @FindBy(xpath = "//nav//a[@href='/shop']")
    private WebElement shopLink;

    @FindBy(xpath = "//nav//a[@href='/our-story']")
    private WebElement ourStoryLink;

    @FindBy(xpath = "//nav//a[@href='/all-blogs']")
    private WebElement blogLink;

    @FindBy(xpath = "//nav//a[@href='/contact-us']")
    private WebElement contactUsLink;

    @FindBy(xpath = "//button[contains(@class, 'text-black font-bold text-lg')]")
    private WebElement myAccountButton;

    // **Page Title**
    @FindBy(xpath = "//h2[contains(text(),'Issue Details')]")
    private WebElement issueDetailsTitle;

    // **Issue Information**
    @FindBy(xpath = "//p[strong[text()='Order ID:']]")
    private WebElement orderIdText;

    @FindBy(xpath = "//p[strong[text()='Title:']]")
    private WebElement issueTitleText;

    @FindBy(xpath = "//p[strong[text()='Description:']]")
    private WebElement issueDescriptionText;

    @FindBy(xpath = "//p[strong[text()='Customer Name:']]")
    private WebElement customerNameText;

    @FindBy(xpath = "//p[strong[text()='Complaint Raised Date:']]")
    private WebElement complaintRaisedDateText;

    @FindBy(xpath = "//p[strong[text()='Status:']]")
    private WebElement issueStatusText;

    @FindBy(xpath = "//p[strong[text()='Assigned To:']]")
    private WebElement assignedToText;

    @FindBy(xpath = "//p[strong[text()='Assigned By:']]")
    private WebElement assignedByText;

    // **Issue Images**
    @FindBy(xpath = "//div[@class='grid grid-cols-4 gap-4']/div/img")
    private List<WebElement> issueImages;

    // **Dropdowns for Assignment & Status Update**
    @FindBy(xpath = "//select[contains(@class, 'border rounded-md')][1]")
    private WebElement assignEmployeeDropdown;

    @FindBy(xpath = "//select[contains(@class, 'border rounded-md')][2]")
    private WebElement changeStatusDropdown;

    // **Buttons**
    @FindBy(xpath = "//button[contains(text(),'Assign')]")
    private WebElement assignButton;

    @FindBy(xpath = "//button[contains(text(),'Update Status')]")
    private WebElement updateStatusButton;

    // **Navigation Sidebar Elements**
    @FindBy(xpath = "//ul[contains(@class,'space-y-4')]")
    private WebElement navigationMenu;

    @FindBy(xpath = "//a[contains(@href, 'dashboard')]")
    private WebElement dashboardNavLink;

    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement ordersNavLink;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement addressesNavLink;

    @FindBy(xpath = "//a[contains(@href, 'profile')]")
    private WebElement accountDetailsNavLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

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
    public SingleIssuePage(WebDriver driver) {
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

    public void clickShopLink() {
        shopLink.click();
    }

    public void clickOurStoryLink() {
        ourStoryLink.click();
    }

    public void clickBlogLink() {
        blogLink.click();
    }

    public void clickContactUsLink() {
        contactUsLink.click();
    }

    public void clickMyAccountButton() {
        myAccountButton.click();
    }

    // **Issue Details Verification Methods**
    public boolean verifyIssueDetailsTitle() {
        return issueDetailsTitle.isDisplayed();
    }

    public String getIssueTitle() {
        return issueTitleText.getText();
    }

    public String getIssueDescription() {
        return issueDescriptionText.getText();
    }

    public String getCustomerName() {
        return customerNameText.getText();
    }

    public String getComplaintRaisedDate() {
        return complaintRaisedDateText.getText();
    }

    public String getIssueStatus() {
        return issueStatusText.getText();
    }

    public String getAssignedTo() {
        return assignedToText.getText();
    }

    public String getAssignedBy() {
        return assignedByText.getText();
    }

    public int getIssueImagesCount() {
        return issueImages.size();
    }

    // **Dropdown Interactions**
    public void selectEmployeeForAssignment(String employeeName) {
        selectDropdownOptionByVisibleText(assignEmployeeDropdown, employeeName);
    }

    public void selectIssueStatus(String status) {
        selectDropdownOptionByVisibleText(changeStatusDropdown, status);
    }

    // **Button Click Actions**
    public void clickAssignButton() {
        assignButton.click();
    }

    public void clickUpdateStatusButton() {
        updateStatusButton.click();
    }

    // **Navigation Sidebar Methods**
    public void clickDashboardNavLink() {
        dashboardNavLink.click();
    }

    public void clickOrdersNavLink() {
        ordersNavLink.click();
    }

    public void clickAddressesNavLink() {
        addressesNavLink.click();
    }

    public void clickAccountDetailsNavLink() {
        accountDetailsNavLink.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
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
