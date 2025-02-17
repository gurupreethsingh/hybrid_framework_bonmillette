package pom.common_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class AboutUsPage extends Verification {
    
    @FindBy(xpath="//p[@class='text-red-600 font-bold mt-3 mb-4 text-base']")
    private WebElement welcomeMessage;
    
    @FindBy(xpath="//p[contains(text(),'Who We Are')]")
    private WebElement whoWeAreTitle;
    
    @FindBy(xpath="//p[contains(text(),'At BonMillette, we believe in snacking smarter.')]")
    private WebElement aboutUsDescription;
    
    @FindBy(xpath="//p[contains(text(),'We are both excited and proud of this exquisite line of mithais')]")
    private WebElement quoteText;
    
    @FindBy(xpath="//hr[@class='w-10']")
    private WebElement horizontalLine;
    
    @FindBy(xpath="//a[@href='/contact-us' and contains(@class, 'btn bg-red-500')]")
    private WebElement contactUsButton;
    
    @FindBy(xpath="//img[@alt='BonMillette Logo']")
    private WebElement bonmilletteLogo;
    
    // Header Elements
    @FindBy(xpath="//img[@alt='Logo']")
    private WebElement headerLogo;
    
    @FindBy(xpath="//nav//a[@href='/home']")
    private WebElement homeLink;
    
    @FindBy(xpath="//nav//a[@href='/shop']")
    private WebElement shopLink;
    
    @FindBy(xpath="//nav//a[@href='/our-story']")
    private WebElement ourStoryLink;
    
    @FindBy(xpath="//nav//a[@href='/all-blogs']")
    private WebElement blogLink;
    
    @FindBy(xpath="//nav//a[@href='/testimonials']")
    private WebElement testimonialsLink;
    
    @FindBy(xpath="//nav//a[@href='/contact-us']")
    private WebElement contactUsNavLink;
    
    @FindBy(xpath="//button[contains(text(),'My Account')]")
    private WebElement myAccountButton;
    
    @FindBy(xpath="//*[name()='svg' and contains(@class, 'AiOutlineSearch')]")
    private WebElement searchIcon;
    
    @FindBy(xpath="//*[name()='svg' and contains(@class, 'HiOutlineShoppingBag')]")
    private WebElement cartIcon;
    
    // Footer Elements
    @FindBy(xpath="//img[@alt='company logo']")
    private WebElement footerLogo;
    
    @FindBy(xpath="//a[contains(@href, 'instagram.com')]")
    private WebElement instagramLink;
    
    @FindBy(xpath="//a[contains(@href, 'linkedin.com')]")
    private WebElement linkedinLink;
    
    @FindBy(xpath="//a[contains(@href, 'facebook.com')]")
    private WebElement facebookLink;
    
    @FindBy(xpath="//a[contains(@href, 'twitter.com')]")
    private WebElement twitterLink;
    
    @FindBy(xpath="//a[@href='/privacy-policy']")
    private WebElement privacyPolicyLink;
    
    @FindBy(xpath="//a[@href='/terms-and-conditions']")
    private WebElement termsAndConditionsLink;
    
    @FindBy(xpath="//a[@href='/return-policy']")
    private WebElement returnPolicyLink;
    
    // Constructor for initialization
    public AboutUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Utilization methods to interact with elements
    public String getWelcomeMessageText() {
        return welcomeMessage.getText();
    }
    
    public String getWhoWeAreTitleText() {
        return whoWeAreTitle.getText();
    }
    
    public String getAboutUsDescriptionText() {
        return aboutUsDescription.getText();
    }
    
    public String getQuoteText() {
        return quoteText.getText();
    }
    
    public boolean isHorizontalLineDisplayed() {
        return horizontalLine.isDisplayed();
    }
    
    public void clickOnContactUsButton() {
        contactUsButton.click();
    }
    
    public boolean isBonMilletteLogoDisplayed() {
        return bonmilletteLogo.isDisplayed();
    }
    
    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }
    
    public void clickOnSearchIcon() {
        searchIcon.click();
    }
    
    public void clickOnCartIcon() {
        cartIcon.click();
    }
    
    public boolean isFooterLogoDisplayed() {
        return footerLogo.isDisplayed();
    }
    
    // Verification methods
    public boolean verifyAboutUsPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }
    
    public boolean verifyAboutUsPageUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }
    
    public boolean verifyTextPresence(String expectedText, SoftAssert softAssert) {
        return verifyTextPresent(expectedText, softAssert);
    }
}
