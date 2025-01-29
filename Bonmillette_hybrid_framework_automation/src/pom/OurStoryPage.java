package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Verification;

public class OurStoryPage extends Verification
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
	
	@FindBy(xpath="//img[@class='rounded-5 w-full']")
	private WebElement ourStoryBannerText;
	
	
	@FindBy(xpath="//img[@class='rounded-5 mx-auto w-full max-w-5xl']")
	private WebElement brandJourneyText;
	
	@FindBy(xpath="//p[@class='text-lg sm:text-xl lg:text-2xl p-5 font-bold']")
	private WebElement bonmilletteSubText;
	
	@FindBy(xpath="//div[@class='all_product_content mb-5 mt-5 text-white w-full lg:w-1/2  lg:text-left']")
	private WebElement whyMilletteText;
	
	
	public OurStoryPage()

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
	
	public void getOurStoryBannerText()
	{
		String actualOurStoryBannerText=ourStoryBannerText.getText();
	}
	
	public void getBrandJourneyText()
	{
	String actualBrandJourneyText	=brandJourneyText.getText();
	}
	
	public void getBonmilletteSubText()
	{
		String actualBonmilletteSubText=bonmilletteSubText.getText();
	}
	
	public void getWhyMilletteText()
	{
		String actualWhyMilletteText=whyMilletteText.getText();
	}
	public void verifyOurStoryTitle(String ExpectedTitle)throws IOException
	{
		verifyTitle(ExpectedTitle);
	}
	
	public void verifyOutStoryPageUrl(String expectedUrl) throws IOException
	{
		verifyUrl(expectedUrl);
	}
	
	
	
}
