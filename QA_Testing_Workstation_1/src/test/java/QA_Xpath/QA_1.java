package QA_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QA_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.id("name")).sendKeys("Rakesh");
		driver.findElement(By.id("email")).sendKeys("Yelugam");
		driver.findElement(By.id("phone")).sendKeys("9908994458");
		driver.findElement(By.id("textarea")).sendKeys("H.No -1125-3200");

		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("tuesday")).click();

		Select s = new Select(driver.findElement(By.id("country")));
		s.selectByValue("canada");

		Select s1 = new Select(driver.findElement(By.id("colors")));
		s1.selectByValue("green");
		
		
		
	}

}
