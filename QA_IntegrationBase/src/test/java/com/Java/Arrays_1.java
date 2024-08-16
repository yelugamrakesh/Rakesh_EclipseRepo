package com.Java;

import java.util.Arrays;

public class Arrays_1 {

	public void task1() {
		int j[] = { 2, 5, 6, 9, 3 };

		// System.out.println(j.length);

		int i = 0;
		int sum = 0;
		while (i <= j.length - 1) {
			System.out.println(j[i]);

			sum = sum + j[i];
			i++;
		}

		System.out.println("addition is  " + sum);

		int av = sum / j.length;
		System.out.println("average is" + av);

	}

	public void task2() {
		int i = 0;
		int[] numbers = { 2, 5, 3, 1, 6, 4 };

		System.out.println("Before sort" + numbers[i]);

		int lastbeforesort = numbers.length - 1;
		int lasElement = numbers[lastbeforesort];

		System.out.println("Before sort last index value is " + lasElement);

		Arrays.sort(numbers); // numbers is now [1, 2, 3, 4, 5,6]

		System.out.println("After sort " + numbers[i]);

		int lastbeforesort1 = numbers.length - 1;
		int lasElement1 = numbers[lastbeforesort1];

		System.out.println("Before sort last index value is " + lasElement1);
		// System.out.println("Max value is " +numbers[i]+" Its index value is "
		// +Lnumber);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arrays_1 T2 = new Arrays_1();
		T2.task2();

	}

}
