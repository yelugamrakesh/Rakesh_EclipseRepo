package com.WebElements;

/**
 * This program is to store a webelement and reuse using findelement
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QA_FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		WebElement printText = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		System.out.println(printText.getText());
		System.out.println("Inter Postponed from the edge of the secound tool");
		
		
		
		
		
	}

}
