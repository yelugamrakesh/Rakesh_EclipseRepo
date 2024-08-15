package Selenium_Topics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts extends Driver {

	@Test
	public void tabs1() throws Exception {

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("alertBox")).click();
		driver.switchTo().alert().accept();
		System.out.println("Note" + driver.findElement(By.id("output")).getText());

		Thread.sleep(3000);

		driver.findElement(By.id("confirmBox")).click();
		driver.switchTo().alert().accept();
		System.out.println("Note" + driver.findElement(By.id("output")).getText());

		driver.findElement(By.id("confirmBox")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("Note" + driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);

		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("Rakesh");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		System.out.println("Note" + driver.findElement(By.id("output")).getText());
		System.out.println("Alert class was sucssfully executed");
	}

}
