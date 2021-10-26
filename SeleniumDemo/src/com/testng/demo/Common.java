package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Common {

	 @BeforeClass
	  public void login() {
		  System.out.println("@BeforeClass : login method"); 
	  }

	  @AfterClass
	  public void gotoHomepage() {
		  System.out.println("@AfterClass : gotoHomepage method"); 
		  Assert.assertEquals(false, true);
	  }

	
}
