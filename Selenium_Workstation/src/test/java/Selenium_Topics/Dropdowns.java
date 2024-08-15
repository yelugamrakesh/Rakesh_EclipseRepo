package Selenium_Topics;

import org.testng.annotations.Test; 
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author rakeshiphoneyelugam Ths section of code is about dropdown selection
 *         and deselection ,getting all the selected option in console Methods :
 * 
 *         s1.deselectAll(); s1.deselectByIndex(0); s1.deselectByValue("");
 *         s1.deselectByVisibleText(""); s1.getAllSelectedOptions();
 *         s1.getFirstSelectedOption(); s1.getOptions(); s1.selectByIndex(0);
 *         s1.selectByValue(""); s1.selectByVisibleText("");
 *
 */

public class Dropdowns {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

	@Test
	public void Dropdown1() throws Exception {

		WebElement dropdown = driver.findElement(By.id("multiple-select-example"));

		Select s1 = new Select(dropdown);

		s1.selectByIndex(0);
		s1.selectByValue("orange");
		s1.selectByVisibleText("Peach");

		// This line is to deselect the selected option
		s1.deselectByValue("orange");

		// This section of code is to print selected value
		/**
		 * List<WebElement> option12 = s1.getAllSelectedOptions(); 
		 * for (WebElement selectedoptions : option12) 
		 * { 
		 * System.out.println("selected options " +" " +selectedoptions.getText());
		 *  }
		 */

		// This section is to print all the option in the dropdown
		List<WebElement> option12 = s1.getAllSelectedOptions();
		for (WebElement selectedoptions : option12) {
			System.out.println("selected options  " + "  " + selectedoptions.getText());
		}

	}
}
