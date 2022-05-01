package whiteboard_mock3;

public class _26_Count_Odd_Numbers_In_An_Array {

    public static int countOdds (int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (num % 2 != 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countOdds(new int[]{3, -5, 4, 11, 2}));
    }
}
