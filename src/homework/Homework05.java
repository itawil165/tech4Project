package homework;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

// TASK 01

        System.out.println("Please enter 3 numbers");
        int var01 = userInput.nextInt(), var02 = userInput.nextInt(), var03 = userInput.nextInt();

        int startMax = Math.max(var01, var02);
        int finalMax = Math.max(startMax, var03);

        int startMin = Math.min(var01, var02);
        int finalMin = Math.min(startMin, var03);

        System.out.println("The max value of the given numbers is " + finalMax);
        System.out.println("The min value of the given numbers is " + finalMin);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        System.out.println("Please enter 5 numbers");

        int var04 = userInput.nextInt(), var05 = userInput.nextInt(), var06 = userInput.nextInt(),
                var07 = userInput.nextInt(), var08 = userInput.nextInt();

        int startMax1 = Math.max(var04, var05);
        int startMax2 = Math.max(var06, var07);
        int finalMax1 = Math.max(startMax1, startMax2);
        int finalMax2 = Math.max(finalMax1, var08);

        int startMin1 = Math.min(var04, var05);
        int startMin2 = Math.min(var06, var07);
        int finalMin1 = Math.min(startMin1, startMin2);
        int finalMin2 = Math.min(finalMin1, var08);


        System.out.println("The max value of the given numbers is " + finalMax2);
        System.out.println("The min value of the given numbers is " + finalMin2);

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        System.out.println("Please enter 2 numbers");

        int var09 = userInput.nextInt(), var10 = userInput.nextInt();
        int findAbs = Math.abs(var09 - var10);

        System.out.println("The difference between the numbers is " + findAbs);

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        System.out.println("3 random will be generated");

        // [ Math.random() * (end pt - start pt) + 1 ] + (start pt)

        double findRndm1 = (int) (Math.random() * 51) + 50, findRndm2 = (int) (Math.random() * 51) + 50,
                findRndm3 = (int) (Math.random() * 51) + 50;

        System.out.println("Number 1 = " + findRndm1);
        System.out.println("Number 2 = " + findRndm2);
        System.out.println("Number 3 = " + findRndm3);

        System.out.println("The sum of the generated numbers is " + (findRndm1 + findRndm2 +  findRndm3));

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        double alex = 125.0, mike = 220.0;

        double alexFinal = alex - 25.5, mikeFinal = mike + 25.5;

        System.out.println("Alex has $125 and Mike has $220. After their transaction is complete, " +
                "Alex will have $" + alexFinal + " and Mike will have $" + mikeFinal + ".");

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        double perDay = 15.60, neededMoney = 390.0;

        System.out.println("David needs to save $390 to buy a bicycle. He makes $15.60 a day.");
        System.out.println("It will take him " + (neededMoney / perDay) + " days to save enough.");

        System.out.println("\n\t-------TASK 06 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
