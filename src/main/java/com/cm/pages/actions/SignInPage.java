package com.cm.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cm.base.Page;
import com.cm.locators.SignInPageLocators;

public class SignInPage extends Page{

	public SignInPageLocators signInPageLocators;
	
	public SignInPage(){
		this.signInPageLocators = new SignInPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.signInPageLocators);
	}
	
	public void doLogIn(String username, String password) throws InterruptedException{
		
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(signInPageLocators.username));
		signInPageLocators.username.sendKeys(username);
		
		signInPageLocators.password.sendKeys(password);
		
		signInPageLocators.logInBtn.click();
		Thread.sleep(4000);
	
	}
	
	
	
	
}
