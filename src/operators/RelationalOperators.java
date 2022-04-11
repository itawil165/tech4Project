package operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // Checking variable equality
        int var1 = 4;
        int var2 = 10;

        boolean equal = var1 == var2; // Checks if var1 is equal to var2
        boolean notEqual = var1 != var2; // Checks if var1 is not equal to var2

        // (highlight means it will always be true/false)

        System.out.println(equal);
        System.out.println(notEqual);
        System.out.println();

        // Comparing variables as less/greater than

        boolean greaterThan = var1 > var2;
        boolean lessThan =  var1 < var2;
        boolean greaterThanOrEqual = var1 >= var2;
        boolean lessThanOrEqual = var1 <= var2;

        System.out.println("Show the validity of the following:");
        System.out.println("4 > 10: " + greaterThan);
        System.out.println("4 < 10: " + lessThan);
        System.out.println("4 >= 10: " + greaterThanOrEqual);
        System.out.println("4 <= 10: " + lessThanOrEqual);
        System.out.println();

// Exercise

        int x= 10, y = 20, z = 10;

        boolean b1 = y < z;
        boolean b2 = x <= y;
        boolean b3 = x >= z;
        boolean b4 = y > x;
        boolean b5 = x >= y;
        // boolean b6 = (x >= z) < y; --> (x >= z) is does not have a valid mathematical value

        System.out.println(b1 + "\n" + b2 + "\n" + b3 + "\n" + b4 + "\n" + b5);
    }
}
