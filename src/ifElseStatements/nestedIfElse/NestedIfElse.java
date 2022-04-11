package ifElseStatements.nestedIfElse;

public class NestedIfElse {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 101) - 50;

        System.out.println(n);

        if (n > 0){


            if (n % 2 == 0){
                System.out.println("The number is positive and even");
            }
            else {
                System.out.println("The number is positive and odd");
            }
        }

        else if (n < 0) {

            if (n % 2 == 0) {
                System.out.println("The number is negative and even");
            } else {
                System.out.println("The number is negative and odd");
            }
        }

        else {
            System.out.println("The number is zero");
        }
    }
}
