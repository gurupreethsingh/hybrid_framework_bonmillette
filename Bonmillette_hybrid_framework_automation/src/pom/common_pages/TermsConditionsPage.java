package pom.common_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class TermsConditionsPage extends Verification {
    
    @FindBy(xpath="//h1[contains(text(),'Terms and Conditions')]")
    private WebElement termsConditionsTitle;
    
    @FindBy(xpath="//p[contains(text(),'Welcome to our e-commerce store')]")
    private WebElement termsConditionsDescription;
    
    @FindBy(xpath="//h2[contains(text(),'Use of Website')]")
    private WebElement useOfWebsiteTitle;
    
    @FindBy(xpath="//p[contains(text(),'You agree to use this website for lawful purposes')]")
    private WebElement useOfWebsiteDescription;
    
    @FindBy(xpath="//h2[contains(text(),'Order Acceptance')]")
    private WebElement orderAcceptanceTitle;
    
    @FindBy(xpath="//p[contains(text(),'We reserve the right to accept or reject your order')]")
    private WebElement orderAcceptanceDescription;
    
    @FindBy(xpath="//h2[contains(text(),'Limitation of Liability')]")
    private WebElement limitationOfLiabilityTitle;
    
    @FindBy(xpath="//p[contains(text(),'We are not liable for any indirect or consequential losses')]")
    private WebElement limitationOfLiabilityDescription;
    
    @FindBy(xpath="//h2[contains(text(),'Changes to Terms')]")
    private WebElement changesToTermsTitle;
    
    @FindBy(xpath="//p[contains(text(),'We may update these terms at any time')]")
    private WebElement changesToTermsDescription;
    
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
    public TermsConditionsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Utilization methods to interact with elements
    public boolean verifyTermsConditionsTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }
    
    public boolean verifyTermsConditionsUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }
    
    public boolean verifyTextPresence(String expectedText, SoftAssert softAssert) {
        return verifyTextPresent(expectedText, softAssert);
    }
}
