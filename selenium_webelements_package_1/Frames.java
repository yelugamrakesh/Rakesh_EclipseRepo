package selenium_webelements_package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.findElement(By.id("name")).sendKeys("Rakesh");

		driver.switchTo().frame("frm1");

		Select s = new Select(driver.findElement(By.id("course")));
		s.selectByVisibleText("Java");

		driver.switchTo().defaultContent();

		driver.findElement(By.id("name")).sendKeys("Warangal");
		
		
	}

}
