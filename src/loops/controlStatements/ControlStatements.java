package loops.controlStatements;

public class ControlStatements {
    public static void main(String[] args) {
        /*
        Write a program that prints all the number bt 1 to 25
        But skip the numbers that can be divided by 10
        Now, do not print any number that is more than 12
         */

        // Print numbers from 1 to 25
        for (int i = 1; i <= 25; i++) System.out.print(i + ", ");

        System.out.println();

        // Break tells the loop to stop once it hits 15
        for (int i = 1; i <= 25; i++) {
            System.out.print(i + ", ");

            if(i == 15) break;
        }

        System.out.println();

        // continue tells the loop to skip numbers that can be divided by 10
        for (int i = 1; i <= 25; i++) {
            if(i % 10 == 0) continue;
            else System.out.print(i + ", ");

            if(i == 25) break;
        }
    }
}
