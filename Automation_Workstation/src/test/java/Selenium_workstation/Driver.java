package Selenium_workstation;

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
import org.openqa.selenium.safari.SafariDriver;
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
		FileUtils.copyFile(screenshoot, new File("./Screenshoot_1/" + sdf.format(dt) + ".jpg"));
	}

	@BeforeMethod
	@Parameters("browser1")

	public void setupbrowser(String browser1) {
		if (browser1.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser1.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser1.equals("safari")) {
			driver = new SafariDriver();
		}

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void terminate() {
		driver.quit();
	}

}
