package com.cm.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.cm.base.Page;
import com.cm.locators.LandingPageLocators;

public class LandingPage {
	public LandingPageLocators landingPageLocators;
	
	public LandingPage(){
		this.landingPageLocators = new LandingPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.driver, 10);
		PageFactory.initElements(factory, this.landingPageLocators);
	}
	
	public void gotoHome() {
		
		landingPageLocators.home.click();
	}
	
	public void gotoCalendar() {
		landingPageLocators.calendar.click();
	}
	
    public ContactsPage gotoContacts() {
    	landingPageLocators.contacts.click();
    	return new ContactsPage();
		
	}
    
    public void gotoCompanies() {
    	landingPageLocators.companies.click();
  	}  
    
    public void gotoDeals() {
		
  	}  
    
    public void gotoTasks() {
    	landingPageLocators.tasks.click();
  	}  

}
