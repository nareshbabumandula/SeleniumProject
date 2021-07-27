package control.statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utility.Utility;

public class BrowserTest {
	
	WebDriver driver;
	
	public void launchBrowser(String strBrowser) throws InterruptedException {
		
		switch (strBrowser) {
		case "ie":
			System.setProperty("webdriver.ie.driver", ".\\browsers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		case "firefox": case "ff":
			System.setProperty("webdriver.gecko.driver", ".\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome": case "google":
			System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "edge": case "chromium":
			System.setProperty("webdriver.edge.driver", ".\\browsers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Invalid browser..!");
			break;
		}
		driver.manage().window().maximize();
		driver.get("http://www.blazedemo.com");
		Thread.sleep(3000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		BrowserTest bt = new BrowserTest();
		Utility ut = new Utility();
		String strBrowser = ut.getProperty("browser");
		bt.launchBrowser(strBrowser);

	}

}
