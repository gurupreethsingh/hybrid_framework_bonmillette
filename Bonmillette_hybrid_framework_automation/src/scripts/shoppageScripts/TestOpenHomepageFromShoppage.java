package scripts.shoppageScripts;

import generic.Excel;
import generic.OpenClose;
import pom.Homepage;
import pom.Shoppage;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestOpenHomepageFromShoppage extends OpenClose
{
	@Test
	public void testOpenHomepageCliclkHomelink() throws IOException
	{
		// shop page. 
		Shoppage sp = new Shoppage(driver);
		String expectedShoppageTitle = (String) Excel.getData("bonmillette_titles", 1, 0);
		sp.verifyShoppageTitle(expectedShoppageTitle);
		
		// find the homelink , 
		sp.clickOnHomeLink();
		String expectedhomepageTitle = (String) Excel.getData("bonmillette_titles", 0, 0);
		
		Homepage hp = new Homepage(driver);
		
		hp.verifyHomepageTitle(expectedhomepageTitle);
	}
  
}
