package com.Java;

import java.util.*;

public class HYR_IF_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me the number");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("Given number is even ");
		} else {
			System.out.println("Given number is odd");
		}

	}

}
