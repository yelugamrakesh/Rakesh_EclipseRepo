package Java_Tutorials;

import java.util.Scanner;

public class Switch_Assignement {
	
	/**
	 * This method is used to call swith based on the operator basic interturn Operations 
	 *
	 */
	
	
    public static double performOperation(double num1, double num2, char operator) {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        return result;
    }
	

	
public static void main(String[] args) {
	
	
	 
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter the operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        double result = performOperation(num1, num2, operator);
	        System.out.println("The result is: " + result);
	    }
	
	
	
	
	
}

