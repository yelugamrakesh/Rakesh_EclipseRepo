package com.WebElements;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Radiobuttons {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/**
		 * Here in this program we are testing or handling Text box ,radio button, and
		 * links
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		driver.findElement(By.xpath("//input[@id='femalerb']")).click();

		WebElement check = driver.findElement(By.xpath("//input[@id='englishchbx']"));
		check.click();
		Thread.sleep(2000);
		if (check.isDisplayed()) {
			if (check.isSelected()) {
				System.out.println("check box is present");
				driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
				Thread.sleep(3000);

			} else
				System.out.println("No element was selected");
		} else
			System.out.println("No element was displayed ");

		driver.findElement(By.xpath("//button[@id='registerbtn']")).click();

		System.out.println(driver.findElement(By.xpath("//label[@id='msg']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		driver.close();
	}

}
