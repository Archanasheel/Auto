package com.axess.ai.automation.page.objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class SystemUsersPage extends TestBase {

	SoftAssert softAssert = new SoftAssert();

	public SystemUsersPage() {

		PageFactory.initElements(driver, this);

	}

	public void verifyClickOnSystemUserModule() throws Throwable {

		systemUserLink.click();
		test.log(LogStatus.INFO, " Click on System Users ");
		wait(1000);
	}

	public void verifyPageHeading() throws InterruptedException {

		String actualHeadingText = pageHeading.getText();
		String expectedHeadingText = "System Users";
		test.log(LogStatus.INFO, "Page heading ");
		wait(1000);
		Assert.assertEquals(actualHeadingText, expectedHeadingText);
	}

	public void verifyPageUrl() {

		String currentUrl = driver.getCurrentUrl();
		test.log(LogStatus.INFO, " Page Url comparison with actual and expected ");
		String expectedUrl = "https://app.dev.axess.ai/system-users";
		Assert.assertEquals(currentUrl, expectedUrl);

	}

	public void verifyAdministratorUsers() throws Throwable {

		adminUserLink.click();
		test.log(LogStatus.INFO, " Administrator Users ");
		wait(3000);
	}

	public void verifyAdminExistingUsers() throws Throwable {

		existingUserAdmin.click();
		test.log(LogStatus.INFO, "Click on existing system Admin Role");
		wait(5000);
		editButton.click();
		test.log(LogStatus.INFO, " Edit existing user");
		wait(5000);
		clickOnUpdateButton();
	}

	public void verifyInstallationUsers() throws Throwable {

		installationUserLink.click();
		test.log(LogStatus.INFO, " Installation User ");
		wait(5000);
	}

	public void verifyOragnizationUsers() throws Throwable {

		organizationUserLink.click();
		test.log(LogStatus.INFO, " Organization User");
		wait(5000);
	}

	public void verifyAllUsers() throws Throwable {

		allUserLink.click();
		test.log(LogStatus.INFO, " All users");
		wait(5000);
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("All Users");
		softAssert.assertTrue(verifyTitle);
	}

	public void verfiyManageRoles() throws Throwable {

		manageRoleLink.click();
		test.log(LogStatus.INFO, " Manage Role");
		wait(3000);
		String expectedUrl = "https://app.dev.axess.ai/user-roles";
		String currentUrl = driver.getCurrentUrl();
		softAssert.assertEquals(expectedUrl, currentUrl);
		driver.navigate().back();
		test.log(LogStatus.INFO, "Navigate back to system user page ");
		wait(3000);
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("User Roles");
		softAssert.assertTrue(verifyTitle);

	}

	public void verifyNewUserCrud() throws Throwable {

		systemUserLink.click();
		test.log(LogStatus.INFO, "Click on System Users Page");
		wait(5000);
		allUserLink.click();
		wait(5000);

		if (driver.getPageSource().contains("Yachna") == true) {

			existingUser.click();
			wait(5000);
			clickOnDeleteButton();
			clickOnYesButton();

		}

		addUsersLink.click();
		test.log(LogStatus.INFO, " Add Users");
		wait(2000);

		String name = "Yachna";
		nameField.sendKeys(name);
		test.log(LogStatus.INFO, " Enter Name");
		wait(2000);

		String email = "yachna12@gmail.com";
		emailField.sendKeys(email);
		test.log(LogStatus.INFO, " Enter Email ");
		wait(2000);
		userType.click();
		test.log(LogStatus.INFO, " Enter UserType");
		wait(2000);
		userType.sendKeys(Keys.ENTER); // for choosing administrator user
		// if choose installation and organization then keys down then enter for
		// installation one down and for organization two down
		test.log(LogStatus.INFO, "Choose Admin Role");
		wait(3000);
		roleSelectDropDown.click();
		test.log(LogStatus.INFO, "Click on role dropdown");
		wait(2000);

		roleSelectDropDown.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Select a role");
		wait(2000);

		locationSelect.click();
		test.log(LogStatus.INFO, "Select location");
		wait(4000);

		iotechDesignslocation.click();
		test.log(LogStatus.INFO, "chooselocation");
		wait(2000);

		clickOnSaveButton();

		// Read and Update user

		driver.getPageSource().contains("Yachna");
		existingUser.click();
		test.log(LogStatus.INFO, "Click on existing user");
		wait(5000);

		editButton.click();
		nameField.sendKeys("New");
		test.log(LogStatus.INFO, "Update Name");
		wait(2000);

		clickOnUpdateButton();

		// Delete User

		if (driver.getPageSource().contains("YachnaNew") == true) {

			updatedUser.click();
			wait(2000);

			clickOnDeleteButton();
			clickOnYesButton();
		}

		boolean verifyUserDeleted = driver.getPageSource().contains("YachnaNew");
		softAssert.assertTrue(verifyUserDeleted);
	}

	public void verfiyAPIKeys() throws Throwable {

		apiKeyLink.click();
		test.log(LogStatus.INFO, " API Key ");
		wait(1000);
		String actualUrl = "https://app.dev.axess.ai/api-keys";
		String currentUrl = driver.getCurrentUrl();
		softAssert.assertEquals(actualUrl, currentUrl);
		driver.navigate().back();
		test.log(LogStatus.INFO, "Navigate Back to System Users Page");
		wait(1000);
	}

}
