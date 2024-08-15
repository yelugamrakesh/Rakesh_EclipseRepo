package Com.WebElements;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class windowHandle_PR2 extends Browsers {

	public void Test1() throws Exception {
		WebDriver driver = openbrowser("chrome", "https://forum.testproject.io/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String parentwindow = driver.getWindowHandle();
		System.out.println("patent window" + parentwindow + driver.getTitle());

		driver.findElement(By.xpath("(//span[@class='d-button-label'])[1]")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		for (String Totalwindowhandles : windowhandles) {
			if (!Totalwindowhandles.equals(parentwindow)) {
				driver.switchTo().window(Totalwindowhandles);
				driver.findElement(By.id("username")).sendKeys("Rakesh");
				TakesScreenshot snap = (TakesScreenshot) driver;
				File S1 = snap.getScreenshotAs(OutputType.FILE);
				File Destination = new File("./Screenshoot/handle1.jpg");
				FileUtils.copyFile(S1, Destination);
			}
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		windowHandle_PR2 t2 = new windowHandle_PR2();
		t2.Test1();
	}

}
