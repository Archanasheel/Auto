/**
 * 
 */
package com.axess.ai.automation.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.axess.ai.automation.page.objects.LoginPage;
import com.axess.ai.automation.page.objects.TemplatesPage;
import com.axess.ai.automation.utilities.TestBase;

@Listeners(com.axess.ai.automation.utilities.ListenersApp.class)
/**
 * @author yachna
 *
 */
public class TemplatesPageTest extends TestBase {

	LoginPage loginPage;
	TemplatesPage templatesPage;

	public TemplatesPageTest() {
		super();
	}

	@BeforeTest
	public void setup() throws Throwable {

		launchBrowser();
		loginPage = new LoginPage();
		templatesPage = new TemplatesPage();
		loginPage.verifyLoginWithValidCredentials(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.verifyClickOnLoginButton();

	}

	@Test(priority = 1)
	public void validateTemplates() throws Throwable {

		templatesPage = new TemplatesPage();
		templatesPage.verifyTemplates();

	}
	@Ignore
	@Test(priority = 2)
	public void validatePageHeading() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifyPageHeading();
	}
	@Ignore
	@Test(priority = 2)
	public void validateCurrentUrl() throws Throwable {

		templatesPage = new TemplatesPage();
		templatesPage.verifyPageUrl();
	}
	
	@Ignore
	@Test(priority = 3)
	public void validateEventField() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifyEventField();
	}
	
	@Ignore
	@Test(priority = 4)
	public void validateEventTemplate() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifyEventTemplate();
	}
	
	@Ignore
	@Test(priority = 5)
	public void validateSettingField() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifySettingField();
	}
	
	@Ignore
	@Test(priority = 6)
	public void validateSettingTemplate() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verfiySettingTemplate();
	}
	
	@Ignore
	@Test(priority = 7)
	public void validateModuleTemplate() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifyModuleTemplate();
	}
	
	@Ignore
	@Test(priority = 8)
	public void validateDeviceTemplate() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifyDeviceTemplate();
	}
	
	
	@Test(priority = 9)
	public void validateNetworkTemplate() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifyNetworkTemplate();
	}
	
	/*@Ignore
	@Test(priority = 9)
	public void validateNetworkField() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifyNetworkField();
	}*/
	
	@Ignore
	@Test(priority = 10)
	public void validatePanelTemplate() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifyPanelTemplate();
	}
	
	@Ignore
	@Test(priority = 11)
	public void validateClusterTemplate() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifyClusterTemplate();
	}
	
	@Ignore
	@Test(priority = 11)
	public void validateModuleType() throws InterruptedException {

		templatesPage = new TemplatesPage();
		templatesPage.verifyModuleType();
	}

	@AfterTest
	public void tearDown() {
		stop();
	}

}
