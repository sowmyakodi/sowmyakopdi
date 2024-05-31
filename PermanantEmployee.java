package project8.com;

public class PermanantEmployee extends Employee
{
		int pf;
		int bonus;
		
		
		void PermanantEmployee()
		{
			System.out.println(" PermanantEmployee:"+"\npf:"+pf+"\nbonus:"+bonus);
		}
		public static void main (String args[]) 
		{
			PermanantEmployee emp=new PermanantEmployee ();
			emp.pf=5000;
			emp.bonus=2000;
			emp.name="keerthi";
			emp.id=1234;
			emp.salary=50000;
			


			emp.EmployeeDetails();
	        emp.PermanantEmployee();
			
			
			
		}
	}




