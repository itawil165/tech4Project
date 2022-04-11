package homework;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

// TASK 01

        int ran1 = (int) (Math.random() * 51);
        System.out.println(ran1);

        if (ran1 >= 10 && ran1 <= 25) System.out.println(true); // Can also be simplified into
        else System.out.println(false);                             // System.out.println(ran1 >= 10 && ran1 <= 25);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        int ran2 = (int) ((Math.random() * 100) + 1);

        // Check if in first or second half
        if (ran2 >= 1 && ran2 <= 50) System.out.println(ran2 + " is in the 1st half");
        else System.out.println(ran2 + " is in the 2nd half");

        // Check which quarter it is in
        if (ran2 >= 1 && ran2 <= 25) System.out.println(ran2 + " is in the 1st quarter");
        else if (ran2 >= 26 && ran2 <= 50) System.out.println(ran2 + " is in the 2nd quarter");
        else if (ran2 >= 51 && ran2 <= 75) System.out.println(ran2 + " is in the 3rd quarter");
        else System.out.println(ran2 + " is in the 4th quarter");

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 5 numbers between 1 and 10 to earn points");
        int var1 = userInput.nextInt(), var2 = userInput.nextInt(), var3 = userInput.nextInt(),
                var4 = userInput.nextInt(), var5 = userInput.nextInt();

        int points = (var1 * 5) + (var2 * 4) + (var3 *3) + (var4 * 2) + (var5);

        if ((var1 < 0 || var1 > 10) || (var2 < 0 || var2 > 10) || (var3 < 0 || var3 > 10) ||
                (var4 < 0 || var4 > 10) || (var5 < 0 || var5 > 10)){
            System.out.println("You entered a number beyond the given limit. You receive no points :(");
        }
        else System.out.println("Congratulations! You received " + points + "!");

        System.out.println("\n\t-------TASK 03 END-------\n");

        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
