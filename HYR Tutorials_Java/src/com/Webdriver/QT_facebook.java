package com.Webdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class QT_facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Yelugamrakesh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Rakesh");
		int s=driver.findElements(By.tagName("a")).size();
		System.out.println(s);
		
		
	}

}
