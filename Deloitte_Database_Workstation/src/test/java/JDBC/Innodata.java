package JDBC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Innodata {



	static WebDriver driver ;
	public static String Screenshot() throws Exception {
		TakesScreenshot screen = (TakesScreenshot) driver;
		String ScreenShot = screen.getScreenshotAs(OutputType.BASE64);

		return ScreenShot;
		
	}

	public static int output(int row) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\Innodata.xlsx");
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = workbook1.getSheet("Sheet1");

		sheet1.getRow(row).getCell(3).setCellValue("Done");
		FileOutputStream fileout = new FileOutputStream("fis");
		workbook1.write(fileout);
		workbook1.close();
		return row;
	}

	public static void main(String[] args) throws Exception {

		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		// driver.get(
		// "https://www.tayyarijeetki.in/download-e-book/?utm_medium=cpc&utm_source=google-ads&utm_campaign=drin_bournvita_in_junejune_2023_inr_eng_mental-health-may_est-123_in23ca18&utm_term=performance-max-lytics-tjk-freq-visitor-mental-health-badmintion&utm_content=1x1&utm_term=&utm_campaign=PMax+-+Conv+-+MH+-+APR-APR23&utm_source=adwords&utm_medium=ppc&hsa_acc=5115786182&hsa_cam=20506394286&hsa_grp=&hsa_ad=&hsa_src=x&hsa_tgt=&hsa_kw=&hsa_mt=&hsa_net=adwords&hsa_ver=3&gclid=EAIaIQobChMIhdLpssqVggMVjUedCR1spQC7EAEYASAAEgL-evD_BwE");

		FileInputStream fis = new FileInputStream("./ExcelFiles/Inno_1 (1).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/Innodata1.html");
		extent.attachReporter(spark);

		int TotalNumberofRows = sheet.getLastRowNum();
		int TotalNumberofColumns = sheet.getRow(1).getLastCellNum();
		System.out.println("Row count is " + TotalNumberofRows +" "+ "Totla number of columns " + TotalNumberofColumns);

		for (int i = 1; i <= TotalNumberofRows; i++) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get(
					"https://www.tayyarijeetki.in/download-e-book/?utm_medium=cpc&utm_source=google-ads&utm_campaign=drin_bournvita_in_junejune_2023_inr_eng_mental-health-may_est-123_in23ca18&utm_term=performance-max-lytics-tjk-freq-visitor-mental-health-badmintion&utm_content=1x1&utm_term=&utm_campaign=PMax+-+Conv+-+MH+-+APR-APR23&utm_source=adwords&utm_medium=ppc&hsa_acc=5115786182&hsa_cam=20506394286&hsa_grp=&hsa_ad=&hsa_src=x&hsa_tgt=&hsa_kw=&hsa_mt=&hsa_net=adwords&hsa_ver=3&gclid=EAIaIQobChMIhdLpssqVggMVjUedCR1spQC7EAEYASAAEgL-evD_BwE");

			
			driver.manage().window().maximize();

			
			XSSFRow celldata = sheet.getRow(i);
			String Name = celldata.getCell(0).getStringCellValue();
			String Mail = celldata.getCell(1).getStringCellValue();
			String number = celldata.getCell(2).getRawValue();

			driver.findElement(By.xpath("//input[@id=\"firstname\"]")).clear();
			driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys(Name);

			
			Thread.sleep(1000);
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(Mail);

			
			driver.findElement(By.id("phone")).clear();
			driver.findElement(By.id("phone")).sendKeys(number);

			Thread.sleep(2000);

			driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement check = driver.findElement(By.xpath("//*[@id=\"field_1_4\"]/div/label"));
			js.executeScript("arguments[0].click()", check);

			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			WebElement check2 = driver.findElement(By.xpath("//*[@id=\"field_1_5\"]/div/label"));
			js1.executeScript("arguments[0].click()", check2);
			
			Thread.sleep(2000);
			extent.createTest(+i+" " +Name+" ").addScreenCaptureFromBase64String(Screenshot()).info(Name).info(Mail).info(number);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			WebElement GetAccess = driver.findElement(By.id("gform_submit_button_1"));
			js2.executeScript("arguments[0].click()", GetAccess);
			
			//Assert as=new Assert();
			
			Assert.assertEquals(driver.getTitle(), "Thank You - Tayyari Jeet Ki by Bournvita");
			//driver.findElement(By.xpath("(//input[@type=\"submit\"])[5]")).click();
		//	driver.findElement(By.id("gform_submit_button_1")).click();
			
			
			sheet.getRow(i).createCell(3).setCellValue("Done");
			sheet.getRow(i).createCell(4).setCellValue("15th-Dec-2022");

			File fileInstance=new File("./ExcelFiles/Inno_1 (1).xlsx");
			FileOutputStream fs=new FileOutputStream(fileInstance);
			workbook.write(fs);
			
			
			

	
			driver.quit();
			extent.flush();
			System.out.println(i + "." + Name + "||" + Mail + "||" + number);

		}
		System.out.println("Completed Succssfully");
		workbook.close();
	}
}


