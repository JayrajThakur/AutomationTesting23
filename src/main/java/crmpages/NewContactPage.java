package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewContactPage extends TestBase
{
	//initalization 
	public NewContactPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	// webElement repository \
	@FindBy(id = "first_name")
	WebElement firstName;
	
	@FindBy(id = "surname")
	WebElement lastName;
	
	@FindBy(id = "mobile")
	WebElement mobileNo;
	
	
	
	@FindBy(name = "address")
	WebElement address;
	
	@FindBy(xpath = "//form[@id='contactForm']/descendant::input[@value='Save']")
	WebElement saveBtn;
	
	
	//actions 
	public void createNewContact(String FN,String LN,String MobNo,String Address)
	{
		firstName.sendKeys(FN);
		lastName.sendKeys(LN);
		mobileNo.sendKeys(MobNo);
		address.sendKeys(Address);
		saveBtn.click();
	}


	
}
