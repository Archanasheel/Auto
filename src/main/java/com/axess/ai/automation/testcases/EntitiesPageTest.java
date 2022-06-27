package com.axess.ai.automation.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.axess.ai.automation.page.objects.EntitiesPage;
import com.axess.ai.automation.page.objects.LoginPage;

import com.axess.ai.automation.utilities.TestBase;

@Listeners(com.axess.ai.automation.utilities.ListenersApp.class)

public class EntitiesPageTest extends TestBase {

	LoginPage loginPage;
	EntitiesPage entitiesPage;

	public EntitiesPageTest() {
		super();
	}

	@BeforeTest
	public void setup() throws Throwable {

		launchBrowser();
		loginPage = new LoginPage();
		entitiesPage = new EntitiesPage();
		loginPage.verifyLoginWithValidCredentials(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.verifyClickOnLoginButton();

	}

	@Test(priority = 1)
	public void validateEntities() throws Throwable {

		entitiesPage = new EntitiesPage();
		entitiesPage.verifyEntities();

	}

	@Test(priority = 2)
	public void validatePageHeading() throws InterruptedException {

		entitiesPage = new EntitiesPage();
		entitiesPage.verifyPageHeading();
	}

	@Test(priority = 2)
	public void validateCurrentUrl() throws Throwable {

		entitiesPage = new EntitiesPage();
		entitiesPage.verifyPageUrl();
	}

	@Test(priority =3)
	public void validateModuleGroups() throws InterruptedException {
		
		entitiesPage = new EntitiesPage();
		entitiesPage.verifyModuleGroups();
		
	}
	/*
	@Test(priority = 4)
	public void validateEntityCreation() throws InterruptedException {

		entitiesPage = new EntitiesPage();
		entitiesPage.verifyEntityCreation();
	}
*/
	@AfterTest
	public void tearDown() {
		stop();
	}

}
