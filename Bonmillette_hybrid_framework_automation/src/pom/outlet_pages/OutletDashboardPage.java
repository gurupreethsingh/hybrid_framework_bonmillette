package pom.outlet_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;
import java.util.List;

public class OutletDashboardPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//p[contains(text(),'Outlet Dashboard')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//input[@placeholder='Search cards...']")
    private WebElement searchField;

    // ========================== NAVIGATION MENU ELEMENTS ==========================

    @FindBy(xpath = "//a[contains(@href, 'dashboard') and contains(text(),'Dashboard')]")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href, 'my-orders')]")
    private WebElement ordersLink;

    @FindBy(xpath = "//a[contains(@href, 'addresses')]")
    private WebElement addressesLink;

    @FindBy(xpath = "//a[contains(@href, 'profile')]")
    private WebElement accountDetailsLink;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;

    // ========================== DASHBOARD CARDS ==========================

    @FindBy(xpath = "//div[contains(@class, 'grid-cols')]//a")
    private List<WebElement> dashboardCards;

    @FindBy(xpath = "//div[contains(@class, 'grid-cols')]//a//h5")
    private List<WebElement> cardTitles;

    @FindBy(xpath = "//div[contains(@class, 'grid-cols')]//a//p")
    private List<WebElement> cardValues;

    // ========================== CONSTRUCTOR ==========================

    public OutletDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public void enterSearchQuery(String query) {
        searchField.clear();
        searchField.sendKeys(query);
    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickOrdersLink() {
        ordersLink.click();
    }

    public void clickAddressesLink() {
        addressesLink.click();
    }

    public void clickAccountDetailsLink() {
        accountDetailsLink.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public boolean isDashboardCardsDisplayed() {
        return !dashboardCards.isEmpty();
    }

    public int getDashboardCardsCount() {
        return dashboardCards.size();
    }

    public String getCardTitle(int index) {
        return cardTitles.get(index).getText();
    }

    public String getCardValue(int index) {
        return cardValues.get(index).getText();
    }

    public void clickOnDashboardCard(int index) {
        dashboardCards.get(index).click();
    }

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}
