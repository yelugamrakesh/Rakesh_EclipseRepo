package com.WebElements;

/**
 * Program which shows findelements
 * This program is to find the Number of links in the page and getting the Text which is associated to the Link.
 */


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QA_FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.letskodeit.com/practice");

		List<WebElement> or = driver.findElements(By.tagName("a"));

		for (WebElement Listeda : or) {
			
			System.out.println(Listeda.getText());
 
		}

	}

}
