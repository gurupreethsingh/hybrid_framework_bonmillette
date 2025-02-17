package generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import com.google.common.io.Files;

public class Verification {
    protected WebDriver driver;

    protected Verification(WebDriver driver) {
        this.driver = driver;
    }

    private String takeScreenshot() {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String screenshotFolder = System.getProperty("user.dir") + "\\failed_screenshots";
            new File(screenshotFolder).mkdirs(); // Ensure directory exists
            String formattedDate = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File destination = new File(screenshotFolder + "\\image_" + formattedDate + ".jpg");
            Files.copy(source, destination);
            return destination.getAbsolutePath(); // Return screenshot path
        } catch (IOException e) {
            e.printStackTrace();
            return "Screenshot capture failed.";
        }
    }

    public boolean verifyTitle(String expectedTitle, SoftAssert softAssert) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actualTitle = driver.getTitle();
        boolean titleMatches = actualTitle.equals(expectedTitle);
        
        try {
            wait.until(ExpectedConditions.titleIs(expectedTitle));
        } catch (TimeoutException e) {
            titleMatches = false;
        }
        
        softAssert.assertEquals(actualTitle, expectedTitle, "Title mismatch.");
        
        if (!titleMatches) {
            String screenshotPath = takeScreenshot();
            Reporter.log("Title mismatch. Expected: " + expectedTitle + " | Actual: " + actualTitle +
                         " | Screenshot: " + screenshotPath);
        }
        
        return titleMatches;
    }

    public boolean verifyUrl(String expectedUrl, SoftAssert softAssert) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actualUrl = driver.getCurrentUrl();
        boolean urlMatches = actualUrl.equals(expectedUrl);
        
        try {
            wait.until(ExpectedConditions.urlMatches(expectedUrl));
        } catch (TimeoutException e) {
            urlMatches = false;
        }
        
        softAssert.assertEquals(actualUrl, expectedUrl, "❌ URL mismatch.");
        
        if (!urlMatches) {
            String screenshotPath = takeScreenshot();
            Reporter.log("URL mismatch. Expected: " + expectedUrl + " | Actual: " + actualUrl +
                         " | Screenshot: " + screenshotPath);
        }
        
        return urlMatches;
    }

    public boolean verifyTextPresent(String expectedText, SoftAssert softAssert) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean textExists = false;
        
        try {
            textExists = wait.until(ExpectedConditions.textToBePresentInElementLocated(
                    By.xpath("//*[contains(text(), '" + expectedText + "')]"), expectedText));
        } catch (TimeoutException e) {
            textExists = false;
        }
        
        softAssert.assertTrue(textExists, "Text not found: " + expectedText);
        
        if (!textExists) {
            String screenshotPath = takeScreenshot();
            Reporter.log("Text not found: " + expectedText + " | Screenshot: " + screenshotPath);
        }
        
        return textExists;
    }
    
    
    public void selectDropdownValue(WebElement dropdown, String value) {
        try {
            Select select = new Select(dropdown);
            select.selectByVisibleText(value);
            Reporter.log("✅ Selected dropdown value: " + value);
        } catch (Exception e) {
            Reporter.log("❌ Failed to select dropdown value: " + value + " | Error: " + e.getMessage());
        }
    }


    public boolean verifyTextAbsent(String expectedText, SoftAssert softAssert) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean textIsAbsent = true;

        try {
            textIsAbsent = wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.xpath("//*[contains(text(), '" + expectedText + "')]")));
        } catch (TimeoutException e) {
            textIsAbsent = false;
        }

        softAssert.assertTrue(textIsAbsent, "Text should be absent but was found: " + expectedText);

        if (!textIsAbsent) {
            String screenshotPath = takeScreenshot();
            Reporter.log("❌ Text should be absent but was found: " + expectedText + " | Screenshot: " + screenshotPath);
        } else {
            Reporter.log("✅ Verified that text is absent: " + expectedText);
        }

        return textIsAbsent;
    }
    
    
    public void selectDropdownByVisibleText(WebElement dropdown, String value, SoftAssert softAssert) {
        try {
            Select select = new Select(dropdown);
            select.selectByVisibleText(value);
            
            // Verify selection
            String selectedOption = select.getFirstSelectedOption().getText();
            softAssert.assertEquals(selectedOption, value, "Dropdown selection mismatch");
            
            Reporter.log("✅ Selected dropdown value: " + value);
        } catch (Exception e) {
            Reporter.log("❌ Failed to select dropdown value: " + value + " | Error: " + e.getMessage());
            softAssert.fail("Failed to select dropdown value: " + value);
        }
    }
    
    public boolean verifySuccessMessage(String expectedMessage, SoftAssert softAssert) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean messageDisplayed = false;

        try {
            WebElement successMessage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + expectedMessage + "')]"))
            );
            messageDisplayed = successMessage.isDisplayed();
        } catch (TimeoutException e) {
            messageDisplayed = false;
        }

        softAssert.assertTrue(messageDisplayed, "Success message not found: " + expectedMessage);

        if (!messageDisplayed) {
            String screenshotPath = takeScreenshot();
            Reporter.log("❌ Success message not found: " + expectedMessage + " | Screenshot: " + screenshotPath);
        } else {
            Reporter.log("✅ Verified success message: " + expectedMessage);
        }

        return messageDisplayed;
    }
    
   
    /** ✅ Wait for an element to be clickable */
    public WebElement waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public WebElement waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /** ✅ Wait for a list of elements to be visible */
    public List<WebElement> waitForElementsToBeVisible(List<WebElement> elements) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    /** ✅ Accept Alert if present */
    public void acceptAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            Reporter.log("🔔 Alert Present: " + alertText);
            alert.accept();
            Reporter.log("✅ Alert accepted.");
        } catch (NoAlertPresentException | TimeoutException e) {
            Reporter.log("❌ No alert present to accept.");
        }
    }


}
