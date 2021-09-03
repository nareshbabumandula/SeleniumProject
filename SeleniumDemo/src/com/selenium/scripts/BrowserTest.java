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
		driver.get("https://www.blazedemo.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println(driver.getWindowHandle()); // Retrieves the browser session ID
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(selectLinkOpeninNewTab);
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandles());
		Set<String> windows = driver.getWindowHandles();

		// Traverse through all the elements of set collection
		Iterator<String> iter = windows.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

		Thread.sleep(5000);
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {

		BrowserTest bt = new BrowserTest();
		bt.browserMethods();
	}

}
