package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Keyboard_PR2 {
	
	
	WebDriver driver;
	@BeforeMethod
	public void browser()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
	}
	
	@org.testng.annotations.Test
	public void Test() throws Exception
	{
		Actions a = new Actions(driver);

		driver.findElement(By.id("source")).sendKeys("Hyd");
		Thread.sleep(2000);
		a.keyDown(Keys.DOWN).perform();
		a.keyDown(Keys.ENTER).perform();
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}



}
