package com.testng.demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Generic {

	 @AfterTest(groups= {"smoke", "regression"})
	  public void logout() {
		  System.out.println("Executing logout method"); 
	  }

	 @Parameters({"url"})
     @BeforeTest(groups = {"smoke", "regression"})
	  public void accessSite(String url) {
		  System.out.println("Executing accessSite method with URL : " + url);
	  }
	  
	
}
