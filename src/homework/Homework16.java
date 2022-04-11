package homework;

import primitives.Int;
import utilities.ScannerHelper;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {
    public static void main(String[] args) {

// TASK 01

        String countWords = ScannerHelper.getStringFromUser();
        int wordCount = 1;

        String wordTrim = countWords.trim();

        for (int i = 0; i < wordTrim.length(); i++) {
            if (wordTrim.charAt(i) == ' ') wordCount++;
        }
        if (wordTrim.length() == 0) wordCount = 0;

        System.out.println("Words in the entered String = " + wordCount);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        String wordWithA = ScannerHelper.getStringFromUser();
        int aCount = 0;

        for (int i = 0; i < wordWithA.length(); i++) {
            if (wordWithA.toLowerCase().charAt(i) == 'a') aCount++;
        }

        System.out.println("Number of A or a in the entered String = " + aCount);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 03

        ArrayList<Integer> isPositive = new ArrayList<>();
        isPositive.add(-45); isPositive.add(0); isPositive.add(34); isPositive.add(-5); isPositive.add(67);
        int positiveCount = 0;

        for (Integer positive : isPositive) {
            if (positive >= 0) positiveCount++;
        }

        System.out.println("The number of positive integers in the Array is = " + positiveCount);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 04

        ArrayList<Integer> intDuplicates = new ArrayList<>();
        intDuplicates.add(10); intDuplicates.add(20); intDuplicates.add(35); intDuplicates.add(20);
        intDuplicates.add(35); intDuplicates.add(60); intDuplicates.add(70); intDuplicates.add(60);

        ArrayList<Integer> duplicatesRemoved = new ArrayList<>(); // Empty ArrayList to fill up with non-duplicates


        System.out.println(intDuplicates);

        for (Integer dupe : intDuplicates) {
            if (!duplicatesRemoved.contains(dupe)) {
                duplicatesRemoved.add(dupe); // Only add non-duplicates into new ArrayList
            }
        }

        System.out.println(duplicatesRemoved);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 05

        ArrayList<String> stringDuplicates = new ArrayList<>();
        stringDuplicates.add("java"); stringDuplicates.add("C#"); stringDuplicates.add("ruby");
        stringDuplicates.add("jAVA"); stringDuplicates.add("ruby"); stringDuplicates.add("C#");
        stringDuplicates.add("C++"); stringDuplicates.add("java");

        ArrayList<String> duplicateStringsRemoved = new ArrayList<>(); // Empty ArrayList to fill up with non-duplicates


        System.out.println(stringDuplicates);

        for (String dupe : stringDuplicates) {
            if (!duplicateStringsRemoved.contains(dupe)) {
                duplicateStringsRemoved.add(dupe); // Only add non-duplicates into new ArrayList
            }
        }

        System.out.println(duplicateStringsRemoved);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 06

        String noExtraSpaces = ScannerHelper.getStringFromUser();

        System.out.println(noExtraSpaces.replaceAll("\\s+", " ").trim()); // Using regex!

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 07

        int[] first =  {3, 0, 0, 7, 5, 10};
        System.out.println(Arrays.toString(first));

        int[] second = {6, 3, 2};
        System.out.println(Arrays.toString(second));

        int[] sum = new int[Math.min(first.length, second.length)];

        for (int i = 0; i < Math.min(first.length, second.length); i++) {
            sum[i] = first[i] + second[i];
        }

        System.out.println(Arrays.toString(sum));

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 08

        int[] numbers = {100, -3, 5, 70, 15, 57};
        int target = 10;

        int closest = 0;
        int dist = Math.abs(numbers[0] - target);


        for (int i = 0; i < numbers.length; i++) {
            int closerDist = Math.abs(numbers[i] - target);

            if (closerDist < dist) {
                closest = i;
                dist = closerDist;
            }
        }
        System.out.println(numbers[closest]);

        System.out.println("\n\t-------TASK 01 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
