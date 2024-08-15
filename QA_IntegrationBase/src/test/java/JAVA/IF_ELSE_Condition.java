package JAVA;

import java.util.Scanner;

public class IF_ELSE_Condition {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a number");
		int GivenNumber=sc.nextInt();
		
		if ( GivenNumber<100) {
			
			System.out.println("It is smaller Number");
		} else {

			System.out.println("It is a bigger Number");
		}
	}
}
