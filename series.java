package project8.com;

public class series {

	public static void main(String[] args)
	{
	    	
	        int n = 9;
	        int first = 0;
	        int second = 1;
	        
	        System.out.print(first + " " + second + " ");

	        for (int i = 2; i < n; i++) {
	            int next = first + second;
	            System.out.print(next + " ");
	            first = second;
	            second = next;
	        }
	    }
	
		

	}

