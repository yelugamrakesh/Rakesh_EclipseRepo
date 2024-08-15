package Com.TestNG;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_TestNG {

	@BeforeSuite
	public void M11() {
		System.out.println("Before suite");
	}

	@AfterSuite
	public void M12() {
		System.out.println("AfterSuite ");
	}

	@AfterMethod
	public void M14() {
		System.out.println("AfterMethod ");
	}

	@BeforeTest

	public void mt() {
		System.out.println("Before Test");
	}

	@AfterTest

	public void mAt() {
		System.out.println("After Test");
	}

	@BeforeMethod
	public void M13() {
		System.out.println("BeforeMethod ");
	}

	@BeforeClass
	public void M1() {
		System.out.println("@BeforeClas");
	}

	@Test
	public void M2() {
		System.out.println(" @Test ");
	}

	@Test
	public void M4() {
		System.out.println(" @Test2  ");
	}

	@AfterClass
	public void M3() {
		System.out.println("  @AfterClass  ");
	}

}
