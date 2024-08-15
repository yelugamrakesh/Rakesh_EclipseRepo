package Com.Java;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int de[]= {8,6,9,7,1,2,5,3};
		int se[]= {8,6,9,7,1,2,5,3};
		int a[]= {8,6,3,4};
		int d[]= {8,6,3,4};
		int b[]=new int[4];
		
		System.out.println("No of elements in a:"+a.length);
		System.out.println("No of elements in b:"+b.length);
		System.out.println("2nd element in a:"+a[1]);
		b[1]=30;
		System.out.println("2nd element in b:"+b[1]);
		System.out.println(Arrays.equals(a, d));
		System.out.println("Before sort last element in a:"+de[de.length-1]);
		Arrays.equals(de, se);
		Arrays.sort(de);
		System.out.println("Before sort last element in a:"+de[de.length-1]);
		System.out.println(Arrays.equals(de, se));
	}

}
