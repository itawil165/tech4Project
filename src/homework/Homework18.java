package homework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Homework18 {

    // TASK 01
    public static String noSpace (String str) {
        return str.replaceAll(" ", "").trim();
    }

    // TASK 02
    public static String replaceFirstLast (String str) {
        String trim = str.trim();

        if (trim.length() <= 2) return "";
        else {
            return (trim.substring(trim.length() - 1) + trim.substring(1, trim.length() - 1) + trim.charAt(0));
        }
    }

    // TASK 03
    public static boolean hasVowel (String str) {
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
                || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) return true;
        else return false;
    }

    // TASK 04
    public static String checkAge (int DOB) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

        int currentYear = Integer.parseInt(dateFormat.format(date));

        int age = currentYear - DOB;

        if (age >= 16 && age <= 100) return "THIS AGE IS ALLOWED";
        else return "THIS AGE IS NOT ALLOWED";
    }

    // TASK 05
    public static int avgOfEdges (int a, int b, int c) {
        return ((Math.max(Math.max(a, b), c)) + (Math.min(Math.min(a, b), c))) / 2;
    }

    // TASK 06
    public static String[] noA (String[] str) {
                for (int i = 0; i < str.length; i++) {
            if (str[i].toLowerCase().startsWith("a")) str[i] = "###";
        }
        return str;
    }

    // TASK 07
    public static int[] no3or5 (int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) nums[i] = 99;
            if (nums[i] % 5 == 0) nums[i] = 100;
            if (nums[i] % 3 == 0 && nums[i] % 5 == 0) nums[i] = 101;
        }
        return nums;
    }

    // TASK 08
    public static int countPrimes (int[] primes) {
        int primeCount = 0;
        int notPrime = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] != 2 && primes[i] % 2 == 0) notPrime++;
            else primeCount++;
        }

        return primeCount;
    }

    public static void main(String[] args) {

        // TASK 01
        System.out.println(noSpace("  Hello      World  "));

        // TASK 02
        System.out.println(replaceFirstLast("  Hello  "));

        // TASK 03
        System.out.println(hasVowel("Java"));

        // TASK 04
        System.out.println(checkAge(2050));

        // TASK 05
        System.out.println(avgOfEdges(10, 13, 20));

        // TASK 06
        System.out.println(Arrays.toString(noA(new String[]{"java", "appium", "hello", "apple"})));

        // TASK 07
        System.out.println(Arrays.toString(no3or5(new int[]{3, 4, 5, 6})));

        // TASK 08
        System.out.println(countPrimes(new int[]{7, 4, 11, 23, 17}));

    }
}
