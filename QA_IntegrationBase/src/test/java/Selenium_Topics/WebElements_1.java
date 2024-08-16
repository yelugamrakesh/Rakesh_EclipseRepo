package Selenium_Topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
//	List<WebElement> cout=	driver.findElements(By.linkText("a")).size());
	System.out.println(driver.findElements(By.tagName("a")).size());
		
	}

}
  