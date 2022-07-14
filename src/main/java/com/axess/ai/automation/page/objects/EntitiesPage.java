package com.axess.ai.automation.page.objects;

import org.openqa.selenium.Keys;
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
		test.log(LogStatus.INFO, "Click On Create Module Group");
		wait(4000);
		locationIdSelect.click();
		test.log(LogStatus.INFO, "Click on location ");
		wait(4000);
		actions.doubleClick(chooseIndia).perform();
		wait(4000);

		nameField.click();
		nameField.sendKeys("YachnaModule");
		test.log(LogStatus.INFO, "Add name of the module group");
		wait(3000);

		moduleTypeId.click();
		wait(5000);
		moduleTypeId.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Select module type ");
		wait(5000);

		moduleTemplateId.click();
		test.log(LogStatus.INFO, " Seclect Module Template for Device Template");
		wait(5000);

		moduleTemplateId.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Select Module Template ");
		wait(4000);

	}

	public void verifyEntityCreation() throws InterruptedException {

		wait(5000);
		deviceAndModule.click();
		test.log(LogStatus.INFO, " Click on Device and Module ");
		wait(5000);
		templateLink.click();
		test.log(LogStatus.INFO, "Click on Templates");
		wait(5000);

		// create event field
		eventField.click();
		test.log(LogStatus.INFO, "Click on Event Field");
		wait(5000);

		if (!driver.getPageSource().contains("YachnaTest")) {

			wait(5000);
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
			test.log(LogStatus.INFO, "Select module type");
			wait(2000);

			dataTypeList.click();
			wait(2000);
			dataTypeList.sendKeys(Keys.ENTER);
			//for selecting other data type look into the list and check the index along with that press arrow down key and then enter key
			test.log(LogStatus.INFO, " Select datatype Boolean");
			wait(3000);

			clickOnSaveButton();
			wait(5000);
		}
		// create event template

		eventTemplate.click();
		test.log(LogStatus.INFO, "Click on Event Template");
		wait(5000);

		if (!driver.getPageSource().contains("Yachna")) {

			addEventTemplate.click();
			test.log(LogStatus.INFO, "Add event template");
			wait(5000);

			nameField.click();
			nameField.sendKeys("Yachna");
			test.log(LogStatus.INFO, "Add name field");

			moduleTypeId.click();
			wait(5000);
			moduleTypeId.sendKeys(Keys.ENTER);
			test.log(LogStatus.INFO, "Select module type ");
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
			wait(5000);

		}
		// create setting field

		settingField.click();
		test.log(LogStatus.INFO, "Click on Setting field");
		wait(3000);

		if (!driver.getPageSource().contains("YachnaTest")) {

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
			//ambientModule.click();
			test.log(LogStatus.INFO, "Select module type");
			wait(2000);

			dataTypeList.click();
			wait(2000);
			dataTypeList.sendKeys(Keys.ENTER);
			test.log(LogStatus.INFO, " Select datatype Boolean");
			wait(3000);

			clickOnSaveButton();
			wait(5000);

		}

		// create setting template
		settingTemplate.click();
		test.log(LogStatus.INFO, "Click on setting template");
		wait(3000);

		if (!driver.getPageSource().contains("Yachna")) {

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

			clickOnSaveButton();
			wait(5000);

		}

		// create module template

		moduleTemplate.click();
		test.log(LogStatus.INFO, "Click on module template");
		wait(2000);

		if (!driver.getPageSource().contains("Yachna")) {

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

			//selectSettingTemplate.click();
			test.log(LogStatus.INFO, "Select Setting Template");
			wait(5000);

			//selectSettingTemplate.sendKeys(Keys.ENTER);
			// if need to select other options so need to add arrow keys then enter key
			test.log(LogStatus.INFO, "Select Setting Template");
			wait(3000);
			
			clickOnSaveButton();
			wait(5000);

		}

		// create device template
		wait(3000);
		deviceTemplate.click();
		test.log(LogStatus.INFO, "Click on Device Template");
		wait(5000);

		if (!driver.getPageSource().contains("Yachna")) {

			wait(5000);
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
			wait(5000);

		}

		// create network field
		networkField.click();
		test.log(LogStatus.INFO, "click on network field");
		wait(3000);

		if (!driver.getPageSource().contains("YachnaTest")) {

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
			wait(5000);

		}
		// create Panel template

		panelTemplate.click();
		test.log(LogStatus.INFO, "Click on panel template");
		wait(3000);

		if (!driver.getPageSource().contains("Yachna")) {

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
			test.log(LogStatus.INFO, "Choose Online mode");
			wait(3000);

			clickOnSaveButton();
			wait(5000);

		}

		// create cluster template

		clusterTemplate.click();
		test.log(LogStatus.INFO, "Click on cluster template");
		wait(3000);

		if (!driver.getPageSource().contains("Yachna")) {

			addClusterTemplate.click();
			test.log(LogStatus.INFO, "Click on add cluster");
			wait(3000);

			nameField.click();
			nameField.sendKeys("YachnaAutomation");
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

			// online
			selectNtwrkField.sendKeys(Keys.ENTER);
			test.log(LogStatus.INFO, "Choose Online mode");
			wait(3000);

			clickOnSaveButton();
			wait(5000);

		}

		// move to entities
		driver.navigate().back();
		wait(5000);
		entitiesLink.click();
		test.log(LogStatus.INFO, "Click on Entities");
		wait(5000);

		actions.moveToElement(networkingHardware).perform();
		wait(5000);
		cluster.click();
		test.log(LogStatus.INFO, "Click on Cluster");
		wait(5000);

		createCluster.click();
		test.log(LogStatus.INFO, "Create Cluster");
		wait(15000);

		locationIdSelect.click();
		wait(5000);
		chooseIndia.click();
		wait(5000);
		building.click();
		wait(5000);
		nameField.click();
		nameField.sendKeys("Yachna");
		wait(5000);
		selectTemplate.click();
		wait(5000);
		
		selectTemplate.sendKeys(Keys.ENTER);
		wait(3000);

		clickOnSaveButton();

		// Create Panel

		Panel.click();
		test.log(LogStatus.INFO, "Choose Panel");
		wait(5000);

		createPanel.click();
		wait(5000);
		locationIdSelect.click();
		wait(4000);
		chooseIndia.click();
		wait(5000);
		building.click();
		wait(5000);
		nameField.click();
		nameField.sendKeys("Yachna");
		wait(5000);

		clusterId.click();
		wait(5000);
		clusterId.sendKeys(Keys.ENTER);
		wait(5000);

		selectTemplate.click();
		wait(5000);
		selectTemplate.sendKeys(Keys.ENTER);
		wait(5000);

		clickOnSaveButton();
		wait(5000);

		// create Device
		device.click();
		wait(5000);

		createDevice.click();
		wait(5000);
		locationIdSelect.click();
		wait(4000);
		chooseIndia.click();
		wait(5000);
		building.click();
		wait(5000);
		nameField.click();
		nameField.sendKeys("Yachna");
		wait(5000);

		clusterId.click();
		wait(5000);
		clusterId.sendKeys(Keys.ENTER);
		wait(5000);

		panelId.click();
		wait(5000);
		panelId.sendKeys(Keys.ENTER);
		wait(5000);

		deviceTemplateId.click();
		wait(5000);
		deviceTemplateId.sendKeys(Keys.ENTER);
		existingTemplate.click();
		wait(5000);

		clickOnSaveButton();
		wait(4000);

		// Create Module Group

	}

}
