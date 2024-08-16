package com.WebElements;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public void doubleclic() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");

		Actions a = new Actions(driver);
		a.contextClick(driver.findElement(By.id("openwindow"))).perform();
		Thread.sleep(2000);
		a.sendKeys("Inspect").perform();

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ActionsClass N=new ActionsClass();
		N.doubleclic();
	}

}
