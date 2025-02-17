package scripts.homepageScripts;

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
import pom.common_pages.Homepage;

public class TestOpenHomepage extends OpenClose {
    private static final Logger log = LogManager.getLogger(TestOpenHomepage.class);

    @BeforeClass
    public static void setupLogging() {
        Configurator.initialize(null, "src/log4j2.xml");
    }

    @Test(priority = 1)
    public void testOpenHomepage() throws IOException {
        SoftAssert softAssert = new SoftAssert();
        Homepage hp = new Homepage(driver);
        String expectedHomepageTitle = (String) Excel.getData("bonmillette_titles", 1, 0);
        
        // ✅ Soft Assertion-based verification
        boolean titleMatched = hp.verifyHomepageTitle(expectedHomepageTitle, softAssert);
        
        softAssert.assertTrue(titleMatched, "Homepage title verification failed.");
        
        if (titleMatched) {
            log.info("Test Passed: Homepage title matches expected title.");
        } else {
            log.error("Test Failed: Expected '" + expectedHomepageTitle + "' but found '" + driver.getTitle() + "'");
        }

        softAssert.assertAll(); // ✅ Collect all failures at the end
    }

    @Test(priority = 2)
    public void testClickBlogLinkOpenBlogpage() throws IOException {
        SoftAssert softAssert = new SoftAssert();
        Homepage hp = new Homepage(driver); 
        String expectedHomepageTitle = (String) Excel.getData("bonmillette_titles", 1, 0);
        
        // ✅ Soft Assertion-based verification
        boolean titleMatched = hp.verifyHomepageTitle(expectedHomepageTitle, softAssert);
        softAssert.assertTrue(titleMatched, "Homepage title verification failed.");
        
        if (titleMatched) {
            log.info("Test Passed: Homepage title matches expected title.");
        } else {
            log.error("Test Failed: Expected '" + expectedHomepageTitle + "' but found '" + driver.getTitle() + "'");
        }
        
        // click on the blog link.
        hp.clickOnBlogLink();
        AllBlogspage abp = new AllBlogspage(driver);
        String expectedAllBlogspageUrl = (String)Excel.getData("bonmillette_titles", 5, 1);
        boolean allBlogspageUrlMatched = abp.verifyAllBlogspageUrl(expectedAllBlogspageUrl, softAssert);

        
        softAssert.assertTrue(allBlogspageUrlMatched, "Blog page Url verification failed.");
        
        if (allBlogspageUrlMatched) {
            log.info("Test Passed: AllBlogspage Url matches expected url.");
        } else {
            log.error("Test Failed: Expected '" + expectedAllBlogspageUrl + "' but found '" + driver.getCurrentUrl() + "'");
        }
       
        softAssert.assertAll(); // ✅ Collect assertion failures at the end
    }
}
