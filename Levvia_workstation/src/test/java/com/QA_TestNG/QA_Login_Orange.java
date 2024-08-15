package com.QA_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QA_Login_Orange {

	WebDriver driver;

	
	@BeforeTest
	public void InitiaizeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	@Test
	public void LaunchAPP() {
		
	}	


	@AfterTest
	public void Close_Browser()

	{

		driver.quit();

	}

}
