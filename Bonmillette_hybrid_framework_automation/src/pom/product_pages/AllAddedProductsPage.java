package pom.product_pages;

import generic.Verification;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import java.util.List;

public class AllAddedProductsPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//a[contains(@href,'/home') and contains(text(),'Home')]")
    private WebElement homeLink;

    @FindBy(xpath = "//a[contains(@href,'/shop') and contains(text(),'Shop')]")
    private WebElement shopLink;

    @FindBy(xpath = "//a[contains(@href,'/our-story') and contains(text(),'Our Story')]")
    private WebElement ourStoryLink;

    @FindBy(xpath = "//a[contains(@href,'/all-blogs') and contains(text(),'Blog')]")
    private WebElement blogLink;

    @FindBy(xpath = "//a[contains(@href,'/testimonials') and contains(text(),'Testimonials')]")
    private WebElement testimonialsLink;

    @FindBy(xpath = "//a[contains(@href,'/contact-us') and contains(text(),'Contact Us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//button[contains(@class,'text-black') and contains(@class,'relative')]")
    private WebElement cartIcon;

    @FindBy(xpath = "//button[contains(@class,'text-black') and contains(text(),'My Account')]")
    private WebElement myAccountButton;

    @FindBy(xpath = "//button[contains(@class,'text-black')]//*[name()='svg']")
    private WebElement searchIcon;

    // ========================== PAGE ELEMENTS ==========================

    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    private WebElement allProductsTitle;

    @FindBy(xpath = "//input[@placeholder='Search products...']")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(text(),'Add Product')]")
    private WebElement addProductButton;

    @FindBy(xpath = "//div[contains(@class,'grid')]//a[contains(@href, '/single-added-product')]")
    private List<WebElement> productCards;

    @FindBy(xpath = "//div[contains(@class,'grid')]//a[contains(@href, '/single-added-product')]//img")
    private List<WebElement> productImages;

    @FindBy(xpath = "//div[contains(@class,'grid')]//a[contains(@href, '/single-added-product')]//h3")
    private List<WebElement> productNames;

    @FindBy(xpath = "//div[contains(@class,'grid')]//a[contains(@href, '/single-added-product')]//p")
    private List<WebElement> productPrices;

    // ========================== VIEW TOGGLE ELEMENTS ==========================

    @FindBy(xpath = "//svg[contains(@class,'cursor-pointer') and @data-icon='th-list']")
    private WebElement listViewIcon;

    @FindBy(xpath = "//svg[contains(@class,'cursor-pointer') and @data-icon='th-large']")
    private WebElement cardViewIcon;

    @FindBy(xpath = "//svg[contains(@class,'cursor-pointer') and @data-icon='th']")
    private WebElement gridViewIcon;

    // ========================== FOOTER ELEMENTS ==========================

    @FindBy(xpath = "//img[contains(@src,'Bon_millette_logo_white')]")
    private WebElement footerLogo;

    @FindBy(xpath = "//a[contains(@href, 'https://www.instagram.com')]")
    private WebElement instagramLink;

    @FindBy(xpath = "//a[contains(@href, 'https://www.linkedin.com')]")
    private WebElement linkedinLink;

    @FindBy(xpath = "//a[contains(@href, 'https://www.facebook.com')]")
    private WebElement facebookLink;

    @FindBy(xpath = "//a[contains(@href, 'https://www.twitter.com')]")
    private WebElement twitterLink;

    @FindBy(xpath = "//a[contains(@href, '/privacy-policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//a[contains(@href, '/terms-and-conditions')]")
    private WebElement termsAndConditionsLink;

    @FindBy(xpath = "//a[contains(@href, '/return-policy')]")
    private WebElement returnPolicyLink;

    // ========================== CONSTRUCTOR ==========================

    public AllAddedProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public String getPageTitle() {
        return allProductsTitle.getText();
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

    public void clickTestimonialsLink() {
        testimonialsLink.click();
    }

    public void clickContactUsLink() {
        contactUsLink.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    public void clickMyAccountButton() {
        myAccountButton.click();
    }

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void enterSearchQuery(String query) {
        searchField.clear();
        searchField.sendKeys(query);
    }

    public void clickAddProductButton() {
        addProductButton.click();
    }

    public int getProductCount() {
        return productCards.size();
    }

    public String getProductName(int index) {
        return productNames.get(index).getText();
    }

    public String getProductPrice(int index) {
        return productPrices.get(index).getText();
    }

    public void clickProductCard(int index) {
        productCards.get(index).click();
    }

    public void clickListViewIcon() {
        listViewIcon.click();
    }

    public void clickCardViewIcon() {
        cardViewIcon.click();
    }

    public void clickGridViewIcon() {
        gridViewIcon.click();
    }

    public void clickInstagramLink() {
        instagramLink.click();
    }

    public void clickLinkedInLink() {
        linkedinLink.click();
    }

    public void clickFacebookLink() {
        facebookLink.click();
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

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }

    public boolean verifyProductAdded(String expectedProduct, SoftAssert softAssert) {
        boolean found = productNames.stream().anyMatch(el -> el.getText().equalsIgnoreCase(expectedProduct));
        softAssert.assertTrue(found, "Product not found: " + expectedProduct);
        return found;
    }

    public boolean verifyProductCount(int expectedCount, SoftAssert softAssert) {
        int actualCount = productCards.size();
        softAssert.assertEquals(actualCount, expectedCount, "Mismatch in product count.");
        return actualCount == expectedCount;
    }

    public boolean verifyFooterLinks(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "Privacy Policy link not visible");
        softAssert.assertTrue(termsAndConditionsLink.isDisplayed(), "Terms & Conditions link not visible");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "Return Policy link not visible");
        return true;
    }

    public boolean verifyHeaderLinks(SoftAssert softAssert) {
        softAssert.assertTrue(homeLink.isDisplayed(), "Home link not visible");
        softAssert.assertTrue(shopLink.isDisplayed(), "Shop link not visible");
        softAssert.assertTrue(ourStoryLink.isDisplayed(), "Our Story link not visible");
        softAssert.assertTrue(blogLink.isDisplayed(), "Blog link not visible");
        return true;
    }
}

