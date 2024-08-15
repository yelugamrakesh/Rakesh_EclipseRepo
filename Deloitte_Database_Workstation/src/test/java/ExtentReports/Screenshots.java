package ExtentReports;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {
	public static WebDriver driver;

	public static String TakeScrenshot() throws Exception {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File Destination = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Destination, new File("./Screenshots/Image.png"));
		return Destination.getAbsolutePath();
	}

	public static void main(String[] args) throws Exception {

		ExtentReports extentreport = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/Screenshots1.html");
		extentreport.attachReporter(spark);

		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		 TakeScrenshot();
		
		extentreport.createTest("ScreenTest").addScreenCaptureFromPath(Screenshots.TakeScrenshot());
		driver.quit();
		extentreport.flush();

	}
}
