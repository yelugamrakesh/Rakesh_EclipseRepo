package Selenium_Topics;

import org.testng.annotations.Test;

public class TestNG_Groups {

	@Test(groups = "Rakesh")

	public void meth1() {
		System.out.println("This is Group Rakesh 1 ");
	}

	@Test(groups = "smokeer")
	public void meth2() {
		System.out.println("This is smoker 1 ");
	}

	@Test(groups = "smokeer")
	public void meth3() {
		System.out.println("This is smoker 2 ");
	}

	@Test(groups = "Rakesh")
	public void meth4() {
		System.out.println("This is Group  Rakesh 2 ");
	}

	@Test(groups = "smokeer")
	public void meth5() {
		System.out.println("This is smoker 3 ");
	}

	@Test(groups = "smokeer")
	public void meth6() {
		System.out.println("This is smoker 4 ");
	}

}
