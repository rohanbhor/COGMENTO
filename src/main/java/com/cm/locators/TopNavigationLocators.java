package com.cm.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	@FindBy(xpath="//span[text()='Log In']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	public WebElement signUpBtn;
	
	@FindBy(xpath="//a[text()='CRM']")
	public WebElement CRMBtn;
	
	
}
