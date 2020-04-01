package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class Opentaps extends ProjectSpecificMethods{
	
	public Opentaps() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//*[@name='companyName'])[2]")  WebElement eleenterCompanyName;
	public Opentaps enterCompanyName(String cname)
	{
		eleenterCompanyName.sendKeys(cname);
		return new Opentaps();
	}
	
	@FindBy(xpath="(//*[@name='submitButton'])")  WebElement eleClickUpdate;
	public ViewLeadsPages clickUpdate()
	{
		eleClickUpdate.click();
		return new ViewLeadsPages();
	}
	
	

}
