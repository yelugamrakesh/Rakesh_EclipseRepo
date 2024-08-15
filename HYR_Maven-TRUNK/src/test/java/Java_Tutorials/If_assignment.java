package Java_Tutorials;

import java.util.Scanner;

public class If_assignment {

	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please give todays day name");
		
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
