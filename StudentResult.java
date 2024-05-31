package project8.com;

public class StudentResult {

	public static void main(String[] args) {
		int[] marks= {36,56,78,90,38};
		boolean b=true;
		int i=0,sum=0;
		double percentage;
		for (;i<marks.length;i++)
		{
			if(marks[i]<=35)
				b=false;
		}
		if(b)
		{
			for(i=0;i<marks.length;i++)
			{
				sum+=marks[i];
				
			}
			percentage=sum/5;
			System.out.println("studentResult:passed:\ntotal="+sum+" percentage="+percentage);
			
			
		}
		else
			System.out.println("student got failed");

			
		

	}

}
