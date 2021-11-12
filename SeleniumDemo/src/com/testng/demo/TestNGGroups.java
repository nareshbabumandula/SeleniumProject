package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;

public class TestNGGroups {
  
  @Test(priority=3, groups = {"regression"})
  public void checkOut() {
	  System.out.println("Executing checkOut method");
  }
  
  @Test(priority=1, groups = {"smoke", "regression"})
  public void searchProduct() {
	  System.out.println("Executing searchProduct method");
  }
    
  @Test(priority=2, groups = {"smoke", "regression"})
  public void addToCart() {
	  System.out.println("Executing addToCart method");
  }
  
  @Test(priority=0, groups = {"smoke", "regression"})
  public void login() {
	  System.out.println("Executing login method");
  }
 

  @BeforeClass(groups="smoke")
  public void gotoHomepage() {
	  System.out.println("Executing gotoHomepage method"); 
  }


  @AfterClass
  public void closeBrowser() {
	  System.out.println("Executing closeBrowser method");
  }

}
