package com.Java;

/**
 * 
 * @author yelugamrakesh
 * This Program is to verify the number of prime numbers in a set of series
 */
public class Prime_Numbers_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, NumberofReminders;

		for (i = 1; i <= 100; i++) {

			NumberofReminders = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					NumberofReminders++;
				}

			}
			if (NumberofReminders == 2) {
				System.out.println(i);

			}

		}

	}

}
