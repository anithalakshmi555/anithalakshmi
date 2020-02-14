package com.crm.qa.testcases;
import com.crm.qa.base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.HomePage;
import  com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testUtil;
	
	public LoginPageTest() {
		// TODO Auto-generated constructor stub
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		Thread.sleep(1000);
		loginpage= new LoginPage();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest()
		{
		 String title =loginpage.validateLoginPageTitle();
		 Assert.assertEquals(title,"Free CRM #1 cloud software for any business large or small");
	}
	
	@Test(priority=2)
	  public void crmLogoImageTest() {
		  testUtil.switchToFrame();
		  Boolean flag=loginpage.validateCRMImage();
		  Assert.assertTrue(flag); 
		  }
	  
	  @Test(priority=3)
	  public void login() throws Exception {
	  		loginpage.loginBtnClick();
	  		Thread.sleep(10000);
	  		loginpage.loginClick(prop.getProperty("user"),prop.getProperty("password"));
	  }
	  	  
}

