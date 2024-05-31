package project8.com;

public class BankApplication 
{
	String Account;
	int types;
	
	public BankApplication(String Account,int types)
	{
		super();
		this.Account=Account;
		this.types=types;
		
	}
	void AccountDetails()
	{
		System.out.println("accountdetails:"+Account+" "+types);
	}
	
	
	
}

