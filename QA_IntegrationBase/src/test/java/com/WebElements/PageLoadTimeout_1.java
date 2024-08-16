package com.WebElements;

import java.time.Duration;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author rakeshiphoneyelugam Here we are Cheking pageloadtimeout
 *
 */

public class PageLoadTimeout_1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//setting the page to wait till 15 sec using pageloadTimeout
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/");

		// Start Time reecord
		Instant starttime = Instant.now();
		System.out.println("start time" + starttime.toString());

		// End Time record
		Instant endtime = Instant.now();
		System.out.println("End time" + endtime.toString());
		
		// Total time calculation
		Duration D = Duration.between(starttime, endtime);
		System.out.println("Total Time" + " " + +D.toMillis() + " secounds");

	}

}
