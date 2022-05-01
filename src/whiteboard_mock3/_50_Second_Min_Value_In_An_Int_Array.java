package whiteboard_mock3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class _50_Second_Min_Value_In_An_Int_Array {

    // This does NOT work if there are duplicate max numbers
    public static int secondMinValue1 (int[] nums) {

        Arrays.sort(nums);

        return nums[1];
    }

    public static int secondMinValue2 (int[] nums) {

        TreeSet<Integer> noDupeMin = new TreeSet<>();
        for (int num : nums) {
            noDupeMin.add(num);
        }

        return new ArrayList<>(noDupeMin).get(1);
    }

    public static void main(String[] args) {

        System.out.println(secondMinValue1(new int[]{-5, 4, 1, 10, 2, -5, 9}));
        System.out.println(secondMinValue2(new int[]{-5, 4, 1, 10, 2, -5, 9}));
    }
}
