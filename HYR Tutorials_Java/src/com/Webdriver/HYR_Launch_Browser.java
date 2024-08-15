package com.Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYR_Launch_Browser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.letskodeit.com/practice");

		driver.close();

	}

}
