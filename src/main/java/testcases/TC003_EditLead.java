package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC003_EditLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void beforeTest()
	{
		excelfilename="EditLeads";
	}
	
	@Test(dataProvider="getData")
	public void EditLeads(String uname, String pword, String fn, String companyName) throws InterruptedException
	{
		new LoginPage()
		.enterUsername(uname)
		.enterPassword(pword)
		.clickLogin().clickCRMSFA().clickLeads().clickFindLeads().enterFirstName(fn).clickFindLeads().clickFirstResult()
		.clickEdit().enterCompanyName(companyName).clickUpdate().verifyCompanyName();
		
		
		
		
	}
	
	

}
