package scripts.homepageScripts;

import java.io.IOException;
import org.testng.annotations.Test;
import generic.Excel;
import generic.OpenClose;
import pom.Homepage;
import pom.Shoppage;

public class TestOpenShoppageFromHome extends OpenClose
{
	@Test()
    public void testOpenShoppage() throws IOException
    {
    	Homepage hp = new Homepage(driver);
    	String expectedHomepageTitle = (String) Excel.getData("bonmillette_titles", 0, 0);
    	hp.verifyHomepageTitle(expectedHomepageTitle);
    	
    	// find the shop link and then click on shop link. 
    	 hp.clickOnShopLink();
    	 String expectedShoppageTitle = (String) Excel.getData("bonmillette_titles", 1, 0);
    	 
    	 Shoppage sp = new Shoppage(driver);
    	 sp.verifyShoppageTitle(expectedShoppageTitle);
    }
}
