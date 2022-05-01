package whiteboard_mock3;

public class _45_Find_Numbers_Factorial {

    public static int factorial (int num) {

        if (num == 0 || num == 1) return 1;
        else {
            int temp = num;
            for (int i = 2; i < temp; i++) {
                num *= i;
            }
            return num;
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}
