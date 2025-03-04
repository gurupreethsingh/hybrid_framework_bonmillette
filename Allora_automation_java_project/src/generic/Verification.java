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
    
    
    
    public boolean verifyTitle(String expectedTitle, SoftAssert softAssert)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	String actualTitle = driver.getTitle();
    	boolean titleMatches = actualTitle.equals(expectedTitle);
    	
    	try
    	{
    		wait.until(ExpectedConditions.titleIs(expectedTitle));
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
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
}
