package Demo_Java_Basics;

public class Assign_string_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rakesh";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("The reversed string is: " + reversed);
    }
	}


