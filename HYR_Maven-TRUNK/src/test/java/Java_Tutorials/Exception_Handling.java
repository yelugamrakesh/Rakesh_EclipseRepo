package Java_Tutorials;

public class Exception_Handling {

	public static void main(String[] args) {

		int i = 9;
		int j = 20;
		try {

			int k = i / j;
			System.out.println("The value of k is" + " " + +k);
		} catch (Exception e) {
			System.out.println("Inter Exception");
			System.out.println("The exception is " + e);
		}

	}

}
