package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_TextBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here webdriver Manager has added in POM file
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		// Here Manage is a instatnce were it contorls the window
		driver.manage().window().maximize();

		// Steps to find textbox and enter the value in it if it is present in UI
		WebElement Textbox = driver.findElement(By.xpath(" //input[@id='firstName']"));
		if (Textbox.isDisplayed()) {
			if (Textbox.isEnabled()) {
				Textbox.sendKeys("Entered Text");
				String TextEntered = Textbox.getAttribute("value");
				System.out.println(TextEntered);
			} else
				System.out.println("Not enabled ");
		} else
			System.out.println("Not Displayed");
	}
}
