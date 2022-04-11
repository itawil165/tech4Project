package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

// Scanner class creation
        Scanner userInput = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

// TASK 01

        System.out.println("Please enter the 3 integer numbers");
        int var1 = inputInt.nextInt();
        int var2 = inputInt.nextInt();
        int var3 = inputInt.nextInt();
        System.out.println("The product of these numbers is: " + (var1 * var2 * var3));

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        System.out.println("What is your first name?");
        String firstName = userInput.next();
        System.out.println("What is your last name?");
        String lastName = userInput.next();
        System.out.println("In what year were you born?");
        int birthYear = inputInt.nextInt();

        System.out.println("User's name is " + firstName + " "+ lastName + " and they are " + (2022 - birthYear) + " years old.");

        System.out.println("\n\t-------TASK 02 END-------\n");

        userInput.nextLine();  // make space in input lines

// TASK 03

        System.out.println("What is your full name?");
        String fullName = userInput.nextLine();
        System.out.println("How much do you weigh (kg)?");
        double weight = inputInt.nextDouble();
        System.out.println(fullName + "'s weight is " + (weight * 2.205) + " lbs.");

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        System.out.println("What is your full name?");
        String firstStudentName = userInput.nextLine();
        System.out.println("How old are you?");
        int firstStudentAge = inputInt.nextInt();

        System.out.println("What is your full name?");
        String secondStudentName = userInput.nextLine();
        System.out.println("How old are you?");
        int secondStudentAge = inputInt.nextInt();

        System.out.println("What is your full name?");
        String thirdStudentName = userInput.nextLine();
        System.out.println("How old are you?");
        int thirdStudentAge = inputInt.nextInt();

        int firstMax = Math.max(firstStudentAge, secondStudentAge); // get max integers
        int finalMax = Math.max(firstMax, thirdStudentAge);

        int firstMin = Math.min(firstStudentAge, secondStudentAge); // get min integers
        int finalMin = Math.min(firstMin, thirdStudentAge);

        System.out.println(firstStudentName + " is " +  firstStudentAge + " years old.");
        System.out.println(secondStudentName + " is " +  secondStudentAge + " years old.");
        System.out.println(thirdStudentName + " is " +  thirdStudentAge + " years old.");

        // calculate average age --> (age1 + age2 + age3) / 3
        System.out.println("The average age is " + ((firstStudentAge + secondStudentAge + thirdStudentAge) / 3) +
                " years old.");
        System.out.println("The eldest is " + finalMax + " years old.");
        System.out.println("The youngest is " +  finalMin + " years old.");

        System.out.println("\n\t-------TASK 04 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
