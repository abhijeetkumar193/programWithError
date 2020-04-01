package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumBase.ProjectSpecificMethods;

public class FindLeads extends ProjectSpecificMethods{
	public static String firstID, firstName;
	
	public FindLeads() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@name='firstName'])[3]") WebElement eleFirstName;
	public FindLeads enterFirstName(String firstname)
	{
		eleFirstName.sendKeys(firstname);
		String text=getFirstId();
		System.out.println(text);
		return this;
	}

@FindBy(xpath="(//*[text()='Find Leads'])[3]") WebElement eleFindLeads;
	public FindLeads clickFindLeads() throws InterruptedException
	{
		Thread.sleep(4000);
		eleFindLeads.click();
		Thread.sleep(4000);

		return this;

	}
	@FindBy(xpath="(//*[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]") WebElement eleGetfirstId;
	public String getFirstId()
	{
		firstID=eleGetfirstId.getText();
		return firstID;

	}
	
	public ViewLeadsPages getFirstResultName()
	{
		firstName=driver.findElementByXPath("//*[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		System.out.println(firstName);
		driver.findElementByXPath("//*[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
		return new ViewLeadsPages();
	}

	public ViewLeadsPages clickFirstResult()
	{

		driver.findElementByXPath("(//*[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]").click();
		return new ViewLeadsPages();
	}

	public void getNoOfResultDisplay()
	{
		System.out.println(driver.findElementByXPath("//*[@class='x-paging-info']").getText());
	}

	public FindLeads enterLeadID() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElementByXPath("((//*[@class='x-form-element'])/input)[13]").sendKeys(firstID);
		return new FindLeads();
	}
	
	public FindLeads clickEmail()
	{
		driver.findElementByXPath("//*[text()='Email']").click();
		return new FindLeads();
	}
	public FindLeads enterEmailAddress(String EmailId)
	{
		driver.findElementByXPath("//*[@name='emailAddress']").sendKeys(EmailId);
		return new FindLeads();
	}
	
	
	
	
	
	



}
