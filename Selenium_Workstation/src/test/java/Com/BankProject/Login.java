package Com.BankProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;

	@BeforeMethod
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/login");
	}

	@AfterMethod
	public void close() {
		driver.findElement(By.id("logout-trigger")).click();
		driver.quit();

	}

	@Test
	public void login() throws Exception {
		{
			// Load web page
			driver.get("https://demo.cyclos.org/ui/home");
			
			// Verify home page
			AssertJUnit.assertTrue(driver.findElement(By.id("menu_home")).isDisplayed());
			
			// Click on Login link
			driver.findElement(By.id("login-link")).click();
			
			// Enter user name
			driver.findElement(By.xpath("//input[@type='text']")).clear();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
			String uname=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
			
			// Enter password
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
			String password=driver.findElement(By.xpath("//input[@type='password']")).getAttribute("value");
			
			// Click on Submit button
			driver.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
			Thread.sleep(2000);
			
			// Blank user name & blank password
			if(uname.equals("") && password.equals(""))
			{
				AssertJUnit.assertEquals(driver.findElement(By.cssSelector(".principal .invalid-feedback")).getText(),"This field is required");
				AssertJUnit.assertEquals(driver.findElement(By.cssSelector(".d-block .invalid-feedback")).getText(),"This field is required");
			}
			
			// Blank user name & valid/invalid password
			else if(uname.equals("") && !(password.equals("")))
			{
				AssertJUnit.assertEquals(driver.findElement(By.cssSelector(".principal .invalid-feedback")).getText(),"This field is required");
			}
			
			// Blank password & valid/invalid user name
			else if(!(uname.equals("")) && password.equals(""))
			{
				AssertJUnit.assertEquals(driver.findElement(By.cssSelector(".d-block .invalid-feedback")).getText(),"This field is required");
			}
			
			// Valid user name & valid password
			else if(isElementPresent(driver,By.id("logout-trigger")))
			{
				driver.findElement(By.id("logout-trigger")).click();
			}  
			
			// Both are invalid/anyone is invalid
			else
			{
				AssertJUnit.assertEquals(driver.findElement(By.cssSelector(".notification-message")).getText(),"The given name / password are incorrect. Please, try again.");
				driver.findElement(By.xpath("//span[contains(.,'×')]")).click();
			}

		}
			
		}
	
		public boolean isElementPresent(WebDriver driver, By locator)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			try
			{
				driver.findElement(locator);
				return true;
			}
			catch(NoSuchElementException e)
			{
				return false;
			}
				    
		}
		
		
		
}
