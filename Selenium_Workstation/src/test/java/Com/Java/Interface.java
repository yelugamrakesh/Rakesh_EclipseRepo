package Com.Java;








interface Shapes


{
	void area(int l, int b);
}

class Rect implements Shapes
{
	public void area(int l, int b) 
	{
		System.out.println("Area of rectangle:" + (l * b));
		
	}
}


class Tri implements Shapes 

{
	
	public void area(int l, int b) 
	{
		System.out.println("Area of Tri:" + (0.5 * l * b));
	}
}

  class Interface {

	public static void main(String[] args) {

		Rect r = new Rect();
		r.area(10, 20);
		Tri t = new Tri();
		t.area(10, 20);

	}

}
