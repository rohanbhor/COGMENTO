package com.ds.rough;

import java.util.Map;

import org.testng.annotations.Test;

import com.cm.base.Constants;
import com.cm.base.Page;
import com.cm.pages.actions.ContactsPage;
import com.cm.pages.actions.LandingPage;
import com.cm.pages.actions.SignInPage;
import com.cm.utilities.TestUtil;

public class CreateContacts {
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void createContacts(Map<String,String>data) throws InterruptedException {		
		Page.initConfiguration();
		SignInPage signin = Page.topNav.gotoSignIn();
		LandingPage lp = signin.doLogIn(Constants.expediaUsername, Constants.expediaPassword);
		ContactsPage cp = lp.gotoContacts();
		cp.gotoCreateNewContacts();
		//Page.quitBrowser();
		click(firstName);
	
  }

}