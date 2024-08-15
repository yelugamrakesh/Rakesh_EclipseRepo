package com.Java;
import java.util.*;

public class HYR_Input_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hi what is your name ");
		
		String name=sc.nextLine();
		
		System.out.printf("Hi %s how are you please provide your age", name);
		
		int age=sc.nextInt();
		
		System.out.printf("your age %d is qualified for the website",age);
		
		
		sc.close();

	}

}
