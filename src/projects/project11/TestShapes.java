package projects.project11;

public class TestShapes {
    public static void main(String[] args) {

        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create a Circle, a Rectangle, and a Square object

        Information to create objects:
                 -radius of the circle = 4

                -width of the rectangle = 5.5
                -height of the rectangle = 6

                -side of the square = 2.5


         Print each object
         Print the area and perimeter of each object
         Find and print the object which has the largest area

         EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12

         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0

         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0

         "The shape with the largest area is the Circle: 50.24
         */

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        // CIRCLE INFO
        circle.setRadius(4);
        System.out.println(circle);
        System.out.println("Area of the Circle is = " + circle.area());
        System.out.println("Perimeter of the Circle is = " + circle.perimeter() + "\n");

        // RECTANGLE INFO
        rectangle.setWidth(5.5);
        rectangle.setHeight(6);
        System.out.println(rectangle);
        System.out.println("Area of the Rectangle is = " + rectangle.area());
        System.out.println("Perimeter of the Rectangle is = " + rectangle.perimeter() + "\n");

        // SQUARE INFO
        square.setSide(2.5);
        System.out.println(square);
        System.out.println("Area of the Square is = " + square.area());
        System.out.println("Perimeter of the Square is = " + square.perimeter() + "\n");

        // SHAPE WITH THE LARGEST AREA
        double largestArea = Math.max(Math.max(circle.area(), rectangle.area()), square.area());

        System.out.println("The shape with the largest area is the Circle: " + largestArea);

    }
}