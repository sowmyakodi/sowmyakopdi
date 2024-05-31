package project8.com;

public class Employee 
{
	String name;
	int id;
	int salary;
	
	void EmployeeDetails()
	{
		System.out.println("EmployeeDetails:"+"\nname:"+name+"\nid:"+id+"\nsalary:"+salary);
	}
	public static void main (String args[])
	{
		Employee emp=new Employee();
		emp.name="keerthi";
		emp.id=1234;
		emp.salary=50000;
		
		emp.EmployeeDetails();
	}
}
