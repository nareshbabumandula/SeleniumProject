package com.selenium.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ImageTest {

	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void imageMethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.mycontactform.com/"); // Load a new web page in the current browser window. 
		driver.manage().window().maximize(); // Maximize the browser window
		WebElement imgTestimonial = driver.findElement(By.className("test_img"));
		System.out.println("Src attribute value is : " + imgTestimonial.getAttribute("src"));
		System.out.println("Alt attribute value is : " + imgTestimonial.getAttribute("alt"));
		System.out.println("Class attribute value is : " + imgTestimonial.getAttribute("class"));
		System.out.println("Html tag name for the image is : " + imgTestimonial.getTagName());
		
	    System.out.println(imgTestimonial.isDisplayed());
		System.out.println(imgTestimonial.isEnabled());
		
		// Click on image
		imgTestimonial.click();
		
	}


	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // All the instances or tabs of browser will be closed
	}

}
