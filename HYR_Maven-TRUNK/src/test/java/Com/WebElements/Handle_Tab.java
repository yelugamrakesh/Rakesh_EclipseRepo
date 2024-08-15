package Com.WebElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Tab {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

	
		String parentWindowHandle = driver.getWindowHandle();
		
		System.out.println("Parent window handle - "+parentWindowHandle + driver.getTitle());
		
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.findElement(By.id("alertBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("output")).getText());
				Thread.sleep(3000);
				driver.close();
			}
		}

		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("HYR TUtorials");

		Thread.sleep(3000);
		driver.quit();
	}

		
	}


