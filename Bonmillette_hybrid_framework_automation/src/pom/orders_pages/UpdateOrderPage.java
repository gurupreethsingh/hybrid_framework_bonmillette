package pom.orders_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import generic.Verification;

import java.util.List;

public class UpdateOrderPage extends Verification {

    // ========================== HEADER ELEMENTS ==========================

    @FindBy(xpath = "//h1[contains(text(),'Update Order Details')]")
    private WebElement updateOrderTitle;

    @FindBy(xpath = "//div[@class='bg-white p-6 shadow-md rounded-lg']")
    private WebElement orderDetailsSection;

    @FindBy(xpath = "//div[contains(@class, 'p-4 mb-4 bg-gray-50 rounded-lg')]")
    private List<WebElement> orderProducts;

    @FindBy(xpath = "//input[@type='number']")
    private List<WebElement> quantityInputs;

    @FindBy(xpath = "//button[contains(text(),'Cancel Product')]")
    private List<WebElement> cancelProductButtons;

    @FindBy(xpath = "//button[contains(text(),'Update Order')]")
    private WebElement updateOrderButton;

    // ========================== CONSTRUCTOR ==========================

    public UpdateOrderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ========================== ACTION METHODS ==========================

    public boolean isUpdateOrderTitleDisplayed() {
        return updateOrderTitle.isDisplayed();
    }

    public boolean isOrderDetailsSectionDisplayed() {
        return orderDetailsSection.isDisplayed();
    }

    public int getProductCount() {
        return orderProducts.size();
    }

    public void setQuantity(int index, String quantity) {
        if (index >= 0 && index < quantityInputs.size()) {
            quantityInputs.get(index).clear();
            quantityInputs.get(index).sendKeys(quantity);
        }
    }

    public void clickCancelProduct(int index) {
        if (index >= 0 && index < cancelProductButtons.size()) {
            cancelProductButtons.get(index).click();
        }
    }

    public void clickUpdateOrderButton() {
        updateOrderButton.click();
    }

    public boolean verifyPageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyPageURL(String expectedURL, SoftAssert softAssert) {
        return verifyUrl(expectedURL, softAssert);
    }
}

