package com.WebElements;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle_PR3 {

	@Test
	public void tabhandle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.letskodeit.com/practice");
		String ParentWindow = driver.getWindowHandle();
		driver.findElement(By.id("opentab")).click();

		Set<String> windowhanles = driver.getWindowHandles();
		for (String windowhandles1 : windowhanles) {
			if (!windowhandles1.equals(ParentWindow)) {

				driver.switchTo().window(windowhandles1);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.id("search")).sendKeys("Rest API");
				Thread.sleep(2000);
			}
		}

	}

}
