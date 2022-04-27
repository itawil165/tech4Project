package collectionsFramework;

import java.util.*;

public class Remove_Duplicates {
    public static void main(String[] args) {

        /*
        Create an ArrayList and store below elements
        Computer
        Phone
        Mouse
        Mouse
        Phone
        Pen

        Remove all duplicates and print  unique elements
        EXPECTED RESULT:
        [Computer, Phone, Mouse, Pen]
        */
        System.out.println("\n-------First way - using loops--------\n");

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        System.out.println("Before removing dupes: " + objects);

        // Create empty List to store unique values

        ArrayList<String> uniques =  new ArrayList<>();

        for (String object : objects) {
            if (!uniques.contains(object)) uniques.add(object);
        }

        System.out.println("After removing dupes: " + uniques);


        System.out.println("\n-------Second way - using collections--------\n");

        // TreeSet --> [Computer, Mouse, Pen, Phone]; (sorts them)
        TreeSet<String> treeSetUniques = new TreeSet<>(objects);
        System.out.println(treeSetUniques);

        // HashSet --> NO PREDICTION
        HashSet<String> hashSetUniques = new HashSet<>(objects);
        System.out.println(hashSetUniques);

        // LinkedHashSet --> [Computer, Phone, Mouse, Pen]; (leaves in order entered)
        LinkedHashSet<String> linkedHashSetUniques = new LinkedHashSet<>(objects);
        System.out.println(linkedHashSetUniques);


    }
}
