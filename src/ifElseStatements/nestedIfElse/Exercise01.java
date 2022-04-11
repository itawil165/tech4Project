package ifElseStatements.nestedIfElse;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");

        int var1 = userInput.nextInt(), var2 = userInput.nextInt();

        if (var1 < var2){
            System.out.println("The smaller number is " + var1);
        }
        else {
            System.out.println("The smaller number is "+ var2);
        }
    }
}
