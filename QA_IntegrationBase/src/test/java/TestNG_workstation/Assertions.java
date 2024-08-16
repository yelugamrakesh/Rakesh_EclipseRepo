package TestNG_workstation;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {

	@Test
	public void AssertionEqual1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Assert.assertEquals(driver.getTitle(), "Practice Page");

		
		//this method is used to validate radio buttons,check boxes.
	//driver.findElement(By.id("bmwradio")).click();
		Assert.assertFalse(driver.findElement(By.id("bmwradio")).isSelected());
		
		//This condition fails the programm
		//Assert.fail();
		
		System.out.println("This method succussfull");
		driver.quit();
	}

}
