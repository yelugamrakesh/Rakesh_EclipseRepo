package com.Selenium_PracticeBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_Dropdown {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");

		WebElement dropdown = driver.findElement(By.id("carselect"));
		Select s = new Select(dropdown);
		Thread.sleep(3000);
		s.selectByVisibleText("BMW");
		driver.quit();
	}

}
