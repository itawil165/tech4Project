package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class CountingArrayListElements {
    public static void main(String[] args) {
        /*
        Create an ArrayList that stores numbers
        10, 12, 13, 8, 9, 15
        Print the list --> [10, 12, 13, 8, 9, 15]
         */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);

        System.out.println(numbers);

        /*
        Count how many odd numbers you have in the list and print the result: 3 odds
        */
        int oddCount = 0;

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                oddCount++;
            }
            System.out.println("There are " + oddCount + " odd numbers");


        }
    }
}
