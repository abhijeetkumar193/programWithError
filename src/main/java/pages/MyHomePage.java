package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage() {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[text()='Leads']") WebElement eleclickLeads;
	public MyLeadsPage clickLeads() 
	{
		eleclickLeads.click();
		return new MyLeadsPage();
	}
	
	
	
	
	
	

}
