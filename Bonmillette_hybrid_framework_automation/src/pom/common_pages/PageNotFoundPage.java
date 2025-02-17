package pom.common_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class PageNotFoundPage extends Verification {
    
    @FindBy(xpath="//p[contains(text(),'404')]")
    private WebElement errorCode;
    
    @FindBy(xpath="//h1[contains(text(),'Page not found')]")
    private WebElement pageNotFoundTitle;
    
    @FindBy(xpath="//p[contains(text(),'Sorry, we couldn’t find the page you’re looking for.')]")
    private WebElement pageNotFoundMessage;
    
    @FindBy(xpath="//a[@href='/' and contains(text(),'Go back home')]")
    private WebElement goBackHomeButton;
    
    @FindBy(xpath="//a[@href='/contact-us' and contains(text(),'Contact support')]")
    private WebElement contactSupportLink;
    
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
    public PageNotFoundPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Utilization methods to interact with elements
    public void clickGoBackHomeButton() {
        goBackHomeButton.click();
    }
    
    public void clickContactSupportLink() {
        contactSupportLink.click();
    }
    
    public boolean verifyPageNotFoundTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }
    
    public boolean verifyPageNotFoundUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }
    
    public boolean verifyTextPresence(String expectedText, SoftAssert softAssert) {
        return verifyTextPresent(expectedText, softAssert);
    }
}
