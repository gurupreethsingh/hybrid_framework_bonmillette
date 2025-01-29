package generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.collections4.FactoryUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Verification
{
	
	private WebDriver driver; 
	
    protected Verification(WebDriver driver) {
        this.driver = driver;
    }
	
    private void takeScreenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String screenshotFolder = System.getProperty("user.dir") + "\\failed_screenshots";
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String formattedDate = sdf.format(d);
        File destination = new File(screenshotFolder + "\\image_" + formattedDate + ".jpg");
        Files.copy(source, destination);
    }
	
    public void verifyTitle(String expectedHomepageTitle) throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.titleIs(expectedHomepageTitle));
            Reporter.log("Title is matching ,Test case passed"); 
            }
        catch (Exception ex) {
            ex.printStackTrace();
            Reporter.log("Test case failed, Title did not match");
            takeScreenshot();
        }
    }

    public void verifyUrl(String expectedUrl) throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.urlMatches(expectedUrl));
            Reporter.log("Url is matching ,Test case passed");
        } catch (Exception ex) {
            ex.printStackTrace();
            Reporter.log("Test case failed, URL did not match");
            takeScreenshot();
        }
    }


}
