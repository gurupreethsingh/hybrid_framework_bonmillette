package pom.contact_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AllRepliesPage extends Verification {

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

    // **Replies Page Elements**
    @FindBy(xpath = "//h2[contains(text(),'All Replies')]")
    private WebElement repliesTitle;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(@class,'text-green-500') and contains(text(),'List View')]")
    private WebElement listViewButton;

    @FindBy(xpath = "//button[contains(@class,'text-green-500') and contains(text(),'Grid View')]")
    private WebElement gridViewButton;

    @FindBy(xpath = "//button[contains(@class,'text-green-500') and contains(text(),'Card View')]")
    private WebElement cardViewButton;

    @FindBy(xpath = "//div[contains(@class, 'grid')]/div")
    private List<WebElement> repliesList;

    @FindBy(xpath = "//button[contains(@class,'bg-indigo-600')]/span[text()='Previous']")
    private WebElement previousPageButton;

    @FindBy(xpath = "//button[contains(@class,'bg-indigo-600')]/span[text()='Next']")
    private WebElement nextPageButton;

    @FindBy(xpath = "//span[contains(text(),'Page')]")
    private WebElement pageNumberText;

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
    public AllRepliesPage(WebDriver driver) {
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

    // **Replies Page Methods**
    public String getRepliesTitle() {
        return repliesTitle.getText();
    }

    public boolean verifyRepliesTitle(SoftAssert softAssert, String expectedTitle) {
        return verifyTextPresent(repliesTitle.getText(), softAssert);
    }

    public void enterSearchText(String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickListViewButton() {
        listViewButton.click();
    }

    public void clickGridViewButton() {
        gridViewButton.click();
    }

    public void clickCardViewButton() {
        cardViewButton.click();
    }

    public int getRepliesCount() {
        return repliesList.size();
    }

    public void clickReply(int index) {
        repliesList.get(index).click();
    }

    public void clickPreviousPage() {
        previousPageButton.click();
    }

    public void clickNextPage() {
        nextPageButton.click();
    }

    public String getCurrentPageNumber() {
        return pageNumberText.getText();
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
