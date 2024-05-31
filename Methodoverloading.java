package project8.com;

public class Methodoverloading
{
	
	    double avg(int a,int b) 
	    {
			double avg=(a+b)/2;
			return avg;

	    }
	    
	double avg(int a,int b,int c)
	{
		double avg=(a+b+c)/3;
		return avg;

	}
	double avg(int a,int b,int c,int d)
	{
		double avg=(a+b+c)/3;
		return avg;
		}
	
	public static void main(String args[])
	{
		Methodoverloading load=new Methodoverloading();
		System.out.println("avg of 2="+load.avg(12,13));
		System.out.println("avg of 3="+load.avg(12,13,14));
		System.out.println("avg of 4="+load.avg(12,13,14,15));

	
	
	
	
	
	
}
}

	
		
