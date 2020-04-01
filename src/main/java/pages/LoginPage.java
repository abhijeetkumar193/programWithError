package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username") WebElement eleenterUsername;
	public LoginPage enterUsername(String uname) {
		eleenterUsername.sendKeys(uname);
		return this;
	}
	@FindBy(id="password") WebElement eleenterPassword;
	public LoginPage enterPassword(String pword) {
		eleenterPassword.sendKeys(pword);
		return this;
	}
	
	@FindBy(className="decorativeSubmit") WebElement eleclickLogin;
	public HomePage clickLogin() {
		eleclickLogin.click();
		return new HomePage();
	}
	
	
	
	
	
	
	

}
