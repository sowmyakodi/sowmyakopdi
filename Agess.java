package project8.com;

public class Agess 
{

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




	

