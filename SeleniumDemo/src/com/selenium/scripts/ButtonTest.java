package com.selenium.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ButtonTest {

	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void buttonMethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.mycontactform.com/"); // Load a new web page in the current browser window. 
		driver.manage().window().maximize(); // Maximize the browser window
		WebElement btnLogin = driver.findElement(By.name("btnSubmit"));
		System.out.println("Type attribute value is : " + btnLogin.getAttribute("type"));
		System.out.println("Name attribute value is : " + btnLogin.getAttribute("name"));
		System.out.println("Class attribute value is : " + btnLogin.getAttribute("class"));
		System.out.println("Value attribute value is : " + btnLogin.getAttribute("value"));
		System.out.println("TabIndex attribute value is : " + btnLogin.getAttribute("tabindex"));
		
		System.out.println("Html tag name for the image is : " + btnLogin.getTagName());
	    System.out.println(btnLogin.isDisplayed());
		System.out.println(btnLogin.isEnabled());
		
		// Click on image
		btnLogin.click();

	}


	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // All the instances or tabs of browser will be closed
	}

}
