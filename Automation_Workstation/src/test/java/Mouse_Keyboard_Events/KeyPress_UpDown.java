package Mouse_Keyboard_Events;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyPress_UpDown {

	WebDriver driver;

	public void Takeascreenshot() throws Exception {
		// DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		// Date dt = new Date();
		File screenshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshoot, new File("./Screenshoot_1/KeyboardEvents.jpg"));
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
	public void keyboard() throws Exception {
		driver.get("https://jqueryui.com/autocomplete/");
		Assert.assertEquals(driver.getTitle(), "Autocomplete | jQuery UI");
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("a");
		List<WebElement> li = driver.findElements(By.className("ui-menu-item"));
		for (WebElement Options : li) {

			driver.findElement(By.id("tags")).sendKeys(Keys.ARROW_DOWN);

			if (Options.getText().equals("Asp")) {
				driver.findElement(By.id("tags")).sendKeys(Keys.ENTER);
				Takeascreenshot();
				break;

			}
		}

	}

}
