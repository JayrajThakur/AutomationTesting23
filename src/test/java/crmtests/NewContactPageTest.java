package crmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;
import crmpages.NewContactPage;
import utility.ReadData;

public class NewContactPageTest extends TestBase 
{

	HomePage homePage;
	NewContactPage newContactPage;
	
	@BeforeMethod 
	public  void initalization ()
	{
		TestBase.init();
		LoginPage loginPage = new LoginPage();
	    homePage =	loginPage.login();
		newContactPage = new NewContactPage();
	}
	
	
	@DataProvider(name = "contactData")
	public String[][] passData()
	{
		return ReadData.testData();
	}
	
	@Test(dataProvider = "contactData")
	public void validateCreateContact(String FirstName, String LastName, String MobileNumber, String Address)
	{
		homePage.newContact();
		newContactPage.createNewContact(FirstName,LastName,MobileNumber,Address);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
