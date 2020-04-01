package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Given;
import seleniumBase.ProjectSpecificMethods;



public class stepsLoginPage extends ProjectSpecificMethods{
	
	/*public LoginPage(){
		this.driver=driver;
	}
	*/
	//@FindBy(id="username") WebElement eleenterUsername;
	@Given("Go to the Chrome browser")
	public stepsLoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");;
		//return this;
	}
	@FindBy(id="password") WebElement eleenterPassword;
	public stepsLoginPage enterPassword(String pword) {
		eleenterPassword.sendKeys(pword);
		return this;
	}
	
	@FindBy(className="decorativeSubmit") WebElement eleclickLogin;
	public HomePage clickLogin() {
		eleclickLogin.click();
		return new HomePage();
	}
	

}
