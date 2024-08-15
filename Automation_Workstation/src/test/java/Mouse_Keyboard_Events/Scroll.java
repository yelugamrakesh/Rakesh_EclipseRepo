package Mouse_Keyboard_Events;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scroll {
	WebDriver driver;

	public void Takeascreenshot() throws Exception {
		// DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		// Date dt = new Date();
		File screenshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshoot, new File("./Screenshoot_1/Dynamicscroll.jpg"));
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
	public void testBrowserSlider() throws InterruptedException {
		// Load web page
		driver.get("https://www.myntra.com/");

		// scroll until the element is found

		while (isElementPresent(driver, By.xpath(
				"//img[@src='https://assets.myntassets.com/w_122,c_limit,fl_progressive,dpr_2.0/assets/images/2022/3/8/1a66b994-5b88-4d40-b8d3-cff57b438d4a1646753584579-SS22-TrendsForHer-Summer-Sandals.jpg']"))) {
			((RemoteWebDriver) driver).executeScript("window.scrollBy(0,400)");
			Thread.sleep(1000);

		}
		driver.findElement(By.xpath(
				"//img[@src='https://assets.myntassets.com/w_122,c_limit,fl_progressive,dpr_2.0/assets/images/2022/3/8/1a66b994-5b88-4d40-b8d3-cff57b438d4a1646753584579-SS22-TrendsForHer-Summer-Sandals.jpg']"))
				.click();

		// scroll to the specific times

//		for(int i=0;i<8;i++)
//		{
//			((RemoteWebDriver) d).executeScript("window.scrollBy(0,400)");
//			Thread.sleep(1000);
//		}
//		((RemoteWebDriver) d).executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);

	}

	public boolean isElementPresent(WebDriver driver, By locator) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		try {
			driver.findElement(locator);
			return false;
		} catch (NoSuchElementException e) {
			return true;
		}

	}
}
