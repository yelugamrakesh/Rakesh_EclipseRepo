package Com.xpath_writing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_bigbasket {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='img-placeholder'])[53]")).click();
		
		
		
		
	}

}
