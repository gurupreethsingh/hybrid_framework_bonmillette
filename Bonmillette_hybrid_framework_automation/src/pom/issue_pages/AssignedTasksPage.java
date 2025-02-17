package pom.issue_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AssignedTasksPage extends Verification {

    // **Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//img[@alt='Logo']")
    private WebElement headerLogo;

    @FindBy(xpath = "//nav//a[@href='/home']")
    private WebElement homeLink;

    @FindBy(xpath = "//nav//a[@href='/dashboard']")
    private WebElement dashboardLink;

    @FindBy(xpath = "//nav//a[@href='/profile']")
    private WebElement profileLink;

    @FindBy(xpath = "//nav//a[@href='/logout']")
    private WebElement logoutLink;

    @FindBy(xpath = "(//*[name()='svg'])[1]")
    private WebElement searchIcon;

    @FindBy(xpath = "(//*[name()='svg'])[2]")
    private WebElement cartIcon;

    // **Navigation Section**
    @FindBy(xpath = "//h3[contains(text(),'Navigation')]")
    private WebElement navigationTitle;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement sideDashboardLink;

    @FindBy(xpath = "//a[contains(text(),'Profile')]")
    private WebElement sideProfileLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement sideLogoutButton;

    // **Assigned Tasks Page Elements**
    @FindBy(xpath = "//h2[contains(text(),'Assigned Tasks')]")
    private WebElement assignedTasksTitle;

    @FindBy(xpath = "//input[@placeholder='Search issues...']")
    private WebElement searchField;

    @FindBy(xpath = "(//svg[contains(@class,'text-xl')])[1]")
    private WebElement listViewIcon;

    @FindBy(xpath = "(//svg[contains(@class,'text-xl')])[2]")
    private WebElement gridViewIcon;

    @FindBy(xpath = "(//svg[contains(@class,'text-xl')])[3]")
    private WebElement cardViewIcon;

    @FindBy(xpath = "//div[contains(@class,'grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 gap-6')]/div")
    private List<WebElement> gridViewIssues;

    @FindBy(xpath = "//div[contains(@class,'flex flex-wrap gap-6')]/div")
    private List<WebElement> cardViewIssues;

    @FindBy(xpath = "//div[contains(@class,'bg-white shadow-md rounded-lg p-4 mb-4')]")
    private List<WebElement> listViewIssues;

    @FindBy(xpath = "//select[contains(@class,'border rounded')]")
    private List<WebElement> statusDropdowns;

    @FindBy(xpath = "//button[contains(text(),'Update')]")
    private List<WebElement> updateButtons;

    @FindBy(xpath = "//div[contains(@class,'mt-6 flex justify-center space-x-2')]/button")
    private List<WebElement> paginationButtons;

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
    public AssignedTasksPage(WebDriver driver) {
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

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickProfileLink() {
        profileLink.click();
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

    public void clickSideDashboardLink() {
        sideDashboardLink.click();
    }

    public void clickSideProfileLink() {
        sideProfileLink.click();
    }

    public void clickSideLogoutButton() {
        sideLogoutButton.click();
    }

    // **Assigned Tasks Page Methods**
    public String getAssignedTasksTitle() {
        return assignedTasksTitle.getText();
    }

    public void enterSearchText(String query) {
        searchField.clear();
        searchField.sendKeys(query);
    }

    public void selectListView() {
        listViewIcon.click();
    }

    public void selectCardView() {
        cardViewIcon.click();
    }

    public void selectGridView() {
        gridViewIcon.click();
    }

    public int getListViewIssuesCount() {
        return listViewIssues.size();
    }

    public int getCardViewIssuesCount() {
        return cardViewIssues.size();
    }

    public int getGridViewIssuesCount() {
        return gridViewIssues.size();
    }

    public void updateIssueStatus(int index, String status) {
        statusDropdowns.get(index).sendKeys(status);
        updateButtons.get(index).click();
    }

    public void clickPaginationButton(int index) {
        paginationButtons.get(index).click();
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
