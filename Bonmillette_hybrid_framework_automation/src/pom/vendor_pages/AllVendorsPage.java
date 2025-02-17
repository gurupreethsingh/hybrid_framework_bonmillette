package pom.vendor_pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AllVendorsPage extends Verification {

    // Page Header
    @FindBy(xpath = "//h2[contains(text(),'All Vendors')]")
    private WebElement allVendorsHeading;

    // Search Field
    @FindBy(xpath = "//input[@placeholder='Search vendors...']")
    private WebElement searchField;

    // Add Vendor Button
    @FindBy(xpath = "//button[contains(text(),'Add Vendor')]")
    private WebElement addVendorButton;

    // View Icons
    @FindBy(xpath = "//svg[contains(@class, 'cursor-pointer')]")
    private List<WebElement> viewIcons;

    // List of Vendors (Grid View)
    @FindBy(xpath = "//div[contains(@class,'grid')]/div")
    private List<WebElement> vendorGridItems;

    // List of Vendors (Card View)
    @FindBy(xpath = "//div[contains(@class,'shadow-lg') and contains(@class,'p-6')]")
    private List<WebElement> vendorCardItems;

    // List of Vendors (List View)
    @FindBy(xpath = "//div[contains(@class,'space-y-6')]/div")
    private List<WebElement> vendorListItems;

    // Delete Vendor Buttons
    @FindBy(xpath = "//button[contains(@class,'text-red-500')]")
    private List<WebElement> deleteVendorButtons;

    // Vendor Name Links
    @FindBy(xpath = "//a[contains(@href,'/single-vendor')]")
    private List<WebElement> vendorNameLinks;

    // Constructor
    public AllVendorsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Get All Vendors Heading
    public String getAllVendorsHeading() {
        return allVendorsHeading.getText();
    }

    // Enter Search Query
    public void enterSearchQuery(String query) {
        searchField.clear();
        searchField.sendKeys(query);
    }

    // Click Add Vendor Button
    public void clickAddVendorButton() {
        addVendorButton.click();
    }

    // Click on View Icons (List, Grid, or Card)
    public void selectView(String view) {
        if (view.equalsIgnoreCase("list") && viewIcons.size() > 0) {
            viewIcons.get(0).click();
        } else if (view.equalsIgnoreCase("card") && viewIcons.size() > 1) {
            viewIcons.get(1).click();
        } else if (view.equalsIgnoreCase("grid") && viewIcons.size() > 2) {
            viewIcons.get(2).click();
        }
    }

    // Get Vendor Count in Grid View
    public int getVendorGridCount() {
        return vendorGridItems.size();
    }

    // Get Vendor Count in Card View
    public int getVendorCardCount() {
        return vendorCardItems.size();
    }

    // Get Vendor Count in List View
    public int getVendorListCount() {
        return vendorListItems.size();
    }

    // Click on a Vendor
    public void clickVendor(int index) {
        if (vendorNameLinks.size() > index) {
            vendorNameLinks.get(index).click();
        }
    }


    // Verify All Vendors Page Title
    public void verifyAllVendorsTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    // Verify All Vendors Page URL
    public void verifyAllVendorsUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}
