package whiteboard_mock3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _27_Remove_Duplicate_Numbers_In_An_Array {
    
    public static ArrayList<Integer> noDupes1 (int[] nums) {

        ArrayList<Integer> noDupes = new ArrayList<>();

        for (Integer num : nums) {
            noDupes.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) noDupes.remove(nums[i]);
            }
        }
        return noDupes;
    }

    public static int[] noDupes2(int[] numbers){

        HashSet<Integer> noDupes = new HashSet<>();
        for (int i : numbers) noDupes.add(i);

        int[] arr = new int[noDupes.size()];

        int index = 0;
        for (int i : noDupes) arr[index++] = i;

        return arr;
    }


    public static void main(String[] args) {

        System.out.println(noDupes1(new int[]{1, 1, 2, 5, 9, 12, 5}));
        System.out.println(Arrays.toString(noDupes2(new int[]{1, 1, 2, 5, 9, 12, 5})));
    }
}
