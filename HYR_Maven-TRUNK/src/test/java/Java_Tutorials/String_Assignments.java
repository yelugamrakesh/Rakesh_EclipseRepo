package Java_Tutorials;



public class String_Assignments {
	
	/*
	 * write a java program to count the number of characters in a string
	 */
	public void Task1()
	{
		String count="java is super";
		System.out.println(count.length());
	}

	/*
	 * write a java program to count the number of words in a string
	 */
	public void Task2()
	{
		String count="java is super";
		 String[] words = count.split("\\s+");
		System.out.println(words);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Assignments as=new String_Assignments();
		as.Task2();
	}

}
