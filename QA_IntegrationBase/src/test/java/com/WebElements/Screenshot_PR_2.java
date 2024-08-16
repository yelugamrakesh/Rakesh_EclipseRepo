package com.WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Screenshot_PR_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mercedes-benz.co.in/passengercars.html?group=all&subgroup=see-all&view=BODYTYPE");
		
		Thread.sleep(2000);
		
		
		TakesScreenshot snap=(TakesScreenshot)driver;
		File S1 = snap.getScreenshotAs(OutputType.FILE);
		File Destination=new File("./Screenshoot/benz.jpg");
		FileUtils.copyFile(S1, Destination);
		
	}

}
