package project8.com;

//Parent class Transport
public class Transport
{
 // Parent class method
 void transportMethod()
 {
     System.out.println("Transportation is of different ways");
 }

}

//Child class RoadTransport to inherit the properties of parent class Transport
class RoadTransport extends Transport
{
 void roadTransportMethod()
 {
     System.out.println(" one of the type of transportation is RoadTransport");
 }

}

//Sub-child class FourWheeler to inherit the properties of child class RoadTransport and parent class Transport
 class FourWheeler extends RoadTransport
 {
 // Sub-child class method
 void fourWheelerMethod()
 {
     System.out.println("The Road transport is done by Four wheelers");
 }

// Main method
 public static void main(String[] args) 
 {
     FourWheeler f = new FourWheeler();

     f.fourWheelerMethod(); 
     f.roadTransportMethod(); 
     f.transportMethod(); 
 }
}
