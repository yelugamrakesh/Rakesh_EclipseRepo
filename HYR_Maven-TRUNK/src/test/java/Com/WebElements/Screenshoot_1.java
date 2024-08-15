package Com.WebElements;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshoot_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot s=(TakesScreenshot)driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File Destination = new File("./Screenshoot/img2.jpg");
		FileUtils.copyFile(source, Destination);

	}

}
