package whiteboard_mock3;

public class _33_Fibonacci_Series_Of_Given_Number {

    public static void getFibonacci(int number){

        int zero = 0, one = 1, sum;

        for (int i = 0; i < number; i++){
            System.out.println(zero);

            sum = zero + one;
            zero = one;
            one = sum;
        }
    }


    //Testing method
    public static void main(String[] args) {
        getFibonacci(8);
    }
}
