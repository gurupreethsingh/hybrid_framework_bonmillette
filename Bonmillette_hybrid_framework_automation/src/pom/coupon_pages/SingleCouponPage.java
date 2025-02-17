package pom.coupon_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class SingleCouponPage extends Verification {

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

    @FindBy(xpath = "//a[contains(@href, '/create-coupon')]")
    private WebElement createCouponLink;

    // **Coupon Details Elements**
    @FindBy(xpath = "//h2[contains(text(),'Coupon Details')]")
    private WebElement couponDetailsTitle;

    @FindBy(xpath = "//input[@name='code']")
    private WebElement couponCodeInput;

    @FindBy(xpath = "//input[@name='discount']")
    private WebElement discountInput;

    @FindBy(xpath = "//input[@name='maxDiscountAmount']")
    private WebElement maxDiscountAmountInput;

    @FindBy(xpath = "//input[@name='expirationDate']")
    private WebElement expirationDateInput;

    @FindBy(xpath = "//input[@name='usageLimit']")
    private WebElement usageLimitInput;

    @FindBy(xpath = "//input[@name='minCartValue']")
    private WebElement minCartValueInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement updateCouponButton;

    // **Coupon History Elements**
    @FindBy(xpath = "//h2[contains(text(),'Coupon History')]")
    private WebElement couponHistoryTitle;

    @FindBy(xpath = "//p[contains(text(),'Expiry')]")
    private WebElement expiryDateText;

    @FindBy(xpath = "//p[contains(text(),'Times Used')]")
    private WebElement timesUsedText;

    @FindBy(xpath = "//p[contains(text(),'Remaining Uses')]")
    private WebElement remainingUsesText;

    @FindBy(xpath = "//ul[contains(@class, 'mt-2')]")
    private WebElement usageDetailsList;

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
    public SingleCouponPage(WebDriver driver) {
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

    public void clickCreateCouponLink() {
        createCouponLink.click();
    }

    // **Coupon Details Methods**
    public boolean verifyCouponDetailsTitle(SoftAssert softAssert, String expectedTitle) {
        return verifyTextPresent(couponDetailsTitle.getText(), softAssert);
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

    public void clickUpdateCouponButton() {
        updateCouponButton.click();
    }

    // **Coupon History Methods**
    public boolean verifyCouponHistoryTitle(SoftAssert softAssert, String expectedTitle) {
        return verifyTextPresent(couponHistoryTitle.getText(), softAssert);
    }

    public String getExpiryDate() {
        return expiryDateText.getText();
    }

    public String getTimesUsed() {
        return timesUsedText.getText();
    }

    public String getRemainingUses() {
        return remainingUsesText.getText();
    }

    public boolean isUsageDetailsDisplayed() {
        return usageDetailsList.isDisplayed();
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

