package POM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Config {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		
		Properties pr=new Properties();
		FileInputStream file=new FileInputStream("/Users/yelugamrakesh/Documents/Documents - Yelugam_Rakesh/Deloitte_Database_Workstation/Reports/config1.properties");
		pr.load(file);
		
		System.out.println(pr.getProperty("Title"));
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		   driver.get(pr.getProperty("url"));
		   
		   
		 FileOutputStream fout=new FileOutputStream("/Users/yelugamrakesh/Documents/Documents - Yelugam_Rakesh/Deloitte_Database_Workstation/Reports/config1.properties");
		   pr.setProperty("Testing Data", "Rakesh_9737");
		
	}

}
