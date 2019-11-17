package com.cm.rough;

import java.util.Map;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cm.base.Constants;
import com.cm.base.Page;
import com.cm.pages.actions.ContactsPage;
import com.cm.pages.actions.LandingPage;
import com.cm.pages.actions.SignInPage;
import com.cm.utilities.TestUtil;

public class CreateContacts {
	
	@BeforeMethod
	public void setUp() {
		Page.initConfiguration();
	}
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void createContacts(Map<String,String>data) throws InterruptedException {
		
		if(data.get("runmode").equalsIgnoreCase("N") ) {
			throw new SkipException("Skipping the test as test mode is set NO");
		}
		
		SignInPage signin = Page.topNav.gotoSignIn();
		LandingPage lp = signin.doLogIn(Constants.expediaUsername, Constants.expediaPassword);
		ContactsPage cp = lp.gotoContacts();
		cp.gotoCreateNewContacts();
		cp.createNewContacts(data.get("firstname"), data.get("lastname"), data.get("companyname"));
		//Page.quitBrowser();
  }
	
	@AfterMethod
	public void tearDown() {
		Page.quitBrowser();
	}

}





