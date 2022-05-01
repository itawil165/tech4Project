package whiteboard_mock3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _31_Remove_Duplicate_Numbers_In_An_ArrayList {

    public static ArrayList<Integer> removeDupes (ArrayList<Integer> nums) {

        return new ArrayList<>(new HashSet<>(nums));
    }

    public static void main(String[] args) {

        System.out.println(removeDupes(new ArrayList<>(Arrays.asList(1, 1, 2, 5, 9, 12, 5))));
    }
}
