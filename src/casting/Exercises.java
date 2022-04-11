package casting;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        /*
        Ask the user to enter their balance as a String then their next 3 transactions.
        Convert the output from String to double.
        */

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your balance?");
        String balance = userInput.next();
        double balanceD = Double.parseDouble(balance);

        System.out.println("What are your next 3 transactions?");
        String t1 = userInput.next(), t2 = userInput.next(), t3 = userInput.next();

        // Convert the Strings to double
        double tD1 = Double.parseDouble(t1), tD2 = Double.parseDouble(t2), tD3 = Double.parseDouble(t3);

        System.out.println("Your balance is now: " + (balanceD - tD1 - tD2 - tD3));
    }
}
