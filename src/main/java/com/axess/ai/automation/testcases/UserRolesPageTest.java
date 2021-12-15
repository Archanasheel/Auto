package com.axess.ai.automation.testcases;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.axess.ai.automation.page.objects.LoginPage;
import com.axess.ai.automation.page.objects.UserRolesPage;
import com.axess.ai.automation.utilities.TestBase;

public class UserRolesPageTest extends TestBase {
	
	
	LoginPage loginPage;
    UserRolesPage userRolesPage;

	public UserRolesPageTest() {
		super();
	}

	@BeforeTest
	public void setup() throws Throwable {

		launchBrowser();
		loginPage = new LoginPage();
		userRolesPage = new UserRolesPage();
		loginPage.verifyLoginWithValidCredentials(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.verifyClickOnLoginButton();
	}
	
	@Test(priority=1)
	public void validateManageRoles() throws Throwable {
		
		userRolesPage = new UserRolesPage();
		userRolesPage.verfiyManageRoles();
	}
	
	@Test(priority=4)
	public void validateCreateAndDeleteRole() throws InterruptedException {
		
		userRolesPage = new UserRolesPage();
		userRolesPage.verifyCreateAndDeleteRole();		
	}
	@Test(priority=2)
	public void validatePageHeading() throws InterruptedException {
		
		userRolesPage = new UserRolesPage();
		userRolesPage.verifyPageHeading();
	}

	@Test(priority=2)
	public void validateCurrentUrl() throws Throwable {
		
		userRolesPage = new UserRolesPage();
		userRolesPage.verifyCurrentUrl();
	}
	
	@Test(priority=3)
	public void validateRoles() throws Throwable {
		
		userRolesPage = new UserRolesPage();
		userRolesPage.verifyRoles();
	}

	

	@AfterTest
	public void tearDown() {
		stop();
	}
	
}
