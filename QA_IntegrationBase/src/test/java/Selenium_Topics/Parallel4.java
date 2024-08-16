package Selenium_Topics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Parallel4 extends Driver {

	
	WebDriver driver;
	
	@Test(groups="practice")
	public void methods1() throws Exception {
		driver.get("https://www.letskodeit.com/practice");
		System.out.println("This is  a Practice page on chrome  was opened  ");
		Thread.sleep(2000);
	}
}
