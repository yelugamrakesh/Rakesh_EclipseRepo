package com.WebElements;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * This program is to get url's of the links 
 */

public class Print_URLs_of_LINKS {

	WebDriver driver;

	@BeforeMethod
	public void setupbrowser() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void terminate() {
		driver.quit();
	}

	@Test
	public void printurls() throws Exception {
		driver.get("https://www.selenium.dev/");

		List<WebElement> links = driver.findElements(By.className("nav-link"));
		System.out.println("Number of links " + links.size());
		for (WebElement link : links) {

			URL u = new URL(link.getAttribute("href"));
			System.out.println(u);

		}
	}

}
