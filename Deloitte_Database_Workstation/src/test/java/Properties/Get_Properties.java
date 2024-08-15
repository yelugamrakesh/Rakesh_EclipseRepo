package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Properties {

	public static void main(String[] args) throws IOException {
		Properties prclass = new Properties();
		FileInputStream file = new FileInputStream(
				"/Users/yelugamrakesh/Documents/Documents - Yelugam_Rakesh/Deloitte_Database_Workstation/input.properties");
		prclass.load(file);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(prclass.getProperty("url"));

		driver.quit();

	}
}
