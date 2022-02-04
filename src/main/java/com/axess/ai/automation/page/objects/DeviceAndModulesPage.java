package com.axess.ai.automation.page.objects;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class DeviceAndModulesPage extends TestBase {

	SoftAssert softAssert = new SoftAssert();

	public DeviceAndModulesPage() {

		PageFactory.initElements(driver, this);

	}

	public void verifyDeviceAndModule() throws Throwable {

		deviceAndModule.click();
		test.log(LogStatus.INFO, " Click on Device and Module ");
		wait(4000);
	}

	public void verifyPageHeading() throws InterruptedException {

		String actualHeadingText = pageHeading.getText();
		String expectedHeadingText = "Devices & Modules";
		test.log(LogStatus.INFO, "Page heading ");
		wait(2000);
		Assert.assertEquals(actualHeadingText, expectedHeadingText);

	}

	public void verifyPageUrl() throws InterruptedException {

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://app.dev.axess.ai/device-modules";
		test.log(LogStatus.INFO, "Page url comparison with actual and expected result");
		wait(2000);
		Assert.assertEquals(currentUrl, expectedUrl);

	}

	public void verifyAllBtns() throws InterruptedException {

		rootTab.click();
		test.log(LogStatus.INFO, "Root Location");
		wait(3000);

		templateLink.click();
		test.log(LogStatus.INFO, "Template Button");
		softAssert.assertTrue(driver.getPageSource().contains("Device Template"));
		wait(5000);
		driver.navigate().back();
		wait(2000);

		entitiesLink.click();
		test.log(LogStatus.INFO, "Entities Button");
		softAssert.assertTrue(driver.getPageSource().contains("Entities"));
		wait(5000);
		driver.navigate().back();
		wait(2000);

		launchpadLink.click();
		test.log(LogStatus.INFO, "LaunchPad Button");
		softAssert.assertTrue(driver.getPageSource().contains("Launchpad"));
		wait(5000);
		driver.navigate().back();
		wait(3000);

	}

	public void verifyEventEngine() throws InterruptedException {

		expandBtn.click();
		test.log(LogStatus.INFO, "Expand the location");
		wait(3000);

		expandBtn.click();
		test.log(LogStatus.INFO, "Expand Cluster to Panel");
		wait(3000);

		expandBtn.click();
		test.log(LogStatus.INFO, "Expand Panel to Device");
		wait(2000);

		deviceClick.click();
		test.log(LogStatus.INFO, "Click on Device");
		wait(3000);
		softAssert.assertTrue(driver.getPageSource().contains("View Device Events"));

		eyeIcon.click();
		test.log(LogStatus.INFO, " View Device ");
		wait(6000);

		crossBtn.click();
		test.log(LogStatus.INFO, "Close the Device");
		wait(3000);

		moduleViewEvent.click();
		test.log(LogStatus.INFO, "Select Module to View Events");
		wait(3000);

		arrowDown.click();
		test.log(LogStatus.INFO, "Choose Event from list");
		wait(3000);

		if (checkBox.isSelected() == false) {

			checkBox.click();
			test.log(LogStatus.INFO, "Choose further Event List");
			wait(3000);
			softAssert.assertTrue(checkBox.isSelected());
		}

		editButton.click();
		wait(5000);

		driver.getPageSource().contains("Save");

		clickOnSaveButton();

		viewDeviceEventsBtn.click();
		softAssert.assertTrue(driver.getPageSource().contains("Device Events"));
		test.log(LogStatus.INFO, "View Device Events");
		wait(5000);
// RabbitMQ operations or simulator implementation
	}

}
