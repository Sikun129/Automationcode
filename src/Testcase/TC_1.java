package Testcase;

import org.testng.annotations.Test;

import Allpages.Homepage;
import Allpages.Loginpage;
import Generics.BaseTest;

public class TC_1 extends BaseTest
{
	@Test
	public void login()
	{
		Loginpage loginPage=new Loginpage(driver);
		loginPage.login();
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		Homepage homePage=new Homepage(driver);
		homePage.lagoutmethod();
	}

}
