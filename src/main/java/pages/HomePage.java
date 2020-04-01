package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(className="decorativeSubmit")  WebElement eleClickLogout;
	public LoginPage clickLogout() {
		eleClickLogout.click();
		return new LoginPage();
	}
	
	@FindBy(how=How.XPATH, using ="//*[contains(text(),'CRM/SFA')]") WebElement eleClickCRMSFA;
	public MyHomePage clickCRMSFA()
	{
		eleClickCRMSFA.click();
		return new MyHomePage();
	}
	
	
	
	
	
	
	

}
