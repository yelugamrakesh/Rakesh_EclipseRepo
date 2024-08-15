package Com.WebElements;

import java.io.*; 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_PR_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bmw.in/en/index.html");

		/*
       TakesScreenshot s=(TakesScreenshot)driver;
		File S1 = s.getScreenshotAs(OutputType.FILE);
		File d1 = new File("./Screenshoot/bmw1.jpg");
		FileUtils.copyFileToDirectory(s1, d1);
		*/
		
	
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d1 = new File("./Screenshoot/bmw1.jpg");
		FileUtils.copyFileToDirectory(s, d1);
	}

}
