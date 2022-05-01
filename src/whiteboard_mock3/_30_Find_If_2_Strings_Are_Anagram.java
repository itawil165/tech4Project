package whiteboard_mock3;

import java.util.Arrays;

public class _30_Find_If_2_Strings_Are_Anagram {

    public static boolean isAnagram1 (String word1, String word2) {

        if (word1.length() != word2.length()) return false;
        else {
            char[] c1 = word1.toLowerCase().toCharArray();
            char[] c2 = word2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.toString(c1).equals(Arrays.toString(c2));
        }
    }

    public static void main(String[] args) {

        System.out.println(isAnagram1("Listen", "Silent"));
        System.out.println(isAnagram1("Hello", "World"));
    }
}
