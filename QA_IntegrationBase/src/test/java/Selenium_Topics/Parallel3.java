package Selenium_Topics;

import org.testng.annotations.Test;

public class Parallel3  extends Driver{
	
	@Test(groups="practice")
	public void methods1() throws Exception {
		driver.get("https://www.hyrtutorials.com/");
		System.out.println("This is HYR turorials on chrome  was opened  ");
		Thread.sleep(2000);
	}
}


