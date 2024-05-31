package project8.com;

public class EngineeringDegree extends Graduation 
{
	String branchname;
	int subjects;

	public EngineeringDegree(String coursename, int years,String branchname,int subjects)
	{
		super(coursename, years);
		this.branchname=branchname;
		this.subjects=subjects;
		
	}
	void courseDetails()
	{
		System.out.println("GradutionDetails:branchname:ece,subjects:5");
		super.courseDetails();
	}
	public static void main(String args[])
	{
	EngineeringDegree eng=new EngineeringDegree("btech",4,"ece",5);
	eng.courseDetails();
    }

	
	

	

		
	}
	
	


