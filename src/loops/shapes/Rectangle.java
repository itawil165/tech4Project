package loops.shapes;

public class Rectangle {
    public static void main(String[] args) {
        /*
        Write a program to print below rectangle
        * * * * * *
        *         *
        *         *
        *         *
        *         *
        *         *
        *         *
        * * * * * *
         */

        // Using print statements
        System.out.println("* * * * * *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("* * * * * *");

        // Using loops
        for (int i = 1; i <= 25; i++) {
            if (i == 1 || i == 25) System.out.println("* * * * * *");
            else System.out.println("*         *");
        }
    }
}
