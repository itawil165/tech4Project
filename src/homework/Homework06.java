package homework;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

// TASK 01

        String str1 = "5", str2 = "10";

        int var1 = Integer.parseInt(str1), var2 = Integer.parseInt(str2);

        System.out.println("The sum of 5 and 10 is = " + (var1 + var2) +
                "\nThe product of 5 and 10 is = " + (var1 * var2) +
                "\nThe division of 5 and 10 is = "+ (var1 / var2) +
                "\nThe difference of 5 and 10 is = " + (var1 - var2) +
                "\nThe remainder of 5 and 10 is = " + (var1 % var2));

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        String str3 = "200", str4 = "-50";

        int var3 = Integer.parseInt(str3), var4 = Integer.parseInt(str4);

        System.out.println("The greatest value is = " + Math.max(var3, var4) +
                "\nThe smallest value is = " + Math.min(var3, var4) +
                "\nThe average is = " + ((var3 + var4) / 2) +
                "\nThe absolute difference is = " + Math.abs(var3 - var4));

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        double quarters = 0.75, dime = 0.10, nickel = 0.10, penny = 0.01;
        double perDay1 = (quarters + dime + nickel + penny);

        double days24 = (24.0 / perDay1);
        int days24Int = (int) days24;

        double days168 = (int) (168.5 / perDay1);
        int days168Int = (int) days168;

        double after5Months =  (5 * 30) * perDay1;

        System.out.println("It will take " + days24Int + " days to save $24");
        System.out.println("It will take " + days168Int + " days to save $168");
        System.out.println("After 5 months, you will have saved $" + after5Months);

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        double perDay2 = 62.50, needed = 1_250.0;

        double daysNeeded = needed / perDay2;
        int daysNeededInt = (int) daysNeeded;

        System.out.println("Jessie will need " + daysNeededInt + (" days to save up for a computer."));

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        double save = 14_265.0, option1 = 475.50, option2 = 951.0;

        double option1Dur = save / option1, option2Dur = save / option2;

        int option1DurInt = (int) option1Dur, option2DurInt = (int) option2Dur;

        System.out.println("Option 1 will take " + option1DurInt + " months.");
        System.out.println("Option 2 will take " + option2DurInt + " months.");

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");

        int var5 = userInput.nextInt(), var6 = userInput.nextInt();
        double var5d6 = (double) var5 / var6;

        System.out.println("The division of the given numbers is = " + var5d6);

        System.out.println("\n\t-------TASK 06 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
