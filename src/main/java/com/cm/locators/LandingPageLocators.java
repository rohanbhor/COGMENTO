package com.cm.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.cm.base.Page;
import com.cm.pages.actions.ContactsPage;

public class LandingPageLocators {
	
	@FindBy(xpath="//span[text()='Home']")
	public WebElement home;
	
	@FindBy(xpath="//span[text()='Calendar']")
	public WebElement calendar;
	
	@FindBy(xpath="//span[text()='Contacts']")
	public WebElement contacts;
	
	@FindBy(xpath="//span[text()='Companies']")
	public WebElement companies;
	
	@FindBy(xpath="//span[text()='Tasks']")
	public WebElement tasks;
	
	@FindBy(xpath="//span[text()='Cases']")
	public WebElement cases;
	
	
	
	

}
