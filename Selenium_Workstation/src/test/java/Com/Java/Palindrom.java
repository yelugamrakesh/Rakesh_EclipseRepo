package Com.Java;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	System.out.println("Enter the value");
	Scanner input=new Scanner(System.in);
	String s1=input.nextLine();
		
	StringBuffer sb=new StringBuffer(s1);
	sb.reverse();
	//String s2=sb.toString();
	if(s1.equals(sb))
	{
		System.out.println("palindrom");
	}
	else 
	{
		System.out.println("Not a polindrom");
	}
		
		
		
	}

}
