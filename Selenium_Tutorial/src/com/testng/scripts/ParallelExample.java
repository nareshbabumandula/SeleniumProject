package com.testng.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.object.repository.Homepage;


public class ParallelExample extends Homepage{
	
	WebDriver driver;

	@Test
	public void chromeTest() {
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize(); // Maximize the browser window
		driver.quit();
	}
	
	@Test
	public void firefoxTest() {
		System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver", ".\\browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize(); // Maximize the browser window
		driver.quit();
	}

}
