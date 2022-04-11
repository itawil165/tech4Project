package homework;

import java.util.Arrays;
import java.util.Random;

public class Homework13 {
    public static void main(String[] args) {

// TASK 01

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i % 5 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 ==0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        System.out.println(Arrays.toString(numbers));

        boolean negative = false, positive = false;

        for (int number : numbers) {
            if (number < 0 && !negative) {
                negative = true;
                System.out.println("First negative number is: " + number);
            }
            else if (number > 0 && !positive){
                positive = true;
                System.out.println("First positive number is: " + number);
            }

            if (negative && positive) break;
        }

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        int[] random = {new Random().nextInt(10), new Random().nextInt(10),
                new Random().nextInt(10), new Random().nextInt(10), new Random().nextInt(10)};

        boolean has2or3 = false;

        System.out.println(Arrays.toString(random));

        for (int i : random) {
            if (i == 2 || i == 3) {
                has2or3 = true;
                break;
            }
        }
        System.out.println(has2or3);

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        String[] list = {"banana", "orange", "Apple"};

        boolean hasApple = false;

        for (String apple : list) {
            if (apple.equalsIgnoreCase("apple")) {
                hasApple = true;
                break;
            }
        }
        System.out.println(hasApple);

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK  05

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        for (int i = 0; i < Math.min(numbers1.length, numbers2.length); i++) {
            for (int j = 0; j < Math.min(numbers1.length, numbers2.length); j++) {
                if (numbers1[i] == numbers2[j]) System.out.println(numbers1[i]);
            }
        }

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        String str = "baNana";

        char[] strArray = str.toLowerCase().toCharArray();


        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i] == strArray[j] && strArray[j] != ' ') {
                    System.out.println("Duplicate characters in this String are: " + strArray[j]);
                    break;
                }
            }
        }

        System.out.println("\n\t-------TASK 06 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
