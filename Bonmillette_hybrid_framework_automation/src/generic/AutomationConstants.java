package generic;

public interface AutomationConstants 
{
	String rootDirectory = System.getProperty("user.dir");
	String failed_screeshot_folder = rootDirectory+"/failed_screeshots";
	String excelSheetPath	= rootDirectory+"/excel_data/project_documents.xlsx";
	String urlOfApplication = "http://localhost:5173";
	String urlOfApplication_withForwardSlash = "http://localhost:5173/";
	String urlOfApplication_withHomeText = "http://localhost:5173/home";
	String urlOfApplication_withHomepageText = "http://localhost:5173/homepage";
	String urlOfApplication_registerPage = "http://localhost:5173/register";
	String urlOfShopPage = "http://localhost:5173/shop";
	String urlOfAllBlogsPage = "http://localhost:5173/all-blogs";
	String urlOfContactUsPage = "http://localhost:5173/contact-us";
	String urlOfAboutUsPage = "http://localhost:5173/about-us";
	String urlOfOurStoryPage = "http://localhost:5173/our-story";
	String urlOfTestimonialsPage = "http://localhost:5173/testimonials";
	
}