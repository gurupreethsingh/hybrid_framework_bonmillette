package pom.outlet_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

import java.util.List;

public class AllOutletsPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//h2[contains(text(),'All Outlets')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//button[contains(text(),'Add Outlet')]")
    private WebElement addOutletButton;

    // ========================== VIEW TOGGLE BUTTONS ==========================

    @FindBy(xpath = "//svg[contains(@class,'text-xl')][1]")  // List View
    private WebElement listViewButton;

    @FindBy(xpath = "//svg[contains(@class,'text-xl')][2]")  // Card View
    private WebElement cardViewButton;

    @FindBy(xpath = "//svg[contains(@class,'text-xl')][3]")  // Grid View
    private WebElement gridViewButton;

    // ========================== SEARCH INPUT ==========================

    @FindBy(xpath = "//input[@placeholder='Search outlets...']")
    private WebElement searchField;

    // ========================== OUTLETS LIST ==========================

    @FindBy(xpath = "//div[contains(@class,'grid-cols')]//a") // Outlet list items
    private List<WebElement> outletsList;

    @FindBy(xpath = "//div[contains(@class,'grid-cols')]//a/h3")
    private List<WebElement> outletNames;

    @FindBy(xpath = "//div[contains(@class,'grid-cols')]//a/p[contains(text(),'Location')]")
    private List<WebElement> outletLocations;

    @FindBy(xpath = "//div[contains(@class,'grid-cols')]//a/p[contains(text(),'Company')]")
    private List<WebElement> outletCompanies;

    // ========================== CONSTRUCTOR ==========================

    public AllOutletsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public void clickAddOutletButton() {
        addOutletButton.click();
    }

    public void clickListView() {
        listViewButton.click();
    }

    public void clickCardView() {
        cardViewButton.click();
    }

    public void clickGridView() {
        gridViewButton.click();
    }

    public void enterSearchQuery(String query) {
        searchField.clear();
        searchField.sendKeys(query);
    }

    public boolean isOutletListDisplayed() {
        return !outletsList.isEmpty();
    }

    public int getOutletsCount() {
        return outletsList.size();
    }

    public String getOutletName(int index) {
        return outletNames.get(index).getText();
    }

    public String getOutletLocation(int index) {
        return outletLocations.get(index).getText();
    }

    public String getOutletCompany(int index) {
        return outletCompanies.get(index).getText();
    }

    public void clickOnOutlet(int index) {
        outletsList.get(index).click();
    }

    // ========================== VERIFICATION METHODS ==========================

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}

