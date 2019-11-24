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
	
	
	public ContactsPage createNewContacts(String firstName, String lastName, String company) throws IOException, InterruptedException {
		type(contactsPageLocators.firstName, firstName );
		type(contactsPageLocators.lastName,lastName );
		type(contactsPageLocators.company, company);
		click(contactsPageLocators.doNotEmailBtn);
		Thread.sleep(1000);
		click(contactsPageLocators.doNotCallBtn);
		Thread.sleep(1000);
		click(contactsPageLocators.selectStatusDropDown);
		Thread.sleep(1000);
		click(contactsPageLocators.selectStatusActive);	
		Thread.sleep(1000);
		click(contactsPageLocators.selectImage);		
		autoitX.winWait("Open", "", 5000);
		autoitX.winActive("Open");
		autoitX.controlFocus("Open","","Edit1");
		autoitX.ControlSetText("Open","","Edit1", System.getProperty("user.dir")+"\\src\\test\\resources\\samplefiles\\male1.jpg");
		autoitX.controlClick("Open","","Button1");
		click(contactsPageLocators.saveBtn);
		
		return new ContactsPage();
	}
	
	
	
	

}
