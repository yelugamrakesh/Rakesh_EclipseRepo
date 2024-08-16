package TestNG_workstation;

import org.testng.annotations.Test;

public class Dependancy {


	@Test(dependsOnMethods="meth2")
	public void meth1()
	{
		System.out.println("Method1");
	}
	
	
	@Test
	public void meth2()
	{
		System.out.println("Method1");
		int n=10/0;
	}
	

	
}
