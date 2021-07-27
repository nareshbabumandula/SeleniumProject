package com.testng.scripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAfterSuiteTest extends BeforeAfterMethodTest{
	
	@BeforeSuite
	public void closeAllBrowswers() {
		System.out.println("Successfully closed all the browsers..!");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("Closed all the resources");
	}
	
}
