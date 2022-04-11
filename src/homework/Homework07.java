package homework;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        // [ Math.random() * (end pt - start pt) + 1 ] + (start pt)

// TASK 01

        int var01 = (int) ((Math.random() * 10)), var02 = (int) ((Math.random() * 10)),
                var03 = (int) ((Math.random() * 10)), var04 = (int) ((Math.random() * 10));

        System.out.println("Number 1 = " + var01);
        System.out.println("Number 2 = " + var02);
        System.out.println("Number 3 = " + var03);
        System.out.println("Number 4 = " + var04);

        int var1Diff = (int) Math.abs(var01 - 5), var2Diff = (int) Math.abs(var02 - 5),
                var3Diff = (int) Math.abs(var03 - 5), var4Diff = (int) Math.abs(var04 - 5);

        System.out.println("The absolute difference between " + var01 + " and 5 is = " + var1Diff);
        System.out.println("The absolute difference between " + var02 + " and 5 is = " + var2Diff);
        System.out.println("The absolute difference between " + var03 + " and 5 is = " + var3Diff);
        System.out.println("The absolute difference between " + var04 + " and 5 is = " + var4Diff);

        int greatestVar1 = (int) Math.max(Math.max(var01, var02), Math.max(var03, var04));
        int smallestVar1 = (int) Math.min(Math.min(var01, var02), Math.min(var03, var04));

        System.out.println("The greatest number is = " + greatestVar1);
        System.out.println("The greatest number is = " + smallestVar1);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        int var05 = (int) (Math.random() * 101) - 50, var06 = (int) (Math.random() * 101) - 50,
                var07 = (int) (Math.random() * 101) - 50, var08 = (int) (Math.random() * 101) - 50,
                var09 = (int) (Math.random() * 101) - 50, var10 = (int) (Math.random() * 101) - 50,
                var11 = (int) (Math.random() * 101) - 50, var12 = (int) (Math.random() * 101) - 50;

        System.out.println("Number 1 = " + var05);
        System.out.println("Number 2 = " + var06);
        System.out.println("Number 3 = " + var07);
        System.out.println("Number 4 = " + var08);
        System.out.println("Number 5 = " + var09);
        System.out.println("Number 6 = " + var10);
        System.out.println("Number 7 = " + var11);
        System.out.println("Number 8 = " + var12);

        // Finding max/min of the numbers
        int greatestVar2 = Math.max(

                Math.max((Math.max(var05, var06)), (Math.max(var07, var08))),
                Math.max((Math.max(var09, var10)), (Math.max(var11, var12)))
        );

        int smallestVar2 = Math.min(

                Math.min((Math.min(var05, var06)), (Math.min(var07, var08))),
                Math.min((Math.min(var09, var10)), (Math.min(var11, var12)))
        );

        System.out.println("The greatest number is = " + greatestVar2);
        System.out.println("The smallest number is = " + smallestVar2);

        // Finding average of numbers
        int averageVar1 = (var05 + var06 + var07 + var08 + var09 + var10 + var11 + var12) / 8;
        System.out.println("The average of the 8 numbers is = " + averageVar1);

        // Finding abs difference
        int absDiff = Math.abs(smallestVar2 - greatestVar2);
        System.out.println("The absolute difference between the smallest and greatest number is = " + absDiff);

        // Check if 3rd number is positive or negative
        if (var07 > 0) System.out.println("The 3rd number is positive = true");
        else System.out.println("The 3rd number is positive = false");

        // Check if 5th number is positive or negative
        if (var09 < 0)System.out.println("The 5th number is negative = true");
        else System.out.println("The 5th number is negative = false");

        // Check if there is at least 1 ZERO among the numbers
        if ((var05 == 0) || (var06 == 0) || (var07 == 0) || (var08 == 0) ||
                (var09 == 0) || (var10 == 0) || (var11 == 0) || (var12 == 0)){
            System.out.println("There is at least 1 zero among these numbers = true");
        }
        else System.out.println("There is at least 1 zero among these numbers = false");

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        int var13 = (int) (Math.random() * 51), var14 = (int) (Math.random() * 51),
                var15 = (int) (Math.random() * 51), var16 = (int) (Math.random() * 51),
                var17 = (int) (Math.random() * 51), var18 = (int) (Math.random() * 51) ,
                var19 = (int) (Math.random() * 51);

        System.out.println("Number 1 = " + var13);
        System.out.println("Number 2 = " + var14);
        System.out.println("Number 3 = " + var15);
        System.out.println("Number 4 = " + var16);
        System.out.println("Number 5 = " + var17);
        System.out.println("Number 6 = " + var18);
        System.out.println("Number 7 = " + var19);

        // Finding max/min of numbers
        int greatestVar3 = Math.max(
                Math.max((Math.max(var13, var14)), (Math.max(var15, var16))),
                Math.max((Math.max(var17, var18)), (var19))
        );
        int smallestVar3 = Math.min(
                Math.min((Math.min(var13, var14)), (Math.min(var15, var16))),
                Math.min((Math.min(var17, var18)), (var19))
        );

        System.out.println("The greatest number is = " + greatestVar3);
        System.out.println("The smallest number is = " + smallestVar3);

        // Finding average of numbers
        int averageVar2 = (var13 + var14 + var15 + var16 + var17 + var18 + var19) / 7;
        System.out.println("The average of the 7 numbers is = " + averageVar2);

        // Check if first number is greater than or equal to 10
        if (var13 >= 10) System.out.println("The 1st number is greater than or equal to 10 = true");
        else System.out.println("The 1st number is greater than or equal to 10 = false");

        // Check is last number is less than or equal to 40
        if (var19 <= 40) System.out.println("The last number is less than or equal to 40 = true");
        else System.out.println("The last number is less than or equal to 40 = false");

        // Check if both the first and last numbers are greater than 25
        if ((var13 > 25) && (var19 > 25)){
            System.out.println("Both the first and last numbers are greater than 25 = true");
        }
        else System.out.println("Both the first and last numbers are greater than 25 = false");

        // Check if there is any number equal to 0 or 50
        if ((var13 == 0) || (var14 == 0) || (var15 == 0) || (var16 == 0) ||
                (var17 == 0) || (var18 == 0) || (var19 == 0)){
            System.out.println("At least one of these numbers is a 0 or 50 = true");
        }
        else if ((var13 == 50) || (var14 == 50) || (var15 == 50) || (var16 == 50) ||
                (var17 == 50) || (var18 == 50) || (var19 == 50)){
            System.out.println("At least one of these numbers is a 0 or 50 = true");
        }
        else System.out.println("At least one of these numbers is a 0 or 50 = false");

        // Check if there is any number between 40 and 50 (40 and 50 included)
        if ((var13 >= 40) || (var14 >= 40) || (var15 >= 40) || (var16 >= 40) ||
                (var17 >= 40) || (var18 >= 40) || (var19 >= 40)){
            System.out.println("There is no number between 40 and 50 = false");
        }
        else if ((var13 <= 50) || (var14 <= 50) || (var15 <= 50) || (var16 <= 50) ||
                (var17 <= 50) || (var18 <= 50) || (var19 <= 50)){
            System.out.println("There is no number between 40 and 50 = false");
        }
        else System.out.println("There is no number between 40 and 50 = true");

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        int random1 = (int) (Math.random() * 101), random2 = (int) (Math.random() * 101),
                random3 = (int) (Math.random() * 101);

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        // Check if all 3 numbers are greater than 25
        if ((random1 > 25) && (random2 > 25) && (random3 > 25)){
            System.out.println("True");
        }
        else System.out.println("False");

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        System.out.println("Please enter a number between 1 and 7 to represent a day of the week");
        int dayInput = userInput.nextInt();

        if (dayInput == 1) System.out.println("Monday");
        else if (dayInput == 2) System.out.println("Tuesday");
        else if (dayInput == 3) System.out.println("Wednesday");
        else if (dayInput == 4) System.out.println("Thursday");
        else if (dayInput == 5) System.out.println("Friday");
        else if (dayInput == 6) System.out.println("Saturday");
        else if (dayInput == 7) System.out.println("Sunday");
        else System.out.println("This is beyond the allotted days of the week. Please enter a number between 1 and 7.");

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        System.out.println("Please enter a number between -10 and 10");
        int varInput = userInput.nextInt();

        // Check if number is POSITIVE, ZERO, or NEGATIVE
        if (varInput > 0) System.out.println("The number is POSITIVE");
        else if (varInput == 0) System.out.println("The number is ZERO");
        else System.out.println("The number is NEGATIVE");

        // Check if number is EVEN or ODD
        if (varInput % 2 == 0) {
            System.out.println("The number is EVEN");
        }
        else System.out.println("The number is ODD");

        System.out.println("\n\t-------TASK 06 END-------\n");

// TASK 07

        System.out.println("Please enter your exam grades");
        int grades1 = userInput.nextInt(), grades2 = userInput.nextInt(), grades3 = userInput.nextInt();

        // Check if grade average is greater than or equal to 70
        if ((grades1 + grades2 + grades3) / 3 >= 70){
            System.out.println("YOU PASSED! WELL PLAYED!");
        }
        else System.out.println("YOU FAILED! GIT GUD NOOB!");

        System.out.println("\n\t-------TASK 07 END-------\n");
        
// TASK 08

        System.out.println("Please enter 3 numbers");

        int jackpot1 = userInput.nextInt(), jackpot2 = userInput.nextInt(), jackpot3 = userInput.nextInt();

        // Check if all 3 numbers are equal, 2 are equal, or none
        if (jackpot1 == jackpot2 && jackpot1 == jackpot3){
            System.out.println("TRIPLE MATCH!");
        }
        else if ((jackpot1 == jackpot2) || (jackpot1 == jackpot3) || (jackpot2 == jackpot3)){
            System.out.println("DOUBLE MATCH!");
        }
        else System.out.println("NO MATCHES!");

        System.out.println("\n\t-------TASK 08 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
