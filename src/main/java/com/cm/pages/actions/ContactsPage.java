package com.cm.pages.actions;

import java.io.IOException;

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
	
	
	public ContactsPage createNewContacts(String firstName, String lastName, String company) throws IOException {
		type(contactsPageLocators.firstName, firstName );
		type(contactsPageLocators.lastName,lastName );
		type(contactsPageLocators.company, company);
		click(contactsPageLocators.firstName);
		Runtime.getRuntime().exec("./src/test/resources/executables/fileupload_autoit.exe");
		return new ContactsPage();
	}
	
	
	
	

}
