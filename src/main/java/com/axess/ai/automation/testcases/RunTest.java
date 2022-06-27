package com.axess.ai.automation.testcases;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.TestNG;

import com.axess.ai.automation.utilities.ApplicationConstants;

public class RunTest {

	public static String browser;
	public static String env;
	public static String xml;

	public static void main(String[] args) throws InterruptedException, IOException {

		try {
			FileUtils.forceDelete(new File(
					System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.EXTENTREPORT));
		} catch (Exception e) {

		}

		env = args[0];
		browser = args[1];

		TestNG runner = new TestNG();
		List<String> suitefiles = new ArrayList<String>();

		suitefiles.add(System.getProperty(ApplicationConstants.USER_DIRECTORY) + ApplicationConstants.XML + env
				+ ApplicationConstants.XMLFILE_EXTENSION);
		runner.setTestSuites(suitefiles);
		runner.run();

	}
}
