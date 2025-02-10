package pom.common_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Verification;

public class Testimonialspage extends Verification{
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
		
		
		// contact link.
		@FindBy(xpath="(//a[@href='/contact-us'])[1]")
		private WebElement contactUsLink;
		
		@FindBy(xpath="//button[@class='hidden md:flex text-black font-bold text-lg']")
		private WebElement myAccountButton;
		
		@FindBy(xpath="(//*[local-name()='svg'])[1]")
		private WebElement searchIcon;
		
		@FindBy(xpath="(//*[local-name()='svg'])[2]")
		private WebElement cartIcon;
		
	@FindBy(xpath="//a[@href='/testimonials']")
	private WebElement testimonialsLink;
	
	@FindBy(xpath="//p[@class='text-3xl md:text-5xl font-bold text-center']")
	private WebElement testimonialText;
	
	@FindBy(xpath="(//p[@class='text-lg font-medium text-gray-700'])[1]")
	private WebElement testimonialTextCard;
	
	//constructor
	 Testimonialspage()
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void clickOnTestimonialsLink()
	{
		testimonialsLink.click();
	}
		
		public void getTestimonialText()
		{
			String actualTestimonialText =  testimonialText.getText();
		}
		
		public void getTestimonialTextCard()
		{
			String actualTestimonialTextCard =  testimonialTextCard.getText();
		}
	
	public void verifyTestimonialsTitle(String expectedTitle) throws IOException
	{
		verifyTitle(expectedTitle);
	}
	
	public void verifyTestimonialsUrl(String expectedUrl) throws IOException
	{
		verifyUrl(expectedUrl);
	}
}