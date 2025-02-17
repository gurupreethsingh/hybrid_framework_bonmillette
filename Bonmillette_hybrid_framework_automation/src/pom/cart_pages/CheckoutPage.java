package pom.cart_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class CheckoutPage extends Verification {

    // User Information
    @FindBy(xpath="//h2[contains(text(),'User Information')]")
    private WebElement userInfoTitle;
    
    @FindBy(xpath="//p[strong[contains(text(),'Name:')]]")
    private WebElement userName;
    
    @FindBy(xpath="//p[strong[contains(text(),'Email:')]]")
    private WebElement userEmail;
    
    @FindBy(xpath="//p[strong[contains(text(),'Phone:')]]")
    private WebElement userPhone;

    // Billing Address
    @FindBy(xpath="//h2[contains(text(),'Billing Address')]")
    private WebElement billingAddressTitle;
    
    @FindBy(xpath="//div[h2[contains(text(),'Billing Address')]]/p")
    private WebElement billingAddress;

    // Shipping Address
    @FindBy(xpath="//h2[contains(text(),'Shipping Address')]")
    private WebElement shippingAddressTitle;
    
    @FindBy(xpath="//div[h2[contains(text(),'Shipping Address')]]/p")
    private WebElement shippingAddress;

    // Order Details Table
    @FindBy(xpath="//h2[contains(text(),'Your Order')]")
    private WebElement orderTitle;
    
    @FindBy(xpath="//table")
    private WebElement orderTable;
    
    @FindBy(xpath="//p[contains(text(),'Total: ₹')]")
    private WebElement totalPrice;

    // Payment Options
    @FindBy(xpath="//input[@type='checkbox']")
    private WebElement cashOnDeliveryCheckbox;
    
    // Confirm Order Button
    @FindBy(xpath="//button[contains(text(),'Confirm Order')]")
    private WebElement confirmOrderButton;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public String getUserName() {
        return userName.getText();
    }

    public String getUserEmail() {
        return userEmail.getText();
    }

    public String getUserPhone() {
        return userPhone.getText();
    }

    public String getBillingAddress() {
        return billingAddress.getText();
    }

    public String getShippingAddress() {
        return shippingAddress.getText();
    }

    public boolean isOrderTableDisplayed() {
        return orderTable.isDisplayed();
    }

    public String getTotalPrice() {
        return totalPrice.getText();
    }

    public void selectCashOnDelivery() {
        if (!cashOnDeliveryCheckbox.isSelected()) {
            cashOnDeliveryCheckbox.click();
        }
    }

    public void clickConfirmOrderButton() {
        confirmOrderButton.click();
    }

    public boolean verifyCheckoutPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyCheckoutPageUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }
}
