package com.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	WebDriver driver ;

	public WebDriver openbrowser(String browser, String URL)
	
	
	{
		if (browser.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

		}
		
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		}
		
		
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		return driver;

	}
}