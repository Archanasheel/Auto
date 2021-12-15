package com.axess.ai.automation.utilities;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase extends ListenersApp {

	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "password")
	public WebElement passwordField;

	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	public WebElement loginButton;

	@FindBy(xpath = "//h1[text()='Status']")
	public WebElement dashboardTitle;

	@FindBy(xpath = "//span[text()='Root']")
	public WebElement rootLocation;

	@FindBy(id = "System User")
	public WebElement systemUser;

	@FindBy(id = "Location")
	public WebElement location;

	@FindBy(id = "Devices and Modules")
	public WebElement deviceAndModule;

	@FindBy(id = "Rule Engine")
	public WebElement ruleEngine;

	@FindBy(id = "Access Control")
	public WebElement accessControl;

	@FindBy(id = "Map")
	public WebElement map;

	@FindBy(id = "Reports & Analytics")
	public WebElement reportsAnalytics;

	@FindBy(id = "Site Setting")
	public WebElement siteSetting;

	@FindBy(id = "Help & Feedback")
	public WebElement helpFeedback;

	@FindBy(xpath = "//header/div[2]/span[1]/span[1]")
	public WebElement logoutDropdown;

	@FindBy(xpath = "//li[contains(text(),'Logout')]")
	public WebElement logoutLink;

	@FindBy(xpath = "//h1[@id='header-heading']")
	public WebElement pageHeading;

	@FindBy(id = "System User")
	public WebElement systemUserLink;

	@FindBy(id = "manage-roles")
	public WebElement manageRoleLink;

	@FindBy(id = "add-users")
	public WebElement addUsersLink;

	@FindBy(id = "api-key")
	public WebElement apiKeyLink;

	@FindBy(id = "Administrator Users")
	public WebElement adminUserLink;

	@FindBy(id = "Installation Users")
	public WebElement installationUserLink;

	@FindBy(id = "Organization Users")
	public WebElement organizationUserLink;

	@FindBy(id = "All Users")
	public WebElement allUserLink;

	@FindBy(id = "name")
	public WebElement nameField;

	@FindBy(id = "user_type")
	public WebElement userType;

	@FindBy(xpath = "//div[contains(text(),'Administrator')]")
	public WebElement adminRole;

	@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
	public WebElement locationSelect;

	@FindBy(xpath = "//span[@class='ant-select-tree-title']")
	public WebElement iotechDesignslocation;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement saveButton;

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	public WebElement cancelButton;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	public WebElement yesButton;

	@FindBy(xpath = "//a[contains(text(),'System users')]")
	public WebElement systemUserBreadCrumb;

	@FindBy(xpath = "//span[contains(text(),'Mehul')]")
	public WebElement userAdminRole;

	@FindBy(xpath = " //span[contains(text(),'Edit')]")
	public WebElement editButton;

	@FindBy(xpath = " //span[contains(text(),'Update')]")
	public WebElement updateButton;

	@FindBy(id = "manage-roles")
	public WebElement manageRole;

	@FindBy(xpath = "//button[@id='add-role']")
	public WebElement newRole;

	@FindBy(id = "description")
	public WebElement descriptionField;

	@FindBy(id = "Administrator Roles")
	public WebElement adminRolesLink;

	@FindBy(xpath = "//span[contains(text(),'System Admin Role')]")
	public WebElement systemAdminRole;

	@FindBy(id = "Installation Roles")
	public WebElement installationRolesLink;

	@FindBy(xpath = "//span[contains(text(),'Installation Admin Role')]")
	public WebElement installationRole;

	@FindBy(id = "Organization Roles")
	public WebElement organizationRolesLink;

	@FindBy(xpath = "//span[text()='Organization Admin Role']")
	public WebElement organizationRole;

	@FindBy(id = "All Roles")
	public WebElement allRolesLink;
	
	@FindBy(xpath="//span[contains(text(),'xyz')]")
	public WebElement existingRole;
	
	@FindBy(xpath="//span[contains(text(),'xyzNew')]")
	public WebElement updatedRole;

	@FindBy(xpath = "//span[@class='anticon anticon-close ant-modal-close-icon']")
	public WebElement crossBtn;

	@FindBy(id = "Location")
	public WebElement locationLink;

	@FindBy(xpath = "//span[text()='Root']")
	public WebElement rootTab;

	@FindBy(xpath = "//span[text()='TEST FOR ZONE AKSHAY 1213']")
	public WebElement zoneTab;

	@FindBy(xpath = "//span[text()='SOUTH ZONE ']")
	public WebElement subZoneTab;

	@FindBy(id = "roleId")
	public WebElement roleSelectDropDown;

	@FindBy(xpath = "//div[contains(text(),'System Admin Role')]")
	public WebElement chooseRole;

	@FindBy(xpath = "//span[contains(text(),'xyz')]")
	public WebElement existingUser;
	
	@FindBy(xpath = "//span[contains(text(),'xyzNew')]")
	public WebElement updatedUser;

	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	public WebElement deleteButton;

	@FindBy(id = "roleType")
	public WebElement roleType;

	@FindBy(id = "permissionIdList")
	public WebElement permissionList;

	@FindBy(xpath = "//div[contains(text(),'Manage Administrator Users')]")
	public WebElement manageAdministratorUser;

	@FindBy(xpath = " //div[contains(text(),'Manage Administrator Roles')]")
	public WebElement manageAdminRoles;

	@FindBy(xpath = "//a[contains(text(),'Manage Roles')]")
	public WebElement manageRolesBreadcrumb;

	@FindBy(xpath = "//div[contains(text(),'Filter')]")
	public WebElement roleFilter;

	@FindBy(id = "template")
	public WebElement templateLink;

	@FindBy(id = "entities")
	public WebElement entitiesLink;

	@FindBy(id = "launchpad")
	public WebElement launchpadLink;

	@FindBy(xpath = "//span[contains(text(),'NORTH ZONE')]")
	public WebElement subZonelink;

	@FindBy(xpath = "(//span[text()=\"GURGAON\"])[2]")
	public WebElement ggnSelect;

	@FindBy(xpath = "//span[@class='ant-tree-switcher ant-tree-switcher_close']")
	public static WebElement expandBtn;

	@FindBy(xpath = "(//span[@class='ant-tree-switcher ant-tree-switcher_close'])[1]")
	public WebElement expandBtn1;

	@FindBy(xpath = "(//span[@class='ant-typography hierarchy-text'])[3]")
	public WebElement deviceClick;

	@FindBy(xpath = "//span[@class='anticon anticon-eye']")
	public WebElement eyeIcon;

	@FindBy(xpath = "//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement moduleViewEvent;

	@FindBy(xpath = "//span[@class='ant-select-tree-switcher ant-select-tree-switcher_close']")
	public WebElement arrowDown;

	@FindBy(xpath = "//span[@class='ant-select-tree-checkbox-inner']")
	public WebElement checkBox;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/button[1]")
	public WebElement viewDeviceEventsBtn;

	@FindBy(xpath = "//span[contains(text(),'Event Field')]")
	public WebElement eventField;

	@FindBy(xpath = "//div[contains(text(),'Add Event Field')]")
	public WebElement addEventField;

	@FindBy(id = "fieldName")
	public WebElement fieldName;

	@FindBy(id = "displayName")
	public WebElement displayName;

	@FindBy(id = "moduleTypeId")
	public WebElement moduleTypeId;

	@FindBy(xpath = "//div[contains(text(),'DOOR')]")
	public WebElement doorModule;

	@FindBy(id = "dataType")
	public WebElement dataTypeList;

	@FindBy(xpath = "//div[contains(text(),'Boolean')]")
	public WebElement booleanDataType;

	@FindBy(xpath = "//span[contains(text(),'YachnaTest')]")
	public WebElement newField;

	@FindBy(xpath = "//span[contains(text(),'NewNew')]")
	public WebElement updatedField;

	@FindBy(xpath = "//span[text()='Event Template']")
	public WebElement eventTemplate;

	@FindBy(xpath = "//div[contains(text(),'Add Event Template')]")
	public WebElement addEventTemplate;

	@FindBy(xpath = "//span[contains(text(),'Add Fields')]")
	public WebElement addFields;

	@FindBy(xpath = "(//span[@class=\"ant-select-selection-search\"])[1]")
	public WebElement dataTypeFilter;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]/input[1]")
	public WebElement singleSelectList;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]/input[1]")
	public WebElement eventCheckBox;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/label[1]/span[1]/input[1]")
	public WebElement requiredCheckBox;

	@FindBy(xpath = "//span[contains(text(),'Yachna')]")
	public WebElement existingTemplate;

	@FindBy(xpath = "//span[contains(text(),'YachnaTest')]")
	public WebElement existingModule;

	@FindBy(xpath = "//span[contains(text(),'YachnaYachna')]")
	public WebElement updateExistingTemplate;

	@FindBy(xpath = "//span[contains(text(),'Setting Field')]")
	public WebElement settingField;

	@FindBy(xpath = "//div[contains(text(),'Add Setting Field')]")
	public WebElement addSettingField;

	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary ant-btn-block'])[2]")
	public WebElement smallSaveBtn;

	@FindBy(xpath = "//span[text()='Setting Template']")
	public WebElement settingTemplate;

	@FindBy(xpath = "//div[contains(text(),'Add Setting Template')]")
	public WebElement addSettingTemplate;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/span[1]")
	public WebElement selectDefaultValue;

	@FindBy(xpath = "(//div[text()='TRUE'])[2]")
	public WebElement chooseTrue;

	@FindBy(xpath = "//span[contains(text(),'Module Template')]")
	public WebElement moduleTemplate;

	@FindBy(xpath = "//div[contains(text(),'Add Module Template')]")
	public WebElement addModuleTemplate;

	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	public WebElement selectEvntTemplate;

	@FindBy(xpath = "(//span[@class='ant-select-selection-search'])[3]")
	public WebElement selectSettingTemplate;

	@FindBy(xpath = "//div[contains(text(),'Event Template Door')]")
	public WebElement selectEventTemplateDoor;

	@FindBy(xpath = "//div[contains(text(),'SETTING TEMPLATE DOOR')]")
	public WebElement selectSettingTemplateDoor;

	@FindBy(xpath = "//span[contains(text(),'Device Template')]")
	public WebElement deviceTemplate;

	@FindBy(xpath = "//div[contains(text(),'Add Device Template')]")
	public WebElement addDeviceTemplate;

	@FindBy(id = "moduleTemplates_0_moduleTemplate")
	public WebElement moduleTemplateSelect;

	@FindBy(xpath = "//div[contains(text(),'MODULE _DOOR')]")
	public WebElement moduleDoorSelect;

	@FindBy(id = "moduleTemplates_0_moduleType")
	public WebElement moduleTypeSelect;

	@FindBy(id = "moduleSubType")
	public WebElement moduleSubType;

	@FindBy(xpath = "//span[contains(text(),'Network Field')]")
	public WebElement networkField;

	@FindBy(xpath = "//div[contains(text(),'Add Network Field')]")
	public WebElement addNetworkField;

	@FindBy(id = "networkTemplateType")
	public WebElement networkTemplateType;

	@FindBy(xpath = "//div[contains(text(),'Panel')]")
	public WebElement panelNetworkTemplate;

	@FindBy(id = "fieldType")
	public WebElement fieldType;

	@FindBy(xpath = "//div[contains(text(),'Read')]")
	public WebElement readFieldType;

	@FindBy(xpath = "//span[contains(text(),'Panel Template')]")
	public WebElement panelTemplate;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-text ant-btn-sm header-button']")
	public WebElement addPanelTemplate;

	@FindBy(xpath = "//tbody/tr[3]/td[1]/label[1]/span[1]/input[1]")
	public WebElement chooseNetwrkField;

	@FindBy(xpath = "//tbody/tr[2]/td[4]/div[1]/div[1]")
	public WebElement selectNtwrkField;

	@FindBy(xpath = "(//div[text()='Online'])[2]")
	public WebElement chooseOnlineMode;

	@FindBy(xpath = "//span[contains(text(),'Cluster Template')]")
	public WebElement clusterTemplate;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-text ant-btn-sm header-button']")
	public WebElement addClusterTemplate;

	@FindBy(xpath = "//strong[contains(text(),'Module Types')]")
	public WebElement moduleTypes;

	@FindBy(xpath = "//div[contains(text(),'Add Module Type')]")
	public WebElement addModuleType;

	@FindBy(id = "moduleTypeNumber")
	public WebElement moduleTypeNumber;
	
	@FindBy(id = "Module Groups")
	public WebElement moduleGroups;
	
	@FindBy(xpath="//div[contains(text(),'Create Module Group')]")
	public WebElement createModuleGroup;
	
	@FindBy(id= "locationId")
	public WebElement locationId;
	
	@FindBy(xpath = "//li[text()='India']")
	public WebElement chooseIndia;
	
	@FindBy(id= "moduleTemplateId")
	public WebElement moduleTemplateId;
	
	@FindBy(xpath = "//div[contains(text(),'AutomationScripts')]")
	public WebElement selectModuleTemplate;
	
	
	

	public void clickOnSaveButton() throws InterruptedException {

		saveButton.click();
		test.log(LogStatus.INFO, " Click on Save Button");
		wait(3000);

	}

	public void clickOnUpdateButton() throws InterruptedException {

		updateButton.click();
		test.log(LogStatus.INFO, " Update existing user");
		wait(5000);
	}

	public void clickOnDeleteButton() throws InterruptedException {

		deleteButton.click();
		test.log(LogStatus.INFO, "Click on Delete Button");
		wait(5000);
	}

	public void clickOnCancelButton() throws InterruptedException {

		cancelButton.click();
		test.log(LogStatus.INFO, " Click on Cancel Button");
		wait(5000);

	}

	public void clickOnYesButton() throws InterruptedException {

		yesButton.click();
		test.log(LogStatus.INFO, " Click on Yes Button ");
		wait(3000);

	}

	public void scrollScreen() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
}
