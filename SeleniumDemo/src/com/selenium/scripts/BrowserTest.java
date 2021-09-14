package com.selenium.scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	WebDriver driver;

	void browserMethods() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.blazedemo.com/"); // Navigates to the page and wait until the page is loaded
		System.out.println(driver.getTitle()); // Browser title
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println(driver.getWindowHandle()); // Retrieves the browser session ID
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(selectLinkOpeninNewTab);
		//driver.findElement(By.className("btn-primary")).sendKeys(selectLinkOpeninNewTab);
		//driver.findElement(By.xpath("//input[contains(@class,'btn btn-primary')]")).sendKeys(selectLinkOpeninNewTab);
		
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandles());
		Set<String> windows = driver.getWindowHandles();

		// Traverse through all the elements of set collection
		Iterator<String> iter = windows.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("destination of the week! The Beach!")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://blazedemo.com/login"); // Navigates to the page but does not wait until the page is loaded
		// It maintains the browser history and cookies during execution
		System.out.println(driver.getPageSource()); // Prints the entire page html
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {

		BrowserTest bt = new BrowserTest();
		bt.browserMethods();
	}

}
