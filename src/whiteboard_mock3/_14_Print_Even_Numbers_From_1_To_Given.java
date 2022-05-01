package whiteboard_mock3;

public class _14_Print_Even_Numbers_From_1_To_Given {

    public static void nums (int a) {

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        nums(5);
    }
}
