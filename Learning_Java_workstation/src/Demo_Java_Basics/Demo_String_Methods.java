package Demo_Java_Basics;

import java.util.Arrays;

public class Demo_String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Rakesh from warangal";
		String s1="RaKEsh";
				String S2="rajesh";
				
				//equals
				//methods is used to compare data
				System.out.println(s.equals(S2));
		
		//equalsIgnoreCase 
		//method is used to compare irrespective of case sensitive
		System.out.println(s.equalsIgnoreCase(s1));
		
		
		//contains  
		System.out.println(s.contains("k"));
		System.out.println(s.contains("Y"));
		
		
		
		//startswith 
		//Checks whether a string starts with specified characters.
		System.out.println(s.startsWith("Ra"));
		System.out.println(s.startsWith("TY"));
  
		//endsWith
		//checks whether a string ends with specified characters.
		System.out.println(s.endsWith("sh"));
		System.out.println(s.endsWith("re"));
		
		//Length
		//counts the length of the string
		System.out.println(s.length());
		
	//trim	
		//Trimes leading and trialling spaces front and back ignores middle one 
		System.out.println(s.trim().length());
		
		//toLowercase 
		//converts to lower case letters
		System.out.println(s.toLowerCase());
		
		//toUppercase
		//converts to uper case letters 
		System.out.println(s.toUpperCase());
		
		
		//toCharArray
		System.out.println(s.toCharArray());
		char[] a=s.toCharArray();
		
		//indexOf --positioin of the charecter
		//lastIndexOf  --if there is multiple chars it gives the last char of dual data
		System.out.println(s.indexOf("k"));
		System.out.println(s.lastIndexOf("e"));
	
	    //substring
		//Brings the data out and form a another string respective to the number given.
		System.out.println(s.substring(2,5));
		
		//Arrays.toString(s.split)
		System.out.println(Arrays.toString(s.split(" ")));
	
//replacewith
		System.out.println(s.replace("from", "hyderabad"));
	
	
	
	}

}
