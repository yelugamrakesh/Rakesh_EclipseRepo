package Demo_Java_Basics;

public class Demo_Methods_Types {
	int x = 10;
	int y = 200;
	String rakesh = "yelugam";

	void sum1() {

		System.out.println("sum" + " " + (x + y));
	}

	void sum(int p, int q) {
		System.out.println("sum" + " " + (p + q));
	}

	int sum3() {

		return x + y;
	}

	String letter() {
		return rakesh;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_Methods_Types M1 = new Demo_Methods_Types();
		M1.sum1();
		M1.sum(20, 80);
		int value = M1.sum3();
		System.out.println(value);

		String value1 = M1.letter();
		System.out.println(value1);

	}

}
