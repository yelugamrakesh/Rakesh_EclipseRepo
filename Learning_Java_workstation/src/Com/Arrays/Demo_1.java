package Com.Arrays;

import java.util.Arrays;

public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,1,7,8,20,100,4}; //1,4,7,8,10,100
		int [] c= {10,1,7,8,20,100,4};
		int b[] = new int[4];

		System.out.println(a[2]);
		b[2] = 30;
		System.out.println(b[2]);
		System.out.println("Before sort last element is " + a[a.length - 1]);
System.out.println(a[1]);

System.out.println(Arrays.equals(a, c));
		Arrays.sort(a);
		System.out.println("Before sort last element is " + a[a.length - 1]);
		System.out.println(a[ 1]);
		
		
		
	}

}
