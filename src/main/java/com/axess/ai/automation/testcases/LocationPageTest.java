package com.axess.ai.automation.testcases;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.axess.ai.automation.utilities.TestBase;
import com.axess.ai.automation.page.objects.LocationPage;
import com.axess.ai.automation.page.objects.LoginPage;

@Listeners(com.axess.ai.automation.utilities.ListenersApp.class)

public class LocationPageTest extends TestBase {

	LoginPage loginPage;
	LocationPage locationPage;

	public LocationPageTest() {
		super();
	}

	@BeforeTest
	public void setup() throws Throwable {

		launchBrowser();
		loginPage = new LoginPage();
		locationPage = new LocationPage();
		loginPage.verifyLoginWithValidCredentials(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.verifyClickOnLoginButton();
	}

	@Test(priority = 1)
	public void validateClickOnLocationModule() throws Throwable {

		locationPage = new LocationPage();
		locationPage.verifyClickOnLocationModule();
	}

	@Test(priority = 2)
	public void validatePageHeading() throws InterruptedException {

		locationPage = new LocationPage();
		locationPage.verifyPageHeading();
	}

	@Test(priority = 2)
	public void validateCurrentUrl() throws Throwable {

		locationPage = new LocationPage();
		locationPage.verifyCurrentUrl();
	}

	@AfterTest
	public void tearDown() {
		stop();
	}

}
