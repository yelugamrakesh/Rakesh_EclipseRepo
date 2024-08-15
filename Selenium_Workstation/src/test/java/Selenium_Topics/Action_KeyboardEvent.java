package Selenium_Topics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author rakeshiphoneyelugam This is a program about how to handle keyboard
 *         events in selenium
 * 
 */

public class Action_KeyboardEvent {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

	@Test
	public void KeyboardEvents() throws Exception {
		
		Actions a = new Actions(driver);
		
		driver.findElement(By.id("source")).sendKeys("Hyd");

		a.keyDown(Keys.DOWN).perform();
		a.keyDown(Keys.DOWN).perform();
		a.keyDown(Keys.ENTER).perform();

		TakesScreenshot s = (TakesScreenshot) driver;
		File S1 = s.getScreenshotAs(OutputType.FILE);
		File d1 = new File("./Screenshoot/Abhi1.jpg");
		FileUtils.copyFileToDirectory(S1, d1);
	}

}
