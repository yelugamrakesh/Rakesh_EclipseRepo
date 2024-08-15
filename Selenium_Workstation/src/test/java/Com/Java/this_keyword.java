package Com.Java;

public class this_keyword {

	int x = 30; // This is a instance variable

	int y = 30;

	public void ad() {
		int x = 45; // This is a local Variable
		System.out.println(x); // Calling Local Variable
	}

	public void thisad() {
		int x = 45;
		System.out.println(this.x); // Calling Instance variable using this keyword
	}

	public static void main(String[] args) {
		this_keyword a = new this_keyword();
		a.ad();

		a.thisad();
	}
}
