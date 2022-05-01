package whiteboard_mock3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class _49_Second_Max_Value_In_An_Int_Array {

    // This does NOT work if there are duplicate max numbers
    public static int secondMaxValue1 (int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length - 2];
    }

    public static int secondMaxValue2 (int[] nums) {

        TreeSet<Integer> noDupeMax = new TreeSet<>();

        for (Integer num : nums) {
            noDupeMax.add(num);
        }

        return new ArrayList<>(noDupeMax).get(noDupeMax.size() - 2);
    }

    public static void main(String[] args) {

        System.out.println(secondMaxValue1(new int[]{-5, 4, 1, 10, 2, 10, 9}));
        System.out.println(secondMaxValue2(new int[]{-5, 4, 1, 10, 2, 10, 9}));
    }
}
