package Com.WebElements;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handles_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.xpath("(//button[@id='button1'])[1]")).click();
		ArrayList<String> id=new ArrayList();
		

	}

}
