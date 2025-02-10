package pom.common_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Verification;

public class AboutUsPage extends Verification
{
	public static WebDriver driver;
	
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

	//declare all the webElements, keep them private
	@FindBy(xpath ="//p[@ class = 'text-red-600 font-bold mt-3 mb-4 text-base']")
	private WebElement welcomeText;
	
	@FindBy(xpath ="//p[@ class = 'text-5xl md:text-5xl font-bold mt-3 mb-4']")
	private WebElement pargraphHeading;
	
	@FindBy(xpath ="//p[@ class = 'text-base md:text-lg font-thin mb-4 w-full md:w-2/3']")
	private WebElement pargraph1;
	
	@FindBy(xpath ="//p[@ class = 'font-bold text-base md:text-xl text-gray-600 mb-3 w-full md:w-7xl']")
	private WebElement pargraph2;
	
	@FindBy(xpath ="//a[@ class='btn border-0 bg-red-500 text-white font-bold px-5 py-3 rounded-full mt-4 mb-5']")
	private WebElement contactUs;
		
	
	@FindBy(xpath ="//img[@ class='w-full h-auto rounded-md']")
	private WebElement BonmilletteBigLogo;
	
		
	
	
	//initialization
	public AboutUsPage()
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	//utlization, by creating fucntions to perform actions.
	
	public void getWelcomeText()
	{
		String actualWelcomeText = welcomeText.getText();
		
	}
	
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
	
	public void verifyAboutUspageTitle(String expectedTitle) throws IOException{
		verifyTitle(expectedTitle);
	}
	
	public void verifyAboutUspageUrl(String expectedUrl) throws IOException
	{
		verifyUrl(expectedUrl);
	}

}

