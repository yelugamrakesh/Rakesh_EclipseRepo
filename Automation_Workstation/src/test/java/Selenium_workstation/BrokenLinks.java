package Selenium_workstation;

import static org.testng.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * This Test case is to find the broken links using HttpURLConnection() method
 * Methods()
 * size()- To know the number of links
 * getAttribute()-To know the value of the attribute
 * URL() - Class used to store the Url's
 * HttpURLConnection --to establish the connection with webserver
 * setConnectTimeout() -- To wait untill the connection was established
 * connect()--To connect to the webserber 
 * getResponseCode()-To get the response code 
 */

public class BrokenLinks {

	WebDriver driver;

	@BeforeMethod
	public void setupbrowser() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void terminate() {
		driver.quit();
	}

	@Test
	public void testlinks() throws Exception {
		driver.get("https://www.selenium.dev/");
		assertEquals(driver.getTitle(), "Selenium");

		List<WebElement> links = driver.findElements(By.className("nav-link"));
		//System.out.println("Number of links are " + links.size());

		for (WebElement link : links) {
			try {
				if (link.getAttribute("href") != null)

				{

					URL u = new URL(link.getAttribute("href"));

					HttpURLConnection con = (HttpURLConnection) u.openConnection();
					con.setConnectTimeout(6000);
					con.connect();

					if (con.getResponseCode() == 200) {
						System.out.println("Link is" + u + " working");
					} else {
						System.out.println("Link is " + u + " not working");
					}

				}

			} catch (Exception ie) {
				System.out.println(ie);
				Assert.fail();
			}

		}

	}

}
