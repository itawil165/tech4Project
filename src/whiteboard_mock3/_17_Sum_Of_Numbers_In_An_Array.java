package whiteboard_mock3;

public class _17_Sum_Of_Numbers_In_An_Array {

    public static int arrSum (int[] numArr) {

        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(arrSum(new int[]{1, 5, 4}));
    }
}
