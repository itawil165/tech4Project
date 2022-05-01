package whiteboard_mock3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _28_Remove_Duplicate_Strings_In_An_Array {

    public static ArrayList<String> noDupes1 (String[] words) {

        ArrayList<String> noDupes = new ArrayList<>();

        for (String word : words) {
            noDupes.add(word);
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) noDupes.remove(words[i]);
            }
        }
        return noDupes;
    }

    public static String[] noDupes2 (String[] words) {
        return new HashSet<>(Arrays.asList(words)).toArray(new String[0]);
    }

    public static void main(String[] args) {

        System.out.println(noDupes1(new String[]{"foo", "bar", "foo", "123", "bar"}));
        System.out.println(Arrays.toString(noDupes2(new String[]{"foo", "bar", "foo", "123", "bar"})));
    }
}
