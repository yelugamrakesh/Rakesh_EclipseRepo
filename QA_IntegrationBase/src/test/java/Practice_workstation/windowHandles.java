package Practice_workstation;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandles {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.findElement(By.id("name")).sendKeys("Entered the message");
		String Parentwindow = driver.getWindowHandle();
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> newwindow=driver.getWindowHandles();
		for(String MultipleWindow :newwindow)
		{
			if(!MultipleWindow.equals(Parentwindow))
			{
				driver.switchTo().window(MultipleWindow);
				driver.findElement(By.id("firstName")).sendKeys("Rakesh");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(Parentwindow);
		driver.findElement(By.id("newTabBtn")).click();
		driver.close();
		
		

	}

}
