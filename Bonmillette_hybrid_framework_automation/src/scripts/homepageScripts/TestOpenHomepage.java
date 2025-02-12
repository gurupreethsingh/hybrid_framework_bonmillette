package scripts.homepageScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.common_pages.Homepage;


public class TestOpenHomepage extends OpenClose
{
	// testing opening homepage normal url
	@Test(priority = 1)
    public void testOpenHomepage() throws IOException
    {
    	Homepage hp = new Homepage(driver);
    	String expectedHomepageTitle = (String) Excel.getData("bonmillette_titles", 0, 0);
    	hp.verifyHomepageTitle(expectedHomepageTitle);
    }
	
}
