package Com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Frames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


	
		System.setProperty("webdriver.chrome.driver",
				"/Users/rakeshiphoneyelugam/Downloads/Library/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Load web page
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		// Switch driver focus to frame
		driver.switchTo().frame("iframeResult");
		// Multi DD
		Select dd = new Select(driver.findElement(By.id("cars")));

		for (int i = 0; i < dd.getOptions().size(); i++) {
			dd.selectByIndex(i);
		}
		Thread.sleep(1000);
		dd.deselectAll();
			

			}

		

	}


