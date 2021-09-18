package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeAfterClassTest {

	// @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closed the browser");
	}

	//@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launched the browser and accessed site");
	}
	
	//Marks a class or a method as part of the test.
	@Test
	public void searchProduct() {
		System.out.println("Successfully searched the product");
	}
	
}
