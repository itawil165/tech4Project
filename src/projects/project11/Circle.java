package projects.project11;

// Implement Shape interface and provide abstract method
public class Circle {

    /*
    Define an instance variable called pi and give initial value of 3.14
    Instance variable must be private, static and final
    */
    private static final double pi = 3.14;

    /*
    Define an instance variable for circle called radius
    Instance variable must be encapsulated - private
    */
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*
    Override area and perimeter methods here
    REMEMBER:
    Area of a circle => π * r * r
    Perimeter of a circle => 2 * π * r
    */
    public double area() {
        return pi * radius * radius;
    }

    public double perimeter() {
        return 2 * pi * radius;
    }

    // Override toString() method here
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
