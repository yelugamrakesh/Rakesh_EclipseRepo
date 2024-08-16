package com.WebElements;

import org.openqa.selenium.By; 
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QA_Dropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Select s = new Select(driver.findElement(By.id("carselect")));
		s.selectByIndex(1);
		List<WebElement> All_the_collected_optionis = driver.findElements(By.id("carselect"));
		
		System.out.println(All_the_collected_optionis);
		
		for (WebElement One_by_one_selected_option : All_the_collected_optionis) 
		{
			
			System.out.println(One_by_one_selected_option.getText());
		}

	}

}
