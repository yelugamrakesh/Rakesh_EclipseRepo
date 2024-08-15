package Java_workstation1;




/*
 * This program is about  inheritance and parent child relation 
 * Super keyword usage from child class
 */

class Parent
{
	
	int a,b;
	Parent(int x)
	{
		System.out.println("This is a paerent Class ");
	}
	void sum()
	{
		System.out.println("sum of two numbers" +(a+b));
	}
	
	
}


class child1  extends Parent
{  
	
	
child1()
{
	super(20);
	super.a=10;
	super.b=20;
	super.sum();
	
	System.out.println("This is a child class");
}
	

	
	
	
}



public class Super_Keyword {
public static void main(String[] args) {
	child1 obj=new child1();
	
	
}
}
