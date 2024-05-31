package project8.com;

//Class Circle extends Shape, demonstrating single-level inheritance
class Circle extends Shape
{
 // Constructor for Circle that calls the parent Shape constructor
 public Circle(String name, double radius) 
 {
     super(name, radius);
 }

 // Main method to create a circle and display its info
 public static void main(String[] args)
 {
     Circle c1 = new Circle("Circle", 3);
     c1.shapeInfo();
 }

 }


