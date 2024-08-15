package Demo_Java_Basics;

public class Asign_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "My name is yrakesh";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y') {
                count++;
            }
        }

        System.out.println("The number of occurrences of the letter 'i' in the string 'ribiooni' is: " + count);
    }
	}


