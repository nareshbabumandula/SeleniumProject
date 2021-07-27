package com.webdriver.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeysTest {

	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void keysMethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.mycontactform.com/"); // Load a new web page in the current browser window. 
		driver.manage().window().maximize(); // Maximize the browser window
		
		driver.findElement(By.id("user")).sendKeys("Naresh" + Keys.BACK_SPACE);
		driver.findElement(By.id("pass")).sendKeys("Secure*123" + Keys.chord(Keys.CONTROL,"a"));
		driver.findElement(By.id("user")).clear();
		driver.findElement(By.id("user")).sendKeys(Keys.SHIFT + "gunjan");
	}


	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // All the instances or tabs of browser will be closed
	}

}
