package project8.com;

public class ArraysMaxMin {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=5;
		arr[1]=8;
		arr[2]=10;
		arr[3]=1;
		arr[4]=2;
		int min=arr[0];
		int max=arr[0];
        // Loop through the array to find minimum and maximum values
         for(int i=0;i<5;i++)
		{
			//minimum 
			if(min>arr[i])
				min=arr[i];
			//maximum
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("max no:"+max);
		System.out.println("min no:"+min);

		

					
				
				
				




		

	}

}
