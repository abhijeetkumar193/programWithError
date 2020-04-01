package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC_005_DuplicateLead extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void beforeTest()
	{
		excelfilename="DuplicateLeads";
	}

@Test(dataProvider="getData")
public void DuplicateLeads(String uname, String password, String emailId) throws InterruptedException
{
	new LoginPage()
	.enterUsername(uname)
	.enterPassword(password).clickLogin()
	.clickCRMSFA().clickLeads().clickFindLeads().clickEmail().enterEmailAddress(emailId).clickFindLeads()
	.getFirstResultName().clickDuplicateLead().getFirstName().clickCreateLead().getFirstName().verify();
	
	
	
	

}
}
