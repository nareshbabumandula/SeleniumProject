package com.webdriver.scripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverTest {

	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void browserMethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.mycontactform.com/"); // Load a new web page in the current browser window. 
		driver.manage().window().maximize(); // Maximize the browser window
		String strTitle = driver.getTitle();
		System.out.println(strTitle); //Get the title of the current page
		System.out.println(driver.getCurrentUrl()); // Get a string representing the current URL that the browser is looking at
	
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Features")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.id("user")).sendKeys("Gunjan");
		driver.findElement(By.id("pass")).sendKeys("Secure*1234");
		String mainwindow = driver.getWindowHandle();
		System.out.println(driver.getWindowHandle()); // Window session ID
		String ctrlEnter =  Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText("Pricing")).sendKeys(ctrlEnter) ;
		System.out.println(driver.getWindowHandles());
	
		Set<String> windows = driver.getWindowHandles();
		
		for(String window:windows) {
			if (!window.equals(mainwindow)) {
				driver.switchTo().window(window);
			}
		}
		
		System.out.println(driver.getTitle()); // Second window title
		driver.switchTo().window(mainwindow); // Switch to the main or parent window
		System.out.println(driver.getTitle()); // First window title
	}


	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // All the instances or tabs of browser will be closed
	}

}
