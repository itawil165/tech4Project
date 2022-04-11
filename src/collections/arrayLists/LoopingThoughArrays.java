package collections.arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoopingThoughArrays {
    public static void main(String[] args) {
        List<Character> chars = new ArrayList<>();
        chars.add('B');
        chars.add('A');
        chars.add('D');
        chars.add('C');

        System.out.println("Unsorted: " + chars);
        Collections.sort(chars);
        System.out.println("Sorted: " + chars);

        // Print using loops
        System.out.println("\n-----Printed using for-i loop-----\n");
        for (int i = 0; i < chars.size(); i++) {
            System.out.print(chars.get(i) + ", ");
        }

        System.out.println();

        System.out.println("\n-----Printed using for-each loop-----\n");
        for (char element : chars) {
            System.out.print(element + ", ");
        }

    }
}
