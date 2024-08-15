package Seleniumfile_QA;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExtentReports extentreports = new ExtentReports();
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("./Reports/data.html");

		extentreports.attachReporter(sparkreporter);
		extentreports.flush();

	}

}
