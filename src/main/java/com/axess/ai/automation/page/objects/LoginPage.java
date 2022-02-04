package com.axess.ai.automation.page.objects;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends TestBase {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void verifyLoginWithValidCredentials(String username, String password) throws Throwable {

		emailField.sendKeys(username);
		test.log(LogStatus.INFO, "Enter Username");
		wait(2000);
		passwordField.sendKeys(password);
		test.log(LogStatus.INFO, "Enter Password");
		wait(2000);
	}

	public void verifyClickOnLoginButton() throws Throwable {

		loginButton.click();
		test.log(LogStatus.INFO, "login Successfully");
		wait(5000);
	}

	public void verifyPageTitle() {

		String title = driver.getTitle();
		test.log(LogStatus.INFO, "Page Title comparison with actual and expected");
		Assert.assertEquals(title, "Axess.ai");

	}

	public void verifyPageUrl() {

		String currentUrl = driver.getCurrentUrl();
		test.log(LogStatus.INFO, " Page Url comparison with actual and expected ");
		String expectedUrl = "https://app.dev.axess.ai/login";
		Assert.assertEquals(currentUrl, expectedUrl);

	}

}
