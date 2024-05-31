package project8.com;

public class EligibleAge {

	public static void main(String[] args)
	{
		int [] Age= {21,17,18,15,22};
		int i;
		for(i=0;i<Age.length;i++)
		{
			System.out.println(Age[i]);

			
			System.out.println(" Age length="+Age.length);
		

			if(Age[i]<18)
				System.out.println("not eligible");
		}
				

	}

}
