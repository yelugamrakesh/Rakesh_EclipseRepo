package Practice_workstation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	
	
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	
	@Test
	public void dropdowns1()
	{
		WebElement drvalue=driver.findElement(By.id("carselect"));
		Select s=new Select(drvalue);
		
	List<WebElement>options  =s.getOptions();
	for(WebElement totoaloptions : options)
	{
		System.out.println("All options " +totoaloptions.getText());
	}
	
	
	}
	
}
