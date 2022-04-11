package homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

//TASK 01

        Scanner userInput = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = userInput.next(); // User inputs first name

        System.out.println("What's your last name?");
        String lastname = userInput.next(); //  User inputs last name

        System.out.println("How old are you?");
        int userAge = userInput.nextInt(); // User inputs age

        System.out.println("What's your email?");
        String email = userInput.next(); // User inputs email address

        userInput.nextLine();

        System.out.println("What's your phone number?");
        String phoneNumber = userInput.nextLine(); // User inputs phone number

        System.out.println("What's your address?");
        String address = input.nextLine(); // User inputs home address

        System.out.print("The user who joined this program is " + name + " " + lastname + ". ");
        System.out.print(name + "'s age is: " + userAge + ". ");
        System.out.print(name + "'s email address is: " + email + ", ");
        System.out.print("phone number: " + phoneNumber + ", ");
        System.out.print("and address is: " + address + ".");
        System.out.println();

        System.out.println("\n\t-------TASK 01 END-------\n");

//TASK 02

        System.out.println("What's your favorite book?");
        String favBook = userInput.nextLine();

        System.out.println("What's your favorite color?");
        String favColor = userInput.next();

        System.out.println("What's your favorite number?");
        int favNumber = userInput.nextInt();


        System.out.print("User favorite book is " + favBook + "\nUser favorite color is " + favColor +
                "\nUser favorite number " + favNumber );
        System.out.println();

        System.out.println("\n\t-------TASK 02 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
