package com.testng.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeAfterClassTest {
	
	@Test(priority = 1)
	public void verifyAddToCart() {
		System.out.println("Successfully added the product to the cart");
		Reporter.log("Successfully added the product to the cart");
	}
		
	@Test(priority = 0)
	public void verifySearchProduct() {
		System.out.println("Successfully searched the product");
		Reporter.log("Successfully searched the product");
	}
	
	@Test(priority = 2)
	public void verifyCheckout() {
		System.out.println("Successfully checked out the product");
		Reporter.log("Successfully searched the product");
	}
		

	/*
	 * @BeforeClass: The annotated method will be run before the first test method
	 * in the current class is invoked.
	 */
	@BeforeClass(dependsOnMethods= {"launchBrowser"})
	public void accessSite() {
		System.out.println("Accessed the flipkart site");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Successfully launched the browser");
	}

	/*
	 * @AfterClass: The annotated method will be run after all the test methods in
	 * the current class have been run.
	 */
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closed the browser");
	}
	
}
