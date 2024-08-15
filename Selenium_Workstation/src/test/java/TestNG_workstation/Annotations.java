package TestNG_workstation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 
 * @author rakeshiphoneyelugam
 * @Beforesuite
 * @BeforeTest
 * @BeforeClass
 * @BeforeMethod Testb
 * @AfterMethod
 * @AfterClass
 * @AfterTest
 */

public class Annotations {

	@BeforeSuite
	public void meth1() {
		System.out.println("@Beforesuite");
	}

	@AfterSuite
	public void meth2() {
		System.out.println("@AfterSuite");
	}

	@BeforeTest
	public void meth3() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void meth4() {
		System.out.println("@AfterTest");
	}

	@BeforeClass
	public void meth5() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void meth6() {
		System.out.println("@AfterClass");
	}

	@BeforeMethod
	public void meth7() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void meth8() {
		System.out.println("@AfterMethod");
	}

	
	@Test
	public void metha() {
		System.out.println("TestA");
	}

	@Test
	public void methb() {
		System.out.println("TestB");
	}

}
