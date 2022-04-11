package loops.controlStatements;

import utilities.ScannerHelper;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        Print all the numbers between the given 2 integers starting from biggest to smallest
        (given numbers are included)
        HOWEVER, do not print any number less than 10

        PSEUDO-CODE:
        1. Ask user to enter 2 numbers
        2. Store number in int variables
        3. Compare numbers and find biggest and smallest
        4. Start a loop with below info
            StartPoint : max number
            EndPoint   : min number
            Update     : decrement
        5. Don't print anything less than 10
         */

        int num1 = ScannerHelper.getNumberFromUser();
        int num2 = ScannerHelper.getNumberFromUser();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for (int i = max; i >= min; i--) {
            if(i < 10) break;
            System.out.print(i + ", ");
        }


    }
}
