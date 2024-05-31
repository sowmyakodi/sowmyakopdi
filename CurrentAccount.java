package project8.com;

public class CurrentAccount extends Account
{
	int interest ;
	int deposit;
	public CurrentAccount(int ac_no,int interest,int deposit)
	{
		super(ac_no);
		this.interest=interest;
		this.deposit=deposit;
	}
	void AccountDetails()
	{
		System.out.println("CurrentAccount details:interest:1000,deposit:10000");
		super.AccountDetails();
		
	}
	public static void main(String args[])
	{
		CurrentAccount ac=new CurrentAccount(123456700,1000,10000);
		ac.AccountDetails();
		

	}
	

	
	
	
	
	
}

