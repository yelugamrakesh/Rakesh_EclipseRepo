package Selenium_Topics;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwait {
	WebDriver driver;

	@BeforeMethod
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	}
	@Test
	public void implicitwait1() {
		driver.findElement(By.id("btn2")).click();

	}
	
	
	

	@AfterMethod
	public void close() {
		driver.quit();
	}

	

}
