package pom.employees_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AllEmployeesPage extends Verification {

    // **Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//img[@alt='Logo']")
    private WebElement headerLogo;

    @FindBy(xpath = "//nav//a[@href='/home']")
    private WebElement homeLink;

    @FindBy(xpath = "//nav//a[@href='/employees']")
    private WebElement employeesLink;

    @FindBy(xpath = "//nav//a[@href='/assign-order']")
    private WebElement assignOrderLink;

    @FindBy(xpath = "//nav//a[@href='/profile']")
    private WebElement profileLink;

    @FindBy(xpath = "//nav//a[@href='/logout']")
    private WebElement logoutLink;

    @FindBy(xpath = "(//*[name()='svg'])[1]")
    private WebElement searchIcon;

    @FindBy(xpath = "(//*[name()='svg'])[2]")
    private WebElement cartIcon;

    // **All Employees Page Elements**
    @FindBy(xpath = "//h2[contains(text(),'All Users')]")
    private WebElement allUsersTitle;

    @FindBy(xpath = "//input[@placeholder='Search users...']")
    private WebElement searchField;

    @FindBy(xpath = "//div[contains(@class,'grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-5 gap-4')]/div")
    private List<WebElement> gridViewUsers;

    @FindBy(xpath = "//div[contains(@class,'grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-6')]/div")
    private List<WebElement> cardViewUsers;

    @FindBy(xpath = "//div[contains(@class,'space-y-6')]/div")
    private List<WebElement> listViewUsers;

    @FindBy(xpath = "//button[contains(@title,'Delete User')]")
    private List<WebElement> deleteUserButtons;

    @FindBy(xpath = "(//svg[contains(@class,'text-xl')])[1]")
    private WebElement listViewIcon;

    @FindBy(xpath = "(//svg[contains(@class,'text-xl')])[2]")
    private WebElement cardViewIcon;

    @FindBy(xpath = "(//svg[contains(@class,'text-xl')])[3]")
    private WebElement gridViewIcon;

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
    public AllEmployeesPage(WebDriver driver) {
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

    public void clickEmployeesLink() {
        employeesLink.click();
    }

    public void clickAssignOrderLink() {
        assignOrderLink.click();
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

    // **All Employees Page Methods**
    public String getAllUsersTitle() {
        return allUsersTitle.getText();
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

    public int getGridViewUsersCount() {
        return gridViewUsers.size();
    }

    public int getCardViewUsersCount() {
        return cardViewUsers.size();
    }

    public int getListViewUsersCount() {
        return listViewUsers.size();
    }

    public void deleteUser(int index) {
        deleteUserButtons.get(index).click();
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

