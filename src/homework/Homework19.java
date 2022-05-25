package homework;

import primitives.Int;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Homework19 {

    // TASK 01
    public static String noDigits (String str) {
        return str.replaceAll("[0-9]", "").trim();
    }

    // TASK 02
    public static String noVowels (String str) {
        return str.replaceAll("[aeiouAEIOU]", "").trim();
    }

    // TASK 03
    public static int sumOfDigits (String str) {
        return 0;
    }

    // TASK 04
    public static boolean hasUpperCase (String str) {
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            if (c > 64 && c < 91) return true;
        }
        return false;
    }

    // TASK 05
    public static int middleInt (int a, int b, int c) {
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(a);
        intArr.add(b);
        intArr.add(c);

        Collections.sort(intArr);

        return intArr.get(1);
    }

    public static void main(String[] args) {

        // TASK 01
        System.out.println(noDigits("123Tech456Global789"));

        // TASK 02
        System.out.println(noVowels("TechGlobal"));

        // TASK 03

        // TASK 04
        System.out.println(hasUpperCase("TechGlobal"));

        // TASK 05
        System.out.println(middleInt(-1, 25, 10));
    }
}
