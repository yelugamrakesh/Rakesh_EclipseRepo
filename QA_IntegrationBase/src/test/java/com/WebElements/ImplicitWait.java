package com.WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class ImplicitWait extends Browsers {

	public void test() {

		WebDriver driver = openbrowser("chrome", "https://www.hyrtutorials.com/p/waits-demo.html");

		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("rakesh");
	
	}

	public static void main(String[] args) {
		ImplicitWait s = new ImplicitWait();
		s.test();
	}

}
