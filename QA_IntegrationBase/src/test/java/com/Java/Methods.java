package com.Java;



/*
 * Main is a starting point of a program here in A class we are not able to run the program without main method 
 * In this program  we are calling variable using object.
 * In this program  we are calling  method using object 
 */

class A {

	int A = 10, b = 20;

	void sum1() {
		System.out.println("This is a default methos");
	}

	// This is parametarized mehtod
	void sum2(int p, int q) {
		System.out.println(+(p + q));
	}

	int sum3() {
		return A + b;
	}

}

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A N = new A();

		// HERE WE ARE CALLING VARIABLE NAME USING OBJECT
		System.out.println("we can call variable using object " + N.A);
		System.out.println(+N.b);

		// here we are calling method using object
		N.sum1();

		N.sum2(10, 20);

		
		//creating a variable and storing the result and printing
		int result = N.sum3();
		System.out.println(+result);
		

	}

}
