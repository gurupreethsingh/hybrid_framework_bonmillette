package pom.cart_pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class Cartpage extends Verification {
    
    // Header Elements
    @FindBy(xpath="//img[@alt='Logo']")
    private WebElement headerLogo;
    
    @FindBy(xpath="//nav//a[@href='/home']")
    private WebElement homeLink;
    
    @FindBy(xpath="//nav//a[@href='/shop']")
    private WebElement shopLink;
    
    @FindBy(xpath="//nav//a[@href='/contact-us']")
    private WebElement contactUsNavLink;
    
    @FindBy(xpath="//*[name()='svg' and contains(@class, 'HiOutlineShoppingBag')]")
    private WebElement cartIcon;

    // Cart Page Elements
    @FindBy(xpath="//h1[contains(text(),'Shopping Cart')]")
    private WebElement shoppingCartHeading;

    @FindBy(xpath="//table//tr")
    private List<WebElement> cartItems;
    
    @FindBy(xpath="//input[@placeholder='Enter coupon code']")
    private WebElement couponInputField;
    
    @FindBy(xpath="//button[contains(text(),'Apply')]")
    private WebElement applyCouponButton;
    
    @FindBy(xpath="//button[contains(text(),'Proceed to Checkout')]")
    private WebElement proceedToCheckoutButton;
    
    @FindBy(xpath="//button[contains(@class, 'bg-teal-500') and text()='-']")
    private List<WebElement> decreaseQuantityButtons;
    
    @FindBy(xpath="//button[contains(@class, 'bg-teal-500') and text()='+']")
    private List<WebElement> increaseQuantityButtons;
    
    @FindBy(xpath="//td[contains(@class,'p-4')]//span")
    private List<WebElement> productNames;
    
    @FindBy(xpath="//td[contains(@class,'p-4')]/img")
    private List<WebElement> productImages;
    
    @FindBy(xpath="//td[contains(@class,'p-4') and contains(text(),'₹')]")
    private List<WebElement> productPrices;
    
    @FindBy(xpath="//td[contains(@class,'p-4')]/button[contains(@class, 'text-red-500')]")
    private List<WebElement> removeItemButtons;
    
    // Address Section
    @FindBy(xpath="//h3[contains(text(),'Billing Address')]")
    private WebElement billingAddressSection;
    
    @FindBy(xpath="//h3[contains(text(),'Shipping Address')]")
    private WebElement shippingAddressSection;
    
    @FindBy(xpath="//input[@type='radio' and @name='shippingAddress']")
    private List<WebElement> shippingAddressOptions;
    
    @FindBy(xpath="//button[contains(text(),'Add New Shipping Address')]")
    private WebElement addNewAddressButton;
    
    // Footer Elements
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
    public Cartpage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Utilization methods to interact with elements
    public boolean verifyCartPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }
    
    public boolean verifyCartPageUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }
    
    public int getCartItemsCount() {
        return cartItems.size();
    }
    
    public void applyCoupon(String couponCode) {
        couponInputField.sendKeys(couponCode);
        applyCouponButton.click();
    }
    
    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }
    
    public void increaseQuantity(int index) {
        increaseQuantityButtons.get(index).click();
    }
    
    public void decreaseQuantity(int index) {
        decreaseQuantityButtons.get(index).click();
    }
    
    public void removeItem(int index) {
        removeItemButtons.get(index).click();
    }
    
    public void selectShippingAddress(int index) {
        shippingAddressOptions.get(index).click();
    }
    
    public void clickAddNewAddressButton() {
        addNewAddressButton.click();
    }
}

