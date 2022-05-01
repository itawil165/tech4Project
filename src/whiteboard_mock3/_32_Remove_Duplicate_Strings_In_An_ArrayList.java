package whiteboard_mock3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _32_Remove_Duplicate_Strings_In_An_ArrayList {

    public static ArrayList<String> removeDupes (ArrayList<String> words) {

        return new ArrayList<>(new HashSet<>(words));
    }

    public static void main(String[] args) {

        System.out.println(removeDupes(new ArrayList<>(Arrays.asList("foo", "bar", "foo", "123", "bar"))));
    }
}
