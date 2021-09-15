package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver(); // Instantiate ChromeDriver
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize(); // Maximize the browser window

		// Enter data in User Name field using ID locator
		driver.findElement(By.id("user")).sendKeys("naresh223");
		Thread.sleep(1000);
		driver.findElement(By.id("user")).clear();
	
		// Enter data in User Name field using Name locator
		driver.findElement(By.name("user")).sendKeys("Srikanth");
		Thread.sleep(1000);
		driver.findElement(By.name("user")).clear();
	
		// Enter data in User Name field using className locator
		driver.findElement(By.className("txt_log")).sendKeys("Gunjan");
		Thread.sleep(1000);
		driver.findElement(By.className("txt_log")).clear();
	
		// Enter data in User Name field using XPath with attributes locator
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Ravi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user']")).clear();
		
		// Enter data in User Name field using CSS locator
		driver.findElement(By.cssSelector("input[id='user']")).sendKeys("Ruken");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='user']")).clear();
		
		// Enter data in User Name field using CSS locator with # as a replacement for ID
		driver.findElement(By.cssSelector("input#user")).sendKeys("Madhu");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#user")).clear();
				
		// Enter data in User Name field using CSS locator with . as a replacement for Classname
		driver.findElement(By.cssSelector("input.txt_log")).sendKeys("Manideep");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.txt_log")).clear();
	
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Successfully performed actions on objects using various locators..!");


	}

}
