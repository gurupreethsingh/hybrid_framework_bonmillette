package pom.customer_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AllCustomersPage extends Verification {

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

    // **Page Elements**
    @FindBy(xpath = "//h2[contains(text(),'All Users')]")
    private WebElement allUsersTitle;

    @FindBy(xpath = "//input[@placeholder='Search users...']")
    private WebElement searchInput;

    @FindBy(xpath = "//svg[contains(@class, 'FaThList')]")
    private WebElement listViewIcon;

    @FindBy(xpath = "//svg[contains(@class, 'FaThLarge')]")
    private WebElement cardViewIcon;

    @FindBy(xpath = "//svg[contains(@class, 'FaTh')]")
    private WebElement gridViewIcon;

    @FindBy(xpath = "//div[contains(@class,'grid grid-cols')]")
    private List<WebElement> customerGridView;

    @FindBy(xpath = "//div[contains(@class,'space-y-6')]")
    private List<WebElement> customerListView;

    @FindBy(xpath = "//div[contains(@class,'grid-cols-3')]")
    private List<WebElement> customerCardView;

    @FindBy(xpath = "//button[contains(@class,'bg-red-500')]")
    private List<WebElement> deleteCustomerButtons;

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
    public AllCustomersPage(WebDriver driver) {
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

    // **Page Methods**
    public boolean verifyAllUsersTitle(SoftAssert softAssert, String expectedTitle) {
        return verifyTextPresent(allUsersTitle.getText(), softAssert);
    }

    public void enterSearchText(String searchText) {
        searchInput.clear();
        searchInput.sendKeys(searchText);
    }

    public void clickListViewIcon() {
        listViewIcon.click();
    }

    public void clickCardViewIcon() {
        cardViewIcon.click();
    }

    public void clickGridViewIcon() {
        gridViewIcon.click();
    }

    public boolean isCustomerGridViewDisplayed() {
        return !customerGridView.isEmpty();
    }

    public boolean isCustomerListViewDisplayed() {
        return !customerListView.isEmpty();
    }

    public boolean isCustomerCardViewDisplayed() {
        return !customerCardView.isEmpty();
    }

    public void clickDeleteCustomer(int index) {
        deleteCustomerButtons.get(index).click();
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

