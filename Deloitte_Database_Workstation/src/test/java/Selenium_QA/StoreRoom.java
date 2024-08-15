package Selenium_QA;

import java.io.File; 
import java.sql.Connection;
import java.sql.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StoreRoom {

	WebDriver driver = null;
	Connection con=null;

	public void screenshot() throws Exception {
		TakesScreenshot TS = (TakesScreenshot) driver;
		File LocalStorage = TS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(LocalStorage, new File("./Screenshots/Image_01.png"));

	}

	public WebDriver browser(String Browser, String url) {
		if (Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(url);
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		return driver;

	}

	public  Connection getConn() throws Exception {
		Class.forName("com.googlecode.sqlsheet.Driver");
		 con = DriverManager.getConnection("jdbc:xlxs://Users//yelugamrakesh//Downloads//Testing.xlsx");
		System.out.println("Connected to Excel");
		return con;
	}
	
	public void Closeconn() throws Exception
	{
		con.close();
	}

	public void closeBrowser() {
		driver.quit();
	}

}
