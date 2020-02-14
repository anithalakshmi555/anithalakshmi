package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties  prop;
	public static String url1;
	
	public TestBase() {
		try {
		 prop=new Properties();
		 /*FileInputStream fis = new FileInputStream("C:\\Users\\Miss Jaydevappa\\eclipse-workspace\\FreeCRMautomation\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		 prop.load(fis);*/
		 
		 FileInputStream fis = new FileInputStream("C://Users//Miss Jaydevappa//eclipse-workspace//FreeCRMautomation//src//main//java//com//crm//qa//config//config.properties");
		 prop.load(fis);
		 
		 
		 url1 = prop.getProperty("url");
		 System.out.println(url1);
	
		}
		catch(FileNotFoundException e){
			e.printStackTrace();}
		catch(IOException e){
			e.printStackTrace();}
		}
	
	public  static void initialization() throws Exception {
		String browserName= prop.getProperty("browser");
		String userName= prop.getProperty("user");
		String pwdName= prop.getProperty("password");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C://Users//Miss Jaydevappa//Automation//TestNGSeleniumDemo//chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(url1);
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
		//driver.get(url1);
	
		//driver.navigate().to("https://www.freecrm.com/index.php");
		Thread.sleep(10000);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		TestBase.driver = driver;
	}

}
