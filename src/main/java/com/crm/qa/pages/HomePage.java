package com.crm.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import javafx.application.Application;

import com.crm.qa.base.TestBase;
public class HomePage   extends TestBase  {

	public HomePage() {
		PageFactory.initElements(driver,this);
	}


	
	
	@FindBy(xpath="//span[@class='item-text' and contains(text(),'Contact')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[@class='item-text' and contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[@class='item-text' and contains(text(),'Tasks')]")
	WebElement taskLink;
	
	
	@FindBy(xpath="//span[@class='user-display' and contains(text(),'Anitha lakshmi')]")
	WebElement titleName;
	
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}

	
	public ContactsPage contactsClick()
	{
		contactsLink.click();
		return new ContactsPage();
	}

	
	public DealsPage dealsClick()
	{
		dealsLink.click();
		return new DealsPage();
	}

	
	public TaskPage taskClick()
	{
		taskLink.click();
		return new TaskPage();
	}
	
	
	
	
}
