package com.WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");

		WebElement option1 = driver.findElement(By.id("multiple-select-example"));
		Select selected1 = new Select(option1);
		selected1.selectByIndex(0);
		selected1.selectByValue("orange");
		selected1.selectByVisibleText("Peach");
		Thread.sleep(2000);
		selected1.deselectByValue("orange");
		
		
		
		List<WebElement> option11 = selected1.getAllSelectedOptions();
		for (WebElement optionsPrint : option11)
			
		{
			System.out.println(optionsPrint.getText());
		}

	}

}
