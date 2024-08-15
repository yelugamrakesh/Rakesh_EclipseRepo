package selenium_webelements_package_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class StoreHouse {
	
	
	public static void CaptureScreenshot(WebDriver driver, String fileName) throws IOException
	{
		  TakesScreenshot ts=(TakesScreenshot)driver;
	      File files=ts.getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(files, new File("./Screenshots/"+fileName+""));
	}

	
	
	
}
