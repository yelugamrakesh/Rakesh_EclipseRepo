package selenium_webelements_package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		driver.findElement(By.id("promptBox")).click();
		driver.switchTo().alert().sendKeys("Yelugam Rakesh");
		driver.switchTo().alert().accept();

		String TextContainer = driver.findElement(By.id("output")).getText();
		System.out.println(TextContainer);
		

	}

}
