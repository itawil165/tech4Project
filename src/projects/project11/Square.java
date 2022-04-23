package projects.project11;

// Implement Shape interface and provide abstract method implementation
public class Square{

    /*
    Define an instance variable for Square called side
    Instance variable must be encapsulated - private
    */
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    /*
    Override area and perimeter methods here
    REMEMBER:
    Area of a square => side * side
    Perimeter of a square => 4 * side
    */
    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }

    //Override toString() method here
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

