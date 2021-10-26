package com.selenium.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckboxTest {

	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void checkboxMethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.mycontactform.com/"); // Load a new web page in the current browser window. 
		driver.manage().window().maximize(); // Maximize the browser window
		
		driver.findElement(By.linkText("Sample Forms")).click();
	
		WebElement chkMarketing = driver.findElement(By.xpath("//input[@name='email_to[]' and @value='0']"));
		System.out.println("Type attribute value is : " + chkMarketing.getAttribute("type"));
		System.out.println("Name attribute value is : " + chkMarketing.getAttribute("name"));
		System.out.println("Value attribute value is : " + chkMarketing.getAttribute("value"));
		System.out.println("Html tag name for the checkbox is : " + chkMarketing.getTagName());
		
	    System.out.println(chkMarketing.isDisplayed());
		System.out.println(chkMarketing.isEnabled());
		System.out.println("Checkbox selection status before is : " + chkMarketing.isSelected());
		// Select the checkbox
		chkMarketing.click();
		System.out.println("Checkbox selection status after is : " + chkMarketing.isSelected());
		
		
		List<WebElement> checkboxes = driver.findElements(By.name("email_to[]"));
		System.out.println(checkboxes.size());
		checkboxes.forEach((n)->n.click());
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // All the instances or tabs of browser will be closed
	}

}
