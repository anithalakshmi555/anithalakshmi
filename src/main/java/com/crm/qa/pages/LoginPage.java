package com.crm.qa.pages;
import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import javafx.application.Application;

public class LoginPage   extends TestBase  {

	public LoginPage() {
		// TODO Auto-generated constructor stub
	}

	//
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement loginBtn1;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement lgnBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	//@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	
	
	@FindBy(xpath="//img[@title='free crm app for itunes']")
	WebElement crmLogo;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwrd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement login;

	
	
	
	
	
	public void  LoginPage() {
		PageFactory.initElements(driver,this);
	}

	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage loginClick(String un,String pwd) {
		email.sendKeys(un);
		passwrd.sendKeys(pwd);
		login.click();
		return new HomePage();
		
	}
	
	

	public void loginBtnClick() {
		loginBtn1.click();
		
	}
	
	
}
