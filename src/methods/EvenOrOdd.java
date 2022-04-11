package methods;

import utilities.MathHelper;

public class EvenOrOdd {
    public static void main(String[] args) {

// Find if number is even or odd

        int ran1 = MathHelper.getRandom(1, 100, 1);

        System.out.println("The generated number is = " + ran1);
        if (MathHelper.isEven(ran1)) System.out.println("The number is even");
        else System.out.println("The number is odd");

    }
}
