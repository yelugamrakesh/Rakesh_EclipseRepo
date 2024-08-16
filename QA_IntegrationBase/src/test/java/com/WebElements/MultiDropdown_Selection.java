package com.WebElements;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropdown_Selection {

	WebDriver driver;

	@AfterTest
	public void closebrowser() {
		driver.quit();
	}

	@BeforeTest
	@Parameters({ "URL" })
	public void LaunchWebSite(String URL) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
	}

	@Test
	public void Mutliselection() throws Exception {
		List<WebElement> Drop = driver.findElements(By.id("colors"));
		for (WebElement AllElements_in_dropdown : Drop) {
			System.out.println(AllElements_in_dropdown.getText());
			Select s = new Select(driver.findElement(By.id("colors")));
			s.selectByVisibleText("Red");
			Thread.sleep(3000);
			s.selectByIndex(2);
		}

	}
}
