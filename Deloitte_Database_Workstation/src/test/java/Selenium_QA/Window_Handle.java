package Selenium_QA;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handle {

	public static void main(String[] args) {
		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.findElement(By.id("name")).sendKeys("Rakesh");
		String Parentwindow = driver.getWindowHandle();

		System.out.println(Parentwindow + driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();

		Set<String> childwindow = driver.getWindowHandles();
		
	for (String collection : childwindow) {
		if(collection!=Parentwindow)
		{
			driver.switchTo().window(collection);
		}
	}

	}
}
