package com.axess.ai.automation.testcases;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.axess.ai.automation.page.objects.AccessControlPage;

import com.axess.ai.automation.page.objects.LoginPage;
import com.axess.ai.automation.utilities.TestBase;

@Listeners(com.axess.ai.automation.utilities.ListenersApp.class)

public class AccessControlPageTest extends TestBase{
	
	LoginPage loginPage;
	AccessControlPage accessControlPage;
	
	public AccessControlPageTest() {
		
		super();
		
		}

	@BeforeTest(alwaysRun = true)
	public void setup() throws Throwable {
		
		launchBrowser();

		loginPage = new LoginPage();
		accessControlPage = new AccessControlPage();
		loginPage.verifyLoginWithValidCredentials(prop.getProperty("username"),prop.getProperty("password"));
		loginPage.verifyClickOnLoginButton();
		
	}
	
	@Test(priority=1)
	public void validateClickOnSystemUserModule() throws Throwable {
		
		accessControlPage = new AccessControlPage();
		accessControlPage.verifyClickOnAccessControlModule();
	}
	
	@Test(priority=2)
	public void validatePageHeading() throws InterruptedException {
		
		accessControlPage = new AccessControlPage();
		accessControlPage.verifyPageHeading();
	}
	
	@Test(priority=2)
	public void validatePageUrl() throws InterruptedException {
	
		accessControlPage = new AccessControlPage();
		accessControlPage.verifyPageUrl();
	}
	
	
	@AfterTest
	public void tearDown() {
		stop();
	}
	
	

}
