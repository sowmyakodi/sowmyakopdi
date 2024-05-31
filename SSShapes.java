package project8.com;

public class SSShapes
{
	void area()
	{
		System.out.println("area of shape");
		
	}

}
class rectangle extends SSShapes{
	int l,b;
	void area()
	{
		int area=l*b;
		System.out.println("area of rectangle");

	}
	public static void main(String args[])
	{
		Rectangle rectangle=new rectangle("Rectangle",10,20,);
		rectangle.SSShapeInfo();
		rectangle.area();
	}


		
	}
	

