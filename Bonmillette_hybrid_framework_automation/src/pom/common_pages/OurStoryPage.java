package pom.common_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class OurStoryPage extends Verification {
    
    @FindBy(xpath="//img[contains(@src, 'Our_Story_Banner.jpg')]")
    private WebElement ourStoryBanner;
    
    @FindBy(xpath="//img[contains(@src, 'our_journey.png')]")
    private WebElement ourJourneyImage;
    
    @FindBy(xpath="//img[contains(@src, 'lady.png')]")
    private WebElement ladyImage;
    
    @FindBy(xpath="//p[contains(text(),'Bon Millette is founded')]")
    private WebElement bonMilletteStory;
    
    @FindBy(xpath="//img[contains(@src, 'variety-legumes.png')]")
    private WebElement varietyLegumesImage;
    
    @FindBy(xpath="//p[contains(text(),'Why Millets')]")
    private WebElement whyMilletsTitle;
    
    @FindBy(xpath="//p[contains(text(),'Millets are more than just a grain')]")
    private WebElement whyMilletsDescription;
    
    @FindBy(xpath="//p[contains(text(),'Nutritious Powerhouse')]")
    private WebElement nutritiousPowerhouse;
    
    @FindBy(xpath="//p[contains(text(),'Sustainable Choice')]")
    private WebElement sustainableChoice;
    
    @FindBy(xpath="//p[contains(text(),'Energizing Fuel')]")
    private WebElement energizingFuel;
    
    @FindBy(xpath="//p[contains(text(),'Allergen-Friendly')]")
    private WebElement allergenFriendly;
    
    @FindBy(xpath="//p[contains(text(),'Pure Ingredients')]")
    private WebElement pureIngredients;
    
    @FindBy(xpath="//p[contains(text(),'Natural Sweeteners')]")
    private WebElement naturalSweeteners;
    
    @FindBy(xpath="//p[contains(text(),'Mindful Recipes')]")
    private WebElement mindfulRecipes;
    
    @FindBy(xpath="//img[contains(@src, 'mixes_items.jpg')]")
    private WebElement mixItemsImage;
    
    @FindBy(xpath="//p[contains(text(),'Ready to snack smarter?')]")
    private WebElement snackSmarterText;
    
    @FindBy(xpath="//a[@href='/shop' and contains(@class, 'bg-red-500')]")
    private WebElement shopNowButton;
    
    // Header and Footer elements from ContactUsPage
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
    public OurStoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Utilization methods to interact with elements
    public void clickShopNowButton() {
        shopNowButton.click();
    }
    
    public boolean verifyOurStoryPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }
    
    public boolean verifyOurStoryPageUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }
    
    public boolean verifyTextPresence(String expectedText, SoftAssert softAssert) {
        return verifyTextPresent(expectedText, softAssert);
    }
}
