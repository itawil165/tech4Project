package ifElseStatements.ifANDElse;

import java.util.Scanner;

public class IfANDElse {
    public static void main(String[] args) {

        double balance = 350;

        // test to see of statement will be true (balance < 150)
        boolean balanceLow = balance <= 24;
        boolean balanceNormal = 25 <= balance;
        boolean balanceHigh = balance > 500;
        boolean balanceNeg = 0 >= balance;


        if (balanceLow) {
            System.out.println("Your balance is low");
        }
        if (balanceNormal){
            System.out.println("Your balance is healthy");
        }
        if (balanceHigh){
            System.out.println("Your balance is high");
        }
        if (balanceNeg){
            System.out.println("You balance is negative");
        }

// Exercise 1

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your age");
        int retireAge = userInput.nextInt();

        boolean retireAgeHit = retireAge >= 55;

        if (retireAgeHit){
            System.out.println("It is time to retire!");
        }
        else {
            System.out.println("You're too young to retire!");
        }

        System.out.println("\n\t EXERCISE 1 END\n");

// Exercise 2

        boolean isWeekday = true;

        if (!isWeekday){
            System.out.println("It's the weekend!");
        }
        else {
            System.out.println("It's a weekday... ugh...");
        }

        System.out.println("\n\t EXERCISE 2 END\n");

// Exercise 3

        System.out.println("What's your balance?");
        double davidBalance = userInput.nextDouble();

        if (davidBalance >= 600){
            System.out.println("Congrats! You ain't broke!");
        }
        else {
            System.out.println("Sheesh... sorry man. Life's hard!");
        }

        System.out.println("\n\t EXERCISE 3 END\n");

// Exercise 4

        System.out.println("Please enter a number");
        int number = userInput.nextInt();

        if (number % 7 == 0){
            System.out.println("The number you entered is divisible by 7!");
        }
        else {
            System.out.println("Try again. This number is not divisible by 7");
        }

        System.out.println("\n\t EXERCISE 4 END\n");

    }
}
