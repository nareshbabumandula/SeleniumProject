package com.selenium.wait.example;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumWaitTest {
	
	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void linkMethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit wait
		driver.get("https://www.mycontactform.com/"); // Load a new web page in the current browser window. 
		driver.manage().window().maximize(); // Maximize the browser window
		// Explicit wait - WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("btnSubmit")));
		driver.findElement(By.name("btnSubmit")).click();
		//Fluent wait
		FluentWait fwait = new FluentWait(driver);
		fwait.withTimeout(10000, TimeUnit.MILLISECONDS);
		fwait.pollingEvery(250, TimeUnit.MILLISECONDS);
		fwait.ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.elementToBeClickable(By.linkText("FREE ACCOUNT SIGN UP!")));
		driver.findElement(By.linkText("FREE ACCOUNT SIGN UP!")).click();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}


	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // All the instances or tabs of browser will be closed
	}

}
