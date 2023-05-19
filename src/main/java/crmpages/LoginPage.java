package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase
{
	//driver.findElement(By.Xpath()).sendKeys();
	
	// to initalize webelement
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElements repository
	
	
	@FindBy (name = "username")
	WebElement usernameTxtBox;
	
	@FindBy (name = "password")
	WebElement passwordTxtBox;
	
	@FindBy (xpath = "//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy (xpath = "(//img[@class='img-responsive'])[1]")
	WebElement logo;
	
	@FindBy (linkText = "Sign Up")
	WebElement signUpLink;
	
	
	//action
	public  HomePage login()
	{
		usernameTxtBox.sendKeys(prop.getProperty("username"));
		passwordTxtBox.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		 
		HomePage object1 = new HomePage();
		return object1;
	}
	
	public boolean logoStatus()
	{
		boolean status = logo.isDisplayed();
		
		return status;
	}
	
	public boolean linkStatus()
	{
		boolean status = signUpLink.isDisplayed();
		
		return status;
	}
	
}
