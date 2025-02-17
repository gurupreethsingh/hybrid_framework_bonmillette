package pom.delivery_person_pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

public class AssignOrderForDeliveryPage extends Verification {

    // **Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//img[@alt='Logo']")
    private WebElement headerLogo;

    @FindBy(xpath = "//nav//a[@href='/home']")
    private WebElement homeLink;

    @FindBy(xpath = "//nav//a[@href='/orders']")
    private WebElement ordersLink;

    @FindBy(xpath = "//nav//a[@href='/assign-order']")
    private WebElement assignOrderLink;

    @FindBy(xpath = "//nav//a[@href='/profile']")
    private WebElement profileLink;

    @FindBy(xpath = "//nav//a[@href='/logout']")
    private WebElement logoutLink;

    @FindBy(xpath = "(//*[name()='svg'])[1]")
    private WebElement searchIcon;

    @FindBy(xpath = "(//*[name()='svg'])[2]")
    private WebElement cartIcon;

    // **Assign Order Page Elements**
    @FindBy(xpath = "//h1[contains(text(),'Assign Delivery Page')]")
    private WebElement assignOrderTitle;

    @FindBy(xpath = "//label[contains(text(),'Delivery Agent')]")
    private WebElement deliveryAgentLabel;

    @FindBy(xpath = "//select[@name='deliveryAgent']")
    private WebElement deliveryAgentDropdown;

    @FindBy(xpath = "//label[contains(text(),'Order ID')]")
    private WebElement orderIdLabel;

    @FindBy(xpath = "//select[@name='selectedOrder']")
    private WebElement orderIdDropdown;

    @FindBy(xpath = "//label[contains(text(),'Outlet')]")
    private WebElement outletLabel;

    @FindBy(xpath = "//select[@name='selectedOutlet']")
    private WebElement outletDropdown;

    @FindBy(xpath = "//div[contains(@class,'border p-4')]//h3[contains(text(),'Outlet Details')]")
    private WebElement outletDetailsSection;

    @FindBy(xpath = "//p[contains(text(),'Name:')]")
    private WebElement outletName;

    @FindBy(xpath = "//p[contains(text(),'Address:')]")
    private WebElement outletAddress;

    @FindBy(xpath = "//p[contains(text(),'Email:')]")
    private WebElement outletEmail;

    @FindBy(xpath = "//p[contains(text(),'Phone:')]")
    private WebElement outletPhone;

    @FindBy(xpath = "//div[contains(@class,'border p-4')]//h3[contains(text(),'Order Details')]")
    private WebElement orderDetailsSection;

    @FindBy(xpath = "//p[contains(text(),'Customer Name:')]")
    private WebElement customerName;

    @FindBy(xpath = "//p[contains(text(),'Email:')]")
    private WebElement customerEmail;

    @FindBy(xpath = "//p[contains(text(),'Phone:')]")
    private WebElement customerPhone;

    @FindBy(xpath = "//p[contains(text(),'Billing Address:')]")
    private WebElement billingAddress;

    @FindBy(xpath = "//p[contains(text(),'Shipping Address:')]")
    private WebElement shippingAddress;

    @FindBy(xpath = "//ul[contains(@class,'list-disc')]/li")
    private List<WebElement> orderedProductsList;

    @FindBy(xpath = "//p[contains(text(),'Total Cost:')]")
    private WebElement totalCost;

    @FindBy(xpath = "//p[contains(text(),'Order Status:')]")
    private WebElement orderStatus;

    @FindBy(xpath = "//label[contains(text(),'Message to Delivery Agent')]")
    private WebElement deliveryMessageLabel;

    @FindBy(xpath = "//textarea")
    private WebElement deliveryMessageTextarea;

    @FindBy(xpath = "//button[contains(text(),'Assign Order')]")
    private WebElement assignOrderButton;

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
    public  AssignOrderForDeliveryPage(WebDriver driver) {
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

    public void clickOrdersLink() {
        ordersLink.click();
    }

    public void clickAssignOrderLink() {
        assignOrderLink.click();
    }

    public void clickProfileLink() {
        profileLink.click();
    }

    public void clickLogoutLink() {
        logoutLink.click();
    }

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    // **Assign Order Page Methods**
    public String getAssignOrderTitle() {
        return assignOrderTitle.getText();
    }

    public void selectDeliveryAgent(String agentId) {
        deliveryAgentDropdown.sendKeys(agentId);
    }

    public void selectOrder(String orderId) {
        orderIdDropdown.sendKeys(orderId);
    }

    public void selectOutlet(String outletId) {
        outletDropdown.sendKeys(outletId);
    }

    public boolean isOutletDetailsVisible() {
        return outletDetailsSection.isDisplayed();
    }

    public boolean isOrderDetailsVisible() {
        return orderDetailsSection.isDisplayed();
    }

    public String getCustomerName() {
        return customerName.getText();
    }

    public String getCustomerEmail() {
        return customerEmail.getText();
    }

    public String getCustomerPhone() {
        return customerPhone.getText();
    }

    public String getBillingAddress() {
        return billingAddress.getText();
    }

    public String getShippingAddress() {
        return shippingAddress.getText();
    }

    public int getOrderedProductsCount() {
        return orderedProductsList.size();
    }

    public void enterDeliveryMessage(String message) {
        deliveryMessageTextarea.clear();
        deliveryMessageTextarea.sendKeys(message);
    }

    public void clickAssignOrderButton() {
        assignOrderButton.click();
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
