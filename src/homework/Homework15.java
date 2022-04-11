package homework;

import java.util.ArrayList;
import java.util.Collections;

public class Homework15 {
    public static void main(String[] args) {

// TASK 01

        ArrayList<Integer> nums1 = new ArrayList<>();

        nums1.add(10); nums1.add(23); nums1.add(67); nums1.add(23); nums1.add(78);

        System.out.println(nums1.get(3));
        System.out.println(nums1.get(0));
        System.out.println(nums1.get(2));
        System.out.println(nums1);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue"); colors.add("Brown"); colors.add("Red");
        colors.add("White");colors.add("Black"); colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n\t-------TASK 02 END-------\n");


// TASK 03

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(23); nums2.add(-34); nums2.add(-54); nums2.add(0); nums2.add(89); nums2.add(100);

        System.out.println(nums2);
        Collections.sort(nums2);
        System.out.println(nums2);

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        ArrayList<String> countries = new ArrayList<>();

        countries.add("Istanbul"); countries.add("Berlin"); countries.add("Madrid"); countries.add("Paris");

        System.out.println(countries);
        Collections.sort(countries);
        System.out.println(countries);

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        ArrayList<String> marvel1 = new ArrayList<>();

        marvel1.add("Spider Man"); marvel1.add("Iron Man"); marvel1.add("Black Panther");
        marvel1.add("Deadpool"); marvel1.add("Captain America");

        System.out.println(marvel1);
        System.out.println(marvel1.contains("Wolverine"));

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        ArrayList<String> marvel2 = new ArrayList<>();

        marvel2.add("Hulk"); marvel2.add("Iron Man"); marvel2.add("Black Widow"); marvel2.add("Captain America");

        Collections.sort(marvel2);
        System.out.println(marvel2);
        System.out.println(marvel2.contains("Hulk") && marvel2.contains("Iron Man"));

        System.out.println("\n\t-------TASK 06 END-------\n");

// TASK 07

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A'); chars.add('x'); chars.add('$'); chars.add('%'); chars.add('9');
        chars.add('*'); chars.add('+'); chars.add('F'); chars.add('G');

        System.out.println(chars);

        for(Character element : chars) {
            System.out.println(element);
        }

        System.out.println("\n\t-------TASK 07 END-------\n");

// TASK 08

        ArrayList<String> office = new ArrayList<>();

        office.add("Desk"); office.add("Laptop"); office.add("Mouse");
        office.add("Monitor"); office.add("Mouse-Pad"); office.add("Adapter");

        System.out.println(office);
        Collections.sort(office);

        int mCount = 0, aeCount = 0;

        for (int i = 0; i < office.size(); i++) {
            if (office.get(i).toLowerCase().startsWith("m")) mCount++;
            if (!office.get(i).toLowerCase().contains("a") && !office.get(i).toLowerCase().contains("e")) aeCount++;
        }

        System.out.println("Elements beginning with M or m: " + mCount);
        System.out.println("Elements containing A, a, E, or e: " + aeCount);

        System.out.println("\n\t-------TASK 08 END-------\n");

// TASK 09

        ArrayList<String> kitchen = new ArrayList<>();

        kitchen.add("Plate"); kitchen.add("spoon"); kitchen.add("fork");
        kitchen.add("Knife"); kitchen.add("cup"); kitchen.add("Mixer");

        int upperCount = 0, lowerCount = 0, pCount = 0, pStartEnd = 0;

        System.out.println(kitchen);

        for (int i = 0; i < kitchen.size(); i++) {
            if (kitchen.get(i).charAt(0) >= 65 && kitchen.get(i).charAt(0) <= 90) upperCount++;
            if (kitchen.get(i).charAt(0) >= 97 && kitchen.get(i).charAt(0) <= 122) lowerCount++;
            if (kitchen.get(i).toLowerCase().contains("p")) pCount++;
            if (kitchen.get(i).toLowerCase().startsWith("p") || kitchen.get(i).toLowerCase().endsWith("p")) pStartEnd++;
        }

        System.out.println("Elements that begin with uppercase = " + upperCount);
        System.out.println("Elements that begin with lowercase = " + lowerCount);
        System.out.println("Elements that have P or p = " + pCount);
        System.out.println("Elements that begin or end with P or p = " + pStartEnd);

        System.out.println("\n\t-------TASK 09 END-------\n");

// TASK 10

        ArrayList<Integer> nums3 = new ArrayList<>();

        nums3.add(3); nums3.add(5); nums3.add(7); nums3.add(10); nums3.add(0); nums3.add(20);
        nums3.add(17); nums3.add(10); nums3.add(23); nums3.add(56); nums3.add(78);

        int dividedBy10 = 0, evenGreaterThan15 = 0, oddLessThan20 = 0, lessThan15GreaterThan50 = 0;

        for (int i = 0; i < nums3.size(); i++) {
            if (nums3.get(i) % 10 == 0) dividedBy10++;
            if (nums3.get(i) % 2 == 0 && nums3.get(i) > 15) evenGreaterThan15++;
            if (nums3.get(i) % 2 == 1 && nums3.get(i) < 20) oddLessThan20++;
            if (nums3.get(i) < 15 || nums3.get(i) > 50) lessThan15GreaterThan50++;

        }

        System.out.println(nums3);
        System.out.println("Elements that divisible by 10 = " + dividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + evenGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddLessThan20);
        System.out.println("Elements that are less than 15 and greater than 50 = " + lessThan15GreaterThan50);

        System.out.println("\n\t-------TASK 10 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
