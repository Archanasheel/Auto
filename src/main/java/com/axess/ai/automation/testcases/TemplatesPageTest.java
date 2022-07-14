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


		templatesPage.verifyTemplates();

	}
	
	@Test(priority = 2)
	public void validatePageHeading() throws InterruptedException {

		
		templatesPage.verifyPageHeading();
	}
	
	@Test(priority = 2)
	public void validateCurrentUrl() throws Throwable {

		
		templatesPage.verifyPageUrl();
	}
	
	@Test(priority = 4)
	public void validateModuleTemplate() throws InterruptedException {

				templatesPage.verifyModuleTemplate();
	}
	
	
	
	
	@Test(priority = 3)
	public void validateNetworkTemplate() throws InterruptedException {


		templatesPage.verifyNetworkTemplate();
	}
	
	

	@AfterTest
	public void tearDown() {
		stop();
	}

}
