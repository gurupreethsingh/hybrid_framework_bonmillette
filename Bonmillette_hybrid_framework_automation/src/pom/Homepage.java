package pom;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class Homepage extends Verification
{
	// 1. find all the Webelements in your page.(private)  (declaration)
		// 2. initialize all the webelements using the constructor. ( initialization)
		// 3. make functions to perform actions in those web elements.  ( utilization)
	
  // declare all the webElements, keep them private. 
	@FindBy(xpath="//img[@class='w-20 h-20']")
	private WebElement bonmilletteLogo;
	
	@FindBy(xpath="//a[@href='/home']")
	private WebElement homeLink;
	
	// shop link.
	@FindBy(xpath="(//a[@href='/shop'])[1]")
	private WebElement shopLink;
	
	// shop link.
	@FindBy(xpath="(//a[@href='/about-us'])[1]")
	private WebElement aboutUsLink;
	
	// our story link.
	@FindBy(xpath="(//a[@href='/our-story'])[1]")
	private WebElement ourStoryLink;
	
	// blog link.
	@FindBy(xpath="(//a[@href='/all-blogs'])[1]")
	private WebElement blogLink;
	
	// testimonials link.
	@FindBy(xpath="(//a[@href='/testimonials'])[1]")
	private WebElement testimonialsLink;
	
	// contact link.
	@FindBy(xpath="(//a[@href='/contact-us'])[1]")
	private WebElement contactUsLink;
	
	@FindBy(xpath="//button[@class='hidden md:flex text-black font-bold text-lg']")
	private WebElement myAccountButton;
	
	@FindBy(xpath="(//*[local-name()='svg'])[1]")
	private WebElement searchIcon;
	
	@FindBy(xpath="(//*[local-name()='svg'])[2]")
	private WebElement cartIcon;
	
	// initialization 
	public Homepage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	// utilization , by creating functions to perform actions. 
	public void clickOnLogo(){
		bonmilletteLogo.click();
	}
	
	public void clickOnHomeLink(){
		homeLink.click();
	}
	
	public void clickOnShopLink(){
		shopLink.click();
	}
	
	public void clickOnAboutUsLink(){
		aboutUsLink.click();
	}
	
	public void clickOnOurStoryLink(){
		ourStoryLink.click();
	}
	
	public void clickOnBlogLink(){
		blogLink.click();
	}
	
	public void clickOnTestimonialsLink(){
		testimonialsLink.click();
	}
	
	public void clickOnContactUsLink(){
		contactUsLink.click();
	}
	
	public void clickOnMyAccountButton(){
		myAccountButton.click();
	}
	
	public void clickOnSearchIcon(){
		searchIcon.click();
	}
	
	public void clickOnCartIcon(){
		cartIcon.click();
	}
	
	public void verifyHomepageTitle(String expectedHomepageTitle) throws IOException{
		verifyTitle(expectedHomepageTitle);   // Verification class function.
	}
	
	public void verifyHomepageUrl(String expectedUrl) throws IOException
	{
		verifyUrl(expectedUrl);
	}
}
