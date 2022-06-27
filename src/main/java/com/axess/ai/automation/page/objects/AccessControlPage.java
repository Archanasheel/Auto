package com.axess.ai.automation.page.objects;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class AccessControlPage extends TestBase {

	SoftAssert softassert = new SoftAssert();
	Actions actions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);

	public AccessControlPage() {

		PageFactory.initElements(driver, this);
	}

	public void verifyClickOnAccessControlModule() throws Throwable {

		accessControl.click();
		test.log(LogStatus.INFO, " Click on Access Control Module ");
		wait(2000);
	}

	public void verifyPageHeading() throws InterruptedException {

		String actualHeadingText = pageHeading.getText();
		String expectedHeadingText = "Access Control";
		test.log(LogStatus.INFO, "Page heading ");
		wait(2000);
		Assert.assertEquals(actualHeadingText, expectedHeadingText);

	}

	public void verifyPageUrl() throws InterruptedException {

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://app.dev.axess.ai/accessors";
		test.log(LogStatus.INFO, "Page url comparison with actual and expected result");
		wait(2000);
		Assert.assertEquals(currentUrl, expectedUrl);

	}

	public void verifyManageHolidays_Holiday() throws InterruptedException {

		wait(5000);
		actions.moveToElement(manageHolidays).perform();
		test.log(LogStatus.INFO, "Click on Manage Holidays");
		wait(7000);

		// create holiday

		holiday.click();
		test.log(LogStatus.INFO, "Click on Holiday");
		wait(5000);

		if (!driver.getPageSource().contains("Holi")) {

			addHoliday.click();
			test.log(LogStatus.INFO, "Add Holiday");
			wait(5000);

			nameField.click();
			nameField.sendKeys("Holi");
			test.log(LogStatus.INFO, "Name of the holiday");
			wait(5000);

			date.click();
			test.log(LogStatus.INFO, "Choose holiday date");
			wait(4000);

			todaysDate.click();
			wait(4000);
			clickOnSaveButton();
		}
		// read and Update holiday

		scrollScreen();

		driver.getPageSource().contains("Holi");
		wait(5000);
		existingHoliday.click();
		test.log(LogStatus.INFO, "Click on newly created Holiday");
		wait(5000);

		editButton.click();
		test.log(LogStatus.INFO, "Click on edit button");
		wait(5000);

		setGlobalHolidays.click();
		test.log(LogStatus.INFO, "Click on set global holidays");
		wait(5000);

		clickOnUpdateButton();

		// delete Holiday

		wait(4000);
		existingHoliday.click();
		test.log(LogStatus.INFO, "Delete holiday");
		wait(4000);
		clickOnDeleteButton();
		clickOnYesButton();

	}

	public void verifyManageHolidays_HolidayGroup() throws InterruptedException {

		wait(5000);
		actions.moveToElement(manageHolidays).perform();
		test.log(LogStatus.INFO, "Click on Manage Holidays");
		wait(7000);

		holidayGroups.click();
		test.log(LogStatus.INFO, "Click on Holiday Groups");
		wait(5000);

		if (driver.getPageSource().contains("Holidays_Group") == true) {
			wait(5000);
			existingHolidayGroup.click();
			test.log(LogStatus.INFO, "Click on Existing holiday for delete");
			wait(5000);

			clickOnDeleteButton();

			int xpathCount = driver.findElements(By.xpath("//span[text()='Yes']")).size();
			System.out.println(xpathCount);

			if (xpathCount == 1) {
				clickOnYesButton();
			} else {

				wait.until(ExpectedConditions.visibilityOf(yesClick));

				yesClick.click();
			}
		}
		addGroupHoliday.click();
		test.log(LogStatus.INFO, "Click on Add group Holiday");
		wait(4000);
		nameField.click();
		nameField.sendKeys("Holidays_Group");
		wait(4000);

		descriptionField.click();
		test.log(LogStatus.INFO, "Description field");
		descriptionField.sendKeys("December Holidays");
		wait(5000);

		holidayList.click();
		wait(5000);
		holidayList.sendKeys(Keys.ENTER);
		holidayList.sendKeys(Keys.ARROW_DOWN);
		holidayList.sendKeys(Keys.ENTER);

		wait(5000);
		clickOnSaveButton();

		// read and Update
		scrollScreen();

		existingHolidayGroup.click();
		test.log(LogStatus.INFO, "Click on Existing Holiday");
		wait(5000);

		editButton.click();
		wait(5000);
		clickOnUpdateButton();

		// delete Holiday Group

		scrollScreen();
		existingHolidayGroup.click();
		test.log(LogStatus.INFO, "Click on Existing holiday for delete");
		wait(5000);

		clickOnDeleteButton();

		int xpathCount = driver.findElements(By.xpath("//span[text()='Yes']")).size();
		System.out.println(xpathCount);

		if (xpathCount == 1) {
			clickOnYesButton();
		} else {

			wait.until(ExpectedConditions.visibilityOf(yesClick));
			yesClick.click();
		}
	}

	public void verfiyManageHolidays_FixedHoliday() throws InterruptedException {

		wait(5000);
		actions.moveToElement(manageHolidays).perform();
		test.log(LogStatus.INFO, "Click on Manage Holidays");
		wait(10000);

		fixedHoliday.click();
		test.log(LogStatus.INFO, "Click on Fixed holiday");
		wait(5000);

		if (!driver.getPageSource().contains("Fixed_Holiday")) {

			addFixedHoliday.click();
			test.log(LogStatus.INFO, "Click on add fixed holiday");
			wait(5000);

			nameField.click();
			nameField.sendKeys("Fixed_Holiday");
			wait(4000);

			locationIdSelect.click();
			test.log(LogStatus.INFO, "Click on location");
			wait(5000);

			chooseIndia.click();
			test.log(LogStatus.INFO, "Choose Location");
			wait(4000);
			building.click();
			wait(4000);
			holidayGroupIdList.click();
			test.log(LogStatus.INFO, "Click on holiday group list");
			wait(5000);
			holidayGroupIdList.sendKeys(Keys.ARROW_DOWN);
			holidayGroupIdList.sendKeys(Keys.ENTER);

			clickOnSaveButton();
		}
		// read and update
		scrollScreen();

		existingFixedHoliday.click();
		test.log(LogStatus.INFO, "Click on Existing Holiday");
		wait(5000);

		editButton.click();
		wait(5000);
		nameField.click();
		nameField.sendKeys("Updated");
		wait(5000);
		clickOnUpdateButton();

		// delete Holiday Group

		scrollScreen();
		existingUpdatedFixedHoliday.click();
		test.log(LogStatus.INFO, "Click on Existing holiday for delete");
		wait(5000);

		clickOnDeleteButton();

	}

	public void verifySchedule() throws InterruptedException {

		wait(5000);
		schedule.click();
		test.log(LogStatus.INFO, "Click on Schedule");
		wait(4000);

		if (driver.getPageSource().contains("Automation Schedule")) {

			existingSchedule.click();
			test.log(LogStatus.INFO, "Click on newly created schedule");
			wait(5000);
			clickOnDeleteButton();

			int xpathCount = driver.findElements(By.xpath("//span[text()='Yes']")).size();
			System.out.println(xpathCount);

			if (xpathCount == 1) {
				clickOnYesButton();
			} else {

				wait.until(ExpectedConditions.visibilityOf(yesClick));
				yesClick.click();
			}

		}

		addSchedule.click();
		test.log(LogStatus.INFO, "Add Schedule");
		wait(5000);
		nameField.click();
		nameField.sendKeys("Automation Schedule");
		wait(5000);
		descriptionField.click();
		descriptionField.sendKeys("Schedule Automation");
		wait(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", activeCheckbox);

		wait(5000);
		activeCheckbox.click();
		test.log(LogStatus.INFO, "Click on Active ");
		wait(5000);
		monCheckbox.click();
		test.log(LogStatus.INFO, "Monday Checkbox");
		wait(5000);
		tuesCheckbox.click();
		test.log(LogStatus.INFO, "Tuesday Checkbox");
		wait(5000);
		scheduleStartTime.click();
		wait(5000);
		currentTime.click();
		test.log(LogStatus.INFO, "Choose current time by clicking on Now");
		wait(70000);

		scheduleEndTime.click();
		wait(5000);
		currentTimeNow.click();
		test.log(LogStatus.INFO, "Choose current time by clicking on Now");
		wait(10000);

		clickOnSaveButton();

		// read and Update
		driver.getPageSource().contains("Automation Schedule");

		existingSchedule.click();
		test.log(LogStatus.INFO, "Click on newly created schedule");
		wait(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton);
		wait(5000);
		editButton.click();
		wait(5000);
		wedCheckbox.click();
		wait(5000);
		thurCheckbox.click();
		wait(5000);

		clickOnUpdateButton();

		// delete Schedule

		driver.getPageSource().contains("Automation Schedule");

		existingSchedule.click();
		test.log(LogStatus.INFO, "Click on newly created schedule");
		wait(5000);
		clickOnDeleteButton();

		int xpathCount = driver.findElements(By.xpath("//span[text()='Yes']")).size();
		System.out.println(xpathCount);

		if (xpathCount == 1) {
			clickOnYesButton();
		} else {

			wait.until(ExpectedConditions.visibilityOf(yesClick));
			yesClick.click();
		}

	}

	public void verfiyAccessLevel() throws InterruptedException {

		accessLevel.click();
		test.log(LogStatus.INFO, "Click on Access Level");
		wait(5000);

		if (driver.getPageSource().contains("Automation_Access_Level")) {

			existingAccessLevel.click();
			test.log(LogStatus.INFO, "Click on created access level");
			wait(5000);

			clickOnDeleteButton();

			int xpathCount = driver.findElements(By.xpath("//span[text()='Yes']")).size();
			System.out.println(xpathCount);

			if (xpathCount == 1) {
				clickOnYesButton();
			} else {

				wait.until(ExpectedConditions.visibilityOf(yesClick));
				yesClick.click();
			}
		}

		addAccessLevel.click();
		test.log(LogStatus.INFO, "Click on Add Access Level");
		wait(5000);

		locationIdSelect.click();
		test.log(LogStatus.INFO, "Click on location");
		wait(5000);

		chooseIndia.click();
		test.log(LogStatus.INFO, "Choose India location");
		wait(5000);

		building.click();
		wait(5000);

		nameField.click();
		nameField.sendKeys("Automation_Access_Level");
		wait(5000);

		scheduleId.click();
		test.log(LogStatus.INFO, "Click on Schedule");
		wait(5000);

		scheduleId.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Choose Schedule");
		wait(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", doors);
		doors.click();
		test.log(LogStatus.INFO, "Click on door");
		wait(5000);

		// doorGroups.click();
		// test.log(LogStatus.INFO, "Click on door groups");
		// wait(5000);

		switcherClose.click();
		test.log(LogStatus.INFO, "Switch to Building door");
		wait(5000);
		// selectDoorGroup.click();
		// test.log(LogStatus.INFO,"Select Door Group");
		// wait(5000);

		selectDoor.click();
		test.log(LogStatus.INFO, "Select a door");
		wait(3000);
		clickOnSaveButton();

		// read and update

		existingAccessLevel.click();
		test.log(LogStatus.INFO, "Click on created access level");
		wait(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton);

		editButton.click();
		wait(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", grantAccessOnHoliday);
		wait.until(ExpectedConditions.visibilityOf(grantAccessOnHoliday));

		grantAccessOnHoliday.click();
		wait(5000);

		clickOnUpdateButton();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");

		// delete access level

		existingAccessLevel.click();
		test.log(LogStatus.INFO, "Click on created access level");
		wait(5000);

		clickOnDeleteButton();

		int xpathCount = driver.findElements(By.xpath("//span[text()='Yes']")).size();
		System.out.println(xpathCount);

		if (xpathCount == 1) {
			clickOnYesButton();
		} else {
			wait.until(ExpectedConditions.visibilityOf(yesClick));
			yesClick.click();
		}

	}

	// create User = Accessor
	public void verifyUser_Accessor() throws InterruptedException, AWTException {

		wait(5000);
		actions.moveToElement(user).perform();
		test.log(LogStatus.INFO, "Mouse hover over user tab");
		wait(10000);

		accessor.click();
		test.log(LogStatus.INFO, "Click on Accessors");
		wait(5000);

		if (driver.getPageSource().contains("Accessor_Automation")) {

			wait(5000);
			existingAccessor.click();
			test.log(LogStatus.INFO, "Click on newly created Accessor");
			wait(10000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteButton);
			clickOnDeleteButton();
			wait(3000);

			int xpathCount = driver.findElements(By.xpath("//span[text()='Yes']")).size();
			System.out.println(xpathCount);

			if (xpathCount == 1) {
				clickOnYesButton();
			} else {

				wait.until(ExpectedConditions.visibilityOf(yesClick));
				yesClick.click();

			}

		}

		wait(5000);
		addAccessor.click();
		test.log(LogStatus.INFO, "Click on add accessors");
		wait(5000);

		uploadImage.click();
		wait(5000);

		// Image upload
		Robot robot = new Robot();

		StringSelection filePath = new StringSelection("C:\\Users\\yachna\\Downloads\\team.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		wait(3000);

		robot.keyPress(KeyEvent.VK_V);
		wait(2000);

		robot.keyRelease(KeyEvent.VK_V);
		wait(2000);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		wait(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		wait(2000);

		robot.keyRelease(KeyEvent.VK_ENTER);
		wait(2000);

		wait(10000);
		uniqueId.click();
		uniqueId.sendKeys("2710");
		test.log(LogStatus.INFO, "Enter the unique id ");
		wait(5000);

		nameField.click();
		nameField.sendKeys("Accessor_Automation");
		test.log(LogStatus.INFO, "Add Name");
		wait(5000);

		emailField.click();
		emailField.sendKeys("yachnas+12@iotech.biz");
		test.log(LogStatus.INFO, "Add value to email field");
		wait(5000);

		holidayGroupIdList.click();
		test.log(LogStatus.INFO, "Click on holiday group list");
		wait(5000);

		holidayGroupIdList.sendKeys(Keys.ARROW_DOWN);
		holidayGroupIdList.sendKeys(Keys.ARROW_DOWN);
		holidayGroupIdList.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Choose a holiday group ");
		wait(5000);

		accessLevelIds.click();
		test.log(LogStatus.INFO, "Click on access level list");
		wait(5000);

		accessLevelIds.sendKeys(Keys.ARROW_DOWN);
		accessLevelIds.sendKeys(Keys.ARROW_DOWN);
		accessLevelIds.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Choose one Access Level");
		wait(5000);

		department.click();
		department.sendKeys("Automation Testing");
		wait(5000);

		accessMediumActive.click();
		test.log(LogStatus.INFO, "Click on Access medium active tab");
		wait(5000);

		accessMediumName.click();
		accessMediumName.sendKeys("New_Automation_Accessor");
		test.log(LogStatus.INFO, "access medium name");
		wait(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accessMediumValidFrom);
		accessMediumValidFrom.click();
		test.log(LogStatus.INFO, "Click on access medium valid from");
		wait(10000);

		todaysDate.click();
		wait(3000);
		okButton.click();
		test.log(LogStatus.INFO, "Current Date and Time");
		wait(3000);

		accessMediumValidTill.click();
		test.log(LogStatus.INFO, "Click on access medium valid till");
		wait(5000);

		// while (!driver.findElement(By.cssSelector("[class='ant-picker-header-view']
		// [class='ant-picker-month-btn']"))
		// .getText().contains("April")) {

		// driver.findElement(By.xpath("//button[@class='ant-picker-header-next-btn']")).click();
		// }

		List<WebElement> dates = driver.findElements(By.cssSelector(".ant-picker-cell.ant-picker-cell-in-view"));

		// grab common attribute and put into the list and iterate

		int count = driver.findElements(By.cssSelector(".ant-picker-cell.ant-picker-cell-in-view")).size();

		for (int i = 0; i < count; i++) {

			String text = driver.findElements(By.cssSelector(".ant-picker-cell.ant-picker-cell-in-view")).get(i)
					.getText();

			if (text.equalsIgnoreCase("23")) {

				driver.findElements(By.cssSelector(".ant-picker-cell.ant-picker-cell-in-view")).get(i).click();
				break;
			}
		}

		if (driver.getPageSource().contains("Ok") == true) {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			ok2Button.click();
			test.log(LogStatus.INFO, "Select a New Date ");
			wait(5000);

		}
		
		accessMediumType.click();
		test.log(LogStatus.INFO, "Click on Access Medium list");
		wait(5000);

		accessMediumType.sendKeys(Keys.ARROW_DOWN);
		accessMediumType.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Click on Card access medium");
		wait(5000);

		cardNumber.click();
		cardNumber.sendKeys("271");
		test.log(LogStatus.INFO, "Enter card number");
		wait(5000);

		facilityCode.click();
		facilityCode.sendKeys("271");
		clickOnSaveButton();

		// read and update

		driver.getPageSource().contains("Accessor_Automation");

		wait(5000);
		existingAccessor.click();
		test.log(LogStatus.INFO, "Click on newly created  Accessor");
		wait(15000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton);
		wait(10000);
		editButton.click();
		test.log(LogStatus.INFO, "click on edit button");
		wait(15000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", enabledButton);

		enabledButton.click();
		test.log(LogStatus.INFO, "Click on enabled Button");
		wait(5000);

		clickOnUpdateButton();

		// delete accessor
		wait(10000);
		
		existingAccessor.click();
		test.log(LogStatus.INFO, "Click on newly created Accessor");
		wait(10000);
		clickOnDeleteButton();
		wait(5000);
		int xpathCount = driver.findElements(By.xpath("//span[text()='Yes']")).size();
		System.out.println(xpathCount);

		if (xpathCount == 1) {
			clickOnYesButton();
		} else {
			
			wait.until(ExpectedConditions.visibilityOf(yesClick));

			yesClick.click();

		}

	}

	public void verifyUser_Visitor() throws InterruptedException, AWTException {

		wait(5000);
		actions.moveToElement(user).perform();
		test.log(LogStatus.INFO, "Mouse hover over user tab");
		wait(5000);

		visitor.click();
		test.log(LogStatus.INFO, "Click on Visitor");
		wait(5000);
		if (driver.getPageSource().contains("Accessor_Automation")) {

			wait(5000);
			existingAccessor.click();
			test.log(LogStatus.INFO, "Click on newly created Accessor");
			wait(10000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteButton);
			clickOnDeleteButton();
			wait(3000);

			int xpathCount = driver.findElements(By.xpath("//span[text()='Yes']")).size();
			System.out.println(xpathCount);

			if (xpathCount == 1) {
				clickOnYesButton();
			} else {

				wait.until(ExpectedConditions.visibilityOf(yesClick));
				yesClick.click();

			}

		}
		addVisitor.click();
		test.log(LogStatus.INFO, "Click on Add Visitor");
		wait(5000);

		// upload image from local system
		uploadImage.click();
		wait(5000);

		Robot robot = new Robot();

		StringSelection filePath = new StringSelection("C:\\Users\\yachna\\Downloads\\team.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		wait(3000);

		robot.keyPress(KeyEvent.VK_V);
		wait(2000);

		robot.keyRelease(KeyEvent.VK_V);
		wait(2000);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		wait(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		wait(2000);

		robot.keyRelease(KeyEvent.VK_ENTER);
		wait(2000);
		wait(60000);
		nameField.click();
		nameField.sendKeys("Automation_Visitor");
		test.log(LogStatus.INFO, "Enter name");
		wait(5000);

		emailField.click();
		emailField.sendKeys("yachnas+12@iotech.biz");
		wait(5000);

		visitingTime.click();
		wait(5000);
		currentTime.click();
		test.log(LogStatus.INFO, "Choose current time by clicking on Now");
		wait(70000);

		visitingTillTime.click();
		test.log(LogStatus.INFO, "Click on access medium valid till time");
		wait(5000);

		currentTimeNow.click();
		test.log(LogStatus.INFO, "Click on Now ");
		wait(5000);

		accessMediumActive.click();
		test.log(LogStatus.INFO, "Click on Access medium active tab");
		wait(5000);

		accessMediumName.click();
		accessMediumName.sendKeys("New_Automation_Accessor");
		test.log(LogStatus.INFO, "access medium name");
		wait(5000);

		accessMediumValidFrom.click();
		test.log(LogStatus.INFO, "Click on access medium valid from");
		wait(15000);
		currentNow.click();
		test.log(LogStatus.INFO, "Choose current time by clicking on Now");
		wait(70000);

		accessMediumValidTill.click();
		test.log(LogStatus.INFO, "Click on access medium valid till");
		wait(5000);

		current_Now.click();
		test.log(LogStatus.INFO, "Click on Now ");
		wait(5000);

		accessMediumType.click();
		test.log(LogStatus.INFO, "Click on Access Medium list");
		wait(5000);

		accessMediumType.sendKeys(Keys.ARROW_DOWN);

		accessMediumType.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Click on Card access medium");
		wait(5000);

		cardNumber.click();
		cardNumber.sendKeys("271");
		test.log(LogStatus.INFO, "Enter card number");
		wait(5000);

		facilityCode.click();
		facilityCode.sendKeys("271");

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", temporaryAccessMediumActive);

		temporaryAccessMediumActive.click();
		test.log(LogStatus.INFO, "Click on temporary access medium active");
		wait(5000);
		temporaryAccessLevel.click();
		test.log(LogStatus.INFO, "Click on access level");
		wait(5000);
        temporaryAccessLevel.sendKeys(Keys.ENTER);
        wait(3000);
		temporaryAccessStartDate.click();
		wait(15000);
		currentTempNow.click();
		test.log(LogStatus.INFO, "Choose current time by clicking on Now");
		wait(70000);

		temporaryAccessEndDate.click();
		test.log(LogStatus.INFO, "Click on temporary access medium end date");
		wait(5000);

		currentTempEndNow.click();
		test.log(LogStatus.INFO, "Click on Now ");
		wait(5000);

		clickOnSaveButton();


	}

	public void demoAccessLevel_Accesor() throws InterruptedException, AWTException {

		accessLevel.click();
		test.log(LogStatus.INFO, "Click on Access Level");
		wait(5000);

		if (driver.getPageSource().contains("Automation_Access_Level")) {

			existingAccessLevel.click();
			test.log(LogStatus.INFO, "Click on created access level");
			wait(5000);

			clickOnDeleteButton();

			int xpathCount = driver.findElements(By.xpath("//span[text()='Yes']")).size();
			System.out.println(xpathCount);

			if (xpathCount == 1) {
				clickOnYesButton();
			} else {

				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOf(yesClick));

				yesClick.click();
			}
		}

		addAccessLevel.click();
		test.log(LogStatus.INFO, "Click on Add Access Level");
		wait(5000);

		locationIdSelect.click();
		test.log(LogStatus.INFO, "Click on location");
		wait(5000);

		chooseIndia.click();
		// actions.doubleClick(chooseIndia).perform();
		test.log(LogStatus.INFO, "Choose India location");
		wait(5000);

		building.click();
		wait(5000);

		nameField.click();
		nameField.sendKeys("Automation_Access_Level");
		wait(5000);

		scheduleId.click();
		test.log(LogStatus.INFO, "Click on Schedule");
		wait(5000);

		chooseSchedule.click();
		test.log(LogStatus.INFO, "Choose Schedule");
		wait(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", doors);
		doors.click();
		test.log(LogStatus.INFO, "Click on doors");
		wait(5000);

		// doorGroups.click();
		// test.log(LogStatus.INFO, "Click on door groups");
		// wait(5000);

		switcherClose.click();
		test.log(LogStatus.INFO, "Switch to building for choosing door");
		wait(5000);
		// selectDoorGroup.click();
		// test.log(LogStatus.INFO, "Select Door Group");
		// wait(5000);

		selectDoor.click();
		test.log(LogStatus.INFO, "Choose the door");
		wait(3000);
		clickOnSaveButton();

		// read and update
		existingAccessLevel.click();
		test.log(LogStatus.INFO, "Click on created access level");
		wait(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton);

		editButton.click();
		wait(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", grantAccessOnHoliday);
		wait.until(ExpectedConditions.visibilityOf(grantAccessOnHoliday));

		// enabledButton.click();
		// wait(3000);
		grantAccessOnHoliday.click();
		wait(5000);

		clickOnUpdateButton();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");

		// Accessor
		wait(5000);
		actions.moveToElement(user).perform();
		test.log(LogStatus.INFO, "Mouse hover over user tab");
		wait(10000);

		accessor.click();
		test.log(LogStatus.INFO, "Click on Accessors");
		wait(5000);

		if (driver.getPageSource().contains("Accessor_Automation")) {

			wait(5000);
			existingAccessor.click();
			test.log(LogStatus.INFO, "Click on newly created Accessor");
			wait(10000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteButton);
			clickOnDeleteButton();
			wait(3000);

			int xpathCount1 = driver.findElements(By.xpath("//span[text()='Yes']")).size();
			System.out.println(xpathCount1);

			if (xpathCount1 == 1) {
				clickOnYesButton();
			} else {

				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOf(yesClick));

				yesClick.click();
			}

		}

		wait(5000);
		addAccessor.click();
		test.log(LogStatus.INFO, "Click on add accessors");
		wait(5000);

		uploadImage.click();
		wait(5000);

		// Image upload
		Robot robot = new Robot();

		StringSelection filePath = new StringSelection("C:\\Users\\yachna\\Downloads\\team.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		wait(3000);

		robot.keyPress(KeyEvent.VK_V);
		wait(2000);

		robot.keyRelease(KeyEvent.VK_V);
		wait(2000);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		wait(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		wait(2000);

		robot.keyRelease(KeyEvent.VK_ENTER);
		wait(2000);

		wait(10000);
		uniqueId.click();
		uniqueId.sendKeys("2710");
		test.log(LogStatus.INFO, "Enter the unique id ");
		wait(5000);

		nameField.click();
		nameField.sendKeys("Accessor_Automation");
		test.log(LogStatus.INFO, "Add Name");
		wait(5000);

		emailField.click();
		emailField.sendKeys("yachnas+12@iotech.biz");
		test.log(LogStatus.INFO, "Add value to email field");
		wait(5000);

		holidayGroupIdList.click();
		test.log(LogStatus.INFO, "Click on holiday group list");
		wait(5000);

		holidayGroupIdList.sendKeys(Keys.ARROW_DOWN);
		holidayGroupIdList.sendKeys(Keys.ARROW_DOWN);
		holidayGroupIdList.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "Choose a holiday group ");
		wait(5000);

		accessLevelIds.click();
		test.log(LogStatus.INFO, "Click on access level list");
		wait(5000);

		accessLevelIds.sendKeys(Keys.ARROW_DOWN);
		accessLevelIds.sendKeys(Keys.ARROW_DOWN);
		accessLevelIds.sendKeys(Keys.ARROW_DOWN);
		accessLevelIds.sendKeys(Keys.ARROW_DOWN);
		accessLevelIds.sendKeys(Keys.ARROW_DOWN);
		accessLevelIds.sendKeys(Keys.ARROW_DOWN);

		accessLevelIds.sendKeys(Keys.ENTER);
		// accessLevelSelect.click();
		test.log(LogStatus.INFO, "Choose one Access Level");
		wait(5000);

		department.click();
		department.sendKeys("Automation Testing");
		wait(5000);

		accessMediumActive.click();
		test.log(LogStatus.INFO, "Click on Access medium active tab");
		wait(5000);

		accessMediumName.click();
		accessMediumName.sendKeys("New_Automation_Accessor");
		test.log(LogStatus.INFO, "access medium name");
		wait(5000);

		accessMediumValidFrom.click();
		test.log(LogStatus.INFO, "Click on access medium valid from");
		wait(10000);

		driver.findElement(By.cssSelector(".ant-picker-cell.ant-picker-cell-in-view.ant-picker-cell-today")).click();
		okButton.click();

		test.log(LogStatus.INFO, "Current Date and Time");
		wait(10000);

		accessMediumValidTill.click();
		test.log(LogStatus.INFO, "Click on access medium valid till");
		wait(5000);

		// while (!driver.findElement(By.cssSelector("[class='ant-picker-header-view']
		// [class='ant-picker-month-btn']"))
		// .getText().contains("April")) {

		// driver.findElement(By.xpath("//button[@class='ant-picker-header-next-btn']")).click();
		// }

		List<WebElement> dates = driver.findElements(By.cssSelector(".ant-picker-cell.ant-picker-cell-in-view"));

		// grab common attribute and put into the list and iterate

		int count = driver.findElements(By.cssSelector(".ant-picker-cell.ant-picker-cell-in-view")).size();

		for (int i = 0; i < count; i++) {

			String text = driver.findElements(By.cssSelector(".ant-picker-cell.ant-picker-cell-in-view")).get(i)
					.getText();

			if (text.equalsIgnoreCase("23")) {

				driver.findElements(By.cssSelector(".ant-picker-cell.ant-picker-cell-in-view")).get(i).click();
				wait(5000);
				break;
			}
		}

		if (driver.getPageSource().contains("Ok") == true) {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			ok2Button.click();
			test.log(LogStatus.INFO, "Select a New Date ");
			wait(5000);

		}

		accessMediumType.click();
		test.log(LogStatus.INFO, "Click on Access Medium list");
		wait(5000);

		accessMediumType.sendKeys(Keys.ARROW_DOWN);
		accessMediumType.sendKeys(Keys.ENTER);

		test.log(LogStatus.INFO, "Click on Card access medium");
		wait(5000);

		cardNumber.click();
		cardNumber.sendKeys("271");
		test.log(LogStatus.INFO, "Enter card number");
		wait(5000);

		facilityCode.click();
		facilityCode.sendKeys("271");
		clickOnSaveButton();

		// read and update

		driver.getPageSource().contains("Accessor_Automation");

		wait(5000);
		existingAccessor.click();
		test.log(LogStatus.INFO, "Click on newly created  Accessor");
		wait(15000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton);
		wait(10000);
		editButton.click();
		test.log(LogStatus.INFO, "click on edit button");
		wait(15000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", enabledButton);

		enabledButton.click();
		test.log(LogStatus.INFO, "Click on enabled Button");
		wait(5000);

		clickOnUpdateButton();

		// delete accessor
		wait(10000);
		existingAccessor.click();
		test.log(LogStatus.INFO, "Click on newly created Accessor");
		wait(10000);
		clickOnDeleteButton();
		wait(5000);
		yesClick.click();

		wait(5000);

	}
}
