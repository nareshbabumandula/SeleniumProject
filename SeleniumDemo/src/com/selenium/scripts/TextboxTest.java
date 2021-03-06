package com.selenium.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextboxTest {

	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void textboxMethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.mycontactform.com/"); // Load a new web page in the current browser window. 
		driver.manage().window().maximize(); // Maximize the browser window
		WebElement USERNAME = driver.findElement(By.id("user"));
		System.out.println("Name attribute value is : " + USERNAME.getAttribute("name"));
		System.out.println(USERNAME.getAttribute("name"));
		System.out.println(USERNAME.getAttribute("type"));
		System.out.println(USERNAME.getAttribute("class"));
		System.out.println(USERNAME.getAttribute("id"));
		System.out.println(USERNAME.getAttribute("tabindex"));
		System.out.println(USERNAME.getTagName());
		
		System.out.println(USERNAME.isDisplayed());
		System.out.println(USERNAME.isEnabled());
		
		// Enter data into the textbox
		USERNAME.sendKeys("Swetha");
		System.out.println("Actual value entered in username text field is  : " + USERNAME.getAttribute("value"));
		Assert.assertEquals("Swetha123", USERNAME.getAttribute("value"));
		Reporter.log("Successfully validated the text field");
		
	}
	
	@Test
    public void testMethod() {
    	Assert.assertEquals("naresh", "sudheera");
    	Assert.assertEquals('a', 'a');
    	Assert.assertEquals('n', 's', "Expected char is not same a actual char");
    	Assert.assertEquals(false, true);
    	Assert.assertEquals(true, false, "Expected value is not same as actual value");
    	
    }


	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // All the instances or tabs of browser will be closed
	}

}
