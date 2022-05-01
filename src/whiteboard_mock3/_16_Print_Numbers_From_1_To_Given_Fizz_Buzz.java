package whiteboard_mock3;

public class _16_Print_Numbers_From_1_To_Given_Fizz_Buzz {

    public static void nums (int a) {

        for (int i = 1; i <= a; i++) {

            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Fizz");
            else if (i % 3 ==0) System.out.println("Buzz");
            else System.out.println(i);

        }
    }

    public static void main(String[] args) {

        nums(15);
    }
}
