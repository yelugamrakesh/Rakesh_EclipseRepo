package com.Java;

import java.util.Scanner;

/**
 * 
 * @author yelugamrakesh This program is to verify the given number is less then
 *         100 or not
 */
public class IF_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int GivenInputNumber = sc.nextInt();

		if (GivenInputNumber< 100) 
		{
			System.out.print("Given Number is smaller");
		}
		
		System.out.println("Bigger");

	}

}
