package Selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Demo {

	public static void main(String[] args) throws InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("(//a[@target='packageFrame'])[2]")).click();

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("packageFrame");
		System.out.println("still this code was executed");
		System.out.println(driver.findElement(By.xpath("//h2[@title='Interfaces']")).getText());

		driver.switchTo().defaultContent();

	
		driver.findElement(By.xpath("//tr[@id='i0']/child::td/following-sibling::th")).click();

	}
}
