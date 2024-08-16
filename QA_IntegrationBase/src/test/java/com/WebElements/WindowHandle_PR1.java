package com.WebElements;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WindowHandle_PR1 extends Browsers {

	public void test() throws Exception {
		WebDriver driver = openbrowser("chrome", "https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent window is " + parentwindow + driver.getTitle());

		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String Totalhandles : windowHandles) {
			if (!Totalhandles.equals(parentwindow)) {
				driver.switchTo().window(Totalhandles);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Rakesh");
				TakesScreenshot snap = (TakesScreenshot) driver;
				File S1 = snap.getScreenshotAs(OutputType.FILE);
				File Destination = new File("./Screenshoot/handle.jpg");
				FileUtils.copyFile(S1, Destination);
				driver.quit();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WindowHandle_PR1 t = new WindowHandle_PR1();
		t.test();
	}

}
