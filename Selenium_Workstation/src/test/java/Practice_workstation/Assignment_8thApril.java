package Practice_workstation;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8thApril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		WebElement month = driver.findElement(By.id("month"));

		List<WebElement> options = month.findElements(By.tagName("option"));
		System.out.println(options);

		boolean elementFound = false;
		for (WebElement option : options) {
			if (option.getText().equals("Nov")) {
				elementFound = true;
				break;
			}
		}

		if (elementFound) {
			System.out.println("Element found in dropdown");
		} else {
			System.out.println("Element not found in dropdown");
		}

	}

}
