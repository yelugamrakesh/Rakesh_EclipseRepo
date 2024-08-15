package com.Java;

public class HYR_Parameterized_Variable {
	
	
 int x=30;
	

	public void test1(int height, int weight) { // Here we are Defining what type of data can be given to height and
												// weight
		int Total = height + weight;
		System.out.println("Ttotal value us " + Total);
	}

	public static void test12(int height, int weight) { 
		// weight
		int Total = height + weight;
		System.out.println("Ttotal value us " + Total);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HYR_Parameterized_Variable ob1 = new HYR_Parameterized_Variable();

		ob1.test1(100, 200); // as we have given int for height and weight we have given integer values
		test12(100,500);

	}

}
