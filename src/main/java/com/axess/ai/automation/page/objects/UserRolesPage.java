package com.axess.ai.automation.page.objects;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class UserRolesPage extends TestBase {
	
	SoftAssert softassert = new SoftAssert();
	
	public UserRolesPage() {
		
		PageFactory.initElements(driver , this);
		}
	
	public void verfiyManageRoles() throws Throwable {
		
		systemUser.click();
		test.log(LogStatus.INFO, "Click on SystemUserModule");
		wait(4000);
		manageRole.click();
		test.log(LogStatus.INFO, "Manage Role");
		wait(5000);
	}
		
	public void verifyCreateAndDeleteRole() throws InterruptedException {
		    	
		allRolesLink.click();
		test.log(LogStatus.INFO, "Click on All Roles");
		wait(5000);
		
		if (driver.getPageSource().contains("xyz")) {
			existingRole.click();
			wait(5000);
			clickOnDeleteButton();
			clickOnYesButton();

		}
	
		newRole.click();
		test.log(LogStatus.INFO,"Add new Role");
		wait(3000);
		
		String name = "xyz"; 
		nameField.sendKeys(name);
		test.log(LogStatus.INFO, " Enter Name");
		wait(3000);
		
		String Description ="Automation Testing";
		descriptionField.sendKeys(Description);
		wait(3000);
		
		roleType.click();
		test.log(LogStatus.INFO, "Click on Role Type");
		wait(3000);
		
		adminRole.click();
		test.log(LogStatus.INFO,"Choose Admin Role");
		wait(3000);
		
		permissionList.click();
		test.log(LogStatus.INFO,"Click On Permission List");
		wait(3000);
		
		manageAdministratorUser.click();
		test.log(LogStatus.INFO, "Choose Administrator User");
		wait(3000);
		
		manageAdminRoles.click();
		test.log(LogStatus.INFO,"Choose Manage Admin Roles");
		wait(3000);
		
		clickOnSaveButton();
		//read and update
		scrollScreen();
		driver.getPageSource().contains("xyz");
		existingRole.click();
		wait(5000);
		editButton.click();
		wait(3000);
		descriptionField.sendKeys("New");
		wait(3000);
		clickOnUpdateButton();
			
		//Delete role
	
    	updatedRole.click();
		wait(3000);
		
		clickOnDeleteButton();
		clickOnYesButton();
		
		boolean pageSource = driver.getPageSource().contains("xyz");
		softassert.assertTrue(pageSource);

	
	}
	  public void verifyPageHeading() throws InterruptedException {
	    	
	    	String actualHeadingText = pageHeading.getText();
			String expectedHeadingText = "User Roles";
			test.log(LogStatus.INFO, "Page heading ");
			wait(1000);
			Assert.assertEquals(actualHeadingText , expectedHeadingText);
	    }
	    
	    
	    public void verifyCurrentUrl() {
	    	
	    	String currentUrl = driver.getCurrentUrl();
	    	test.log(LogStatus.INFO, " Page Url comparison with actual and expected ");
			String expectedUrl ="https://app.dev.axess.ai/user-roles";
			Assert.assertEquals(currentUrl, expectedUrl);
		
	    }
	    
	    public void verifyRoles() throws Throwable {
	    	
	    	adminRolesLink.click();
	    	test.log(LogStatus.INFO, "Administrator Roles");
	    	wait(1000);
	    	systemAdminRole.click();
	    	test.log(LogStatus.INFO," System Admin Role");
	    	wait(2000);
	    	crossBtn.click();
	    	wait(1000);
	    	
	    	installationRolesLink.click();
	    	test.log(LogStatus.INFO, "Installation Roles");
	    	wait(1000);
	    	installationRole.click();
	    	test.log(LogStatus.INFO,"Installation Admin Role");
	    	wait(1000);
	    	crossBtn.click();
	    	wait(1000);
	    	
	    	organizationRolesLink.click();
	    	test.log(LogStatus.INFO, "Organization Roles");
	    	wait(1000);
	    	organizationRole.click();
	    	test.log(LogStatus.INFO," Organization Roles");
	    	wait(1000);
	    	crossBtn.click();
	    	wait(1000);
	    	
	    	allRolesLink.click();
	    	test.log(LogStatus.INFO, "All Roles");
	    	wait(1000);
	    	
	    	roleFilter.click();
	    	test.log(LogStatus.INFO, "Click on Filter for filtering roles either Administrator,Installation,Orgranisation");
	    	wait(1000);
	    	
	    	manageRolesBreadcrumb.click();
	    	wait(1000);
	    
	    }
	    
	  
	

}
