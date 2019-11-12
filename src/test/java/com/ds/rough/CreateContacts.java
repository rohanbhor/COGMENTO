package com.ds.rough;

import com.cm.base.Constants;
import com.cm.base.Page;
import com.cm.pages.actions.ContactsPage;
import com.cm.pages.actions.LandingPage;
import com.cm.pages.actions.SignInPage;

public class CreateContacts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Page.initConfiguration();
		SignInPage signin = Page.topNav.gotoSignIn();
		LandingPage lp = signin.doLogIn(Constants.expediaUsername, Constants.expediaPassword);
		ContactsPage cp = lp.gotoContacts();
		cp.gotoCreateNewContacts();
		//Page.quitBrowser();
		
	
		
	}

}
