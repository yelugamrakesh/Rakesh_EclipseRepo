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
 * Test Case:   click on element
 * Website :https://retail.onlinesbi.sbi/retail/login.htm
 * Method :
 * a.click().perform()
 * a.click​(WebElement target).perform()
 */

public class click_Method {

	WebDriver driver;

	public void Takeascreenshot() throws Exception {
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt = new Date();
		File screenshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshoot, new File("./Screenshoot/img2.jpg"));
		FileUtils.copyFile(screenshoot, new File("./Screenshoot_1/" + sdf.format(dt) + ".jpg"));
	}

	@BeforeMethod
	public void setupbrowser() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.manage().window().minimize();

	}

	@AfterMethod
	public void terminate() {
		driver.quit();
	}

	@Test
	public void clickMethod() throws Exception {
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");

		Actions a = new Actions(driver);
		WebElement cl = driver.findElement(By.className("login_button"));
		a.click(cl).perform();
		Thread.sleep(2000);
		Takeascreenshot();
	}

}
