package com.axess.ai.automation.testcases;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.axess.ai.automation.page.objects.LoginPage;
import com.axess.ai.automation.page.objects.SystemUsersPage;

import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(com.axess.ai.automation.utilities.ListenersApp.class)
public class SystemUsersPageTest extends TestBase {

	LoginPage loginPage;
	SystemUsersPage systemUsersPage;

	public SystemUsersPageTest() {
		super();
	}

	@BeforeTest
	public void setup() throws Throwable {

		launchBrowser();
		loginPage = new LoginPage();
		systemUsersPage = new SystemUsersPage();
		loginPage.verifyLoginWithValidCredentials(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.verifyClickOnLoginButton();
	}

	@Test(priority = 1)
	public void validateClickOnSystemUserModule() throws Throwable {

		systemUsersPage = new SystemUsersPage();
		systemUsersPage.verifyClickOnSystemUserModule();
	}

	@Test(priority = 2)
	public void validatePageHeading() throws InterruptedException {

		systemUsersPage = new SystemUsersPage();
		systemUsersPage.verifyPageHeading();
	}

	@Test(priority = 2)
	public void validatePageUrl() throws Throwable {

		systemUsersPage = new SystemUsersPage();
		systemUsersPage.verifyPageUrl();
	}

	@Test(priority = 3)
	public void validateAdministratorUser() throws Throwable {

		systemUsersPage = new SystemUsersPage();
		systemUsersPage.verifyAdministratorUsers();
	}

	@Test(priority = 3)
	public void validateadminexistingRoles() throws Throwable {

		systemUsersPage = new SystemUsersPage();
		systemUsersPage.verifyAdminExistingRoles();

	}

	@Test(priority = 4)
	public void validateInstallationUser() throws Throwable {

		systemUsersPage = new SystemUsersPage();
		systemUsersPage.verifyInstallationUsers();
	}

	@Test(priority = 5)
	public void validateOrganizationUser() throws Throwable {

		systemUsersPage = new SystemUsersPage();
		systemUsersPage.verifyOragnizationUsers();
	}

	@Test(priority = 6)
	public void validateAllUsers() throws Throwable {

		systemUsersPage = new SystemUsersPage();
		systemUsersPage.verifyAllUsers();

	}

	@Test(priority = 7)
	public void validateManageRoles() throws Throwable {
		
		systemUsersPage = new SystemUsersPage();
		systemUsersPage.verfiyManageRoles();
	}

	@Test(priority = 9)
	public void validateAddNewUserAndDelete() throws Throwable {
		
		systemUsersPage = new SystemUsersPage();
		systemUsersPage.verifyNewUserCrud();

	}

	@Test(priority = 3)
	public void validateAPIKeys() throws Throwable {

		systemUsersPage.verfiyAPIKeys();
	}

	@AfterTest
	public void tearDown() {
		stop();
	}

}
