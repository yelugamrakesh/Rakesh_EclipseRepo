package com.Java;

/*
 * This program is to print even numbers  between 200 to 500 using while and do while
 */

public class While_assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This program is for while loop");

		int n = 200;

		while (n <= 500) {

			if (n % 2 == 0) {
				System.out.println(n);
			}

			n++;

		}

	}

}
