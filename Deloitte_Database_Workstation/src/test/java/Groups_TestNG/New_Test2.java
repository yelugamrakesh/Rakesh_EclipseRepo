package Groups_TestNG;

import org.testng.annotations.*; 


public class New_Test2 {

	@Test(groups = { "Sanity" })
	public void Test1() {
		System.out.println("Test1");
	}

	@Test(groups = { "Smoke" })
	public void Test2() {
		System.out.println("Test2");
	}

	@Test(groups = { "Fucnrional" })
	public void Test3() {
		System.out.println("Test3");
	}

	@Test
	public void Test4() {
		System.out.println("Test4");
	}
}
