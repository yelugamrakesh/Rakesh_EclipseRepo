package com.WebElements;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_1 {

	public Logger Logs = null;
	public ExtentTest test = null;
	public ExtentReports report = null;

	static WebDriver driver;

	public void TestLogs() {

		Logs = Logger.getLogger("TestLoggger");
		Logs.debug("Test Called");

		report = new ExtentReports();

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Logs.debug("Opened  site");

		Select s1 = new Select(driver.findElement(By.id("country")));
		s1.selectByVisibleText("Australia");
		driver.quit();

	}

	public static void main(String[] args) {
		Dropdown_1 t = new Dropdown_1();
		t.TestLogs();

	}

}
