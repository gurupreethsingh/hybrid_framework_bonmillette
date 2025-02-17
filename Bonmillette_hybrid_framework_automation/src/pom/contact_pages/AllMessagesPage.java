package pom.contact_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AllMessagesPage extends Verification {

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

    // **Messages Page Elements**
    @FindBy(xpath = "//h2[contains(text(),'Messages')]")
    private WebElement messagesTitle;

    @FindBy(xpath = "//input[@placeholder='Search messages...']")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(text(),'Newest First')]")
    private WebElement newestFirstButton;

    @FindBy(xpath = "//button[contains(text(),'Oldest First')]")
    private WebElement oldestFirstButton;

    @FindBy(xpath = "//div[contains(@class, 'grid')]/div")
    private List<WebElement> messageList;

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
    public AllMessagesPage(WebDriver driver) {
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

    // **Messages Page Methods**
    public String getMessagesTitle() {
        return messagesTitle.getText();
    }

    public boolean verifyMessagesTitle(SoftAssert softAssert, String expectedTitle) {
        return verifyTextPresent(messagesTitle.getText(), softAssert);
    }

    public void enterSearchText(String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickNewestFirstButton() {
        newestFirstButton.click();
    }

    public void clickOldestFirstButton() {
        oldestFirstButton.click();
    }

    public int getMessageCount() {
        return messageList.size();
    }

    public void clickMessage(int index) {
        messageList.get(index).click();
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

