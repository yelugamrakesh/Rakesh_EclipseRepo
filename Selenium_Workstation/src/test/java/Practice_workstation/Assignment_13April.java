package Practice_workstation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_13April {


		// TODO Auto-generated method stub
		public static void main(String[] args) throws Exception {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

			driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
			driver.findElement(By.className("login_button")).click();
			
			 String parentwindow=driver.getWindowHandle();
			 
			driver.findElement(By.xpath("//a[@onclick='fnNewUserClick();']")).click();
			driver.switchTo().alert().accept();
			
			Set<String> Newwindow=driver.getWindowHandles();
			for ( String windowss :Newwindow)
			{
				if(!windowss.equals(parentwindow))
				{
					driver.switchTo().window("newUserRegHome");
					driver.close();
					/*
					driver.manage().window().maximize();
					WebElement dr=driver.findElement(By.xpath("//select[@name='issueCode']"));
					Select s=new Select(dr);
					s.selectByValue("registerHere");
					*/
				}
			}
	}

}
