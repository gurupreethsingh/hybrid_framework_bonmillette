package pom.testimonials_pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import java.time.Duration;
import java.util.List;

public class AllTestimonialsPage extends Verification {

    WebDriverWait wait;

    // Constructor
    public AllTestimonialsPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // **🔹 Header Elements**
    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//header//nav//a[contains(text(),'Home')]")
    private WebElement homeLink;

    @FindBy(xpath = "//header//nav//a[contains(text(),'Shop')]")
    private WebElement shopLink;

    @FindBy(xpath = "//header//nav//a[contains(text(),'My Account')]")
    private WebElement myAccountLink;

    @FindBy(xpath = "//header//nav//a[contains(text(),'Contact Us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//header//h1[contains(text(),'Testimonials')]")
    private WebElement testimonialsHeading;

    // **🔹 Testimonial Section**
    @FindBy(xpath = "//div[contains(@class, 'grid grid-cols-1') or contains(@class, 'grid-cols-2')]/div")
    private List<WebElement> testimonialCards;

    @FindBy(xpath = "//div[contains(@class, 'grid grid-cols-1') or contains(@class, 'grid-cols-2')]/div//p")
    private List<WebElement> testimonialTexts;

    @FindBy(xpath = "//div[contains(@class, 'grid grid-cols-1') or contains(@class, 'grid-cols-2')]/div//h3")
    private List<WebElement> testimonialNames;

    @FindBy(xpath = "//div[contains(@class, 'grid grid-cols-1') or contains(@class, 'grid-cols-2')]/div//span")
    private List<WebElement> testimonialDesignations;

    // **🔹 Footer Elements**
    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "//footer//a[contains(text(),'Privacy Policy')]")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//footer//a[contains(text(),'Terms & Conditions')]")
    private WebElement termsConditionsLink;

    @FindBy(xpath = "//footer//a[contains(text(),'Return Policy')]")
    private WebElement returnPolicyLink;

    // **🔹 Verification Methods**

    /**
     * Verifies the Testimonials page title.
     */
    public void verifyPageTitle(SoftAssert softAssert) {
        verifyTitle("Testimonials", softAssert);
    }

    /**
     * Verifies that header and footer are present.
     */
    public void verifyHeaderAndFooter(SoftAssert softAssert) {
        softAssert.assertTrue(header.isDisplayed(), "❌ Header is not displayed.");
        softAssert.assertTrue(footer.isDisplayed(), "❌ Footer is not displayed.");
    }

    /**
     * Verifies that navigation links in the header are displayed.
     */
    public void verifyHeaderNavigation(SoftAssert softAssert) {
        softAssert.assertTrue(homeLink.isDisplayed(), "❌ Home link not found.");
        softAssert.assertTrue(shopLink.isDisplayed(), "❌ Shop link not found.");
        softAssert.assertTrue(myAccountLink.isDisplayed(), "❌ My Account link not found.");
        softAssert.assertTrue(contactUsLink.isDisplayed(), "❌ Contact Us link not found.");
    }

    /**
     * Verifies that testimonials are loaded.
     */
    public boolean areTestimonialsDisplayed() {
        return !testimonialCards.isEmpty();
    }

    /**
     * Verifies that footer links are displayed.
     */
    public void verifyFooterNavigation(SoftAssert softAssert) {
        softAssert.assertTrue(privacyPolicyLink.isDisplayed(), "❌ Privacy Policy link not found.");
        softAssert.assertTrue(termsConditionsLink.isDisplayed(), "❌ Terms & Conditions link not found.");
        softAssert.assertTrue(returnPolicyLink.isDisplayed(), "❌ Return Policy link not found.");
    }

    // **🔹 Actions**

    /**
     * Clicks on a specific testimonial by name.
     */
    public void clickTestimonial(String name) {
        for (int i = 0; i < testimonialNames.size(); i++) {
            if (testimonialNames.get(i).getText().equalsIgnoreCase(name)) {
                testimonialCards.get(i).click();
                break;
            }
        }
    }

    /**
     * Gets the count of testimonials displayed.
     */
    public int getTestimonialCount() {
        return testimonialCards.size();
    }
}
