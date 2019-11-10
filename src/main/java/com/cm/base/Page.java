package com.cm.base;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cm.pages.actions.TopNavigation;
import com.cm.utilities.ExcelReader;
import com.cm.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Page {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoylogger");
	public static ExcelReader excel=null;
	public static WebDriverWait wait;
	public static ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	public static TopNavigation topNav;
	
	public static void initConfiguration(){
		if(Constants.Browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/executables/"+"geckodriver.exe");
			driver= new FirefoxDriver();
			log.debug("Launching Firefox");
		}else if(Constants.Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/"+"chromedriver.exe");
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");		
			driver = new ChromeDriver(options);
			log.debug("Launching Chrome");
			
		}else if(Constants.Browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "IEdriverServer.exe");
			driver= new InternetExplorerDriver();
			log.debug("Launching Internet Explorer");
		}
		
		topNav = new TopNavigation();
		wait = new WebDriverWait(driver, 30);
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWait, TimeUnit.SECONDS);
	}
	
	
	public static void quitBrowser(){
		driver.close();
		driver.quit();
	}
	
	

}