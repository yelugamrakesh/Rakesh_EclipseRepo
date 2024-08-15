
package com.QA.SeleniumElements;
import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This Program is to find Number of Links in a webpage using size and findelements  method
 * @return 
 */

public class QA_Number_of_Links

{

	@Test
	public static void numberoflinks()
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.letskodeit.com/practice");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		int TotalLinks = links.size();
		
		System.out.println("There are " + TotalLinks + "Links in the webpage ");
		
		for(int i=0 ;i<=TotalLinks;i++)
			
		{
			
			System.out.println(driver.findElements(By.tagName("a")).get(i).getText());
			
		}
	
		driver.quit();

	}
	}
	
	


