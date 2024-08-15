package Com.WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Web_Alerts {

	
	
	WebDriver d;
	@BeforeMethod
	public void setupchrome() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/chromedriver_mac_arm64/chromedriver");
		 d=new ChromeDriver(); 
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	
	
	@Test
	public void test1() throws Exception
	{
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(3000);
		d.findElement(By.xpath("(//*[text()='CONTINUE TO LOGIN'])[1]")).click();
		
d.findElement(By.xpath("//input[@id='Button2']")).click();
	}

	

	@AfterMethod
	public void close() throws Exception
	{
		d.quit();
	}
	
	
	

}
