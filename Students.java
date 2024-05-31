package project8.com;
//public we can access it within same class,same package, different package,different class and within subclass
public class Students
{  
	//public 
	public int rollnumber=111;
	
	public Students()
	{
		rollnumber=111;
		
	}
	
	public void rollnumber() {
		System.out.println(rollnumber);

	}

}
//public modifier in different class
public class modify 
{
	
	public static void main(String[] args)
	{
		Students s=new Students();
		System.out.println(s.rollnumber);
		
    }

}
//private modifier can access only within the class
public class Age
{
	//private
	private int Age=21;
	
	private Age()
	{
		Age=21;
		
	}
	
	private void Age() {
		System.out.println(Age);

	}
	

     public static void main(String[] args) {
		Age a=new Age();
		System.out.println(a.Age);


	}

}
//default modifier only within the package
//As it is default there is no specific modifier is needed

public class Ages
{
		int Ages=21;
		
		 Ages()
		{
			Ages=21;
			
		}
		
		 void Ages() {
			System.out.println(Ages);

		}
		

	     public static void main(String[] args) {
			Ages a=new Ages();
			System.out.println(a.Ages);


		}

	}
//protected modifier is similar to default modifier and we can access to its subclass 


public class Agess 
{
//protected
	protected int Agess=21;
	
	protected Agess()
	{
		Agess=21;
		
	}
	
	protected void Agess() {
		System.out.println(Agess);

	}
    public static void main(String[] args) {
		Agess a=new Agess();
		System.out.println(a.Agess);


	}
}
//subclass
public class weight extends Agess
{
	int weight=50;
	
   public static void main(String[] args)
   {
   	
   	 weight w =new weight();
   	 Agess a=new Agess();
		 System.out.println(a.Agess);
		 System.out.println(w.weight);



   	

	}

}


	




