package com.cm.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	public WebElement logInBtn;

	
	
	
}
