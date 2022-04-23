package projects.project11;

// Implement Shape interface and provide abstract method
public class Rectangle {

    /*
    Define instance variables of rectangle as below
    Instance variables must be encapsulated - private
    double width
    double height
    */
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*
    Override area and perimeter methods here
    REMEMBER:
    Area of a rectangle => width * height
    Perimeter of a rectangle => 2 * (width + height)
    */
    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    // Override toString() method here
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}