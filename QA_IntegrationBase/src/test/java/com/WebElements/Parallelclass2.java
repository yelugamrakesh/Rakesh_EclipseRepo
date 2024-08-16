package com.WebElements;

import org.testng.annotations.Test;

public class Parallelclass2 extends Driver {

	@Test(groups="Flipkart")
	public void methods1() throws Exception {
		driver.get("https://www.amazon.in/");
		System.out.println("amazon Page was opened  ");
		Thread.sleep(2000);
	}
}
