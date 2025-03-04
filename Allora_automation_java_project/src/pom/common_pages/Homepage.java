package pom.common_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class Homepage extends Verification
{
	
  @FindBy(xpath ="")
  private WebElement logo;
  
  public Homepage(WebDriver driver)
  {
	  super(driver);
	  PageFactory.initElements(driver, this);
  }
  
  public void clickOnLogo()
  {
	  logo.click();
  }
  
  
  public void verifyHomepageTitle(String expectedTitle, SoftAssert sortAssert)
  {
	  verifyTitle(expectedTitle, sortAssert );
  }
}
