package Demo_Selenium_Topicwise;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Handle_webelements {


	
	public void openChromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/chromedriver_mac_arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("chrome browser was opened");
			}
	
	
	public void radioButtons()
	{
		System.setProperty("webdriver.gecho.driver", "/Users/rakeshiphoneyelugam/Downloads/Library/geckodriver");
		//ChromeDriver driver=new ChromeDriver(); 
		 FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();


	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Demo_Handle_webelements RadioBT=new Demo_Handle_webelements();
		RadioBT.radioButtons();
	}

}
