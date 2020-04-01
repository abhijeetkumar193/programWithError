package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC001_LoginLogout extends ProjectSpecificMethods {
	
	@BeforeTest
	public void beforeTest()
	{
		excelfilename="loginLogout";
	}
	
	@Test(dataProvider="getData")
	public void loginLogout(String uname, String password) {
		/*
		 * LoginPage lp = new LoginPage(); 
		 * lp.enterUsername(); 
		 * lp.enterPassword();
		 */
		
		new LoginPage()
		.enterUsername(uname)
		.enterPassword(password)
		.clickLogin();
		/*.clickLogout();*/
	
	}
	
	/*@Test
	public void CreateLead()
	{
		LoginPage lp= new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin().clickCRMSFA().clickLeads().clickCreateLead().enterCompanyName().enterFirstName().enterLastName()
		.clickCreateLeadButton().verifyCompanyName();
		
		
	}*/
	
	
	
	
	
	
	
	
	
	
}
