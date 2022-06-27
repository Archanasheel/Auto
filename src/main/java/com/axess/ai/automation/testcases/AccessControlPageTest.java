package com.axess.ai.automation.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.axess.ai.automation.page.objects.AccessControlPage;

import com.axess.ai.automation.page.objects.LoginPage;
import com.axess.ai.automation.utilities.TestBase;

@Listeners(com.axess.ai.automation.utilities.ListenersApp.class)

public class AccessControlPageTest extends TestBase {

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
		loginPage.verifyLoginWithValidCredentials(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.verifyClickOnLoginButton();

	}

	@Test(priority = 1)
	public void validateClickOnAccessControlModule() throws Throwable {

		accessControlPage = new AccessControlPage();
		accessControlPage.verifyClickOnAccessControlModule();
	}

	@Test(priority = 2)
	public void validatePageHeading() throws InterruptedException {

		accessControlPage = new AccessControlPage();
		accessControlPage.verifyPageHeading();
	}

	@Test(priority = 2)
	public void validatePageUrl() throws InterruptedException {

		accessControlPage = new AccessControlPage();
		accessControlPage.verifyPageUrl();
	}

	@Test(priority = 3)
	public void validateManageHolidays_Holiday() throws InterruptedException {

		accessControlPage = new AccessControlPage();
		accessControlPage.verifyManageHolidays_Holiday();
	}
	
	@Test(priority = 3)
	public void validateManageHolidays_HolidayGroup() throws InterruptedException {

		accessControlPage = new AccessControlPage();
		accessControlPage.verifyManageHolidays_HolidayGroup();
	}

	@Test(priority = 4)
	public void validateManageHolidays_FixedHoliday() throws InterruptedException {

		accessControlPage = new AccessControlPage();
		accessControlPage.verfiyManageHolidays_FixedHoliday();

	}

	@Test(priority = 4)
	public void validateSchedule() throws InterruptedException {
		accessControlPage = new AccessControlPage();
		accessControlPage.verifySchedule();
	}
	
	@Test(priority = 5)
	public void validateAccessLevel() throws InterruptedException {

		accessControlPage = new AccessControlPage();
		accessControlPage.verfiyAccessLevel();

	}
	
	@Test(priority = 6)
	public void validateUser_Accessor() throws InterruptedException, AWTException {

		accessControlPage = new AccessControlPage();
		accessControlPage.verifyUser_Accessor();

	}

	@Test(priority = 7)
	public void validateUser_Visitor() throws InterruptedException, AWTException {

		accessControlPage = new AccessControlPage();
		accessControlPage.verifyUser_Visitor();

	}
/*
	@Test(priority = 8)
	public void validateDemoAccessLevel_Accesor() throws InterruptedException, AWTException {

		accessControlPage = new AccessControlPage();
		accessControlPage.demoAccessLevel_Accesor();

	}
*/
	@AfterTest
	public void tearDown() {
		stop();
	}

}
