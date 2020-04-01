package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public MyLeadsPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Create Lead'][1]") WebElement eleClickCreateLeads;
	public CreateLead clickCreateLead()
	{
		eleClickCreateLeads.click();
		return new CreateLead();
	}
	@FindBy(xpath="//*[text()='Find Leads'][1]") WebElement eleClickFindLeads;
	public FindLeads clickFindLeads() throws InterruptedException
	{
		Thread.sleep(5000);
		eleClickFindLeads.click();
		return new FindLeads();
	}
}
