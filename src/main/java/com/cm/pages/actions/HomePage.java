package com.cm.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cm.base.Page;
import com.cm.locators.HomePageLocators;

public class HomePage extends Page{

	public HomePageLocators home;

	public HomePage(){
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}
		
	public HomePage goToFlights(){
		home.flightTab.click();
		return this;
	}
	
}
