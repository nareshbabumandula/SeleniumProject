package com.selenium.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FramesTest {

	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void framesMethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/"); 
		driver.manage().window().maximize(); 
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(3000);
		//driver.switchTo().frame(0); // Switches to the first frame in the html dom
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // Switches to a frame based on frame webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/draggable/default.html']")));
		boolean blnDraggableFlag = driver.findElement(By.id("draggable")).isDisplayed();
		System.out.println(blnDraggableFlag);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.background='green'", driver.findElement(By.id("draggable"))); 
		
		driver.switchTo().defaultContent(); // Switch the WebDriver out from the frame
		driver.findElement(By.linkText("Autocomplete")).click();
		driver.switchTo().frame(0);
		//driver.findElement(By.id("tags")).sendKeys("Selenium");
		jsExecutor.executeScript("arguments[0].value='Selenium'", driver.findElement(By.id("tags")));

	}


	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // All the instances or tabs of browser will be closed
	}

}
