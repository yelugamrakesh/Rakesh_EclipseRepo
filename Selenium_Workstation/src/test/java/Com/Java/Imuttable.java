package Com.Java;

/*
 * Here the program is about Imutable strings which are used to add and replace ,change the strings 
 * 
 */

public class Imuttable {

	public static void main(String[] args) {

		// Concat Mehtod is used to add the strings

		String s = "Selenium";
//		String s2=s.concat("IDE");
		String s2 = s.replace('S', 'Y');
		System.out.println(s2);

	}
}
