package whiteboard_mock3;

public class _15_Print_Odd_Numbers_From_1_To_Given {

    public static void nums (int a) {

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        nums(5);
    }
}
