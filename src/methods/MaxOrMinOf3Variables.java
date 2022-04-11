package methods;

import utilities.MathHelper;
import java.util.Scanner;

public class MaxOrMinOf3Variables {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");

        int var1 = userInput.nextInt();
        int var2 = userInput.nextInt();
        int var3 = userInput.nextInt();


        int greatest = MathHelper.maxOf3Int(var1, var2, var3);
        int smallest = MathHelper.minOf3Int(var1, var2, var3);

        System.out.println("The greatest number is = " + greatest);
        System.out.println("The smallest number is = " + smallest);

// Find if number is even or odd

        int ran1 = MathHelper.getRandom(1, 100, 1);

        System.out.println("The generated number is = " + ran1);
        if (MathHelper.isEven(ran1)) System.out.println("The number is even");
        else System.out.println("The number is odd");


    }
}
