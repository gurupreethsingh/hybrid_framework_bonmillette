package generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.collections4.FactoryUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	public void verifyTitle(String expectedTitle) throws IOException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
	        wait.until(ExpectedConditions.titleIs(expectedTitle));
	        Reporter.log("Title is matching, Test case passed"); 
	    } catch (Exception ex) {
	        ex.printStackTrace();
	        Reporter.log("Test case failed, Title did not match");
	        takeScreenshot();
	    }
	}

	public void verifyUrl(String expectedUrl) throws IOException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
	        wait.until(ExpectedConditions.urlMatches(expectedUrl));
	        Reporter.log("Url is matching, Test case passed");
	    } catch (Exception ex) {
	        ex.printStackTrace();
	        Reporter.log("Test case failed, URL did not match");
	        takeScreenshot();
	    }
	}

	public void verifyTextPresent(String expectedText) throws IOException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(
	            org.openqa.selenium.By.xpath("//*[contains(text(), '" + expectedText + "')]"), expectedText));
	        Reporter.log("Text '" + expectedText + "' is present, Test case passed");
	    } catch (Exception ex) {
	        ex.printStackTrace();
	        Reporter.log("Test case failed, Text '" + expectedText + "' is not present");
	        takeScreenshot();
	    }
	}

	public void verifyTextNotPresent(String unexpectedText) throws IOException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
	        wait.until(ExpectedConditions.not(
	            ExpectedConditions.textToBePresentInElementLocated(
	                org.openqa.selenium.By.xpath("//*[contains(text(), '" + unexpectedText + "')]"), unexpectedText)));
	        Reporter.log("Text '" + unexpectedText + "' is not present, Test case passed");
	    } catch (Exception ex) {
	        ex.printStackTrace();
	        Reporter.log("Test case failed, Text '" + unexpectedText + "' is present");
	        takeScreenshot();
	    }
	}
	
	
	 public void clickWhenClickable(WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	    }

	    public void clickElementByText(WebElement parentElement, String text) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement element = parentElement.findElement(By.xpath(".//*[text()='" + text + "']"));
	        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	    }

	    public void sendKeysWithWait(WebElement element, String text) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement inputField = wait.until(ExpectedConditions.visibilityOf(element));
	        inputField.clear();
	        inputField.sendKeys(text);
	    }

	    public void selectDropdownOption(WebElement dropdown, String optionText) {
	        clickWhenClickable(dropdown);
	        WebElement option = dropdown.findElement(By.xpath(".//option[text()='" + optionText + "']"));
	        clickWhenClickable(option);
	    }

	    public void adjustSlider(WebElement slider, int minValue, int maxValue) {
	        // Implementation for adjusting slider using actions or JavaScript if required
	    }
	    
	    public void clickElement(WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        try {
	            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	        } catch (Exception e) {
	            Reporter.log("Element is not clickable: " + element.toString());
	            e.printStackTrace();
	        }
	    }

	    public void enterText(WebElement element, String text) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        try {
	            WebElement inputField = wait.until(ExpectedConditions.visibilityOf(element));
	            inputField.clear();
	            inputField.sendKeys(text);
	        } catch (Exception e) {
	            Reporter.log("Unable to enter text in the element: " + element.toString());
	            e.printStackTrace();
	        }
	    }
}
