package com.javascript.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavascriptTest {
	public WebDriver driver;

	@Test
	public void Javascriptexecutor_Methods_Demo() throws InterruptedException {
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//Fetching the Domain Name 
		String sDomain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain = "+sDomain);
		//Fetching the URL 
		String sURL = js.executeScript("return document.URL;").toString();
		System.out.println("URL = "+sURL);
		//Fetching the Title
		String sTitle = js.executeScript("return document.title;").toString();
		System.out.println("Title = "+sTitle);
		js.executeScript("history.go[0]"); // Refresh the page
		//Highlight element
		js.executeScript("arguments[0].style.border='2px groove green'", driver.findElement(By.id("user")));
		// Enter text in text fields using JavaScriptExecutor
		js.executeScript("arguments[0].value='monali'", driver.findElement(By.id("user")));
		js.executeScript("arguments[0].style.border='2px groove yellow'", driver.findElement(By.id("pass")));
		js.executeScript("document.getElementById('pass').value='Himaja'");
		Thread.sleep(3000);
				
		js.executeScript("arguments[0].click();", driver.findElement(By.linkText("Sample Forms")));

		//Vertical scroll - down by 200  pixels
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Successfully did the vertical scroll by 200px");

		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.name("submit")));
		
		
	

	}
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}