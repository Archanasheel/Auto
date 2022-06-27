package com.axess.ai.automation.page.objects;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class LocationPage extends TestBase {

	SoftAssert softAssert = new SoftAssert();

	public LocationPage() {

		PageFactory.initElements(driver, this);

	}

	public void verifyClickOnLocationModule() throws Throwable {

		locationLink.click();
		test.log(LogStatus.INFO, " Click on Location Module ");
		wait(1000);
	}

	public void verifyPageHeading() throws InterruptedException {

		String actualHeadingText = pageHeading.getText();
		String expectedHeadingText = "Locations";
		test.log(LogStatus.INFO, "Page heading ");
		wait(1000);
		Assert.assertEquals(actualHeadingText, expectedHeadingText);
	}

	public void verifyCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		test.log(LogStatus.INFO, " Page Url comparison with actual and expected ");
		String expectedUrl = "https://app.dev.axess.ai/locations";
		Assert.assertEquals(currentUrl, expectedUrl);

	}
}
