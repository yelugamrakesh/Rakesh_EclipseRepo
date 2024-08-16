package com.Java;

import java.util.Scanner;

public class If_else_Assignemetn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner Marks=new Scanner(System.in);
		
		System.out.println("Please Enter the student Marks");
		
		int studentMarks=Marks.nextInt();
		
		if(studentMarks>=35)
		{
			System.out.println("Student got Passed");
			if(studentMarks>=35 && studentMarks<=70)
			{
				System.out.println("Student got Third class");
				
			}else if (studentMarks>=70 && studentMarks<=80)
			{
				System.out.println("stuent got secound class ");
			}else if(studentMarks>=80)
			{
				System.out.println("student got first class");
			}
			
		}
 			else
 			{
 				System.out.println("Student got failed  ");
 			}
			
		
		
		
		
		
		
		
		
		
	}

}
