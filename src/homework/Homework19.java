package homework;

import java.util.ArrayList;
import java.util.Arrays;
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
        char[] c = str.toCharArray();
        int sum = 0;
        for (char value : c) {
            if (Character.isDigit(value)) {
                int a = Integer.parseInt(String.valueOf(value));
                sum += a;
            }
        }
        return sum;
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

    // TASK 06
    public static int[] no13 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    // TASK 07
    public static int[] arrFactorial (int[] factorial) {

        int fact;
        for (int i = 0; i < factorial.length; i++) {
            fact = 1;
            for (int j = 1; j <= factorial[i]; j++) {
                fact *= j;
            }
            factorial[i] = fact;
        }
        return factorial;
    }

    // TASK 08
    public static String[] categorizeCharacters (String str) {
        StringBuilder letters = new StringBuilder(),
                numbers = new StringBuilder(), special = new StringBuilder();

        for (int i=  0; i < str.length(); i++)
        {
            if (Character.isLetter(str.charAt(i)))
                letters.append(str.charAt(i));
            else if(Character.isDigit(str.charAt(i)))
                numbers.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
        return new String[]{String.valueOf(letters), String.valueOf(numbers), String.valueOf(special)};
    }



        public static void main(String[] args) {

        // TASK 01
        System.out.println(noDigits("123Tech456Global789"));

        // TASK 02
        System.out.println(noVowels("TechGlobal"));

        // TASK 03
        System.out.println(sumOfDigits("John's age is 29"));

        // TASK 04
        System.out.println(hasUpperCase("TechGlobal"));

        // TASK 05
        System.out.println(middleInt(-1, 25, 10));

        // TASK 06
        System.out.println(Arrays.toString(no13(new int[]{13, 1, 13, 6})));

        // TASK 07
        System.out.println(Arrays.toString(arrFactorial(new int[]{5, 0, 6})));

        // TASK 08
        System.out.println(Arrays.toString(categorizeCharacters("abc123!@#")));
    }
}
