package com.WebElements;

import java.io.File; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Driver {

	WebDriver driver;

	public void Takeascreenshot() throws Exception {
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt = new Date();
		File screenshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshoot, new File("./Screenshoot/img2.jpg"));
		FileUtils.copyFile(screenshoot, new File("./Screenshoot/" + sdf.format(dt) + ".jpg"));
	}

	@BeforeMethod
	//@Parameters("browser")
	public void setup(String browser) {
		if (browser.equals("Fire")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome"))

		{
			driver = new ChromeDriver();
			driver=new ChromeDriver();
		 driver.close();
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}
}
