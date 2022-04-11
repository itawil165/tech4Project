package homework;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {

// TASK 01

        int[] firstIntDupe = {-4, 0, -7, 0, 5, 10, 45, 45};

        boolean dupeIntCheck1 = false; // set flag

        for (int i = 0; i < firstIntDupe.length; i++) {
            for (int j = i + 1; j < firstIntDupe.length; j++) {
                if (firstIntDupe[i] == firstIntDupe[j] && !dupeIntCheck1){
                    System.out.print("The first duplicate is: " + firstIntDupe[j]);
                    dupeIntCheck1 = true;
                }
            }
        }

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        String[] firstStringDupe = {"Z", "abc", "z", "123", "#"};

        boolean dupeStringCheck1 = false; // set flag

        for (int i = 0; i < firstStringDupe.length; i++) {
            for (int j = i + 1; j < firstStringDupe.length; j++) {
                if (firstStringDupe[i].equalsIgnoreCase(firstStringDupe[j]) && !dupeStringCheck1) {
                    System.out.println("The first duplicate is: " + firstStringDupe[j]);
                    dupeStringCheck1 = true;
                }
            }
        }

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        int[] intDupes = {-4, 0, -7, 0, 5, 10, 45};

        int dupeIntCheck2 = 0; // set counter

        for (int i = 0; i < intDupes.length; i++) {
            for (int j = i + 1; j < intDupes.length; j++) {
                if (intDupes[i] == intDupes[j]){
                    System.out.print(intDupes[j] + ", ");
                    dupeIntCheck2++;
                    break;
                }
            }
        }
        if (dupeIntCheck2 >= 1) System.out.println("There are " + dupeIntCheck2 + " duplicates");
        else System.out.println("There are no duplicates");

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        String[] stringDupes = {"A", "foo", "12", "Foo", "bar", "a", "java"};

        int dupeStringCheck2 = 0; // set counter

        for (int i = 0; i < stringDupes.length; i++) {
            for (int j = i + 1; j < stringDupes.length; j++) {
                if (stringDupes[i].equalsIgnoreCase(stringDupes[j])){
                    System.out.print(stringDupes[j] + ", ");
                    dupeStringCheck2++;
                }
            }
        }
        if (dupeStringCheck2 >= 1) System.out.println("There are " + dupeStringCheck2 + " duplicates");
        else System.out.println("There are no duplicates");

        System.out.println("\n\t-------TASK 04 END-------\n");


// TASK 05

        String[] reverseWords = {"abc", "foo", "bar"};

        for (int i = 0; i < reverseWords.length/2; i++) {
            String temp = reverseWords[i];
            reverseWords[i] = reverseWords[reverseWords.length - 1 -i];
            reverseWords[reverseWords.length - 1 -i] = temp;
        }
        System.out.println(Arrays.toString(reverseWords));

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

       String input = "Java is fun";

       String[] words = input.split(" ");
       String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";

            for (int j = word.length() - 1; j >= 0 ; j--) {
                reversedWord += word.charAt(j);
            }
            reversedString += reversedWord + " ";
        }
        System.out.println(input);
        System.out.println(reversedString);

        System.out.println("\n\t-------TASK 06 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
