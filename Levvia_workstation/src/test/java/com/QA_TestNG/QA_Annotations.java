package com.QA_TestNG;


import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class QA_Annotations {

	
	@Test
	public void class1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		System.out.println("This is TestNG Message ");
		
		driver.get("https://www.google.com/");
		 
		driver.findElement(By.name("q")).sendKeys("HYR Tutorial", Keys.ENTER);
		
		
		
	}
	
}
