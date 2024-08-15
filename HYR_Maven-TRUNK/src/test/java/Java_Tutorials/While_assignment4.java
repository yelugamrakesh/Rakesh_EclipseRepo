package Java_Tutorials;

public class While_assignment4 {

	
	/*
	 * T
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 40;

		int sum = 0;

		// Initialize a variable for the current number

		while (i <= 80) {
			// Check if the current number is even
			if (i % 2 == 0) {
				// Add the even number to the sum
				sum=sum+i; 
				System.out.println(sum);
				//sum += i;
			}
			// Increment the current number by 1
			i++;
		}

		System.out.println("The sum of even numbers   is: " + sum);
	}

}
