package whiteboard_mock3;

public class _20_Count_Zeros_In_An_Array {

    public static int countZero (int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (num == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("There are " + countZero(new int[]{3, 5, 4, 0, 0}) + " zeroes");
    }
}
