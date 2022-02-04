
package com.axess.ai.automation.page.objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class TemplatesPage extends TestBase {

	SoftAssert softassert = new SoftAssert();
	Actions actions = new Actions(driver);

	public TemplatesPage() {

		PageFactory.initElements(driver, this);

	}

	public void verifyTemplates() throws Throwable {

		wait(5000);
		deviceAndModule.click();
		test.log(LogStatus.INFO, " Click on Device and Module ");
		wait(5000);
		templateLink.click();
		test.log(LogStatus.INFO, "Click on Templates");
		wait(5000);
	}

	public void verifyPageHeading() throws InterruptedException {

		String actualHeadingText = pageHeading.getText();
		String expectedHeadingText = "Device Template";
		test.log(LogStatus.INFO, "Page heading ");
		wait(3000);
		Assert.assertEquals(actualHeadingText, expectedHeadingText);

	}

	public void verifyPageUrl() throws InterruptedException {

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://app.dev.axess.ai/templates";
		test.log(LogStatus.INFO, "Page url comparison with actual and expected result");
		wait(3000);
		Assert.assertEquals(currentUrl, expectedUrl);

	}

	public void verifyEventField() throws InterruptedException {

		eventField.click();
		test.log(LogStatus.INFO, "Click on Event Field");
		wait(5000);

		if (driver.getPageSource().contains("YachnaTest")) {
			newField.click();
			test.log(LogStatus.INFO, "Delete already exist event field with same name");
			wait(5000);
			clickOnDeleteButton();
			clickOnYesButton();

		}

		addEventField.click();
		test.log(LogStatus.INFO, "Add Event Field");
		wait(3000);

		fieldName.click();
		fieldName.sendKeys("New");
		test.log(LogStatus.INFO, "Enter Field Name");
		wait(3000);

		displayName.click();
		displayName.sendKeys("YachnaTest");
		test.log(LogStatus.INFO, "Enter Display Name");
		wait(5000);

		moduleTypeId.click();
		wait(5000);
		moduleTypeId.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Select module type ");
		wait(2000);

		dataTypeList.click();
		wait(2000);
		dataTypeList.sendKeys(Keys.ENTER);
		// if need to select other data type then use down key then enter key
		test.log(LogStatus.INFO, " Select datatype Boolean");
		wait(3000);

		clickOnSaveButton();

		// update event field
		newField.click();
		test.log(LogStatus.INFO, "click on new event field");
		wait(5000);
		editButton.click();
		test.log(LogStatus.INFO, "Click on edit button");
		wait(3000);

		fieldName.click();
		fieldName.sendKeys("New");
		test.log(LogStatus.INFO, "Modify field name");
		wait(3000);
		clickOnUpdateButton();
		wait(3000);

		// delete event field

		softassert.assertTrue(driver.getPageSource().contains("NewNew"));
		newField.click();
		test.log(LogStatus.INFO, "Click on updated event field");
		wait(5000);
		clickOnDeleteButton();
		clickOnYesButton();

	}

	public void verifyEventTemplate() throws InterruptedException {

		eventTemplate.click();
		test.log(LogStatus.INFO, "Click on Event Template");
		wait(5000);

		if (driver.getPageSource().contains("Yachna")) {
			existingTemplate.click();
			wait(5000);

			clickOnDeleteButton();
			clickOnYesButton();

		}

		addEventTemplate.click();
		test.log(LogStatus.INFO, "Add event template");
		wait(5000);

		nameField.click();
		nameField.sendKeys("Yachna");
		test.log(LogStatus.INFO, "Add name field");

		moduleTypeId.click();
		wait(3000);
		moduleTypeId.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Select module type");
		wait(5000);

		addFields.click();
		test.log(LogStatus.INFO, "Add event fields in event template");
		wait(5000);

		eventCheckBox.click();
		test.log(LogStatus.INFO, "select event field for template");
		wait(5000);

		smallSaveBtn.click();
		test.log(LogStatus.INFO, "Click on inner save button");
		wait(2000);

		requiredCheckBox.click();
		test.log(LogStatus.INFO, "Click on required checkbox");
		wait(3000);

		clickOnSaveButton();
		wait(2000);
		// read & update
		softassert.assertTrue(driver.getPageSource().contains("Yachna"));
		existingTemplate.click();
		wait(3000);
		editButton.click();
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(3000);
		clickOnUpdateButton();
		wait(3000);
		// delete template
		softassert.assertTrue(driver.getPageSource().contains("YachnaYachna"));

		updateExistingTemplate.click();
		wait(5000);
		clickOnDeleteButton();
		clickOnYesButton();

	}

	public void verifySettingField() throws InterruptedException {

		settingField.click();
		test.log(LogStatus.INFO, "Click on Setting field");
		wait(3000);

		if (driver.getPageSource().contains("YachnaTest")) {
			newField.click();
			test.log(LogStatus.INFO, "Delete already exist setting field with same name");
			wait(5000);
			clickOnDeleteButton();
			clickOnYesButton();

		}

		addSettingField.click();
		test.log(LogStatus.INFO, "Add Setting Field");
		wait(3000);

		fieldName.click();
		fieldName.sendKeys("New");
		test.log(LogStatus.INFO, "Enter Field Name");
		wait(3000);

		displayName.click();
		displayName.sendKeys("YachnaTest");
		test.log(LogStatus.INFO, "Enter Display Name");
		wait(3000);

		moduleTypeId.click();
		wait(2000);
		moduleTypeId.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Select module type");
		wait(2000);

		dataTypeList.click();
		wait(2000);
		dataTypeList.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, " Select datatype Boolean");
		wait(3000);

		clickOnSaveButton();
		// read & update
		softassert.assertTrue(driver.getPageSource().contains("YachnaTest"));
		newField.click();
		wait(3000);
		editButton.click();
		wait(3000);

		fieldName.click();
		fieldName.sendKeys("New");
		wait(3000);
		clickOnUpdateButton();
		wait(3000);

		// delete event field

		softassert.assertTrue(driver.getPageSource().contains("NewNew"));

		newField.click();
		wait(5000);

		clickOnDeleteButton();
		clickOnYesButton();

	}

	public void verfiySettingTemplate() throws InterruptedException {

		settingTemplate.click();
		test.log(LogStatus.INFO, "Click on setting template");
		wait(3000);

		if (driver.getPageSource().contains("Yachna")) {
			existingTemplate.click();
			wait(5000);

			clickOnDeleteButton();
			clickOnYesButton();

		}

		addSettingTemplate.click();
		test.log(LogStatus.INFO, "Add setting template");
		wait(2000);

		nameField.click();
		nameField.sendKeys("Yachna");

		moduleTypeId.click();
		wait(3000);
		moduleTypeId.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Select module type");
		wait(5000);

		addFields.click();
		test.log(LogStatus.INFO, "Add event fields in event template");
		wait(5000);

		checkBoxEvent.click();
		test.log(LogStatus.INFO, "select event field for template");
		wait(3000);

		smallSaveBtn.click();
		wait(2000);

		addIntegerValue.click();
		addIntegerValue.sendKeys("1");

		wait(2000);

		clickOnSaveButton();
		wait(2000);
		// read & update
		softassert.assertTrue(driver.getPageSource().contains("Yachna"));
		existingTemplate.click();
		wait(3000);
		editButton.click();
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(3000);
		clickOnUpdateButton();
		wait(5000);
		// delete template
		softassert.assertTrue(driver.getPageSource().contains("YachnaYachna"));
		updateExistingTemplate.click();
		wait(5000);
		clickOnDeleteButton();
		clickOnYesButton();

	}

	public void verifyModuleTemplate() throws InterruptedException {

		moduleTemplate.click();
		test.log(LogStatus.INFO, "Click on module template");
		wait(2000);

		if (driver.getPageSource().contains("Yachna")) {
			existingTemplate.click();
			wait(5000);

			clickOnDeleteButton();
			clickOnYesButton();

		}

		addModuleTemplate.click();
		test.log(LogStatus.INFO, "Add module template");
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");

		moduleTypeId.click();
		wait(3000);
		moduleTypeId.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Select module type");
		wait(5000);

		moduleSubType.click();
		moduleSubType.sendKeys("Temp");
		wait(5000);

		selectEvntTemplate.click();
		test.log(LogStatus.INFO, "Select Event Template");
		wait(3000);
		selectEvntTemplate.sendKeys(Keys.ENTER);
		// if need to select other options so need to add arrow keys then enter key
		test.log(LogStatus.INFO, "Select existing event template");
		wait(3000);

		selectSettingTemplate.click();
		test.log(LogStatus.INFO, "Select Setting Template");
		wait(5000);

		selectSettingTemplate.sendKeys(Keys.ENTER);
		// if need to select other options so need to add arrow keys then enter key
		test.log(LogStatus.INFO, "Select Setting Template");
		wait(3000);

		clickOnSaveButton();

		// read & Update
		softassert.assertTrue(driver.getPageSource().contains("Yachna"));
		existingTemplate.click();
		wait(3000);
		editButton.click();
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(3000);
		clickOnUpdateButton();
		wait(3000);
		// delete template
		softassert.assertTrue(driver.getPageSource().contains("YachnaYachna"));
		// updated template click then delete operation
		updateExistingTemplate.click();
		wait(5000);
		clickOnDeleteButton();
		clickOnYesButton();

	}

	public void verifyDeviceTemplate() throws InterruptedException {

		wait(5000);
		deviceTemplate.click();
		test.log(LogStatus.INFO, "Click on Device Template");
		wait(5000);

		if (driver.getPageSource().contains("Yachna")) {
			existingTemplate.click();
			wait(5000);

			clickOnDeleteButton();
			clickOnYesButton();

		}

		wait(4000);
		addDeviceTemplate.click();
		test.log(LogStatus.INFO, "Add Device Template");
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(4000);

		moduleTypeSelect.click();
		wait(3000);
		moduleTypeSelect.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Select module type Door");
		wait(5000);

		moduleTemplateSelect.click();
		test.log(LogStatus.INFO, " Seclect Module Template for Device Template");
		wait(3000);

		moduleTemplateSelect.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Choose module for device template");
		wait(3000);

		clickOnSaveButton();

		// read & Update
		softassert.assertTrue(driver.getPageSource().contains("Yachna"));
		existingTemplate.click();
		wait(3000);
		editButton.click();
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(3000);
		clickOnUpdateButton();
		wait(3000);
		// delete template
		softassert.assertTrue(driver.getPageSource().contains("YachnaYachna"));
		// updated template click then delete operation
		updateExistingTemplate.click();
		wait(5000);
		clickOnDeleteButton();
		clickOnYesButton();

	}

	public void verifyNetworkField() throws InterruptedException {

		networkField.click();
		test.log(LogStatus.INFO, "click on network field");
		wait(3000);

		if (driver.getPageSource().contains("YachnaTest")) {
			newField.click();
			test.log(LogStatus.INFO, "Delete already exist network field with same name");
			wait(5000);
			clickOnDeleteButton();
			clickOnYesButton();

		}

		addNetworkField.click();
		test.log(LogStatus.INFO, "Add Network Field");
		wait(3000);

		fieldName.click();
		fieldName.sendKeys("New");
		test.log(LogStatus.INFO, "Enter Field Name");
		wait(3000);

		displayName.click();
		displayName.sendKeys("YachnaTest");
		test.log(LogStatus.INFO, "Enter Display Name");
		wait(3000);

		networkTemplateType.click();
		test.log(LogStatus.INFO, "Select Network Template Type");
		wait(3000);

		networkTemplateType.sendKeys(Keys.ENTER);
		// if need to choose cluster then one arrow down key then enter key
		test.log(LogStatus.INFO, "Choose panel network template type");
		wait(3000);

		fieldType.click();
		test.log(LogStatus.INFO, "Choose Network Field Type");
		wait(3000);

		fieldType.sendKeys(Keys.ENTER);
		// if need to choose Write then one arrow down key then enter key
		test.log(LogStatus.INFO, " Read Network field Type");
		wait(2000);

		dataTypeList.click();
		test.log(LogStatus.INFO, "Select data type");
		wait(3000);

		dataTypeList.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Choose boolean Data type");
		wait(3000);

		clickOnSaveButton();

		// read & update
		softassert.assertTrue(driver.getPageSource().contains("YachnaTest"));
		newField.click();
		wait(3000);
		editButton.click();
		wait(3000);

		fieldName.click();
		fieldName.sendKeys("New");
		wait(3000);
		clickOnUpdateButton();
		wait(3000);

		// delete event field

		softassert.assertTrue(driver.getPageSource().contains("NewNew"));

		newField.click();
		wait(5000);

		clickOnDeleteButton();
		clickOnYesButton();

	}

	public void verifyPanelTemplate() throws InterruptedException {

		panelTemplate.click();
		test.log(LogStatus.INFO, "Click on panel template");
		wait(3000);

		if (driver.getPageSource().contains("Yachna")) {
			existingTemplate.click();
			wait(5000);

			clickOnDeleteButton();
			clickOnYesButton();

		}

		addPanelTemplate.click();
		test.log(LogStatus.INFO, "Add panel template");
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(3000);

		addFields.click();
		test.log(LogStatus.INFO, "Add new Fields");
		wait(3000);

		chooseNetwrkField.click();
		test.log(LogStatus.INFO, "choose network field for panel template");
		wait(3000);

		smallSaveBtn.click();
		test.log(LogStatus.INFO, "Click on save button");
		wait(3000);

		selectNtwrkField.click();
		test.log(LogStatus.INFO, "select network field");
		wait(3000);

		selectNtwrkField.sendKeys(Keys.ENTER);
		// if need to select OFFLINE mode then need to add arrow key and then enter key
		// onlineMode.click();
		test.log(LogStatus.INFO, "Choose Online mode");
		wait(3000);

		clickOnSaveButton();

		// read & Update
		softassert.assertTrue(driver.getPageSource().contains("Yachna"));
		existingTemplate.click();
		wait(3000);
		editButton.click();
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(3000);
		clickOnUpdateButton();
		wait(3000);
		// delete template
		softassert.assertTrue(driver.getPageSource().contains("YachnaYachna"));
		// updated template click then delete operation
		updateExistingTemplate.click();
		wait(5000);
		clickOnDeleteButton();
		clickOnYesButton();

	}

	public void verifyClusterTemplate() throws InterruptedException {

		clusterTemplate.click();
		test.log(LogStatus.INFO, "Click on cluster template");
		wait(3000);

		if (driver.getPageSource().contains("Yachna")) {
			existingTemplate.click();
			wait(5000);

			clickOnDeleteButton();
			clickOnYesButton();

		}

		addClusterTemplate.click();
		test.log(LogStatus.INFO, "Click on add cluster");
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(3000);

		addFields.click();
		test.log(LogStatus.INFO, "Add new Fields");
		wait(3000);

		chooseNetwrkField.click();
		test.log(LogStatus.INFO, "choose network field for panel template");
		wait(3000);

		smallSaveBtn.click();
		test.log(LogStatus.INFO, "Click on save button");
		wait(3000);

		selectNtwrkField.click();
		test.log(LogStatus.INFO, "select network field");
		wait(3000);

		selectNtwrkField.sendKeys(Keys.ENTER);
		// if need to select OFFLINE mode then need to add arrow key and then enter key
		test.log(LogStatus.INFO, "Choose Online mode");
		wait(3000);

		clickOnSaveButton();
		// read & Update
		softassert.assertTrue(driver.getPageSource().contains("Yachna"));
		existingTemplate.click();
		wait(3000);
		editButton.click();
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(3000);
		clickOnUpdateButton();
		wait(3000);
		// delete template
		softassert.assertTrue(driver.getPageSource().contains("YachnaYachna"));
		// updated template click then delete operation
		updateExistingTemplate.click();
		wait(5000);
		clickOnDeleteButton();
		clickOnYesButton();

	}

	public void verifyModuleType() throws InterruptedException {

		moduleTypes.click();
		test.log(LogStatus.INFO, "Click on module types");
		wait(3000);

		if (driver.getPageSource().contains("YachnaTest")) {
			existingModule.click();
			wait(5000);

			clickOnDeleteButton();
			clickOnYesButton();

		}

		addModuleType.click();
		test.log(LogStatus.INFO, "Add module type");
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(3000);

		displayName.click();
		displayName.sendKeys("YachnaTest");
		test.log(LogStatus.INFO, "Enter Display Name");
		wait(3000);

		moduleTypeNumber.click();
		moduleTypeNumber.sendKeys("20");
		test.log(LogStatus.INFO, "Module Type Number");
		wait(3000);

		clickOnSaveButton();
		wait(5000);
		// read & Update
		softassert.assertTrue(driver.getPageSource().contains("YachnaTest"));
		existingModule.click();
		wait(3000);
		editButton.click();
		wait(3000);

		nameField.click();
		nameField.sendKeys("Yachna");
		wait(3000);
		clickOnUpdateButton();
		wait(3000);
		// delete template
		softassert.assertTrue(driver.getPageSource().contains("YachnaYachna"));
		// updated template click then delete operation
		existingModule.click();
		wait(5000);
		clickOnDeleteButton();
		clickOnYesButton();
		wait(5000);

	}

}