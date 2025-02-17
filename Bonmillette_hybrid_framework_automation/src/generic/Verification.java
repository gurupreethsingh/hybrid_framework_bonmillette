package generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import com.google.common.io.Files;

public class Verification {
    private WebDriver driver;

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
}
