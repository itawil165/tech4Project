package loops.whileLoops;

public class NumbersAscendingAndDescending {
    public static void main(String[] args) {
        /*
        Write a program that prints numbers from 1 to 7 (both included)
         */

        /*
        This is how you would do it using for loops:

        for(int i = 1; i < 8; i++){
            System.out.println(i);
        }
         */

        // Ascending
        int i = 1;

        while(i <= 7){
            System.out.print(i + ", ");
            i++;
        }

        System.out.println();

        // Descending
        int j = 7;

        while(j >= 1) {
            System.out.print(j + ", ");
            j--;
        }
    }
}
