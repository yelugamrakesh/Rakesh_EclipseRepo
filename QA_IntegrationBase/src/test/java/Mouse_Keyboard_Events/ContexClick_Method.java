package Mouse_Keyboard_Events;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Test Case:  Right click on element
 * Website :https://swisnl.github.io/jQuery-contextMenu/demo.html
 * Method :
 * a.contextClick().perform()
 * a.contextClick​(WebElement target).perform()
 */

public class ContexClick_Method {
	WebDriver driver;

	public void Takeascreenshot() throws Exception {
		// DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		// Date dt = new Date();
		File screenshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshoot, new File("./Screenshoot_1/RightClick.jpg"));
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
	public void RightClick() throws Exception {
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions a = new Actions(driver);
		WebElement cl = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Thread.sleep(2000);
		a.contextClick(cl).perform();
		Takeascreenshot();

	}

}
