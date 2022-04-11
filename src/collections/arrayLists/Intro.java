package collections.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {

        // Declaring Array vs ArrayList
        String[] namesArray = new String[5];
        ArrayList<String> namesList = new ArrayList<>();

        // Print size of Array vs ArrayList
        System.out.println(namesArray.length);
        System.out.println(namesList.size());

        // Add elements to Array vs ArrayList
        namesArray[0] = "Diamond";
        namesArray[4] = "Pearl";

        namesList.add("Gardevoir");
        namesList.add("Link");
        namesList.add("Zelda");
        namesList.add("Pikachu");
        System.out.println(namesList); // ["Gardevoir", "Link", "Zelda", "Pikachu"]

        namesList.set(3, "Eevee"); // ["Gardevoir", "Link", "Zelda", "Eevee"]

        // Print Array vs ArrayList
        System.out.println(Arrays.toString(namesArray));
        System.out.println(namesList);

        // Remove element from ArrayList
        namesList.remove("Link"); // ["Gardevoir", "Zelda", "Pikachu"]
        System.out.println(namesList);

        // Get element at index or index of element
        System.out.println(namesList.get(1)); // ["Gardevoir", "Zelda", "Pikachu"] --> Zelda
        System.out.println(namesList.indexOf("Gardevoir")); // 0

        namesList.add("Zelda"); // ["Gardevoir", "Zelda", "Pikachu", "Zelda"]
        System.out.println(namesList.lastIndexOf("Zelda")); // 3

        // Check if ArrayList contains element (returns boolean)
        System.out.println(namesList.contains("Eevee")); // True
        System.out.println(namesList.contains("Zoroark")); // False

    }
}
