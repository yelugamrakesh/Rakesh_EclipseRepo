package Mouse_Keyboard_Events;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Test Case Name :  Drag and drop a element .
 * Website : https://jqueryui.com/datepicker/
 * Methods :
 * a.dragAndDrop​(WebElement source, WebElement target).perform()
    a.dragAndDropBy​(WebElement source, int xOffset, int yOffset).perform()
 */

public class DragandDrop_Method {
	WebDriver driver;

	public void Takeascreenshot() throws Exception {
		// DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		// Date dt = new Date();
		File screenshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshoot, new File("./Screenshoot_1/draganddropslider.jpg"));
		// FileUtils.copyFile(screenshoot, new File("./Screenshoot_1/" + sdf.format(dt)
		// + ".jpg"));
	}

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

	
	public void drags1() throws Exception {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		Takeascreenshot();

	}
	
	
	@Test
	public void drags2() throws Exception {
		
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		Actions a = new Actions(driver);
		a.dragAndDropBy(driver.findElement(By.id("slider")), 240, 0).perform();
		Thread.sleep(2000);
		Takeascreenshot();
	}

}
