package projects;

import java.util.Arrays;

public class Project07 {
    public static void main(String[] args) {

// TASK 01

        int[] smallToLargeSort = {10, 7, 7, 10, -3, 10, -3};
        Arrays.sort(smallToLargeSort);
        System.out.println(Arrays.toString(smallToLargeSort));
        System.out.println("Smallest number = " + smallToLargeSort[0]);
        System.out.println("Largest number = " + smallToLargeSort[smallToLargeSort.length - 1]);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        int[] smallToLargeNoSort = {10, 7, 7, 10, -3, 10, -3};
        int smallest1 = smallToLargeNoSort[0];
        int largest1 = smallToLargeNoSort[0];

        for (int i : smallToLargeNoSort) {
            if (i < smallest1) smallest1 = i;
            if (i > largest1) largest1 = i;
        }
        System.out.println(Arrays.toString(smallToLargeNoSort));
        System.out.println("Smallest number = " + smallest1);
        System.out.println("Largest number = " + largest1);

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        int[] secondSmallToLargeSort = {10, 5, 6, 7, 8, 5, 15, 15};
        Arrays.sort(secondSmallToLargeSort);
        System.out.println(Arrays.toString(secondSmallToLargeSort));
        System.out.println("Second smallest number = " + secondSmallToLargeSort[2]);
        System.out.println("Second largest number = " + secondSmallToLargeSort[secondSmallToLargeSort.length - 3]);

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        int[] secondSmallToLargeNoSort = {10, 5, 6, 7, 8, 5, 15, 15};
        System.out.println(Arrays.toString(secondSmallToLargeSort));

        // Find smallest and second-smallest
        int smallest2 = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int i : secondSmallToLargeNoSort) {
            if (smallest2 > i) {
                secondSmallest = smallest2;
                smallest2 = i;
            }

            if (smallest2 < i && secondSmallest > i) {
                secondSmallest = i;
            }
        }
        System.out.println("The second smallest = " + secondSmallest);

        // Find largest and second-largest
        int largest2 = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int i : secondSmallToLargeNoSort) {
            if (largest2 < i) {
                secondLargest = largest2;
                largest2 = i;
            }

            if (largest2 > i && secondLargest < i) {
                secondLargest = i;
            }
        }
        System.out.println("The second largest = " + secondLargest);

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        String[] duplicates = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};

        System.out.println("Repeated elements = " );

        for (int i = 0; i < duplicates.length; i++) {
            for (int j = i + 1; j < duplicates.length; j++) {
                if (duplicates[i].equals(duplicates[j])){
                    System.out.println(duplicates[j]);
                }
            }
        }

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        String[] mostRepeated = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        String repeated = "";
        int count = 0;

        for (int i = 0; i < mostRepeated.length; i++) {
            String tempRepeated = mostRepeated[i];
            int tempCount = 0;
            for (int j = 0; j < mostRepeated.length; j++) {
                if (mostRepeated[j].equals(tempRepeated)) tempCount++;
            }
            if (tempCount > count) {
                repeated = tempRepeated;
                count = tempCount;
            }
        }
        System.out.println("The most repeated element = " + repeated);

        System.out.println("\n\t-------TASK 05 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
