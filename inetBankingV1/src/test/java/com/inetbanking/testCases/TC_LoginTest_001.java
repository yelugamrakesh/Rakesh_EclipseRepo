package com.inetbanking.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
public class TC_LoginTest_001 extends BaseClass{
	@Test
	public void loginTest() {
		driver.get(baseURL);

		logger.info("Target Website was opened");

		LoginPage LP = new LoginPage(driver);

		LP.setUserName(username);
		logger.info("User Name Entered");
		logger.info("YELUGAM RAKESH");

		LP.setPassword(password);
		logger.info("Password Entered");

		LP.clickButton();
		logger.info("Login button was clicked");

		if (driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Tittle Matched and Test passed");

		} else {

			Assert.assertFalse(false);
			logger.info("Title Mismathced and Test Failed");
		}

	}

}
