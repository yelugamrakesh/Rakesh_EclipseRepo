package Selenium_Topics;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvents extends Screenshoot1 {

	WebDriver driver;

	public void Takeascreenshot() throws Exception {
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt = new Date();
		File screenshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshoot, new File("./Screenshoot/img2.jpg"));
		FileUtils.copyFile(screenshoot, new File("./Screenshoot/" + sdf.format(dt) + ".jpg"));
	}

	@BeforeMethod
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/"); 
		
	}

	@AfterMethod
	public void close() {
		driver.close();
	}

	@Test
	public void mouse() throws Exception {

		// assertEquals
		Assert.assertEquals(driver.getTitle(), "jQuery UI");
		Actions a = new Actions(driver);

		// moveToElement();
		// a.moveToElement(driver.findElement(By.linkText("Contribute"))).perform();
		// Thread.sleep(1000);
		// driver.findElement(By.linkText("Bug Triage")).click();

		// clickAndHold()

		// dragAndDrop();
		// driver.navigate().back();
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")));

		// Takeascreenshot();
		Thread.sleep(2000);

	}

}
