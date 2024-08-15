package com.Java;

import java.util.*;

public class HYR_WeekEnd_WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Pleae give the day value");
		String day=sc.nextLine();
		
		
		if(day.equals("monday") || day.equals("tuesday")|| day.equals("wednesday")||day.equals("thursday")||day.equals("friday"))
		{
			System.out.println("Hey it's week day ");
		}else if (day.equals("satarday")||day.equals("sunday"))
		{
			System.out.println("Hey its weekend");
		}else
		{
			System.out.println("Please provide a valida day Name or check spelling of the day(Please give in lower case letters)");
		}
	}
}


