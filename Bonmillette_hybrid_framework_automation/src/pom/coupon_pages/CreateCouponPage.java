package pom.coupon_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class CreateCouponPage extends Verification {

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

    // **Navigation Elements**
    @FindBy(xpath = "//a[contains(@href, '/superadmin-dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href, '/all-coupons')]")
    private WebElement allCouponsLink;

    @FindBy(xpath = "//a[contains(@href, '/all-orders')]")
    private WebElement allOrdersLink;

    @FindBy(xpath = "//a[contains(@href, '/profile')]")
    private WebElement profileLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // **Create Coupon Form Elements**
    @FindBy(xpath = "//h2[contains(text(),'Create a New Coupon')]")
    private WebElement createCouponTitle;

    @FindBy(id = "code")
    private WebElement couponCodeInput;

    @FindBy(id = "discount")
    private WebElement discountInput;

    @FindBy(id = "maxDiscountAmount")
    private WebElement maxDiscountAmountInput;

    @FindBy(id = "expirationDate")
    private WebElement expirationDateInput;

    @FindBy(id = "usageLimit")
    private WebElement usageLimitInput;

    @FindBy(id = "minCartValue")
    private WebElement minCartValueInput;

    @FindBy(id = "isActive")
    private WebElement isActiveCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement createCouponButton;

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
    public CreateCouponPage(WebDriver driver) {
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

    // **Navigation Methods**
    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickAllCouponsLink() {
        allCouponsLink.click();
    }

    public void clickAllOrdersLink() {
        allOrdersLink.click();
    }

    public void clickProfileLink() {
        profileLink.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    // **Create Coupon Form Methods**
    public boolean verifyCreateCouponTitle(SoftAssert softAssert, String expectedTitle) {
        return verifyTextPresent(createCouponTitle.getText(), softAssert);
    }

    public void enterCouponCode(String code) {
        couponCodeInput.clear();
        couponCodeInput.sendKeys(code);
    }

    public void enterDiscount(String discount) {
        discountInput.clear();
        discountInput.sendKeys(discount);
    }

    public void enterMaxDiscountAmount(String amount) {
        maxDiscountAmountInput.clear();
        maxDiscountAmountInput.sendKeys(amount);
    }

    public void enterExpirationDate(String date) {
        expirationDateInput.clear();
        expirationDateInput.sendKeys(date);
    }

    public void enterUsageLimit(String limit) {
        usageLimitInput.clear();
        usageLimitInput.sendKeys(limit);
    }

    public void enterMinCartValue(String value) {
        minCartValueInput.clear();
        minCartValueInput.sendKeys(value);
    }

    public void toggleIsActiveCheckbox() {
        isActiveCheckbox.click();
    }

    public void clickCreateCouponButton() {
        createCouponButton.click();
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
