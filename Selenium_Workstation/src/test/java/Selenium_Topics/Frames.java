package Selenium_Topics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames extends Driver {

	@Test
	public void tabs1() throws Exception {
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.xpath(" //input[@id='name']")).sendKeys("Rakesh");
		driver.switchTo().frame("frm1");

		Select s = new Select(driver.findElement(By.id("course")));
		s.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();

	}

}
