package com.axess.ai.automation.page.objects;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;


public class EntitiesPage extends TestBase {
	
	
	
	SoftAssert softassert = new SoftAssert();
	Actions actions = new Actions(driver);
	public EntitiesPage() {

		PageFactory.initElements(driver, this);

	}

	public void verifyEntities() throws Throwable {

		wait(5000);
		deviceAndModule.click();
		test.log(LogStatus.INFO, " Click on Device and Module ");
		wait(5000);
		entitiesLink.click();
		test.log(LogStatus.INFO, "Click on Entities");
		wait(5000);
	}

	public void verifyPageHeading() throws InterruptedException {

		String actualHeadingText = pageHeading.getText();
		String expectedHeadingText = "Entities";
		test.log(LogStatus.INFO, "Page heading ");
		wait(1000);
		Assert.assertEquals(actualHeadingText, expectedHeadingText);

	}

	public void verifyPageUrl() throws InterruptedException {

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://app.dev.axess.ai/entities";
		test.log(LogStatus.INFO, "Page url comparison with actual and expected result");
		wait(1000);
		Assert.assertEquals(currentUrl, expectedUrl);

	}

	public void verifyModuleGroups() throws InterruptedException {
		
		moduleGroups.click();
		test.log(LogStatus.INFO, "Click on Module Group");
		wait(5000);
		createModuleGroup.click();
		test.log(LogStatus.INFO,"Click On Create Module Group");
		wait(4000);
		locationId.click();
		test.log(LogStatus.INFO, "Click on location ");
		wait(4000);
		actions.doubleClick(chooseIndia).perform();
		wait(4000);
		
		nameField.click();
		nameField.sendKeys("YachnaModule");
		test.log(LogStatus.INFO,"Add name of the module group");
		wait(3000);
		
		moduleTypeId.click();
		wait(5000);
		doorModule.click();
		test.log(LogStatus.INFO, "Select module type Door");
		wait(5000);
		
		moduleTemplateId.click();
		test.log(LogStatus.INFO, " Seclect Module Template for Device Template");
		wait(5000);
		
		selectModuleTemplate.click();
		test.log(LogStatus.INFO,"Select Module Template ");
		wait(4000);
		
		
		
	}



}
