package project8.com;

public class Graduation
{
	String coursename;
	int years;
	
	public Graduation(String coursename,int years)
	{
		super();
		this.coursename=coursename;
		this.years=years;
	}
	void courseDetails()
	{
		System.out.println("coursedetails:"+coursename+" "+years);
		
	}
}

