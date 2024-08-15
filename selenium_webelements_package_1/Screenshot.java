package selenium_webelements_package_1;

import java.io.File; 
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File files = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(files, new File("./Screenshots/Image_4.png"));

		driver.quit();
	}

}
