package pom.contact_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class ReplyMessagePage extends Verification {

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

    // **Reply Message Page Elements**
    @FindBy(xpath = "//h2[contains(text(),'Replies')]")
    private WebElement repliesTitle;

    @FindBy(xpath = "//h2[contains(@class,'text-2xl')]")
    private WebElement messageText;

    @FindBy(xpath = "//p[contains(@class,'text-gray-800')]")
    private WebElement fullMessageContent;

    @FindBy(xpath = "//span[contains(@class,'text-sm text-gray-700')]")
    private WebElement senderDetails;

    @FindBy(xpath = "//span[contains(@class,'text-sm text-gray-500')]")
    private WebElement messageTimestamp;

    @FindBy(xpath = "//h3[contains(text(),'Your Reply')]")
    private WebElement yourReplyTitle;

    @FindBy(xpath = "//textarea[@placeholder='Type your reply here...']")
    private WebElement replyInputField;

    @FindBy(xpath = "//button[contains(text(),'Send Reply')]")
    private WebElement sendReplyButton;

    @FindBy(xpath = "//div[contains(@class,'border rounded-lg')]/p")
    private List<WebElement> allReplies;

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
    public ReplyMessagePage(WebDriver driver) {
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

    // **Reply Message Page Methods**
    public String getRepliesTitle() {
        return repliesTitle.getText();
    }

    public boolean verifyRepliesTitle(SoftAssert softAssert, String expectedTitle) {
        return verifyTextPresent(repliesTitle.getText(), softAssert);
    }

    public String getMessageText() {
        return messageText.getText();
    }

    public String getFullMessageContent() {
        return fullMessageContent.getText();
    }

    public String getSenderDetails() {
        return senderDetails.getText();
    }

    public String getMessageTimestamp() {
        return messageTimestamp.getText();
    }

    public String getYourReplyTitle() {
        return yourReplyTitle.getText();
    }

    public void enterReplyText(String replyText) {
        replyInputField.clear();
        replyInputField.sendKeys(replyText);
    }

    public void clickSendReplyButton() {
        sendReplyButton.click();
    }

    public int getAllRepliesCount() {
        return allReplies.size();
    }

    public String getReplyText(int index) {
        return allReplies.get(index).getText();
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

