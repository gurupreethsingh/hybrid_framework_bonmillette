package pom.blog_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class SingleBlogPage extends Verification {
    
    @FindBy(xpath="//h1")
    private WebElement blogTitle;
    
    @FindBy(xpath="//p[contains(text(),'Published on')]")
    private WebElement publishedDate;
    
    @FindBy(xpath="//img[contains(@class, 'w-full h-auto')]")
    private WebElement featuredImage;
    
    @FindBy(xpath="//div[contains(@class, 'text-lg mb-4')]")
    private WebElement blogContent;
    
    @FindBy(xpath="//input[@placeholder='Search blogs...']")
    private WebElement searchInput;
    
    @FindBy(xpath="//h3[contains(text(),'Latest Blogs')]")
    private WebElement latestBlogsSection;
    
    @FindBy(xpath="//h3[contains(text(),'Categories')]")
    private WebElement categoriesSection;
    
    @FindBy(xpath="//h3[contains(text(),'Tags')]")
    private WebElement tagsSection;
    
    @FindBy(xpath="//button[contains(@class, 'text-xs bg-gray-200')]")
    private WebElement blogTags;
    
    @FindBy(xpath="//a[contains(@href, '/single-blog/')]")
    private WebElement relatedBlogLinks;
    
    @FindBy(xpath="//button[contains(@class, 'cursor-pointer')]//svg")
    private WebElement viewToggleButtons;
    
    @FindBy(xpath="//button[contains(@class, 'cursor-pointer') and contains(@class, 'FaArrowLeft')]")
    private WebElement previousBlogButton;
    
    @FindBy(xpath="//button[contains(@class, 'cursor-pointer') and contains(@class, 'FaArrowRight')]")
    private WebElement nextBlogButton;
    
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
    public SingleBlogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Utilization methods to interact with elements
    public void clickPreviousBlogButton() {
        previousBlogButton.click();
    }
    
    public void clickNextBlogButton() {
        nextBlogButton.click();
    }
    
    public boolean verifySingleBlogTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }
    
    public boolean verifySingleBlogUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }
    
    public boolean verifyTextPresence(String expectedText, SoftAssert softAssert) {
        return verifyTextPresent(expectedText, softAssert);
    }
}
