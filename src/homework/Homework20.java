package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {

    // TASK 01
    public static boolean hasLowerCase (String str) {
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            if (c >= 97 && c <= 122) return true;
        }
        return false;
    }

    // TASK 02
    public static ArrayList<Integer> noZero (ArrayList<Integer> noZeroArr) {
        noZeroArr.removeIf(integer -> integer == 0);

        return new ArrayList<>(noZeroArr);
    }

    // TASK 03
    public static int[][] numberAndSquare (int[] intArr) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < intArr.length; i++) {
            a = intArr[i];
            b = intArr[i] * intArr[i];
        }
        return new int[a][b];
    }

    // TASK 04
    public static boolean containsValue (String[] strArr, String str) {
        for (String strCheck : strArr) {
            if (strCheck.equals(str)) return true;
        }
        return false;
    }

    // TASK 05
    public static String reverseSentence (String str) {
        String[] words = str.split(" ");

        StringBuilder reverse = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
            reverse.append(" ");
        }
        return reverse.toString();
    }

    // TASK 06
    public static String removeStringSpecialsDigits (String str) {
        return str.replaceAll("[^a-zA-Z\\s]", "");
    }

    // TASK 07
    public static String[] removeArraySpecialsDigits (String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].replaceAll("[^a-zA-Z]", "");
        }
        return strArr;
    }

    // TASK 08
    public static ArrayList<String> removeAndReturnCommons (ArrayList<String> strArr1, ArrayList<String> strArr2) {
        ArrayList<String> commons = new ArrayList<>();

        for (int i = 0; i < Math.max(strArr1.size(), strArr2.size()); i++) {
            if (strArr1.get(i).equals(strArr2.get(i))) commons.add(strArr1.get(i));
        }
        return new ArrayList<>(commons);
    }

    // TASK 09
    public static ArrayList<String> noXInVariables (ArrayList<String> strArr) {

        ArrayList<String> xRemoved = new ArrayList<>();

        for (int i = 0; i < strArr.size(); i++) {
                xRemoved.add(strArr.get(i).replaceAll("[xX]", ""));

                // Removes empty element (if entire index contained x's)
                if (xRemoved.get(i).equals("")) xRemoved.removeAll(Arrays.asList("", null));
        }

        return xRemoved;
    }

    public static void main(String[] args) {


        // TASK 01
        System.out.println(hasLowerCase("Hello"));

        // TASK 02
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(14);
        nums.add(6);
        nums.add(0);

        System.out.println(noZero(nums));

        // TASK 03
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 6})));

        // TASK 04
        System.out.println(containsValue(new String[]{"abc", "123", "java"}, "java"));

        // TASK 05
        System.out.println(reverseSentence("Java is fun"));

        // TASK 06
        System.out.println(removeStringSpecialsDigits("123Java!@# is456 fun$%^"));

        // TASK 07
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "!@#is", "4%6fun"})));

        // TASK 08
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("is");
        list1.add("fun");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("C#");
        list2.add("Python");

        System.out.println(removeAndReturnCommons(list1, list2));

        // TASK 09
        ArrayList<String> xList = new ArrayList<>();
        xList.add("abcX");
        xList.add("xyz");
        xList.add("x123X");
        xList.add("xX");
        System.out.println(noXInVariables(xList));
    }
}
