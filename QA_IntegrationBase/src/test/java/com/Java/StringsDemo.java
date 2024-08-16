package com.Java;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Welocme to Java";
		String s2 = "Welocme to Java";

		String s3 = new String("Java");
		String s4 = new String("Java");

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));

		System.out.println(s1 == s2);

		System.out.println(s3 == s4);

	}

}
