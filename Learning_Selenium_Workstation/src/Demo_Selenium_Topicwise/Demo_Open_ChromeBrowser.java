package Demo_Selenium_Topicwise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Open_ChromeBrowser extends Browsers {

	
	public void openChromeBrowser() throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("chrome browser was opened");
		
	
	}
	
	
	
	public void openFirefoxBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/geckodriver");
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("firefox browser was opened");
	}
		
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		Demo_Open_ChromeBrowser t1=new Demo_Open_ChromeBrowser();
		t1.openChromeBrowser();
	t1.openFirefoxBrowser();
		
	
	
	}

}
