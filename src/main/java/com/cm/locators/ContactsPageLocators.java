package com.cm.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPageLocators {

	
	@FindBy(xpath="//a[@href='/contacts/new']/button")
	public WebElement newBtn;
	
	@FindBy(xpath="//input[@name='first_name']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	public WebElement lastName;
	
	@FindBy(xpath="//div[@name='company']/input")
	public WebElement company;
	
	@FindBy(xpath="//input[@name='image']")
	public WebElement image;
	
	
	
	
	
	
}
