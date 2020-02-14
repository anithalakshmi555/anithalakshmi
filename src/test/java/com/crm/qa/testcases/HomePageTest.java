package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TaskPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactPage;
	DealsPage dealPage;
	TaskPage taskPage;
	
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		loginPage = new LoginPage();
		loginPage.loginBtnClick();
		
		
	}
	
	@Test(priority=1)
	public void verifyLoginBtnclick()
	{
		homePage = loginPage.loginClick(prop.getProperty("user"),prop.getProperty("user"));
	}
	
	
	@Test(priority=2)
	public void verifyHomePageTitleTest()
	{
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homeTitle,"Cogmento CRM","Home page title not matched");
	}
	
	@Test(priority=3)
	public void contacts()
	{
		contactPage = homePage.contactsClick();
		
	}
	
	
	@Test(priority=4)
	public void deals()
	{
		dealPage = homePage.dealsClick();
		
	}
	
	@Test(priority=5)
	public void tasks()
	{
		taskPage = homePage.taskClick();
		
	}
	@AfterMethod
	public void tearDown() throws Exception
	{
		driver.quit();
		
	}
}
