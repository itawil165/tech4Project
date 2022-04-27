package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class FindSecondGreatest {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);

        // TreeSet --> [3, 5, 7]
        TreeSet<Integer> treeSetUniques = new TreeSet<>(numbers);
        System.out.println(treeSetUniques);

        ArrayList<Integer> uniquesList = new ArrayList<>(treeSetUniques);
        System.out.println(uniquesList.get(uniquesList.size() - 2)); // second from the last will be second greatest
    }
}
