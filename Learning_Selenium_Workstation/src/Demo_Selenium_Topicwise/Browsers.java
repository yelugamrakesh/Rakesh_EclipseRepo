package Demo_Selenium_Topicwise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	WebDriver driver = null;

	public WebDriver OpenBrowser(String browser, String url) throws Exception {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/rakeshiphoneyelugam/Downloads/Library/chromedriver_mac_arm64/chromedriver");
			
			new ChromeDriver();
			
		} else {
			
			System.setProperty("webdriver.chrome.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/geckodriver");
			
			new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();

		Thread.sleep(3000);

		return driver;

	}

	public void closeBrowser() {
		driver.quit();
	}

}
