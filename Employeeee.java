package project8.com;
//Demonstrating method overridding for Employeeee
    //superclass
public class Employeeee
{
    int id;
    String name;
    double salary;


    // Method to print employee details
    public void empDetails()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // Method to print salary
    public void salary() {
        System.out.println("Salary is 50000");
    }
}
//Permanantemployeee
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
//Contractedemployee
//child class
public class ContractedEmployee extends Employeeee
{
  //@override
  public void salary()
  {
      System.out.println("salary is 60000");
  }



  public static void main(String[] args)
  {
  	//object creation
      Employeeee emp = new Employeeee();
      emp.salary();
  }
}













	


