package TestNG_workstation;

import org.testng.annotations.Test;

public class priority_Tag {

	@Test(priority = 3)
	public void meth1() {
		System.out.println("This is priority 3");
	}

	@Test(priority = 2)
	public void meth2() {
		System.out.println("This is priority 2");
	}

	@Test(priority = 1)
	public void meth3() {
		System.out.println("This is priority 1");
	}

	@Test(priority = 6)
	public void meth4() {
		System.out.println("This is priority 6");
	}

	@Test(priority = 5)
	public void meth5() {
		System.out.println("This is priority 5");
	}

	@Test(priority = 4)

	public void meth6() {
		System.out.println("This is priority 4");
	}

}
