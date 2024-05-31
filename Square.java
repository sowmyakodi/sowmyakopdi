package project8.com;

public class Square implements Shapes
{
	int side;

	public int area()
	{
		int area=side*side;
		return area;
	}
	public int perimeter()
	{
		int perimeter=4*side;
		return perimeter;
	}
	public int volume()
	{
		return 1;
	}
	
	public static void main(String args[])
	{
		Square square=new Square();
		int a=square.area();
		int p=square.perimeter();
		System.out.println("Area="+a);
		System.out.println("perimeter="+p);
		
		Shapes.msg();
		
		
		
		
		
	}
	
		
		
		

	}
	


