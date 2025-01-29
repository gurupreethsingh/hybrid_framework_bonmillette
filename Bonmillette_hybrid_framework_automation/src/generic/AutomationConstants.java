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
	
}