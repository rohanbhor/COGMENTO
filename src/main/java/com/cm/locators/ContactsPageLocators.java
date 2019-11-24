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
	public WebElement selectImage;
	
	
	@FindBy(xpath="//div[@class='ui toggle checkbox']/input[@name='do_not_email']/following-sibling::label")
	public WebElement doNotEmailBtn;
	
	@FindBy(xpath="//input[@name='do_not_call']/following-sibling::label")
	public WebElement doNotCallBtn;
	
	@FindBy(xpath="//div[@name='status']/i")
	public WebElement selectStatusDropDown;

	@FindBy(xpath="//div[@class='visible menu transition']/div[2]/span[text()='Active']")
	public WebElement selectStatusActive;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	public WebElement saveBtn;
	
}
