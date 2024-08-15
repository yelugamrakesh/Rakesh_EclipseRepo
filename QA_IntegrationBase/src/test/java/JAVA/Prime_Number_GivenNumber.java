package JAVA;

import java.util.Scanner;

/**
 * 
 * @author yelugamrakesh This program is to verify whether the given number is a
 *         Prime Number or not
 */
public class Prime_Number_GivenNumber {

	public static void main(String[] args) {

		System.out.println("Please Enter the Number");
		
		Scanner sc = new Scanner(System.in);
		int givenNumber = sc.nextInt();

		int check = 0;

		for (int i = 1; i <= givenNumber; i++) {

			if (givenNumber % i == 0) {
				check++;

			}
		}
		if (check == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not a  Prime");
		}

	}

}
