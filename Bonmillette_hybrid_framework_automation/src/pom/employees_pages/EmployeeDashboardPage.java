package pom.employees_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class EmployeeDashboardPage extends Verification {

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

    @FindBy(xpath = "(//*[name()='svg'])[1]")
    private WebElement searchIcon;

    @FindBy(xpath = "(//*[name()='svg'])[2]")
    private WebElement cartIcon;

    // **Dashboard Elements**
    @FindBy(xpath = "//h2[contains(text(),'Employee Dashboard')]")
    private WebElement employeeDashboardTitle;

    @FindBy(xpath = "//input[@placeholder='Search cards...']")
    private WebElement searchInput;

    @FindBy(xpath = "//a[contains(@href, 'assigned-issue')]")
    private WebElement assignedTasksCard;

    @FindBy(xpath = "//p[contains(text(),'Assigned Tasks')]")
    private WebElement assignedTasksText;

    @FindBy(xpath = "//div[contains(@class,'grid grid-cols')]")
    private List<WebElement> dashboardCards;

    // **Navigation Sidebar Elements**
    @FindBy(xpath = "//ul[contains(@class,'space-y-4')]")
    private WebElement navigationMenu;

    @FindBy(xpath = "//a[contains(@href, 'employee-dashboard')]")
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
    public EmployeeDashboardPage(WebDriver driver) {
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

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    // **Dashboard Methods**
    public boolean verifyEmployeeDashboardTitle(SoftAssert softAssert, String expectedTitle) {
        return verifyTextPresent(employeeDashboardTitle.getText(), softAssert);
    }

    public void enterSearchText(String searchText) {
        searchInput.clear();
        searchInput.sendKeys(searchText);
    }

    public void clickAssignedTasksCard() {
        assignedTasksCard.click();
    }

    public boolean isAssignedTasksTextDisplayed() {
        return assignedTasksText.isDisplayed();
    }

    public boolean areDashboardCardsDisplayed() {
        return !dashboardCards.isEmpty();
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

