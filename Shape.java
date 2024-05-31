package project8.com;

public class Shape {
    // Attributes of the shape class
    String name;
    double radius;
    double diameter;
    double area;

    // Constructor to initialize the attributes
    public Shape(String name, double radius) {
        this.name = name;
        this.radius = radius;
        this.diameter = 2 * radius;
        this.area = Math.PI * radius * radius;
    }

    // Method to display shape info
    void shapeInfo() {
        System.out.println("Shape Info:");
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Area: " + area);
    }
}

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

