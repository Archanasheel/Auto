package com.axess.ai.automation.testcases;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.axess.ai.automation.page.objects.DashboardPage;
import com.axess.ai.automation.page.objects.LoginPage;
import com.axess.ai.automation.utilities.TestBase;

@Listeners(com.axess.ai.automation.utilities.ListenersApp.class)

public class DashboardPageTest extends TestBase {

	LoginPage loginPage;
	DashboardPage dashboardPage;

	public DashboardPageTest() {
		super();
	}

	@BeforeTest(alwaysRun = true)
	public void setup() throws Throwable {

		launchBrowser();

		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		loginPage.verifyLoginWithValidCredentials(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.verifyClickOnLoginButton();

	}

	@Test(priority = 2)
	public void validatePageHeading() throws InterruptedException {

		dashboardPage = new DashboardPage();
		dashboardPage.verifyPageHeading();
	}

	@Test(priority = 1)
	public void validatePageTitle() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verfiyPageTitle();
	}

	@Test(priority = 1)
	public void validatePageUrl() throws InterruptedException {

		dashboardPage = new DashboardPage();
		dashboardPage.verifyPageUrl();
	}

	@Test(priority = 2)
	public void validateRootLocation() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verifyClickOnRootLocation();
	}

	@Test(priority = 3)
	public void validateSystemUserModule() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verifySystemUserModule();
	}

	@Test(priority = 4)
	public void validateLocationModule() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verifyLocationModule();
	}

	@Test(priority = 5)
	public void validateDeviceAndModule() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verifyDeviceAndModule();
	}

	@Test(priority = 6)
	public void validateRuleEngineModule() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verifyRuleEngineModule();
	}

	@Test(priority = 7)
	public void validateAccessManagerModule() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verifyAccessManagerModule();
	}

	@Test(priority = 8)
	public void validateMapModule() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verifyMapModule();
	}

	@Test(priority = 9)
	public void validateReportAndAnalyticsModule() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verifyReportsAnalyticsModule();
	}

	@Test(priority = 10)
	public void validateSiteSettingModule() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verifySiteSettingModule();
	}

	@Test(priority = 11)
	public void validateHelpAndFeedbackModule() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verifiyHelpAndFeedbackModule();
	}

	@Test(priority = 12)
	public void validateLogoutdropdown() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verfiyLogoutDropDown();
	}

	@Test(priority = 13)
	public void validateLogoutLink() throws Throwable {

		dashboardPage = new DashboardPage();
		dashboardPage.verfiyLogoutLink();
	}

	@AfterTest
	public void tearDown() {
		stop();
	}

}
