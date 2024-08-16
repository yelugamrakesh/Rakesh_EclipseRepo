package Selenium_Topics;

import java.util.Set; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// single window

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		String Patenthandles = driver.getWindowHandle();
		System.out.println("Parent window handle" + Patenthandles + driver.getTitle());

		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windowhandlenumbers = driver.getWindowHandles();

		for (String winnumber : windowhandlenumbers) {
			if (!winnumber.equals(Patenthandles)) {
				driver.switchTo().window(winnumber);
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				driver.findElement(By.id("firstName")).sendKeys("Rakesh");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(Patenthandles);
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Raghu");
		Thread.sleep(2000);
		driver.quit();

	}

}
