package com.WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://mvnrepository.com/");
			driver.close();
			TakesScreenshot TS = (TakesScreenshot) (TakesScreenshot) driver;
			File FileLocation = TS.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(FileLocation, new File("Screenshots/Image.png"));
			driver.quit();
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
