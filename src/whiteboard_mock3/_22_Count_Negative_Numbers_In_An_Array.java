package whiteboard_mock3;

public class _22_Count_Negative_Numbers_In_An_Array {

    public static int countNegatives (int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (num <= 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countNegatives(new int[]{3, -5, 4, 0, 2}));
    }
}
