package Demo_Java_Basics;

public class Assign_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 String str = "java is a super program";
	        int count = 1; // We start with 1 because there is always at least one word in a string

	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ' ') {
	                count++;
	            }
	        }
System.out.println("count of the words are " +count);
		
		
	}

}
