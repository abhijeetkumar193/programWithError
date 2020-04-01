package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class DuplicateLeadsPages extends ProjectSpecificMethods {

	
	public static String firstname;
	public DuplicateLeadsPages()
	{
		PageFactory.initElements(driver, this);
	}
	public void getTitle()
	{
		String Title=driver.getTitle();
		if(Title.contentEquals("Duplicate Leads")) {
			System.out.println("yes, have duplicate Leads");
		}
		else
		{
			System.out.println("do not contains the dulicate leads");
		}
		
		
		
	}
	
	
	@FindBy(xpath="//*[@name='firstName']") WebElement eleDuplFirstname;
	public DuplicateLeadsPages getFirstName() {
		firstname=eleDuplFirstname.getText();
		return new DuplicateLeadsPages();
	}
	@FindBy(how=How.XPATH, using="//*[@name='submitButton']")  WebElement eleSubmitButton;
	public ViewLeadsPages clickCreateLead()
	{
		eleSubmitButton.click();
		return new ViewLeadsPages();
	}
}
