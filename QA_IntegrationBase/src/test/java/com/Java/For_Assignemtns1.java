package com.Java;

public class For_Assignemtns1 {
	public static void main(String[] args) {

		/*
		 * Print sum of the even numbers between 40 to 80  using for loop 
		 * 
		 */
		int sum = 0;
		for (int i = 40; i <= 80; ) 
		{

			sum=sum+i;
			i=i+2;
			
//			if (i % 2 == 0) {
//				sum = sum + i;
//			}

		}
		System.out.println("addition of even numbers between 40 to 80 is " + sum);
	}
}
