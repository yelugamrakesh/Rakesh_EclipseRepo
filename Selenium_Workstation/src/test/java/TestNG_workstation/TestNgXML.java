package TestNG_workstation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgXML {
	WebDriver driver;

	@Test
	public void AssertionEqual1() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void tabs1() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
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

	}

	@Test
	public void google() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
