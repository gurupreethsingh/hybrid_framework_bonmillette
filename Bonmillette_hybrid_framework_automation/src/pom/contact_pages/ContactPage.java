package pom.contact_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class ContactPage extends Verification {
    
    @FindBy(xpath="//h2[contains(text(),'Contact Us')]")
    private WebElement contactUsTitle;
    
    @FindBy(xpath="//p[contains(text(),'Get In Touch')]")
    private WebElement getInTouchTitle;
    
    @FindBy(xpath="//input[@id='firstName']")
    private WebElement firstNameInput;
    
    @FindBy(xpath="//input[@id='lastName']")
    private WebElement lastNameInput;
    
    @FindBy(xpath="//input[@id='email']")
    private WebElement emailInput;
    
    @FindBy(xpath="//input[@id='phone']")
    private WebElement phoneInput;
    
    @FindBy(xpath="//textarea[@id='message_text']")
    private WebElement messageInput;
    
    @FindBy(xpath="//button[contains(text(),'Submit Form')]")
    private WebElement submitButton;
    
    @FindBy(xpath="//iframe[contains(@src, 'google.com/maps')]")
    private WebElement googleMapsIframe;
    
    @FindBy(xpath="//img[@src='../../assets/homepage_images/email.svg']")
    private WebElement emailIcon;
    
    @FindBy(xpath="//img[@src='../../assets/homepage_images/phone.svg']")
    private WebElement phoneIcon;
    
    @FindBy(xpath="//img[@src='../../assets/homepage_images/address.svg']")
    private WebElement addressIcon;
    
    @FindBy(xpath="//p[contains(text(),'info@bonmillette.com')]")
    private WebElement emailText;
    
    @FindBy(xpath="//p[contains(text(),'+91 9035098282')]")
    private WebElement phoneText;
    
    @FindBy(xpath="//p[contains(text(),'Shed No 45, Katha No 125')]")
    private WebElement addressText;
    
    // Header and Footer elements from AboutUsPage
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
    public ContactPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Utilization methods to interact with elements
    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }
    
    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }
    
    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }
    
    public void enterPhone(String phone) {
        phoneInput.sendKeys(phone);
    }
    
    public void enterMessage(String message) {
        messageInput.sendKeys(message);
    }
    
    public void clickSubmitButton() {
        submitButton.click();
    }
    
    public boolean isGoogleMapDisplayed() {
        return googleMapsIframe.isDisplayed();
    }
    
    public boolean verifyContactUsPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }
    
    public boolean verifyContactUsPageUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }
    
    public boolean verifyTextPresence(String expectedText, SoftAssert softAssert) {
        return verifyTextPresent(expectedText, softAssert);
    }
}
