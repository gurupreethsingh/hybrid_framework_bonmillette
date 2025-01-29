package scripts.homepageScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.AllBlogspage;
import pom.Homepage;
import pom.Shoppage;

public class TestOpenAllBlogspageFromHome extends OpenClose
{
	@Test()
    public void testOpenAllBlogspage() throws IOException
    {
    	Homepage hp = new Homepage(driver);
    	String expectedHomepageTitle = (String) Excel.getData("bonmillette_titles", 0, 0);
    	hp.verifyHomepageTitle(expectedHomepageTitle);
    	
    	// find the shop link and then click on shop link. 
    	 hp.clickOnBlogLink();
    	 String expectedBlogpageTitle = (String) Excel.getData("bonmillette_titles", 4, 0);
    	 
    	  AllBlogspage bp = new AllBlogspage(driver);
    	  bp.verifyAllBlogspageTitle(expectedBlogpageTitle);
    	   
    }
}