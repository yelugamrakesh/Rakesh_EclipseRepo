package Groups_TestNG;

import org.testng.annotations.*; 


public class New_Test1 {

	@Test(groups = { "Smoke", "Sanity" })
	public void Test5() {
		System.out.println("Test5");
	}

	@Test(groups = { "Smoke", "Fucntional" })
	public void Test6() {
		System.out.println("Test6");
	}

	@Test(groups = { "Smoke", "Sanity" })
	public void Test7() {
		System.out.println("Test7");
	}

	@Test(groups = { "Smoke", "Sanity", "Fucntional" })
	public void Test8() {
		System.out.println("Test8");
	}

}
