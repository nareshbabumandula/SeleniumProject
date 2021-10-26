package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

/*@BeforeSuite: The annotated method will be run before all tests in this suite have run.
@AfterSuite: The annotated method will be run after all tests in this suite have run.
@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
@BeforeMethod: The annotated method will be run before each test method.
@AfterMethod: The annotated method will be run after each test method.*/

public class TestNGAnnotationsTest extends Common{
  @Test(priority=0)
  public void searchProduct() {
	  System.out.println("@Test : searchProduct method"); 
  }
  
  @Test(priority=1)
  public void checkStock() {
	  System.out.println("@Test : checkStock method"); 
  }
  
  @BeforeMethod
  public void verifyProduct() {
	  System.out.println("@BeforeMethod : verifyProduct method"); 
  }

  @AfterMethod
  public void validateProduct() {
	  System.out.println("@AfterMethod : validateProduct method"); 
  }
 
  @BeforeTest
  public void accessSite() {
	  System.out.println("@BeforeTest : accessSite method"); 
  }

  @AfterTest(alwaysRun=true)
  public void logout() {
	  System.out.println("@AfterTest : logout method"); 
  }

  @BeforeSuite
  public void launchBrowser() {
	 System.out.println("@BeforeSuite : LaunchBrowser method"); 
  }

  @AfterSuite(enabled=false)
  public void closeBrowser() {
	  System.out.println("@afterSuite : closeBrowser method");
  }

}
