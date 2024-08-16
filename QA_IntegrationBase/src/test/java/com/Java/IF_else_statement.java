package com.Java;
import java.util.Scanner;

public class IF_else_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the name of the day: ");
		        String dayName = scanner.nextLine();
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") 
		            || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") 
		            || dayName.equalsIgnoreCase("Friday")) 
		        	
		        {
		            System.out.println(dayName + " is a weekday.");
		        }
		        
		        else if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")) 
		        	
		        {
		            System.out.println(dayName + " is a weekend day.");
		        } else 
		        
		        
		        {
		            System.out.println("Invalid input. Please enter a valid day name.");
		        }
		        
		        
		    }
		

		
		
		
		
	}


