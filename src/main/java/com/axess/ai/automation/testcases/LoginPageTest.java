package com.axess.ai.automation.testcases;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.axess.ai.automation.page.objects.LoginPage;

import com.axess.ai.automation.utilities.TestBase;

@Listeners(com.axess.ai.automation.utilities.ListenersApp.class)
public class LoginPageTest extends TestBase {

	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeTest
	public void setup() {
		launchBrowser();
	}

	@Test(priority = 2)
	public void loginwithcredentials() throws Throwable {

		loginPage = new LoginPage();
		loginPage.verifyLoginWithValidCredentials(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 3)
	public void validateclickOnLogin() throws Throwable {

		loginPage = new LoginPage();
		loginPage.verifyClickOnLoginButton();
	}

	@Test(priority = 4)
	public void validateTitle() {
		
		loginPage = new LoginPage();
		loginPage.verifyPageTitle();

	}

	@Test(priority = 1)
	public void validateUrl() {
		
		loginPage = new LoginPage();
		loginPage.verifyCurrentUrl();

	}

	@AfterTest
	public void tearDown() {
		stop();
	}

}
