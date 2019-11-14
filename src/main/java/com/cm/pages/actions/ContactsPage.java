package com.cm.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.cm.base.Page;
import com.cm.locators.ContactsPageLocators;

public class ContactsPage extends Page {
	
	public ContactsPageLocators contactsPageLocators;
	
	public ContactsPage(){
		this.contactsPageLocators = new ContactsPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.contactsPageLocators);
	}	
	
	public ContactsPage gotoCreateNewContacts() {
		contactsPageLocators.newBtn.click();
		return new ContactsPage();
	}
	
	
	public ContactsPage createNewContacts(String firstName, String lastName, String company) {
		type(contactsPageLocators.firstName, firstName );
		type(contactsPageLocators.lastName,lastName );
		type(contactsPageLocators.company, company);
		return new ContactsPage();
	}
	
	
	
	

}
