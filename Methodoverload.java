package project8.com;
//Demonstrating method overload of area
public class Methodoverload 
{
	//Area of square
	double area(int a)
	{
		double area=(a*a);
		return area;
		
	}
	//Area of rectangle
	double area(int l,int b)
	{
		double area=(l*b);
		return area;
	}
	//Area of triangle
	double area(double base,double height)
	{
		double area=0.5*base*height;
		return area;
	}
	
	public static void main(String args[])
	{
	Methodoverload meth=new Methodoverload();
	System.out.println("area of square="+meth.area(2));
	System.out.println("area of rectangle="+meth.area(2,3));
	System.out.println("area of traingle ="+meth.area(2));
}



	
	
	

	}


