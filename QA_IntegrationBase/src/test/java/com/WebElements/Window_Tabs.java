package com.WebElements;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Tabs {
	
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void browser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
	}
	
	
	
	
	@Test
	public void tabs1() throws Exception 
	{
		String Patenthandles = driver.getWindowHandle();
		System.out.println("Parent window handle" + Patenthandles + driver.getTitle());

		driver.findElement(By.id("opentab")).click();
		Set<String> windowhandlenumbers = driver.getWindowHandles();

		for (String winnumber : windowhandlenumbers) {
			if (!winnumber.equals(Patenthandles)) {
				driver.switchTo().window(winnumber);
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rakesh");
				Thread.sleep(2000);
				
			}
		}
		driver.switchTo().window(Patenthandles);
		Thread.sleep(3000);
		driver.findElement(By.id("autosuggest")).sendKeys("Raghu");
		Thread.sleep(3000);
		driver.quit();
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
