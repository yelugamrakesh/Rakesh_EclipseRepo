package ExtentReports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static WebDriver driver;

	public static String captureImage() {

		TakesScreenshot screen = (TakesScreenshot) driver;
		String Base64Image = screen.getScreenshotAs(OutputType.BASE64);

		return Base64Image;
	}

	public static String CaptureImagepath(String filename) throws Exception {

		TakesScreenshot screenImage = (TakesScreenshot) driver;
		File pathImage = screenImage.getScreenshotAs(OutputType.FILE);
		File Destination = new File("./Screenshots/" + filename + "Image_1.png");

		FileUtils.copyFile(pathImage, Destination);

		return Destination.getAbsolutePath();
	}

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tirumala.org/");

		captureImage();
		String PathuptoImage = CaptureImagepath("Thirumala");

		ExtentReports extentreprots = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/screenshots.html");
		extentreprots.attachReporter(spark);
		
		extentreprots.createTest("ScreenCapture Base64 Message", "This screenshot from base64")
		.addScreenCaptureFromBase64String(Screenshot.captureImage(),"Message");

		extentreprots.createTest("ScreenCapture Base64", "This screenshot from base64")
				.addScreenCaptureFromBase64String(Screenshot.captureImage());

		extentreprots.createTest("ScreenCapture Image", "This screenshot from base64")
				.addScreenCaptureFromPath(PathuptoImage);

		extentreprots.createTest("Multiple Images").addScreenCaptureFromPath(PathuptoImage, "Image_1")
				.addScreenCaptureFromPath(PathuptoImage, "Image_2");

		extentreprots.createTest("LogLevel Images")
				.pass(MediaEntityBuilder.createScreenCaptureFromPath(PathuptoImage).build())
				.fail(MediaEntityBuilder.createScreenCaptureFromPath(PathuptoImage).build())
				.pass(MediaEntityBuilder.createScreenCaptureFromPath(PathuptoImage).build());

		extentreprots.flush();
		driver.quit();

	}
}
