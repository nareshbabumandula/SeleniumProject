package com.selenium.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MenusTest {

	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void actionMethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/"); // Load a new web page in the current browser window. 
		driver.manage().window().maximize(); // Maximize the browser window
		
		WebElement addons = driver.findElement(By.linkText("Add-ons"));
		
		Actions action = new Actions(driver);
		action.moveToElement(addons).perform(); // Hover the mouse on Add-Ons tab
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.linkText("Extra Seat"))).perform();
		driver.findElement(By.linkText("Extra Seat")).click();
		
	}


	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // All the instances or tabs of browser will be closed
	}

}
