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
 * Test Case Name :  Click and Hold a element .
 * Website : https://jqueryui.com/slider/"
 * Methods :
 *a.clickAndHold​(source).moveToElement​(target).release().build().perform()
                      .moveByOffset​(xOffset,yOffset)
 */

public class ClickAndHold_Method {
	WebDriver driver;

	public void Takeascreenshot() throws Exception {
		// DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		// Date dt = new Date();
		File screenshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshoot, new File("./Screenshoot_1/Clickandhold.jpg"));
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
	public void ClickandHold1() throws Exception {
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		Actions a = new Actions(driver);

		a.clickAndHold(driver.findElement(By.id("slider"))).moveByOffset(260, 0).release().build().perform();
		Takeascreenshot();

	}

}
