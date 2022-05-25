package homework;

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
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] > 64 && charArr[i] < 91) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // TASK 01
        System.out.println(noDigits("123Tech456Global789"));

        // TASK 02
        System.out.println(noVowels("TechGlobal"));

        // TASK 03

        // TASK 04
        System.out.println(hasUpperCase("TechGlobal"));
    }
}
