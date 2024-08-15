package Com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_methods {

	/**
	 * THis program is used to explain the naviageion methods
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR tutorials");
		driver.findElement(By.name("q")).submit();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		driver.navigate().to("https://www.decodejava.com/");
	}

}
