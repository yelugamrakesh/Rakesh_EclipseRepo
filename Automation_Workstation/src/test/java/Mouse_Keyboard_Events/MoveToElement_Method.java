package Mouse_Keyboard_Events;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Test Case:  Move the mouse to selected place
 * Website :https://jqueryui.com/datepicker/
 * Method :
 *  a.moveToElement​(WebElement target).perform()
 *   a.moveToElement​(WebElement target, int xOffset, int yOffset).perform()
 */

public class MoveToElement_Method {

	WebDriver driver;

	public void Takeascreenshot() throws Exception {
		// DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		// Date dt = new Date();
		File screenshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshoot, new File("./Screenshoot_1/Moetoelement.jpg"));
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

	@Test
	public void move() throws Exception {
		driver.get("https://jqueryui.com/datepicker/");

		Actions a = new Actions(driver);
		WebElement cl = driver.findElement(By.linkText("Support"));

		a.moveToElement(cl).build().perform();
		Thread.sleep(2000);
		Takeascreenshot();
	}

}
