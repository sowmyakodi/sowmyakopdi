package project8.com;

public class ContractEmployee extends Employee
{
	int years;
	int leaves;
	int allowances;
	
	void contractEmployeeDetails()
	{
		System.out.println("contractEmployeeDetails:"+"\nyears:"+years+"\nleaves:"+leaves+"\nallowances:"+allowances);
		
		
	}
	public static void main (String args[]) 
	{
		ContractEmployee emp=new ContractEmployee();
		emp.years=5;
		emp.leaves=20;
		emp.allowances=10000;
		emp.name="keerthi";
		emp.id=1234;
		emp.salary=50000;
		


		emp.EmployeeDetails();
        emp.contractEmployeeDetails();
		
		
		
	}
}


	
	
	
	
	
	


