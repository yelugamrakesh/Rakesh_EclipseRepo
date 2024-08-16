package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_frames {
	
	
	
	
public static void main(String[] args) {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	
	
	
	driver.findElement(By.id("name")).sendKeys("Text1");
	driver.switchTo().frame("frm1");
	
	Select dr=new Select(driver.findElement(By.id("course")));
	dr.selectByVisibleText("Java");

	
	
	
}
}
