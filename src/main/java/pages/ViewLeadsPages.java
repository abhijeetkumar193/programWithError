package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class ViewLeadsPages extends ProjectSpecificMethods {
	
	public ViewLeadsPages()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static String fn;
	@FindBy(xpath="//*[@id='viewLead_companyName_sp']") WebElement eleVerifyCompanyName;
	public void verifyCompanyName()
	{
		System.out.println(eleVerifyCompanyName.getText());
	}

	@FindBy(xpath="//*[text()='Edit']") WebElement eleclickEdit;
	public Opentaps clickEdit()
	{
		eleclickEdit.click();
		return new Opentaps();
	}
	@FindBy(xpath="//*[text()='Delete']") WebElement eleClickDelete;
	public MyLeadsPage clickDelete()
	{
		eleClickDelete.click();
		return new MyLeadsPage();
	}
	
	@FindBy(xpath="//*[text()='Duplicate Lead']") WebElement eleClickDiplicateLeads;
	public DuplicateLeadsPages clickDuplicateLead()
	{
		eleClickDiplicateLeads.click();
		return new DuplicateLeadsPages();
	}
	@FindBy(xpath="//*[@id='viewLead_firstName_sp']") WebElement elegetFirstName;
	public ViewLeadsPages getFirstName()
	{
		fn=elegetFirstName.getText();
		System.out.println(fn);
		return new ViewLeadsPages();
	}
	
	public void verify()
	{
		if(fn.equals(FindLeads.firstName))
		{
			System.out.println("Both the name are equals");
		}
	}
	
	
}
