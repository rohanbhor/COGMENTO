package com.cm.listeners;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.cm.base.Page;
import com.cm.utilities.MonitoringMail;
import com.cm.utilities.TestConfig;
import com.cm.utilities.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListeners extends Page implements ITestListener, ISuiteListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		Reporter.log("<br>Capturing Screenshot...");
		
		try {
			TestUtil.captureScreenshot();
			Reporter.log("<br>Screenshot Captured!!: "+ TestUtil.screenshotname2);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Page.test.log(LogStatus.FAIL,arg0.getName().toUpperCase()+ " TEST FAILED with exception :"+arg0.getThrowable());
		Page.test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotpath2));
	
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotpath2+">screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotpath2+"><img height=200 width=200 src="+TestUtil.screenshotpath2+"></img></a>");
		
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		test.log(LogStatus.SKIP, arg0.getName()+" Skipped as Run Mode is NO");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		test = rep.startTest(arg0.getName().toUpperCase());
	
		/*
		//Run Mode on Test Start
		if(!TestUtil.isTestRunnable(arg0.getName(), excel)){
			throw new SkipException("Skipping the test: "+ arg0.getName() +" as Run Mode is NO");
		}
		*/
		 
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		Page.test.log(LogStatus.PASS,arg0.getName().toUpperCase()+ " TEST PASSED");
		rep.endTest(test);
		rep.flush();
	}

	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		
		/*
		MonitoringMail mail= new MonitoringMail();
		try {
			String messageBody = "http://"+InetAddress.getLocalHost().getHostAddress()+":8080/job/MasterDataDriven/Extent_20Report/";
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/		
	
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

}
