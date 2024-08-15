package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Attributes {

	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/Attributes.html");
		extent.attachReporter(spark);

		extent.createTest("Test_1").assignAuthor("Yelugam Rakesh").assignDevice("Mac").assignCategory("Smoke Testing");

		extent.flush();
	}
}
