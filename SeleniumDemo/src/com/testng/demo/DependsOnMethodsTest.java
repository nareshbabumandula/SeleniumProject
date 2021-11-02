package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DependsOnMethodsTest {
	
	@AfterClass(enabled=false)
	public void logout() {
		System.out.println("Logged out from the application");
	}
	
	@BeforeClass()
	public void launchBrowser() {
		System.out.println("Launched the browser and accessed site");
	}
		
	@Test
	public void searchProduct() {
		try {
			Assert.assertEquals(false, true, "Failed to search a product");
		} catch (Exception e) {
			System.out.println("Failed to search product");
		}finally {
			System.out.println("searchProduct method failed");
		}
		
	}
	
	@Test(dependsOnMethods= {"addtocart"})
	public void checkout() {
		System.out.println("Successfully checkedout the product");
	}
		
	@Test(dependsOnMethods= {"searchProduct"}, alwaysRun=true)
	public void addtocart() {
		System.out.println("Successfully added the product to cart");
	}
	
	
}
