package TestNG_workstation;

import org.testng.annotations.Test;

public class Priority {

	
	
	
	
	
	@Test(priority=4) 
	public void meth1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=3)
	public void meth2()
	{
		System.out.println("Test2");
	}
	
	@Test(priority=2)
	public void meth3()
	{
		System.out.println("Test3");
	}
	
	@Test(priority=1)
	public void meth4()
	{
		System.out.println("Test4");
	}
	

}
