package pom.issue_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AllIssuesPage extends Verification {

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

    // **Page Title**
    @FindBy(xpath = "//h2[contains(text(),'All Issues')]")
    private WebElement allIssuesTitle;

    // **Search Field**
    @FindBy(xpath = "//input[@placeholder='Search issues...']")
    private WebElement searchInput;

    // **View Toggle Buttons**
    @FindBy(xpath = "//svg[contains(@class,'cursor-pointer')][1]")
    private WebElement listViewButton;

    @FindBy(xpath = "//svg[contains(@class,'cursor-pointer')][2]")
    private WebElement cardViewButton;

    @FindBy(xpath = "//svg[contains(@class,'cursor-pointer')][3]")
    private WebElement gridViewButton;

    // **Issue Cards/Grid/List Elements**
    @FindBy(xpath = "//div[contains(@class, 'grid grid-cols') or contains(@class, 'space-y-4')]")
    private List<WebElement> issueCards;

    @FindBy(xpath = "//div[contains(@class, 'grid grid-cols')]/a")
    private List<WebElement> issueLinks;

    // **Pagination Elements**
    @FindBy(xpath = "//div[contains(@class, 'mt-6')]/button")
    private List<WebElement> paginationButtons;

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
    public AllIssuesPage(WebDriver driver) {
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

    // **Page Title Verification**
    public boolean verifyAllIssuesTitle() {
        return allIssuesTitle.isDisplayed();
    }

    // **Search Methods**
    public void enterSearchText(String searchText) {
        searchInput.clear();
        searchInput.sendKeys(searchText);
    }

    // **View Toggle Methods**
    public void clickListView() {
        listViewButton.click();
    }

    public void clickCardView() {
        cardViewButton.click();
    }

    public void clickGridView() {
        gridViewButton.click();
    }

    public boolean areIssuesDisplayed() {
        return !issueCards.isEmpty();
    }

    // **Issue Interaction Methods**
    public void clickOnFirstIssue() {
        if (!issueLinks.isEmpty()) {
            issueLinks.get(0).click();
        }
    }

    public int getTotalIssuesCount() {
        return issueCards.size();
    }

    // **Pagination Methods**
    public boolean isPaginationDisplayed() {
        return !paginationButtons.isEmpty();
    }

    public void clickOnPage(int pageNumber) {
        if (pageNumber > 0 && pageNumber <= paginationButtons.size()) {
            paginationButtons.get(pageNumber - 1).click();
        }
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

