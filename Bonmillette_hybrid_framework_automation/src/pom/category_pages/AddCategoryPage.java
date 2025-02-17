package pom.category_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AddCategoryPage extends Verification {

    // **Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//img[@class='w-20 h-20']")
    private WebElement logo;

    @FindBy(xpath = "//a[@href='/home']")
    private WebElement homeLink;

    @FindBy(xpath = "//a[@href='/shop']")
    private WebElement shopLink;

    @FindBy(xpath = "//a[@href='/about-us']")
    private WebElement aboutUsLink;

    @FindBy(xpath = "//a[@href='/all-categories']")
    private WebElement allCategoriesLink;

    @FindBy(xpath = "//a[@href='/testimonials']")
    private WebElement testimonialsLink;

    @FindBy(xpath = "//a[@href='/contact-us']")
    private WebElement contactUsLink;

    @FindBy(xpath = "//button[@class='hidden md:flex text-black font-bold text-lg']")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//*[local-name()='svg'])[1]")
    private WebElement searchIcon;

    @FindBy(xpath = "(//*[local-name()='svg'])[2]")
    private WebElement cartIcon;

    // **Page Elements**
    @FindBy(xpath = "//h2[contains(text(),'Add Main Category')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//label[contains(text(),'Category Name')]")
    private WebElement categoryNameLabel;

    @FindBy(id = "categoryName")
    private WebElement categoryNameInput;

    @FindBy(xpath = "//button[contains(text(),'Add Category')]")
    private WebElement addCategoryButton;

    @FindBy(xpath = "//p[contains(@class,'text-green-500')]")
    private WebElement successMessage;

    // **Footer Elements**
    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "//p[contains(text(),'©')]")
    private WebElement copyrightText;

    @FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//a[contains(text(),'Terms & Conditions')]")
    private WebElement termsAndConditionsLink;

    // **Constructor**
    public AddCategoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // **Header Methods**
    public boolean isHeaderDisplayed() {
        return header.isDisplayed();
    }

    public void clickOnLogo() {
        logo.click();
    }

    public void clickHomeLink() {
        homeLink.click();
    }

    public void clickShopLink() {
        shopLink.click();
    }

    public void clickAboutUsLink() {
        aboutUsLink.click();
    }

    public void clickAllCategoriesLink() {
        allCategoriesLink.click();
    }

    public void clickTestimonialsLink() {
        testimonialsLink.click();
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

    // **Page Methods**
    public String getPageTitle() {
        return pageTitle.getText();
    }

    public boolean isCategoryNameLabelDisplayed() {
        return categoryNameLabel.isDisplayed();
    }

    public void enterCategoryName(String categoryName) {
        categoryNameInput.clear();
        categoryNameInput.sendKeys(categoryName);
    }

    public void clickAddCategoryButton() {
        addCategoryButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public boolean verifyAddCategoryPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyAddCategoryPageUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }

    // **Footer Methods**
    public boolean isFooterDisplayed() {
        return footer.isDisplayed();
    }

    public String getCopyrightText() {
        return copyrightText.getText();
    }

    public void clickPrivacyPolicyLink() {
        privacyPolicyLink.click();
    }

    public void clickTermsAndConditionsLink() {
        termsAndConditionsLink.click();
    }
}
