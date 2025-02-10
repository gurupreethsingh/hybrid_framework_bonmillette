package pom.blog_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class AddBlogPage extends Verification {

    // **Page Title**
    @FindBy(xpath = "//h2[contains(text(), 'Add New Blog')]")
    private WebElement pageTitle;

    // **Blog Title Field**
    @FindBy(xpath = "//input[@id='title']")
    private WebElement titleInput;

    // **Blog Body Field (Rich Text Editor)**
    @FindBy(xpath = "//textarea[@id='body']")
    private WebElement bodyInput;

    // **Blog Summary Field**
    @FindBy(xpath = "//textarea[@id='summary']")
    private WebElement summaryInput;

    // **Tags Input Field**
    @FindBy(xpath = "//input[@id='tags']")
    private WebElement tagsInput;

    // **Category Selection Dropdown**
    @FindBy(xpath = "//select[@id='category']")
    private WebElement categoryDropdown;

    // **SEO Title Input Field**
    @FindBy(xpath = "//input[@id='seoTitle']")
    private WebElement seoTitleInput;

    // **Meta Description Field**
    @FindBy(xpath = "//textarea[@id='metaDescription']")
    private WebElement metaDescriptionInput;

    // **Slug Input Field**
    @FindBy(xpath = "//input[@id='slug']")
    private WebElement slugInput;

    // **Author Name Field**
    @FindBy(xpath = "//input[@id='author']")
    private WebElement authorInput;

    // **Feature Image Upload Field**
    @FindBy(xpath = "//input[@id='featuredImage']")
    private WebElement uploadImageInput;

    // **Image Preview**
    @FindBy(xpath = "//img[contains(@class, 'preview-img')]")
    private WebElement imagePreview;

    // **Publish Checkbox**
    @FindBy(xpath = "//input[@type='checkbox' and @id='publish']")
    private WebElement publishCheckbox;

    // **Visibility Option (Public/Private)**
    @FindBy(xpath = "//select[@id='visibility']")
    private WebElement visibilityDropdown;

    // **Submit Button**
    @FindBy(xpath = "//button[contains(text(), 'Add Blog')]")
    private WebElement addBlogButton;

    // **Cancel Button**
    @FindBy(xpath = "//button[contains(text(), 'Cancel')]")
    private WebElement cancelButton;

    // **Success Message**
    @FindBy(xpath = "//p[contains(@class, 'text-green-500')]")
    private WebElement successMessage;

    // **Error Messages**
    @FindBy(xpath = "//p[contains(@class, 'text-red-500')]")
    private WebElement errorMessage;

    // **Initialization**
    public AddBlogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // **Actions - Enter Text Fields**
    public void enterTitle(String title) {
        titleInput.clear();
        titleInput.sendKeys(title);
    }

    public void enterBody(String body) {
        bodyInput.clear();
        bodyInput.sendKeys(body);
    }

    public void enterSummary(String summary) {
        summaryInput.clear();
        summaryInput.sendKeys(summary);
    }

    public void enterTags(String tags) {
        tagsInput.clear();
        tagsInput.sendKeys(tags);
    }

    public void enterSeoTitle(String seoTitle) {
        seoTitleInput.clear();
        seoTitleInput.sendKeys(seoTitle);
    }

    public void enterMetaDescription(String metaDescription) {
        metaDescriptionInput.clear();
        metaDescriptionInput.sendKeys(metaDescription);
    }

    public void enterSlug(String slug) {
        slugInput.clear();
        slugInput.sendKeys(slug);
    }

    public void enterAuthor(String author) {
        authorInput.clear();
        authorInput.sendKeys(author);
    }

    // **Actions - Select from Dropdowns**
    public void selectCategory(String category) {
        categoryDropdown.sendKeys(category);
    }

    public void selectVisibility(String visibility) {
        visibilityDropdown.sendKeys(visibility);
    }

    // **Actions - Upload Image**
    public void uploadImage(String imagePath) {
        uploadImageInput.sendKeys(imagePath);
    }

    // **Actions - Click Buttons**
    public void clickPublishCheckbox() {
        if (!publishCheckbox.isSelected()) {
            publishCheckbox.click();
        }
    }

    public void clickAddBlog() {
        addBlogButton.click();
    }

    public void clickCancel() {
        cancelButton.click();
    }

    // **Actions - Get Text Methods**
    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    // **Verification Methods**
    public void verifyAddBlogPageTitle(String expectedTitle) throws IOException {
        verifyTitle(expectedTitle);
    }

    public void verifyAddBlogPageUrl(String expectedUrl) throws IOException {
        verifyUrl(expectedUrl);
    }
}

