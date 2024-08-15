package JDBC;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Born_vita {

	public static void main(String[] args) throws Exception {

		Properties prclass = new Properties();
		FileInputStream file = new FileInputStream("./PropertiesFiles/BornVita.properties");
		prclass.load(file);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.tayyarijeetki.in/download-e-book/?utm_medium=cpc&utm_source=google-ads&utm_campaign=drin_bournvita_in_junejune_2023_inr_eng_mental-health-may_est-123_in23ca18&utm_term=performance-max-lytics-tjk-freq-visitor-mental-health-badmintion&utm_content=1x1&utm_term=&utm_campaign=PMax+-+Conv+-+MH+-+APR-APR23&utm_source=adwords&utm_medium=ppc&hsa_acc=5115786182&hsa_cam=20506394286&hsa_grp=&hsa_ad=&hsa_src=x&hsa_tgt=&hsa_kw=&hsa_mt=&hsa_net=adwords&hsa_ver=3&gclid=EAIaIQobChMIhdLpssqVggMVjUedCR1spQC7EAEYASAAEgL-evD_BwE");

		driver.get(prclass.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		Thread.sleep(3000);

		// Text_Boxes
		// driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Rakesh");
		driver.findElement(By.xpath(prclass.getProperty("Text_box1"))).sendKeys("Rakesh");

		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Yelug@gmail.com");
		driver.findElement(By.xpath(prclass.getProperty("Text_box2"))).sendKeys("YelugamRakesh@gmail.com");

		// driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9908994458");
		driver.findElement(By.xpath(prclass.getProperty("Text_box3"))).sendKeys("9908994458");

		// Message_1
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		// driver.findElement(By.xpath(prclass.getProperty("Message_1"))).click();
		Thread.sleep(3000);
		

		// driver.findElement(By.xpath("(//label[@class=\"gform-field-label
		// gform-field-label--type-inline gfield_consent_label\"])[1]")).click();

		// CheckBox_1
		// driver.findElement(By.xpath(prclass.getProperty("check_1"))).click();

		// Checkbox=2
		//driver.findElement(By.xpath("//span[text()=\"I agree to receiving marketing communications from Mondelez\"]"))
			//	.click();
		// driver.findElement(By.xpath(prclass.getProperty("check_2"))).click();

		// Get_Access_Button
		driver.findElement(By.id("gform_submit_button_1")).click();
		// driver.findElement(By.xpath(prclass.getProperty("Get_Access_Button"))).click();
		// driver.quit();
	}

}
