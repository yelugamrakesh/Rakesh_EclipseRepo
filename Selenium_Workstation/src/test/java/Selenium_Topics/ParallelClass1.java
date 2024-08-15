package Selenium_Topics;

import org.testng.annotations.Test;

public class ParallelClass1 extends Driver {

	
	
	@Test(groups="Flipkart")
	public void methods1() throws Exception
	{
		
		driver.get("https://www.flipkart.com/");
		System.out.println("Flipkart Page was opened ");
		Takeascreenshot();
		Thread.sleep(2000);
	}
	
}
