package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class OpenClose implements AutomationConstants
{
	public WebDriver driver;   // public int a;
	
	@BeforeMethod
  public void openApplication()
  {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  // open the webpage
	  driver.get(urlOfApplication);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
	@AfterMethod
  public void closeApplication()
  {
	  driver.quit();
  }
}