package whiteboard_mock3;

import java.util.Arrays;

public class _46_Find_All_Numbers_Factorial_In_An_Array {

    public static int[] factorial (int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 || nums[i] == 1) nums[i] = 1;
            else {
                int temp = nums[i];
                for (int j = 2; j < temp; j++) {
                    nums[i] *= j;
                }
            }
        }
        return nums;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(factorial(new int[]{0, 5, 4, 1, 3, 2})));
    }
}
