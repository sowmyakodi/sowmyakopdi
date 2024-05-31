package project8.com;

public interface Shapes
{
	int area();
	int perimeter();
	default int volume()
	{
	return 0;	
	}
	static void msg()
	{
		System.out.println("it is an static method");
	}
	
		
	
	

}
