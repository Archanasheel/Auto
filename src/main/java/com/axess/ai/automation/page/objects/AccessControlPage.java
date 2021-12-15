package com.axess.ai.automation.page.objects;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class AccessControlPage extends TestBase {

	public AccessControlPage() {

		PageFactory.initElements(driver, this);
	}

	public void verifyClickOnAccessControlModule() throws Throwable {

		accessControl.click();
		test.log(LogStatus.INFO, " Click on Access Control Module ");
		wait(2000);
	}

	public void verifyPageHeading() throws InterruptedException {

		String actualHeadingText = pageHeading.getText();
		String expectedHeadingText = "Access Control";
		test.log(LogStatus.INFO, "Page heading ");
		wait(2000);
		Assert.assertEquals(actualHeadingText, expectedHeadingText);

	}

	public void verifyPageUrl() throws InterruptedException {

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://app.dev.axess.ai/accessors";
		test.log(LogStatus.INFO, "Page url comparison with actual and expected result");
		wait(2000);
		Assert.assertEquals(currentUrl, expectedUrl);

	}
	
	

}
