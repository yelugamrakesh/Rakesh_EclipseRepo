package Demo_Java_Basics;

public class Decesion_Making_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Marks = 75;

		if (Marks >= 35 || Marks<35)
		{
			System.out.println("student was passed");
			if (Marks >= 35 && Marks <= 70)
			{
				System.out.println("Third class");
				if (Marks > 70 && Marks <85)
				{
					System.out.println("Secound class");
				}
			}
		}else
		{
			System.out.println("candidate was failed");
		}

	}

}
