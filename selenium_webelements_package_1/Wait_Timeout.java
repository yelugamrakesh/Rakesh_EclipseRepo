package selenium_webelements_package_1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Wait_Timeout {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		System.out.println("Button was Cliked");

	StoreHouse.CaptureScreenshot(driver, "Image_5.png");
		
		
		driver.findElement(By.id("txt1")).sendKeys("Rakesh");
		driver.quit();

	}

}
