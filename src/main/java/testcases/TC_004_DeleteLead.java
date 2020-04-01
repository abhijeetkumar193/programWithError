package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC_004_DeleteLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void beforeTest()
	{
		excelfilename="DeleteLeads";
	}

	@Test(dataProvider="getData")
	public void deleteLeads(String uname, String pword, String fn) throws InterruptedException
	{
		new LoginPage()
		.enterUsername(uname).enterPassword(pword).clickLogin().clickCRMSFA().clickLeads().clickFindLeads().enterFirstName(fn)
		.clickFindLeads().clickFirstResult().clickDelete().clickFindLeads().enterLeadID().clickFindLeads().getNoOfResultDisplay();
	}
}
