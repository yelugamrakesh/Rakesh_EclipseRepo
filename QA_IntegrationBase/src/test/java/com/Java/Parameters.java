package com.Java;

public class Parameters {

	public static void test1(int height, int weight) {

		int Total = height + weight;
		System.out.println(Total);
	}
	
	
	
	public static void test2(int classMarks )
	{
		if(classMarks>=35)
		{
			System.out.println("Student is pass");
		}else
		{
			System.out.println("Studen is failed");
		}
	}
	
	
	
	
	public static void test3(String studenName )
	{
		if(studenName.equals("raju"))
		{
			System.out.println("Student is class Leader");
		}else
		{
			System.out.println("Student is not normal person");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1(50, 20);
		test2(10);
		test3("rajuSundharam");
	}

	
	
	
}
