package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	
	
	//we are creating the constructor as to initialise the driver for this page
	// As @FindBy only referes to findElements method while for adding the driver for some
	//actions, we have to initialise using the PageFactory in the constructor
	public  CreateLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@name='companyName'])[2]") WebElement eleCompanyName;
	public CreateLead enterCompanyName(String companyNamme)
	{
		eleCompanyName.sendKeys(companyNamme);
		return this;
	}
	
	@FindBy(xpath="(//*[@name='firstName'])[3]") WebElement eleFirstName;
	public CreateLead enterFirstName(String firstname)
	{
		eleFirstName.sendKeys(firstname);
		return this;
	}
	@FindBy(xpath="(//*[@name='lastName'])[3]") WebElement eleLastName;
	public CreateLead enterLastName(String lastname)
	{
		eleLastName.sendKeys(lastname);
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using="//*[@name='submitButton']") WebElement eleClickCreateLeadButton;
	public ViewLeadsPages clickCreateLeadButton()
	{
		eleClickCreateLeadButton.click();
		return new ViewLeadsPages();
	}

}
