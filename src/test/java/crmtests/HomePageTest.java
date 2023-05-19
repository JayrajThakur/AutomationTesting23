package crmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;

public class HomePageTest extends TestBase
{
  
	HomePage homePage;
	
@BeforeMethod
public void initalization()
	{
		init();
		LoginPage loginPage = new LoginPage();
		homePage = loginPage.login();
		
	}
	
	@Test
  public void validateUserTest() 
  {
	  homePage.userCheck();
  }
  
  @Test
  public void validateLogOutTest()
  {
	 homePage.logout();
  }
  
  @Test
  public void ValidateHomePageLogoTest()
  {
	  homePage.logoCheck();
  }
  
  @Test
  public void validateRedirectionOfCreateContactTest()
  {
	 homePage.newContact(); 
  }
  
  @Test
  public void validateRedirectionOfCreateCompanyTest()
  {
	  homePage.createCompany();
  }
  
  @Test
  public void validateRedirectionOfDealTest()
  {
	  homePage.createDeal();
  }
  
  @Test
  public void validateRedirectionOfCreateTaskTest()
  {
	  homePage.createTask();
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.close();
  }
}
