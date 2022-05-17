package whiteboard_mock3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class _48_Min_Value_In_An_Int_Array {

    public static int minValue (int[] nums) {

        Arrays.sort(nums);

        return nums[0];
    }

    public static void main(String[] args) {

        System.out.println(minValue(new int[]{-5, 4, 1, 10, 2}));
    }
}
