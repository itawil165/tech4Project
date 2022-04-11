package loops.controlStatements;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import utilities.ScannerHelper;

public class Exercise02 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        between 0 and 10 (0 and 10 included)
        Print all the numbers between given 2 integers starting
        from smallest to biggest (given numbers are included)
        HOWEVER, do not print the number of 5
        6 8   -> 6 7 8
        9 7   -> 7 8 9
        1 3   -> 1 2 3
        3 7   -> 3 4 6 7

        PSEUDO-CODE:
        1. Ask user to enter 2 numbers
        2. Store number in int variables
        3. Compare numbers and find biggest and smallest
        4. Start a loop with below info
            StartPoint : max number
            EndPoint   : min number
            Update     : decrement
        5. Don't print 5
         */

        int num1 = ScannerHelper.getNumberFromUser();
        int num2 = ScannerHelper.getNumberFromUser();

        // First way - without continue
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if(i != 5) System.out.print(i + ", ");
        }

        System.out.println();

        // Second way - with continue
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if(i == 5) continue;
            System.out.print(i + ", ");
        }
    }
}
