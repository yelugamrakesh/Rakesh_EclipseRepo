package Java_Tutorials;

public class Methods_Demo {

	static int currentBalance = 1000;

	public static void greetinsCustomer() {
		System.out.println("Welcome to the Bank");
		System.out.println("Current balance of the customer A is  " +currentBalance);
	}

	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Current Balance of the customer after deposit  " + currentBalance);
	}

	public static void withdral(int amount) {
		currentBalance = currentBalance - amount;

	}

	public int getcurrentbalance() {
		return currentBalance;
	}

	public static void main(String[] args) {

		Methods_Demo customer = new Methods_Demo();

		greetinsCustomer();

		customer.deposit(500);

		withdral(300);

		System.out.println("Final balance after withdral"+customer.getcurrentbalance());
	}

}
