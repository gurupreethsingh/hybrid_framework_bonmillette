package scripts.userSystemScenarios;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.common_pages.Homepage;

public class CustomerRegisterLoginDashboardLogout extends OpenClose
{
	@Test(priority = 1, invocationCount = 10)
    public void testUserRegLoginLogout() throws IOException
    {
    	Homepage hp = new Homepage(driver);
    	hp.clickOnMyAccountButton();
    	
    	String loginPageUrl = "http://localhost:5173/my-account";
    	
    	String expectedUrl = Excel.getData("", 0, 0);
    	
    	
    	Loginpage lp = new Loginpage(driver);
    	
    	lp.verifyLoginPageUrl(expectedUrl);
    	
    	
    	lp.clickOnSignUpLink();
    	
    	
    	String expectedRegisterPageUrl = Excel.getData(expectedUrl, 0, 0);
    	Registerpage rp = new Registerpage(driver);
    	rp.verifyRegisterpageUrl(expectedRegisterPageUrl);
    	
    	
    	
    }
}
