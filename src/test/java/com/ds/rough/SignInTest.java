package com.ds.rough;

import com.cm.base.Constants;
import com.cm.base.Page;
import com.cm.pages.actions.SignInPage;

public class SignInTest {

	public static void main(String[] args) throws InterruptedException {

		Page.initConfiguration();
		SignInPage signin = Page.topNav.gotoSignIn();
		signin.doLogIn(Constants.expediaUsername, Constants.expediaPassword);
		Page.quitBrowser();
		
	}

}
