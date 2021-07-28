package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize();
		
		// Locators
		driver.findElement(By.id("user")).sendKeys("Seerath");
		driver.findElement(By.name("pass")).sendKeys("Secure*1234");
		driver.findElement(By.id("user")).clear();
		driver.findElement(By.className("txt_log")).sendKeys("Sheshu");
		driver.findElement(By.xpath("//input[starts-with(@name,'email_to')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email_to')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email_to')][@value=1]")).click();
		driver.findElement(By.xpath("//input[@id='subject' or @ name='subject']")).sendKeys("Test Subject");
		driver.findElement(By.xpath("//input[@ID='email' and @NAME='email']")).sendKeys("Vishwada@gmail.com");
		boolean blnSubject = driver.findElement(By.xpath("//label[contains(text(),'Subject:')]")).isDisplayed();
		System.out.println("Subject field label name display status is : " + blnSubject);
		String strText = "Sample\nEmail\nContact Form";
		strText = strText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));
		driver.findElement(By.xpath("//*[@id='q2']")).sendKeys(strText);
		driver.findElement(By.xpath("//input[@*='q4']")).click();
		driver.findElement(By.xpath("//input[@name='q11_first']/following::input")).sendKeys("Pattapu");
		Thread.sleep(2000);
		// Identifying a link based on linktext and partial linktext
		driver.findElement(By.linkText("Detailed Contact Form")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Simple Web")).click();
		
		driver.findElement(By.cssSelector("input[id='q[1]']")).sendKeys("Seerath");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("seerath@gmail.com");
		driver.findElement(By.cssSelector("input[id='email']")).clear();
		driver.findElement(By.cssSelector("input#email")).sendKeys("rajani@yahoo.com");
		driver.findElement(By.cssSelector("input.txt_log")).clear();
		driver.findElement(By.cssSelector("input.txt_log")).sendKeys("Mounica");
		driver.findElement(By.cssSelector("input[id^='use']")).clear();
		driver.findElement(By.cssSelector("input[id^='use']")).sendKeys("Sheshu");
		driver.findElement(By.cssSelector("input[id$='ser']")).clear();
		driver.findElement(By.cssSelector("input[id^='use']")).sendKeys("Sheenu");
		driver.findElement(By.cssSelector("input[type*='word']")).clear();
		driver.findElement(By.cssSelector("input[type*='word']")).sendKeys("Swetha");
				
		Thread.sleep(3000);
		driver.quit(); // Terminate the browser

	}

}
