package com.QA.SeleniumElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QA_WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		WebElement printText = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		
	

	}

}
