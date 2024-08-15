package Java_Tutorials;

import java.util.Random;

public class Test_1 {

	   int number;
	
	public static void main(String[] args) {
		
	//	System.out.println(Static_1.numbers);
		
		Test_1 t1=new Test_1();
		
		t1.number=-new Random().nextInt();
		
		
		Test_1 t2=new Test_1();
		
		t1.number=-new Random().nextInt();
		
		
		Test_1 t3=new Test_1();
		
		t1.number=-new Random().nextInt();
		
		
		System.out.println(t1.number);
		System.out.println(t2.number);
		System.out.println(t3.number);
		
		//System.out.println(Test_1.numbers);
	}
}
