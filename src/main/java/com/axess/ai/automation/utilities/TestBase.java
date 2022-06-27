package com.axess.ai.automation.utilities;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "//span[contains(text(),'Root')]")
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

	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-link'])[1]")
	public WebElement existingUserAdmin;

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
	
	@FindBy(xpath="//span[contains(text(),'Yachna')]")
	public WebElement existingRole;
	
	@FindBy(xpath="(//input[@class=\"ant-checkbox-input\"])[1]")
	public WebElement adminRoleFilter;

	@FindBy(xpath = "//span[@class='anticon anticon-close ant-modal-close-icon']")
	public WebElement crossBtn;

	@FindBy(xpath="(//span[@class=\"anticon anticon-close\"])[3]")
	public WebElement crossButton;
	
	@FindBy(id = "Location")
	public WebElement locationLink;

	@FindBy(xpath = "//span[text()='Root']")
	public WebElement rootTab;

	@FindBy(xpath="(//input[@class=\"ant-checkbox-input\"])[2]")
	public WebElement inputCheckBox;
	
	@FindBy(id = "roleId")
	public WebElement roleSelectDropDown;

	@FindBy(xpath = "//span[contains(text(),'Yachna')]")
	public WebElement existingUser;
	
	@FindBy(xpath = "//span[contains(text(),'YachnaNew')]")
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

	@FindBy(id = "dataType")
	public WebElement dataTypeList;

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
	
	@FindBy(xpath="(//span[@class=\"ant-checkbox\"])[3]")
	public WebElement checkBoxEvent;

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
	
	@FindBy(xpath="//input[@class=\"ant-input-number-input\"]")
	public WebElement addIntegerValue;

	@FindBy(xpath = "//span[contains(text(),'Module Template')]")
	public WebElement moduleTemplate;

	@FindBy(xpath = "//div[contains(text(),'Add Module Template')]")
	public WebElement addModuleTemplate;

	@FindBy(id = "event_template")
	public WebElement selectEvntTemplate;
	
	@FindBy(id = "setting_template")
	public WebElement selectSettingTemplate;
	
	@FindBy(xpath = "//div[contains(text(),'Yachna')]")
	public WebElement selectEventTemplateAmbient;

	@FindBy(xpath = "(//div[text()='Yachna'])[2]")
	public WebElement selectSettingTemplateAmbient;

	@FindBy(xpath = "//span[contains(text(),'Device Template')]")
	public WebElement deviceTemplate;

	@FindBy(xpath = "//div[contains(text(),'Add Device Template')]")
	public WebElement addDeviceTemplate;

	@FindBy(id = "moduleTemplates_0_moduleTemplate")
	public WebElement moduleTemplateSelect;

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

	@FindBy(id = "fieldType")
	public WebElement fieldType;

	@FindBy(xpath = "//span[contains(text(),'Panel Template')]")
	public WebElement panelTemplate;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-text ant-btn-sm header-button']")
	public WebElement addPanelTemplate;

	@FindBy(xpath = "//tbody/tr[3]/td[1]/label[1]/span[1]/input[1]")
	public WebElement chooseNetwrkField;

	@FindBy(id = "dynamic_single_select_list")
	public WebElement selectNtwrkField;
	
	@FindBy(xpath="(//div[contains(text(),'Online')])[2]")
	public WebElement onlineMode;

	@FindBy(xpath = "//span[contains(text(),'Cluster Template')]")
	public WebElement clusterTemplate;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-text ant-btn-sm header-button']")
	public WebElement addClusterTemplate;

	@FindBy(xpath = "//strong[contains(text(),'Module Types')]")
	public WebElement moduleTypes;

	@FindBy(xpath = "//div[contains(text(),'Add Module Type')]")
	public WebElement addModuleType;

	@FindBy(xpath="//div[contains(text(),'STEADY HIGH')]")
	public WebElement SteadyHigh;
	
	@FindBy(id = "moduleTypeNumber")
	public WebElement moduleTypeNumber;
	
	@FindBy(id = "Module Groups")
	public WebElement moduleGroups;
	
	@FindBy(xpath="//div[contains(text(),'Create Module Group')]")
	public WebElement createModuleGroup;
	
	@FindBy(xpath= "//span[@class='ant-cascader-picker-label']")
	public WebElement locationIdSelect;
	
	@FindBy(xpath = "//li[text()='INDIA']")
	public WebElement chooseIndia;
	
	@FindBy(id= "moduleTemplateId")
	public WebElement moduleTemplateId;
	
	@FindBy(xpath ="//div[contains(text(),'AMBIENT')]")
	public WebElement ambientModule;
	
	@FindBy(id="Networking Hardware")
	public WebElement networkingHardware;
	
	@FindBy(xpath = "//span[text()='Cluster']")
	public WebElement cluster;
	
	@FindBy(xpath ="//div[contains(text(),'Create Cluster')]")
	public WebElement createCluster;
	
	@FindBy(xpath = "//li[text()='TEST_BUILDING_098']")
	public WebElement building;
	
	@FindBy(xpath="//span[text()='Doors']")
	public WebElement doors;
	
	@FindBy(xpath="//span[@class='ant-tree-switcher ant-tree-switcher_close']")
	public WebElement switcherClose;
	
	@FindBy(xpath="(//span[@class='ant-tree-checkbox-inner'])[2]")
	public WebElement selectDoor;
	
	@FindBy(id ="networkTemplateId")
	public WebElement selectTemplate;
	
	@FindBy(xpath="(//span[text()='Panel'])[1]")
	public WebElement Panel;
	
	@FindBy(xpath ="//div[contains(text(),'Create Panel')]")
	public WebElement createPanel;
	
	@FindBy(id ="clusterId")
	public WebElement clusterId;
	
	@FindBy(id = "Device")
	public WebElement device;
	
	@FindBy(xpath ="//div[contains(text(),'Create Device')]")
	public WebElement createDevice;
	
	@FindBy(id = "panelId")
	public WebElement panelId;
	
	@FindBy(id = "deviceTemplateId")
	public WebElement deviceTemplateId;
	
	@FindBy(id = "Manage Holidays")
	public WebElement manageHolidays;
	
	@FindBy(xpath = "//span[contains(text(),'Holiday')]")
	public WebElement holiday;
	
	@FindBy(xpath ="//div[contains(text(),'Add Holiday')]")
	public WebElement addHoliday;
	
	@FindBy(id= "date")
	public WebElement date;
	
	@FindBy(xpath ="//span[text()='Holi']")
	public WebElement existingHoliday;
	
	@FindBy(xpath =" //span[contains(text(),'Set Global Holidays')]")
	public WebElement setGlobalHolidays;
	
	@FindBy(xpath ="//span[contains(text(),'Holiday Groups')]")
	public WebElement holidayGroups;
	
	@FindBy(xpath = "//div[contains(text(),'Add Group Holiday')]")
	public WebElement addGroupHoliday;
	
	@FindBy(id="holidayIdList")
	public WebElement holidayList;

	@FindBy(xpath = "//span[text()='Holidays_Group']")
	public WebElement existingHolidayGroup;
	
	@FindBy(xpath="//span[contains(text(),'Fixed_Holiday')]")
	public WebElement existingFixedHoliday;
	
	@FindBy(xpath="//span[contains(text(),'Fixed_HolidayUpdated')]")
	public WebElement existingUpdatedFixedHoliday;
	
	@FindBy(css=".ant-picker-cell.ant-picker-cell-in-view.ant-picker-cell-today")
	public WebElement todaysDate;
	
	@FindBy(id = "Schedule")
	public WebElement schedule;
	
	@FindBy(xpath = "//div[contains(text(),'Add Schedule')]")
	public WebElement addSchedule;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement activeCheckbox;
	
	@FindBy(xpath ="(//input[@type='checkbox'])[3]")
	public WebElement monCheckbox;
	
	@FindBy(xpath ="(//input[@type='checkbox'])[4]")
	public WebElement tuesCheckbox;
	
	@FindBy(xpath ="(//input[@type='checkbox'])[5]")
	public WebElement wedCheckbox;
	
	@FindBy(xpath ="(//input[@type='checkbox'])[6]")
	public WebElement thurCheckbox;
	
	@FindBy(xpath="//a[text()='Now']")
	public WebElement currentTime;
	
	@FindBy(xpath="(//a[text()='Now'])[2]")
	public WebElement currentTimeNow;
	
	@FindBy(xpath ="(//a[text()='Now'])[3]")
	public WebElement currentNow;
	
	@FindBy(xpath="(//a[text()='Now'])[4]")
	public WebElement current_Now;
	
	@FindBy(xpath="(//a[text()='Now'])[5]")
	public WebElement currentTempNow;
	
	@FindBy(xpath="//a[text()='Now'])[6]")
	public WebElement currentTempEndNow;
	
	@FindBy(id = "intervalCOList_0_startMinutesSinceMidnight")
	public WebElement scheduleStartTime;
	
	@FindBy(id ="intervalCOList_0_endMinutesSinceMidnight")
	public WebElement scheduleEndTime;
	
	@FindBy(xpath ="//span[contains(text(),'Automation Schedule')]")
	public WebElement existingSchedule;
	
	@FindBy(id ="Access Level")
	public WebElement accessLevel;
	
	@FindBy(xpath="//div[text()='Add Access Level']")
	public WebElement addAccessLevel;
	
	@FindBy(id="scheduleId")
	public WebElement scheduleId;
	
	@FindBy(xpath="//div[text()='WEEKDAY_SCHEDULE']")
	public WebElement chooseSchedule;
	
	@FindBy(xpath ="//span[text()='Door Groups']")
	public WebElement doorGroups;
	
	@FindBy(xpath ="(//input[@class=\"ant-checkbox-input\"])[2]")
	public WebElement selectDoorGroup;
	
	@FindBy(xpath="//span[text()='Automation_Access_Level']")
	public WebElement existingAccessLevel;
	
	@FindBy(id="grantAccessOnHoliday")
	public WebElement grantAccessOnHoliday;
	
	@FindBy(id="User")
	public WebElement user;
	
	@FindBy(xpath = "//span[contains(text(),'Accessor')]")
	public WebElement accessor;
	
	@FindBy(xpath="//div[contains(text(),'Add Accessor')]")
	public WebElement addAccessor;
	
	@FindBy(id="uid")
	public WebElement uniqueId;
	
	
	@FindBy(id="holidayGroupIdList")
	public WebElement holidayGroupIdList;
	
	@FindBy(id ="accessLevelIds")
	public WebElement accessLevelIds;
	
	@FindBy(id="department")
	public WebElement department;
	
	@FindBy(id="accessMediumDetails_0_active")
	public WebElement accessMediumActive;
	
	@FindBy(id="accessMediumDetails_0_name")
	public WebElement accessMediumName;
	
	@FindBy(id="accessMediumDetails_0_validFrom")
	public WebElement accessMediumValidFrom;
	
	@FindBy(id="accessMediumDetails_0_expiryDate")
	public WebElement accessMediumValidTill;
	
	@FindBy(id="accessMediumDetails_0_accessMediumType")
	public WebElement accessMediumType;
	
	@FindBy(xpath ="//div[contains(text(),'Card')]")
	public WebElement cardAccessMedium;
	
	@FindBy(id="accessMediumDetails_0_accessMediumNumber")
	public WebElement cardNumber;
	
	@FindBy(id="accessMediumDetails_0_facilityCode")
	public WebElement facilityCode;
	
	@FindBy(xpath ="//span[contains(text(),'Accessor_Automation')]")
	public WebElement existingAccessor;
	
	@FindBy(id="active")
	public WebElement enabledButton;
	
	
	@FindBy(xpath="//span[text()='Visitor']")
	public WebElement visitor;
	
	@FindBy(xpath="//div[contains(text(),'Add Visitor')]")
	public WebElement addVisitor;
	
	@FindBy(id="visitingFromTime")
	public WebElement visitingTime;
	
	@FindBy(id="visitingTillTime")
	public WebElement visitingTillTime;
	
	@FindBy(id="temporaryAccessCOList_0_active")
	public WebElement temporaryAccessMediumActive;
	
	@FindBy(id="temporaryAccessCOList_0_accessLevelId")
	public WebElement temporaryAccessLevel;
	
	@FindBy(id="temporaryAccessCOList_0_startDate")
	public WebElement temporaryAccessStartDate;
	
	@FindBy(id="temporaryAccessCOList_0_endDate")
	public WebElement temporaryAccessEndDate;
	
	@FindBy(xpath="//span[@class='ant-upload']")
	public WebElement uploadImage;
	
	@FindBy(xpath="(//span[text()='Yes'])[2]")
	public WebElement yesClick;
	
	@FindBy(xpath="//span[contains(text(),'Ok')]")
	public WebElement okButton;
	
	@FindBy(xpath="(//span[contains(text(),'Ok')])[2]")
	public WebElement ok2Button;
	
	@FindBy(xpath="//span[contains(text(),'Fixed Holiday')]")
	public WebElement fixedHoliday;
	
	@FindBy(xpath="//div[contains(text(),'Add Fixed Holiday')]")
	public WebElement addFixedHoliday;
	 
	
	
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

		wait(5000);
		yesButton.click();
		test.log(LogStatus.INFO, " Click on Yes Button ");
		wait(2000);

	}

	public void scrollScreen() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
	
	public void scrollModalScreen() {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);");
	}
}
