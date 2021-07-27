package com.testng.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class BeforeAfterMethodTest {
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Successfully launched the browser");
	}
	
	@BeforeClass
	public void accessSite() {
		System.out.println("Accessed the flipkart site");
	}
	
	@BeforeMethod
	public void verifyProductDetails() {
		System.out.println("Successfully verifed the product details");
		Reporter.log("Successfully verifed the product details");
	}
	
	@AfterMethod
	public void verifyStockAvailability() {
		System.out.println("Successfully verifed the product stock details");
		Reporter.log("Successfully verifed the product stock details");
	}
	
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
	
	@AfterClass
	public void Logout() {
		System.out.println("Logged out from the application");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Closed the browser");
	}
	
}
