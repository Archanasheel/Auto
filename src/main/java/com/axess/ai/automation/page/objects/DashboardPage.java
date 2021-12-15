package com.axess.ai.automation.page.objects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.axess.ai.automation.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class DashboardPage extends TestBase {

	
	public DashboardPage() {
		
	PageFactory.initElements(driver , this);
	
	}

	
	public void verfiyPageTitle() throws Throwable {
		boolean result = dashboardTitle.isDisplayed();
		test.log(LogStatus.INFO, "Page Title");
		Assert.assertTrue(result);
		wait(1000);
		
		
	}
	
	public void verifyPageHeading() throws InterruptedException {
		
		String actualHeadingText = pageHeading.getText();
		String expectedHeadingText = "Status";
		test.log(LogStatus.INFO, "Page heading ");
		wait(2000);
		Assert.assertEquals(actualHeadingText , expectedHeadingText);
	
	}
	
	public void verifyPageUrl() throws InterruptedException {
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://app.dev.axess.ai/dashboard";
		test.log(LogStatus.INFO, "Page url comparison with actual and expected result");
		wait(2000);
		Assert.assertEquals(currentUrl , expectedUrl);
		
	}
	
	
	public void verifyClickOnRootLocation() throws Throwable {
		
		rootLocation.click();
		test.log(LogStatus.INFO," click on Root Location");
		wait(3000);
	}
	
	
	public void verifySystemUserModule() throws Throwable {
		
		systemUser.isDisplayed();
		test.log(LogStatus.INFO," System Users Module");
	    wait(3000);
		
	}
    public void verifyLocationModule() throws Throwable {
		
		location.isDisplayed();
    	test.log(LogStatus.INFO, " Location Module ");
    	wait(3000);
	
    }
    
    public void verifyDeviceAndModule() throws Throwable {
		
		deviceAndModule.isDisplayed();
		test.log(LogStatus.INFO," Device and Module");
		wait(3000);
	
    }
    
    public void verifyRuleEngineModule() throws Throwable {
		
		ruleEngine.isDisplayed();
		test.log(LogStatus.INFO," Rule Engine Module");
		wait(3000);
		
    }
    
    public void verifyAccessManagerModule() throws Throwable {
		
		accessControl.isDisplayed();
		test.log(LogStatus.INFO," Access Manager Module");
		wait(1000);
    }
    
    public void verifyMapModule() throws Throwable {
		
		map.isDisplayed();
		test.log(LogStatus.INFO," Map Module");
		wait(1000);

    }
    
    public void verifyReportsAnalyticsModule() throws Throwable {
		
    	reportsAnalytics.isDisplayed();
		test.log(LogStatus.INFO," Reports and Analytics Module");
		wait(1000);
    }
    
    public void verifySiteSettingModule() throws Throwable {
		
		siteSetting.isDisplayed();
		test.log(LogStatus.INFO," Site Setting Module");
		wait(1000);
		
    }
    

    public void verifiyHelpAndFeedbackModule() throws Throwable {
		
		helpFeedback.isDisplayed();
		test.log(LogStatus.INFO," Help and Feedback Module");
		wait(1000);
	
    }
    
    public void verfiyLogoutDropDown() throws Throwable {
    	
    	logoutDropdown.click();
		test.log(LogStatus.INFO," Logout Dropdown");
		wait(1000);
    }
    
    public void verfiyLogoutLink() throws Throwable {
  
    	logoutLink.click();
		test.log(LogStatus.INFO," Logout");
		wait(2000);
    }
    
    
    
}
