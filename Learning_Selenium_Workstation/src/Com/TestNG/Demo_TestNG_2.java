package Com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_TestNG_2 {


	WebDriver driver;
	@BeforeMethod
	public void setupchrome() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/chromedriver_mac_arm64/chromedriver");
		 driver=new ChromeDriver(); 
		
	
	}
	
	
	@Test
	public void amazon() throws Exception
	{
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]/child::a")).click();
	}
	

	@AfterMethod
	public void close() throws Exception
	{
		driver.quit();
	}
	
}
