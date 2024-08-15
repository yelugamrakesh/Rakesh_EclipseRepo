package com.inetbanking.testCases;

import org.apache.log4j.Logger; 
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



import com.inetbanking.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readConfiguration = new ReadConfig();

	String baseURL = readConfiguration.getApplicationURL();
	String username = readConfiguration.getUserName();
	String password = readConfiguration.getPwd();

	public static WebDriver driver;
	public static Logger logger;

	


	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		// logs
		logger = Logger.getLogger("Banking");
		PropertyConfigurator.configure("log4j.properties");
		

	
		
		if (br.equals("chrome")) {
			// WebDriver
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if (br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get(baseURL);

	

	}

	@AfterClass
	public void teardown() {
		
		driver.quit();
		
	}

}
