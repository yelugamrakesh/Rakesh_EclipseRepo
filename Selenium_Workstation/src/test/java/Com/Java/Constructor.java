package Com.Java;

class B {

	int x, y;

//This is parametrized constructor 
	B(int p, int q) {
		x = p;
		y = q;
	}

	void sum() {
		System.out.println((x + y));
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B(10, 20);
		obj.sum();

		B obj1 = new B(10, 20);
		obj1.sum();

		B obj2 = new B(10, 20);
		obj2.sum();

	}

}
