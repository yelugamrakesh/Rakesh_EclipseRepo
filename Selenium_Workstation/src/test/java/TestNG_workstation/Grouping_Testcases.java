package TestNG_workstation;

import org.testng.annotations.Test;

public class Grouping_Testcases {

	@Test(groups = "smoke")
	public void Test1() {
		System.out.println("Smoke1");
	}
	

	@Test(groups = "Regression")
	public void Test2() {
		System.out.println("Regression1");
	}

	
	@Test(groups = "smoke")
	public void Test3() {
		System.out.println("Smoke2");
	}

	
	@Test(groups = "Regression")
	public void Test4() {
		System.out.println("Regression2");
	}
	

	@Test(groups = "smoke")
	public void Test5() {
		System.out.println("Smoke3");
	}

}
