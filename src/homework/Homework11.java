package homework;

import utilities.ScannerHelper;

public class Homework11 {
    public static void main(String[] args) {

// TASK 01

        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0) System.out.print(i + " - ");
        }

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        for (int i = 1; i <= 50; i++){
            if (i % 2 == 0 && i % 3 == 0) System.out.print(i + " - ");
        }

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        for (int i = 100; i >= 50; i--){
            if (i % 5 == 0) System.out.print(i + " - ");
        }

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        for (int i = 0; i <= 7; i++){
            System.out.println("The square of " + i + " is = " + i*i);
        }

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        int sum = 0;

        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        int fact = ScannerHelper.getNumberFromUser();

        for (int i = fact - 1; i >= 1; i--){
            fact *= i;
        }
        System.out.println(fact);

        System.out.println("\n\t-------TASK 06 END-------\n");

// TASK 07

        String name = ScannerHelper.getNameFromUser();
        int vowelNum = 0;

        for (int i = 0; i < name.length(); i++) {
            char vowel = name.toLowerCase().charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                vowelNum++;
            }
        }
        System.out.println(vowelNum);

        System.out.println("\n\t-------TASK 07 END-------\n");

// TASK 08

        int input = 0;
        int total = 0;

        do {
            input = ScannerHelper.getNumberFromUser();

            if (input > 100) {
                System.out.println("This number is already more than 100");
                break;
            }
            if (total + input <= 100) total += input;

        } while (total < 100);

        if (total == 0) System.out.println();
        else System.out.println("The sum of the numbers = " + total);

        System.out.println("\n\t-------TASK 08 END-------\n");

// TASK 09

        int fibonacci = ScannerHelper.getNumberFromUser();

        // Define first two numbers of the series
        int first = 0;
        int second = 1;

        int nth = 0;

        System.out.println("Fibonacci series");
        System.out.print(first + " -" + second + " - ");

        for (int i = 2; i < fibonacci; i++) {

            // Updates the values as the loop goes on
            nth = first + second;
            first = second;
            second = nth;

            System.out.print(nth + " - ");
        }

            System.out.println("\n\t-------TASK 09 END-------\n");

// TASK 10

            String jName;

            do {
                jName = ScannerHelper.getNameFromUser();

                if (jName.toLowerCase().startsWith("j")){
                    System.out.println("User: " + jName);
                }
            } while (!jName.toLowerCase().startsWith("j"));

        System.out.println("\n\t-------TASK 10 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}

