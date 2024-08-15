package selenium_webelements_package_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This Program is to get the window handels and switch between the handles
 */
public class WindowHandles_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		// Getting the windowHandle to a variable
		String Parendtwindow = driver.getWindowHandle();
		System.out.println("Name of the Parent window is " + Parendtwindow + driver.getTitle());

		driver.findElement(By.id("name")).sendKeys("Rakesh");

		// click on the new window
		driver.findElement(By.id("newWindowBtn")).click();

		// storing all the windowhandles in the Allwindows variable with set<string>
		// retruntype
		Set<String> Allwindows = driver.getWindowHandles();
		for (String onebyone : Allwindows) {
			if (!onebyone.equals(Parendtwindow)) {
				driver.switchTo().window(onebyone);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Rahul");
				driver.close();

			}
			driver.switchTo().window(Parendtwindow);
		}
	}

}
