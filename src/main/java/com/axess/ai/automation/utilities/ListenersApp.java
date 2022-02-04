
package com.axess.ai.automation.utilities;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.axess.ai.automation.testcases.RunTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenersApp implements ITestListener, ISuiteListener {

	public static ExtentReports reports;
	public static ExtentTest test;
	public static WebDriver driver;
	public static Properties prop;
	public static String env = RunTest.env + ApplicationConstants.PROPERTYFILE_EXTENSION;

	public ListenersApp() {

		try {

			prop = new Properties();
			System.out.println(" Super Contructor invoked ");
			FileInputStream fileInputStream = new FileInputStream(
					System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.CONFIGURATIONS + env);
			prop.load(fileInputStream);
		

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void launchBrowser() {

		String browserName = RunTest.browser;

		WebDriverManager.iedriver().setup();

		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			
		} else if (browserName.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			// options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-notifications");
			driver = new FirefoxDriver(options);
			
		} else if (browserName.equals("IE")) {
			
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

	public static void wait(int time) throws InterruptedException {

		Thread.sleep(time);
	}

	public void stop() {
		
		if (driver != null) {
			driver.quit();
			driver = null;

		}
	}

	public void onStart(ITestContext context) {

		System.out.println("*** TestClass Started ***");

	}

	public void onFinish(ITestContext context) {

		System.out.println("*** TestClass Ending ***" + context.getName());

	}

	public void onTestStart(ITestResult result) {

		System.out.println("*** On Test Start ***" + result.getMethod().getMethodName());

		test = reports.startTest(
				result.getTestClass().getRealClass().getSimpleName() + "--->" + result.getMethod().getMethodName());

		test.log(LogStatus.INFO, result.getMethod().getMethodName() + " Test is Started ");
	}

	public void onTestFinish(ITestResult result) {

		test.log(LogStatus.INFO, result.getMethod().getMethodName().toUpperCase() + " TEST IS FINISHED ");
		reports.endTest(test);
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("*** On Test Success ***");

		test.log(LogStatus.PASS, result.getMethod().getMethodName() + " Test is Passed ");

	}

	public void onTestFailure(ITestResult result) {

		System.out.println("*** On Test Failure ***");

		test.log(LogStatus.FAIL, result.getMethod().getMethodName() + " Test is Failed ");
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateFormat = new SimpleDateFormat(ApplicationConstants.DATEFORMAT);
		
		try {
			String fileName = System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.EXTENTREPORT
					+ result.getMethod().getMethodName() + ApplicationConstants.UNDERSCORE
					+ dateFormat.format(new Date()) + ApplicationConstants.SCREENSHOT_EXTENSION;

			FileUtils.copyFile(source, new File(fileName));
			String file = test.addScreenCapture(fileName);
			test.log(LogStatus.FAIL, result.getMethod().getMethodName() + " Test is Failed ", file);
			test.log(LogStatus.FAIL, result.getMethod().getMethodName() + " Test is Failed ",
					result.getThrowable().getMessage());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("*** On Test Skipped ***");

		test.log(LogStatus.SKIP, result.getMethod().getMethodName() + " Test is Skipped ");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("*** Test failed but within percentage % *** " + result.getMethod().getMethodName());

	}

	public void onStart(ISuite suite) {

		System.out.println("*** On Suite Start ***");

		try {
			Files.createDirectories(Paths.get(System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.BACKUPREPORT));
			Files.createDirectories(Paths.get(System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.EXTENTREPORT));
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dir = new File(System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.EXTENTREPORT);
		delete(dir);
		File file = new File(System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.EXTENTREPORT);
		SimpleDateFormat dateFormat = new SimpleDateFormat(ApplicationConstants.DATEFORMAT);
		reports = new ExtentReports(System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.EXTENTREPORT +"TestResults_"
				+ dateFormat.format(new Date()) + ApplicationConstants.REPORT_EXTENSION);

	}

	public void onFinish(ISuite suite) {

		System.out.println("*** On Suite Finish ***");
		reports.flush();

		try {

			Path sourceDirectory = Paths.get(System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.EXTENTREPORT);
			Path destinationDirectory = Paths.get(System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.BACKUPREPORT);

			Stream<Path> files = Files.walk(sourceDirectory);

			files.forEach(file -> {
				try {
					Files.copy(file, destinationDirectory.resolve(sourceDirectory.relativize(file)),
							StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					System.out.println("TestSuite Finish");
				}
			});
			files.close();
		} catch (IOException ex) {
			System.out.println("Directory Not Found");
		}
	}

	private static void delete(File file) {

		if (file.isDirectory()) {
			String fileList[] = file.list();
			if (fileList.length == 0) {
				System.out.println(" Deleting Directory : " + file.getPath());
				file.delete();
			} else {
				int size = fileList.length;
				for (int i = 0; i < size; i++) {
					String fileName = fileList[i];
					System.out.println(" File path :" + file.getPath() + " and name " + fileName);
					String fullPath = file.getPath() + ApplicationConstants.SLASH + fileName;
					File fileOrFolder = new File(fullPath);
					System.out.println(" Full Path : " + fileOrFolder.getPath());
					delete(fileOrFolder);
				}
			}
		} else {
			System.out.println("Deleting file :" + file.getPath());
			file.delete();
		}

	}

}
