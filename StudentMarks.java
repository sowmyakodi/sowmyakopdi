package project8.com;
//calculate total, percentage, result, of student marks using arrays
public class StudentMarks {

	public static void main(String[] args)
	{
		
		int i;
		//array
		int marks[]=new int[4];
		marks[0]=60;
		marks[1]=70;
		marks[2]=30;
		marks[3]=90;
		for(i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);

		
			System.out.println(" marks length="+marks.length);
		
		
			if(marks[i]<35)
				System.out.println("fail");
		}
		
		//attributes
		int sum;
		double avg;
		sum=marks[0]+marks[1]+marks[2]+marks[3];//sum of marks
		avg=sum/4;//average of marks
		System.out.println("average is "+avg);
		if(avg>40)
			System.out.println("pass");

			
		

		

	}//25th topic under arrays

}
