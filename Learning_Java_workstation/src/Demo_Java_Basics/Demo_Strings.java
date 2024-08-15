package Demo_Java_Basics;

public class Demo_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Types which string can be written
		//type 1
		String a="arun";
		
		//Type 2
		String r=new String("arun");
		System.out.println(a);
		System.out.println(r);
		
		//In this comparision address are verified 
		System.out.println(a==r);
		
		//In this coparision data is verified 
		
		System.out.println(a.equals(r));
	}

}
