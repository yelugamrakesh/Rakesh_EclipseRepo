package Selenium_Topics;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplaye_isEnabled {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		driver.get("https://www.ifsccodebank.com/");
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

	@Test
	public void Dropdown1() throws Exception {
		WebElement dr = driver.findElement(By.id("BC_ddlBank"));
		if (dr.isDisplayed()) {
			System.out.println("Element id found ");
			Thread.sleep(2000);
			Select s = new Select(dr);
			s.selectByVisibleText("Bank Of Maharashtra");
		}

	}

}
