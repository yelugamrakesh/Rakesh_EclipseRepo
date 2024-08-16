package com.Java;

import java.util.Scanner;

public class Input_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter your Name");
		String Name=s.nextLine();
		System.out.printf("Hey %s, how are you \n", Name);
		String status =s.nextLine() ;
		System.out.println("What is your age ");
		int age=s.nextInt();
		System.out.printf("As your age is  %d  you are eligible  \n ",age);
		System.out.printf("Thanks for contacting %s we will getback to you soon ", Name);
		
		
	}

}
