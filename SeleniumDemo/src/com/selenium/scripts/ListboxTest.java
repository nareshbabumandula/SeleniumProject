package com.selenium.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListboxTest {

	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void listboxMethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.mycontactform.com/"); // Load a new web page in the current browser window. 
		driver.manage().window().maximize(); // Maximize the browser window
		
		driver.findElement(By.linkText("Sample Forms")).click();
		
		WebElement dropdownBox = driver.findElement(By.id("q3"));
		System.out.println("ID attribute value is : " + dropdownBox.getAttribute("id"));
		System.out.println("Name attribute value is : " + dropdownBox.getAttribute("name"));
		System.out.println("Style attribute value is : " + dropdownBox.getAttribute("style"));
		System.out.println("Html tag name for the dropdown is : " + dropdownBox.getTagName());
		
	    System.out.println(dropdownBox.isDisplayed());
		System.out.println(dropdownBox.isEnabled());
		System.out.println("Listbox selection status before is : " + dropdownBox.isSelected());
		
		// Select the value from dropdown listbox
		dropdownBox.click();
		
		// Create an object for Select class in order to work with any dropdown listbox
		Select select = new Select(dropdownBox);
		System.out.println("First selected option is : "+ select.getFirstSelectedOption().getText());
		select.selectByIndex(1); // Selects the 2nd item from the dropdown listbox 
		select.selectByIndex(0); // Selects the 1st item from the dropdown listbox 
		select.selectByVisibleText("Fourth Option"); // Selects the item based on the text of the list of list item
		System.out.println("First selected option is : "+ select.getFirstSelectedOption().getText());
	
			
		List<WebElement> items = select.getOptions();
		
		for (WebElement value : items) {
			System.out.println(value.getText());
		}
		
		// Lamba expression on List collection
		System.out.println("Lambda expression to fetch all the items from dropdown");
		items.forEach(item->System.out.println(item.getText()));
		
		// Stream API
		System.out.println("Stream API to fetch all the items from dropdown");
		items.stream().forEach(product -> System.out.println(product.getText()));
					
		System.out.println("Listbox selection status after is : " + dropdownBox.isSelected());
		
		
	}


	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // All the instances or tabs of browser will be closed
	}

}
