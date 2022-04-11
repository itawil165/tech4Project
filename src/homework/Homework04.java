package homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

// TASK 01

        System.out.println("Please enter 2 numbers");
        double avgVar1 = userInput.nextDouble();
        double avgVar2 = userInput.nextDouble();

        System.out.println("The average of the given 2 numbers is: " + (avgVar1 + avgVar2) / 2);

        System.out.println("\n\t-------TASK 01 END-------\n");


// TASK 02

        System.out.println("Please enter 2 numbers");
        double productVar1 = userInput.nextDouble();
        double productVar2 = userInput.nextDouble();

        System.out.println("The product of the given 2 numbers is: " + (productVar1 * productVar2));

        System.out.println("\n\t-------TASK 02 END-------\n");


// TASK 03

        System.out.println("Please enter 3 numbers");
        double sqrVar1 = userInput.nextDouble();
        double sqrVar2 = userInput.nextDouble();
        double sqrVar3 = userInput.nextDouble();

        System.out.println("The square of " + sqrVar1 + " is: " + (sqrVar1 * sqrVar1));
        System.out.println("The square of " + sqrVar2 + " is: " + (sqrVar2 * sqrVar2));
        System.out.println("The square of " + sqrVar3 + " is: " + (sqrVar3 * sqrVar3));

        System.out.println("\n\t-------TASK 03 END-------\n");


// TASK 04

        System.out.println("Please enter 2 numbers");
        int remVar1 = userInput.nextInt();
        int remVar2 = userInput.nextInt();

        System.out.println("The remainder of " + remVar1 + " and " + remVar2 + " is: " + (remVar1 % remVar2));

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        System.out.println("Please enter 5 numbers");
        double avgVar3 = userInput.nextDouble();
        double avgVar4 = userInput.nextDouble();
        double avgVar5 = userInput.nextDouble();
        double avgVar6 = userInput.nextDouble();
        double avgVar7 = userInput.nextDouble();

        System.out.println("The average of the given 5 numbers is: " + (avgVar3 + avgVar4 + avgVar5 + avgVar6 + avgVar7) / 5);

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        System.out.println("Please enter a number");

        double multiTable = userInput.nextDouble();


        System.out.println(multiTable + " * 1 = " + (multiTable * 1));
        System.out.println(multiTable + " * 2 = " + (multiTable * 2));
        System.out.println(multiTable + " * 3 = " + (multiTable * 3));
        System.out.println(multiTable + " * 4 = " + (multiTable * 4));
        System.out.println(multiTable + " * 5 = " + (multiTable * 5));
        System.out.println(multiTable + " * 6 = " + (multiTable * 6));
        System.out.println(multiTable + " * 7 = " + (multiTable * 7));
        System.out.println(multiTable + " * 8 = " + (multiTable * 8));
        System.out.println(multiTable + " * 9 = " + (multiTable * 9));
        System.out.println(multiTable + " * 10 = " + (multiTable * 10));

        System.out.println("\n\t-------TASK 06 END-------\n");

// TASK 7

        System.out.println("Please enter the length of the sides of the square");

        double side = userInput.nextDouble();

        System.out.println("The perimeter of the square is " + (4 * side) + "m");
        System.out.println("The area of the square is " + (side * side) + "m^2");

        System.out.println("\n\t-------TASK 07 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
