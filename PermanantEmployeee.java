package project8.com;
//child class
public class PermanantEmployeee extends Employeeee
{
	//@override
	public void salary()
	{
		System.out.println("salary is 70000");
	}
	
	
	public static void main(String args[])
	{
		//object creation
		Employeeee emp=new Employeeee();
		emp.salary();
		
	}
}




	

	