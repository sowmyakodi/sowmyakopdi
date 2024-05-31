package project8.com;

public class SavingAccount extends Account
{
	int balance;
	int limit;
	
	public SavingAccount(int ac_no,	int balance,int limit)
	{
		super(ac_no);
		this.balance=balance;
		this.limit=limit;
		
	}
	void AccountDetails()
	{
		System.out.println("SavingAccount details:balance:5000,limit:1000 ");
		super. AccountDetails();
				
	}
	public static void main(String args[])
	{
		SavingAccount ac=new SavingAccount(123456700,5000,1000);
		ac.AccountDetails();
		

	}
	
	
	
	
	
	


	}


