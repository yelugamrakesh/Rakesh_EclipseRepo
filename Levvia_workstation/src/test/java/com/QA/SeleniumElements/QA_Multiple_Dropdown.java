package com.QA.SeleniumElements;

/**
 * This program is to select Multiple options from dropdown and deselect one option and print in the console 
 */
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.util.*;
import org.openqa.selenium.WebElement;

public class QA_Multiple_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		Select s = new Select(driver.findElement(By.id("ide")));

		System.out.println(s);
		List<WebElement> TotalList_In_Dropdown = s.getOptions();

		for (WebElement One_by_one : TotalList_In_Dropdown) {

			System.out.println(One_by_one.getText());

		}

		s.selectByIndex(0);
		s.selectByVisibleText("IntelliJ IDEA");
		s.selectByValue("vs");

		s.deselectByVisibleText("IntelliJ IDEA");

		List<WebElement> SelecteOptios = s.getAllSelectedOptions();
		for (WebElement oneByone : SelecteOptios) {
			System.out.println(oneByone.getText());
		}

	}

}
