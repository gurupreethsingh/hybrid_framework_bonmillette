package pom.category_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class AllCategoriesPage extends Verification {
    
    // Header elements
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
    
    @FindBy(xpath="//nav//a[@href='/contact-us']")
    private WebElement contactUsNavLink;
    
    @FindBy(xpath="//*[name()='svg' and contains(@class, 'FaSearch')]")
    private WebElement searchIcon;

    // Category elements
    @FindBy(xpath="//h2[contains(text(),'Main Categories')]")
    private WebElement mainCategoriesTitle;
    
    @FindBy(xpath="//input[@placeholder='Search categories...']")
    private WebElement searchField;
    
    @FindBy(xpath="//button[contains(text(),'Add Category')]")
    private WebElement addCategoryButton;
    
    @FindBy(xpath="//div[contains(@class,'grid')]/div")
    private List<WebElement> categoryList;
    
    @FindBy(xpath="//button[contains(@class,'text-red-500')]")
    private List<WebElement> deleteCategoryButtons;
    
    // Footer elements
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
    public AllCategoriesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Utilization methods to interact with elements
    public boolean verifyMainCategoriesTitle(SoftAssert softAssert) {
        return verifyTextPresent(mainCategoriesTitle.getText(), softAssert);
    }
    
    public void enterSearchText(String categoryName) {
        searchField.clear();
        searchField.sendKeys(categoryName);
    }
    
    public void clickAddCategory() {
        addCategoryButton.click();
    }
    
    public void clickOnCategory(int index) {
        categoryList.get(index).click();
    }
    
    public void deleteCategory(int index) {
        deleteCategoryButtons.get(index).click();
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
        contactUsNavLink.click();
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
