package Com.WebElements;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alerts {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("promptBox")).click();
	
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Rakesh");
	
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("output")).getText());
		driver.quit();
	}

}
