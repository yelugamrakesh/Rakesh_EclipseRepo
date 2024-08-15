package Demo_Java_Basics;

public class Assign_string_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="My name is rakesh";
		String reverse=" ";
		
		
		
		for (int i=s.length()-1;i>=0;i--)
		{
			reverse+=s.charAt(i);
		}
		System.out.println("reverse of the word" +reverse);
		
		
	}

}
