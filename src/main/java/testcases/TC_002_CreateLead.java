package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC_002_CreateLead extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setData()
	{
		excelfilename="CreateLeadsExcel";
	}
	
	/*@Test --- Method-1l of Accessing from POM
	public void createLead()
	{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads().clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadButton()
		.verifyCompanyName();
	}
	*/
	
	
	//another method for accessing --- Method -2 of Accessing from POM
	
	@Test(dataProvider="getData")
	public void CreateLead(String username, String password, String cname,String fname, String lname )
	{
		LoginPage lp= new LoginPage();
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickLogin().clickCRMSFA().clickLeads().clickCreateLead().enterCompanyName(cname).enterFirstName(fname).enterLastName(lname)
		.clickCreateLeadButton().verifyCompanyName();
		
		
		
	}

}
