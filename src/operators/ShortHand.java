package operators;

import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {

        int age =5;
        System.out.println(age);

        // Reassign
        age += 3; // Add 3 to  5 ==> 8
        System.out.println(age);

        age -= 2; // Subtract 2 from 8 --> 6
        System.out.println(age);

        age *= 2; // Multiply 6 by 2 --> 12
        System.out.println(age);

        age /= 3; // Divide 12 by 3 --> 4
        System.out.println(age);
        System.out.println();

// Exercise

        int a = 8;
        int b = 3;

        System.out.println("a += b --> " + (a += b));
        System.out.println("a -= b --> " + (a -= b));
        System.out.println("a *= b --> " + (a *= b));
        System.out.println("a /= b --> " + (a /= b));
        System.out.println("a %= b --> " + (a %= b));
        System.out.println();


// Exercise
        /*
        Write a Java program that asks the user to enter their balance and one-day transactions.
        Subtract each transaction from balance and return the new balance using shorthand operators.
         */

        Scanner transaction = new Scanner(System.in);

        System.out.println("Please enter your balance");
        double balance = transaction.nextDouble();

        System.out.println("Enter your transaction");
        double firstTransaction = transaction.nextDouble();
        balance -= firstTransaction; // Balance change
        System.out.println("NEW BALANCE: $" + balance);

        System.out.println("Enter your transaction");
        double secondTransaction = transaction.nextDouble();
        balance -= secondTransaction; // Balance change
        System.out.println("NEW BALANCE: $" + balance);

        System.out.println("Enter your transaction");
        double thirdTransaction = transaction.nextDouble();
        balance -= thirdTransaction; // Balance change
        System.out.println("NEW BALANCE: $" + balance);
    }
}
