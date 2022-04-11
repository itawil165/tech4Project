package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int var1 = 7;
        int var2 = 2;

        int addSum = var1 + var2; // Addition

        int subSum = var1 - var2; // Subtraction

        int multiSum1 = var1 * var2; // Multiplication
        int multiSum2 = var2 * var1;

        int divSumRemainder = var2 % var1; // Division regarding whole numbers and give remainder - will only return whole numbers!
        int divSumWhole = var2 / var1; // This will return a 0 since the answer is a decimal and int cannot output decimals! Need to create doubles for it to work.

        double varD1 = 7;
        double varD2 = 2;
        double divSumDeci = varD2 / varD1; // Division regarding decimals - will return decimals and wholes!

        System.out.println("Simple addition: 7 + 2 = " + addSum);
        System.out.println("Simple reduction: 7 - 2 = " + subSum);
        System.out.println();
        System.out.println("Simple multiplication: 7 * 2 = " + multiSum1);
        System.out.println("Commutative property of multiplication: 2 * 7 = " + multiSum2);
        System.out.println();
        System.out.println("Division with remainder: 7 % 2 = " + divSumRemainder);
        System.out.println("Division with whole number: 7 /2 = " + divSumWhole);
        System.out.println("Division with decimals: 7 / 2 = " + divSumDeci);
        System.out.println();



// Exercise: Calculate the Area and Perimeter
        int w = 4;
        int l = 5;

        // Perimeter = 2wl
        int p = 2 * w * l;

        // Area = wl
        int a = w * l;

        System.out.println("The perimeter of the square is: " + p + "m");
        System.out.println("The area of the square is: " + a + "m");
        System.out.println();

// Exercise: Use the annual salary of 90k to find the monthly and bi-weekly pay

        double annSalary = 90_000.00;

        double monthlySalary = annSalary / 12;
        double biweeklySalary = annSalary / 26;

        System.out.println("Annual pay of " + annSalary);
        System.out.println("Monthly pay of " + monthlySalary);
        System.out.println("Bi-Weekly pay of " + biweeklySalary);
        System.out.println();
    }
}
