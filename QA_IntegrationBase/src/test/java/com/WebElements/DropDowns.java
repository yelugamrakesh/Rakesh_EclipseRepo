package com.WebElements;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/**
		 * This program is used to handle single dropdowns and multiple dropdowns
		 */
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		// To select for multiple dorpdowns
		WebElement MultipDR = driver.findElement(By.id("ide"));
		Select s1 = new Select(MultipDR);
		s1.selectByIndex(0);

		s1.selectByValue("ij");
		s1.selectByVisibleText("NetBeans");
		Thread.sleep(2000);
		s1.deselectByValue("ij");

		List<WebElement> option12 = s1.getAllSelectedOptions();
		for (WebElement selectedoptions : option12) {
			System.out.println("selected options" + selectedoptions.getText());
		}

	}

}
