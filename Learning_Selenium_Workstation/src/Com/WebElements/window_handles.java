package Com.WebElements;



import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class window_handles {

	WebDriver d;
	@BeforeMethod
	public void setupchrome() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/geckodriver");
		d=new FirefoxDriver();

	
	}
	
	
	@Test
	public void test1() throws Exception
	{
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
Thread.sleep(5000);
		d.navigate().forward();
		Thread.sleep(5000);
		d.navigate().back();
		d.navigate().to("https://retail.onlinesbi.sbi/retail/login.htm");
	}

	

	@AfterMethod
	public void close() throws Exception
	{
		d.quit();
	}
	

}
