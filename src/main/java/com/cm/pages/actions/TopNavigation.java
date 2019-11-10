package com.cm.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.cm.base.Page;
import com.cm.locators.HomePageLocators;
import com.cm.locators.TopNavigationLocators;

public class TopNavigation {

	public TopNavigationLocators topNavigation;
	
	public TopNavigation(){
		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.driver, 10);
		PageFactory.initElements(factory, this.topNavigation);
	}
	
	
	
	public SignInPage gotoSignIn(){
		topNavigation.loginBtn.click();; 
		return new SignInPage();
	}
	

	public void gotoSignUp() {
		
	}
	
	public void gotoAbout() {
		
	}
	
    public void gotoCRM() {
		
	}
    
    public void gotoComapare() {
		
  	}  
    

    public void gotoPricing() {
		
  	}  
    
	
}
