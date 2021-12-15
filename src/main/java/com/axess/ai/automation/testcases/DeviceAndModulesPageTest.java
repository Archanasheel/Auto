/**
 * 
 */
package com.axess.ai.automation.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.axess.ai.automation.page.objects.DeviceAndModulesPage;
import com.axess.ai.automation.page.objects.LoginPage;

import com.axess.ai.automation.utilities.TestBase;
@Listeners(com.axess.ai.automation.utilities.ListenersApp.class)

/**
 * @author yachna
 *
 */
public class DeviceAndModulesPageTest extends TestBase {

	LoginPage loginPage;
	DeviceAndModulesPage deviceAndModulesPage;

	public DeviceAndModulesPageTest() {
		super();
	}

	@BeforeTest
	public void setup() throws Throwable {

		launchBrowser();
		loginPage = new LoginPage();
		deviceAndModulesPage = new DeviceAndModulesPage();
		loginPage.verifyLoginWithValidCredentials(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.verifyClickOnLoginButton();
	}
	
	@Test(priority=1)
	public void validateClickOnSystemUserModule() throws Throwable {
		
		deviceAndModulesPage = new DeviceAndModulesPage();
		deviceAndModulesPage.verifyDeviceAndModule();
	}
	
	@Test(priority=2)
	public void validatePageHeading() throws InterruptedException {
		
		deviceAndModulesPage = new DeviceAndModulesPage();
		deviceAndModulesPage.verifyPageHeading();
	}

	@Test(priority=2)
	public void validateCurrentUrl() throws Throwable {
		
		deviceAndModulesPage = new DeviceAndModulesPage();
		deviceAndModulesPage.verifyPageUrl();
	}
	
	@Test(priority=3)
	public void validateAllBtns() throws InterruptedException {
	
		deviceAndModulesPage = new DeviceAndModulesPage();
		deviceAndModulesPage.verifyAllBtns();
	}
	
	
	@AfterTest
	public void tearDown() {
		stop();
	}
	
}
