package pom.subscription_pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import java.time.Duration;
import java.util.List;

public class SubscriptionsPage extends Verification {
    
    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public SubscriptionsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Page Elements
    @FindBy(xpath = "//h1[contains(text(),'Subscription List')]")
    private WebElement subscriptionHeading;

    @FindBy(xpath = "//table")
    private WebElement subscriptionTable;

    @FindBy(xpath = "//thead/tr/th[contains(text(),'Email ID')]")
    private WebElement emailColumn;

    @FindBy(xpath = "//thead/tr/th[contains(text(),'Status')]")
    private WebElement statusColumn;

    @FindBy(xpath = "//thead/tr/th[contains(text(),'Subscribed On')]")
    private WebElement subscribedOnColumn;

    @FindBy(xpath = "//thead/tr/th[contains(text(),'Unsubscribed On')]")
    private WebElement unsubscribedOnColumn;

    @FindBy(xpath = "//thead/tr/th[contains(text(),'Actions')]")
    private WebElement actionsColumn;

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> subscriptionRows;

    @FindBy(xpath = "//tbody/tr/td[1]")
    private List<WebElement> emailList;

    @FindBy(xpath = "//tbody/tr/td[2]/span")
    private List<WebElement> statusList;

    @FindBy(xpath = "//tbody/tr/td[5]/button")
    private List<WebElement> actionButtons;

    // Verification Methods

    /**
     * Verifies the Subscription List page title.
     */
    public void verifySubscriptionPageTitle(SoftAssert softAssert) {
        verifyTitle("Subscription List", softAssert);
    }

    /**
     * Verifies that the Subscription List page is loaded successfully.
     */
    public void verifySubscriptionPageLoaded(SoftAssert softAssert) {
        softAssert.assertTrue(subscriptionHeading.isDisplayed(), "❌ Subscription page heading is not displayed.");
        softAssert.assertTrue(subscriptionTable.isDisplayed(), "❌ Subscription table is not visible.");
    }

    /**
     * Checks if the subscription table contains data.
     */
    public boolean isSubscriptionListNotEmpty() {
        return !subscriptionRows.isEmpty();
    }

    /**
     * Verifies column headers exist.
     */
    public void verifyColumnHeaders(SoftAssert softAssert) {
        softAssert.assertTrue(emailColumn.isDisplayed(), "❌ Email column is missing.");
        softAssert.assertTrue(statusColumn.isDisplayed(), "❌ Status column is missing.");
        softAssert.assertTrue(subscribedOnColumn.isDisplayed(), "❌ Subscribed On column is missing.");
        softAssert.assertTrue(unsubscribedOnColumn.isDisplayed(), "❌ Unsubscribed On column is missing.");
        softAssert.assertTrue(actionsColumn.isDisplayed(), "❌ Actions column is missing.");
    }

    // Actions

    /**
     * Finds the row for a given email and returns the corresponding row index.
     */
    private int getRowIndexByEmail(String email) {
        for (int i = 0; i < emailList.size(); i++) {
            if (emailList.get(i).getText().equalsIgnoreCase(email)) {
                return i;
            }
        }
        return -1; // Email not found
    }

    /**
     * Toggles the subscription status for a given email.
     */
    public void toggleSubscription(String email, SoftAssert softAssert) {
        int rowIndex = getRowIndexByEmail(email);
        if (rowIndex == -1) {
            softAssert.fail("❌ Email not found in the subscription list: " + email);
            return;
        }

        WebElement actionButton = actionButtons.get(rowIndex);
        String currentStatus = statusList.get(rowIndex).getText().trim();

        actionButton.click();
        
        if (currentStatus.equalsIgnoreCase("Active")) {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
            softAssert.assertTrue(statusList.get(rowIndex).getText().contains("Inactive"),
                    "❌ Subscription was not deactivated for " + email);
        } else {
            softAssert.assertTrue(statusList.get(rowIndex).getText().contains("Active"),
                    "❌ Subscription was not reactivated for " + email);
        }
    }

    /**
     * Gets the subscription status of a given email.
     */
    public String getSubscriptionStatus(String email, SoftAssert softAssert) {
        int rowIndex = getRowIndexByEmail(email);
        if (rowIndex == -1) {
            softAssert.fail("❌ Email not found: " + email);
            return null;
        }
        return statusList.get(rowIndex).getText().trim();
    }

    /**
     * Verifies if a user is subscribed.
     */
    public boolean isUserSubscribed(String email, SoftAssert softAssert) {
        return getSubscriptionStatus(email, softAssert).equalsIgnoreCase("Active");
    }

    /**
     * Verifies if a user is unsubscribed.
     */
    public boolean isUserUnsubscribed(String email, SoftAssert softAssert) {
        return getSubscriptionStatus(email, softAssert).equalsIgnoreCase("Inactive");
    }
}

