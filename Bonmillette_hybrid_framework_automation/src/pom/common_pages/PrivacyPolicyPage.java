package pom.common_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class PrivacyPolicyPage extends Verification {
    
    @FindBy(xpath="//h1[contains(text(),'Privacy Policy')]")
    private WebElement privacyPolicyTitle;
    
    @FindBy(xpath="//p[contains(text(),'At our e-commerce store, we value your privacy')]")
    private WebElement privacyPolicyDescription;
    
    @FindBy(xpath="//h2[contains(text(),'Information We Collect')]")
    private WebElement informationWeCollectTitle;
    
    @FindBy(xpath="//p[contains(text(),'We may collect personal information')]")
    private WebElement informationWeCollectDescription;
    
    @FindBy(xpath="//h2[contains(text(),'How We Use Your Information')]")
    private WebElement howWeUseYourInformationTitle;
    
    @FindBy(xpath="//p[contains(text(),'Your information is used to process transactions')]")
    private WebElement howWeUseYourInformationDescription;
    
    @FindBy(xpath="//h2[contains(text(),'Contact Us')]")
    private WebElement contactUsTitle;
    
    @FindBy(xpath="//p[contains(text(),'If you have any questions about our privacy practices')]")
    private WebElement contactUsDescription;
    
    // Header and Footer elements
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
    public PrivacyPolicyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Utilization methods to interact with elements
    public boolean verifyPrivacyPolicyTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }
    
    public boolean verifyPrivacyPolicyUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }
    
    public boolean verifyTextPresence(String expectedText, SoftAssert softAssert) {
        return verifyTextPresent(expectedText, softAssert);
    }
}

