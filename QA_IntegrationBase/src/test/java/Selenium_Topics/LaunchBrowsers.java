package Selenium_Topics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.*;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowsers {

	public void chrome() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.quit();
	}

	public void firefox() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.abhibus.com/");
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LaunchBrowsers L1 = new LaunchBrowsers();
		L1.firefox();

	}

}
