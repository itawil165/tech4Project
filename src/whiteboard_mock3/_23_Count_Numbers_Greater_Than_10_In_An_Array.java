package whiteboard_mock3;

public class _23_Count_Numbers_Greater_Than_10_In_An_Array {

    public static int countGreaterThan10 (int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (num > 10) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countGreaterThan10(new int[]{3, -5, 4, 11, 2}));
    }
}
