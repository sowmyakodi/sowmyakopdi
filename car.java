package project8.com;

public class car extends vehicle{
	String name;
	int price;
	int speed;
	void carDetails() {
		System.out.println("car Details:"+"\nname:"+name+"\nprice:"+price+"\nspeed:"+speed);
		
	}
	public static void main(String args[])
	{
		car c1=new car();
		c1.name="breeza";
		c1.price=1500000;
		c1.speed=20;
		c1.vehicleInfo();
		c1.carDetails();
		
		
		
		
	}
	
	


	}


 