package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverloadingInSelenium {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Autocomplete")).click();
		System.out.println(driver.findElement(By.className("demo-frame")).isDisplayed());
		//driver.switchTo().frame(0); // Switches the WebDriver to the 1st frame based on Index 0'
		WebElement frameweblement = driver.findElement(By.xpath("//iframe[@src='/resources/demos/autocomplete/default.html']"));
		driver.switchTo().frame(frameweblement);
		driver.findElement(By.id("tags")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.quit();
	}

}
