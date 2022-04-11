package loops.whileLoops;

import utilities.ScannerHelper;

public class DoWhile {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter a number
        if number is more than or equal to 10, then finish the program but
        if number is less than 10, keep asking user to enter a new number
        until user enters a number that is more than or equal to 10

        Example program:
        Program: Please enter a number
        User: 3
        Program: This number is not more than or equal to 10
        Program: Please enter a new number
        User: 8
        Program: This number is not more than or equal to 10
        Program: Please enter a new number
        User: 15
        Program: This number is more than or equal to 10
         */


        int input = 0;
        int number = 0;

        do {
            input = ScannerHelper.getNumberFromUser();

            if (input >= 10) {
                System.out.println("This number is more than or equal to 10");
                break;
            }
            if (number + input <= 10) number += input;

        } while (number < 10);

    }
}
