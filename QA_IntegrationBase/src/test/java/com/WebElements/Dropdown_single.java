package com.WebElements;

import org.testng.annotations.Test; 
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import org.openqa.selenium.support.ui.Select;

public class Dropdown_single {
	WebDriver driver;

	@BeforeTest 
	@Parameters({ "URL" })
	public void LaunchWebSite(String URL) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
	}

	@Test
	public void dropdown1() throws Exception {
		Select s1 = new Select(driver.findElement(By.id("country")));
		s1.selectByVisibleText("Australia");
		Thread.sleep(3000);
	

	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}

}
