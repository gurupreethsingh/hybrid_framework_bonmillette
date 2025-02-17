package pom.common_pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Verification;

public class Homepage extends Verification
{
	// 1. find all the Webelements in your page.(private)  (declaration)
		// 2. initialize all the webelements using the constructor. ( initialization)
		// 3. make functions to perform actions in those web elements.  ( utilization)
	
	@FindBy(xpath="//img[@class='w-20 h-20']")
	private WebElement bonmilletteLogo;

	@FindBy(xpath="//a[@href='/home']")
	private WebElement homeLink;

	@FindBy(xpath="(//a[@href='/shop'])[1]")
	private WebElement shopLink;

	@FindBy(xpath="(//a[@href='/about-us'])[1]")
	private WebElement aboutUsLink;

	@FindBy(xpath="(//a[@href='/our-story'])[1]")
	private WebElement ourStoryLink;

	@FindBy(xpath="(//a[@href='/all-blogs'])[1]")
	private WebElement blogLink;

	@FindBy(xpath="(//a[@href='/testimonials'])[1]")
	private WebElement testimonialsLink;

	@FindBy(xpath="(//a[@href='/contact-us'])[1]")
	private WebElement contactUsLink;

	@FindBy(xpath="//button[@class='hidden md:flex text-black font-bold text-lg']")
	private WebElement myAccountButton;

	@FindBy(xpath="(//*[local-name()='svg'])[1]")
	private WebElement searchIcon;

	@FindBy(xpath="(//*[local-name()='svg'])[2]")
	private WebElement cartIcon;

	@FindBy(xpath="//a[@href='/shop' and contains(@class, 'btn bg-red-600')]")
	private WebElement shopNowButtonCarousel;

	@FindBy(xpath="//h2[@class='text-center text-5xl font-bold text-gray-800 mb-8']")
	private WebElement topSellersSectionTitle;

	@FindBy(xpath="//button[@class='absolute left-3 sm:left-5 text-orange-600 hover:text-orange-800 z-10']")
	private WebElement leftArrowButton;

	@FindBy(xpath="//button[@class='absolute right-3 sm:right-5 text-orange-600 hover:text-orange-800 z-10']")
	private WebElement rightArrowButton;

	@FindBy(xpath="//img[@alt='Basen Laddo']")
	private WebElement basenLaddoImage;

	@FindBy(xpath="//a[@href='/shop' and contains(@class, 'inline-block mt-2 mb-2')]")
	private WebElement shopNowButtonTopSeller;

	@FindBy(xpath="//p[text()='Limited time offer']")
	private WebElement limitedTimeOfferText;

	@FindBy(xpath="//p[contains(@class, 'text-3xl md:text-5xl') and text()='Festive Specials']")
	private WebElement festiveSpecialsTitle;

	@FindBy(xpath="//a[@href='/shop' and contains(@class, 'rounded-pill bg-red-600')]")
	private WebElement shopButtonFestiveSpecials;

	@FindBy(xpath="//p[contains(@class, 'text-3xl md:text-5xl font-bold') and text()='Core Values']")
	private WebElement coreValuesTitle;

	@FindBy(xpath="//p[contains(text(), 'Transparency')]")
	private WebElement transparencyTitle;

	@FindBy(xpath="//p[contains(text(), 'We believe in clear, honest ingredients')]")
	private WebElement transparencyDescription;

	@FindBy(xpath="//p[contains(text(), 'WHAT MAKES BON MILLETTE DIFFERENT?')]")
	private WebElement bonMilletteDifferenceTitle;

	@FindBy(xpath="//img[@alt='Veg Icon' and @src='/static/media/Frame-10.svg']")
	private WebElement vegIcon100Percent;

	@FindBy(xpath="//p[text()='NO MAIDA']")
	private WebElement noMaidaTitle;

	@FindBy(xpath="//p[text()='Our Vision']")
	private WebElement ourVisionTitle;

	@FindBy(xpath="//p[text()='Our Mission']")
	private WebElement ourMissionTitle;

	@FindBy(xpath="//h5[text()='Arjun Mehta']")
	private WebElement testimonialArjunMehta;

	@FindBy(xpath="//h5[text()='Priya Iyer']")
	private WebElement testimonialPriyaIyer;

	@FindBy(xpath="//h5[text()='Rohan Desai']")
	private WebElement testimonialRohanDesai;

	@FindBy(xpath="//img[@src='/static/media/shipping.svg']")
	private WebElement freeShippingIcon;

	@FindBy(xpath="//h5[text()='Free Shipping']")
	private WebElement freeShippingTitle;

	@FindBy(xpath="//img[@src='/static/media/certificate.svg']")
	private WebElement qualityGuaranteeIcon;

	@FindBy(xpath="//img[@src='/static/media/head_phones.svg']")
	private WebElement phoneOrderIcon;

	@FindBy(xpath="//img[@src='/static/media/payment.svg']")
	private WebElement securePaymentIcon;

	@FindBy(xpath="//h5[text()='Secure Payment']")
	private WebElement securePaymentTitle;

	// initialization 
	public Homepage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// utilization , by creating functions to perform actions. 
	public void clickOnLogo() {
		bonmilletteLogo.click();
	}

	public void clickOnHomeLink() {
		homeLink.click();
	}

	public void clickOnShopLink() {
		shopLink.click();
	}

	public void clickOnAboutUsLink() {
		aboutUsLink.click();
	}

	public void clickOnOurStoryLink() {
		ourStoryLink.click();
	}

	public void clickOnBlogLink() {
		blogLink.click();
	}

	public void clickOnTestimonialsLink() {
		testimonialsLink.click();
	}

	public void clickOnContactUsLink() {
		contactUsLink.click();
	}

	public void clickOnMyAccountButton() {
		myAccountButton.click();
	}

	public void clickOnSearchIcon() {
		searchIcon.click();
	}

	public void clickOnCartIcon() {
		cartIcon.click();
	}

	public void clickOnShopNowButtonCarousel() {
		shopNowButtonCarousel.click();
	}

	public void clickOnLeftArrowButton() {
		leftArrowButton.click();
	}

	public void clickOnRightArrowButton() {
		rightArrowButton.click();
	}

	public void clickOnBasenLaddoImage() {
		basenLaddoImage.click();
	}

	public void clickOnShopNowButtonTopSeller() {
		shopNowButtonTopSeller.click();
	}

	public void clickOnShopButtonFestiveSpecials() {
		shopButtonFestiveSpecials.click();
	}

	public void clickOnVegIcon100Percent() {
		vegIcon100Percent.click();
	}


    public boolean verifyHomepageTitle(String expectedTitle, SoftAssert softAssert) {
        return verifyTitle(expectedTitle, softAssert);
    }

    public boolean verifyHomepageUrl(String expectedUrl, SoftAssert softAssert) {
        return verifyUrl(expectedUrl, softAssert);
    }

    public boolean verifyHomepageTextPresence(String expectedText, SoftAssert softAssert) {
        return verifyTextPresent(expectedText, softAssert);
    }
}
