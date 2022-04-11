package homework;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

// TASK 01

        Scanner inputInt = new Scanner(System.in);

        System.out.println("Please enter the first integer number");
        int var1 = inputInt.nextInt();
        System.out.println("The first number entered is " + var1);

        System.out.println("Please enter the second integer number");
        int var2 = inputInt.nextInt();
        System.out.println("The second number entered is " + var2);
        System.out.println();

        System.out.println("The sum of the given integer numbers is: " + (var1 + var2));

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        Scanner inputDouble1 = new Scanner(System.in);

        System.out.println("Please enter the first decimal number");
        double var3 = inputDouble1.nextDouble();
        System.out.println("The first number entered is " + var3);

        System.out.println("Please enter the second decimal number");
        double var4 = inputDouble1.nextDouble();
        System.out.println("The second number entered is " + var4);
        System.out.println();

        System.out.println("The division of the given decimal numbers is: " + (var3 / var4));

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        System.out.println(-10 + (7*5));
        System.out.println((72 + 24) % 24);
        System.out.println(10 + (-3*9) / 9);
        System.out.println(5 + (18 /3) * 3 - (6%3));

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        Scanner inputDouble2 = new Scanner(System.in);

        System.out.println("Please enter the first number");
        double var5 = inputDouble2.nextDouble();
        System.out.println("The first number entered is " + var5);

        System.out.println("Please enter the second number");
        double var6 = inputDouble2.nextDouble();
        System.out.println("The second number entered is " + var6);
        System.out.println();

        System.out.println("The sum of the given numbers is: " + (var5 + var6));
        System.out.println("The product of the given numbers is: " + (var5 * var6));
        System.out.println("The difference of the given numbers is: " + (var5 - var6));
        System.out.println("The division of the given numbers is: " + (var5 / var6));
        System.out.println("The remainder of the given numbers is: " + (var5 % var6));

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        double w = 7.5;
        double l = 10.5;

        System.out.println("The perimeter of the rectangle is " + (2 * (w + l)) + "m");
        System.out.println("The area of the rectangle is " + (w * l) + "m^2");

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        double avgSalary = 90_000.00;
        System.out.println("A Software Engineer in Test can earn " + (avgSalary * 3) + " in 3 years");

        System.out.println("\n\t-------TASK 06 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
