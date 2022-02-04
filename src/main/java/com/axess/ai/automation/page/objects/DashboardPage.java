package com.axess.ai.automation.page.objects;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class DashboardPage extends TestBase {

	SoftAssert softAssert = new SoftAssert();

	public DashboardPage() {

		PageFactory.initElements(driver, this);

	}

	public void verfiyPageTitle() throws Throwable {

		softAssert.assertEquals(true, dashboardTitle.isDisplayed());
		test.log(LogStatus.INFO, "Page Title");
		wait(2000);

	}

	public void verifyPageHeading() throws InterruptedException {

		String actualHeadingText = pageHeading.getText();
		String expectedHeadingText = "Status";
		test.log(LogStatus.INFO, "Page heading ");
		wait(2000);
		Assert.assertEquals(actualHeadingText, expectedHeadingText);

	}

	public void verifyPageUrl() throws InterruptedException {

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://app.dev.axess.ai/dashboard";
		test.log(LogStatus.INFO, "Page url comparison with actual and expected result");
		wait(2000);
		Assert.assertEquals(currentUrl, expectedUrl);

	}

	public void verifyClickOnRootLocation() throws Throwable {

		rootLocation.click();
		test.log(LogStatus.INFO, " click on Root Location");
		wait(3000);
	}

	public void verifySystemUserModule() throws Throwable {

		softAssert.assertEquals(true, systemUser.isDisplayed());
		systemUser.click();
		test.log(LogStatus.INFO, " System Users Module");
		wait(5000);
		driver.navigate().back();

	}

	public void verifyLocationModule() throws Throwable {

		softAssert.assertEquals(true, location.isDisplayed());
		location.click();
		test.log(LogStatus.INFO, " Location Module ");
		wait(5000);
		driver.navigate().back();
	}

	public void verifyDeviceAndModule() throws Throwable {

		softAssert.assertEquals(true, deviceAndModule.isDisplayed());
		deviceAndModule.click();
		test.log(LogStatus.INFO, " Device and Module");
		wait(5000);
		driver.navigate().back();

	}

	public void verifyRuleEngineModule() throws Throwable {

		softAssert.assertEquals(true, ruleEngine.isDisplayed());
		ruleEngine.click();
		test.log(LogStatus.INFO, " Rule Engine Module");
		wait(5000);
		driver.navigate().back();
	}

	public void verifyAccessManagerModule() throws Throwable {

		softAssert.assertEquals(true, accessControl.isDisplayed());
		accessControl.click();
		test.log(LogStatus.INFO, " Access Manager Module");
		wait(5000);
		driver.navigate().back();
	}

	public void verifyMapModule() throws Throwable {

		softAssert.assertEquals(true, map.isDisplayed());
		map.click();
		test.log(LogStatus.INFO, " Map Module");
		wait(5000);
		driver.navigate().back();
	}

	public void verifyReportsAnalyticsModule() throws Throwable {

		softAssert.assertEquals(true, reportsAnalytics.isDisplayed());
		reportsAnalytics.click();
		test.log(LogStatus.INFO, " Reports and Analytics Module");
		wait(5000);
		driver.navigate().back();
	}

	public void verifySiteSettingModule() throws Throwable {

		softAssert.assertEquals(true, siteSetting.isDisplayed());
		siteSetting.click();
		test.log(LogStatus.INFO, " Site Setting Module");
		wait(5000);
		driver.navigate().back();
	}

	public void verifiyHelpAndFeedbackModule() throws Throwable {

		softAssert.assertEquals(true, helpFeedback.isDisplayed());
		helpFeedback.click();
		test.log(LogStatus.INFO, " Help and Feedback Module");
		wait(5000);
		driver.navigate().back();

	}

	public void verfiyLogoutDropDown() throws Throwable {

		logoutDropdown.click();
		test.log(LogStatus.INFO, " Logout Dropdown");
		wait(1000);
	}

	public void verfiyLogoutLink() throws Throwable {

		logoutLink.click();
		test.log(LogStatus.INFO, " Logout");
		wait(2000);
	}

}
