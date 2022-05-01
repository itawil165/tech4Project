package whiteboard_mock3;

import java.util.Arrays;

public class _47_Max_Value_In_An_Int_Array {

    public static int maxValue (int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {

        System.out.println(maxValue((new int[]{-5, 4, 1, 10, 2})));
    }
}
