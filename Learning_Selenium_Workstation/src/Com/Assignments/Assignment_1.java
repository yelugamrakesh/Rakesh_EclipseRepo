package Com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
	
		System.out.println("chrome browser was opened");
		driver.findElement(By.xpath("(//div[@id='banner'])[1]/child::div[2]/a")).click();
		
		driver.findElement(By.id("username")).sendKeys("Rakesh");
		driver.findElement(By.id("label2")).sendKeys("Rakesh@123");
	}

}
