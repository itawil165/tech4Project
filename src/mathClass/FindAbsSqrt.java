package mathClass;

import javax.swing.plaf.metal.MetalTabbedPaneUI;

public class FindAbsSqrt {
    public static void main(String[] args) {

        int x = 25;
        int y = 9;
        int z = -9;
        double w = 7.654;

// Working with abs values
        System.out.println(y-x);
        System.out.println(Math.abs(y-x));
        System.out.println(z);
        System.out.println(Math.abs(z));
        System.out.println();


        char b = 65; // Gives ASCII values of 4
        char c =  (char) Math.abs(10-75); // Requires (char) to tell Java that the end result should be a char --> Casting

        System.out.println(b);
        System.out.println(c);
        System.out.println();

// Working with square roots
        System.out.println(Math.sqrt(x));
        System.out.println(Math.sqrt(x-y));
        System.out.println(Math.sqrt(z)); // Not a Number (NaN) bc sqrt values cannot be negative!
        System.out.println(Math.sqrt(Math.abs(z))); // NaN resolved by getting the abs value before getting the sqrt
        System.out.println(Math.sqrt(w));
        System.out.println();
    }
}
