package project8.com;
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






