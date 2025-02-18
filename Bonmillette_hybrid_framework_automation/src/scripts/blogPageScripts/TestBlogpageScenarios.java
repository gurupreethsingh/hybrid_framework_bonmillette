package scripts.blogPageScripts;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.Excel;
import generic.OpenClose;
import pom.blog_pages.AllBlogspage;

public class TestBlogpageScenarios  extends OpenClose
{
	private static final Logger log = LogManager.getLogger(TestBlogpageScenarios.class);
	
    @BeforeClass
    public static void setupLogging() {
        Configurator.initialize(null, "src/log4j2.xml");
    }
    
    @Test(priority = 1)
    public void testOpenHomepage() throws IOException {
        SoftAssert softAssert = new SoftAssert();
        AllBlogspage hp = new  AllBlogspage(driver);
        String expectedAllBlogspageTitle = (String) Excel.getData("bonmillette_titles", 5, 0);
        
        // ✅ Soft Assertion-based verification
        boolean titleMatched = hp.verifyAllBlogspageTitle(expectedAllBlogspageTitle, softAssert);
        
        softAssert.assertTrue(titleMatched, "Homepage title verification failed.");
        
        if (titleMatched) {
            log.info("Test Passed: allBlogs page title matches expected title.");
        } else {
            log.error("Test Failed: Expected '" + expectedAllBlogspageTitle + "' but found '" + driver.getTitle() + "'");
        }

        softAssert.assertAll(); // ✅ Collect all failures at the end
    }

}
