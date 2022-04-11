package ifElseStatements.ifANDElse;

import java.util.Scanner;

public class ExerciseAgeWeight {
    public static void main(String[] args) {

        Scanner userInput =  new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = userInput.nextInt();

        if (age >= 18 && age < 100){
            System.out.println("You are old enough to drive");
        }
        else if (age > 100){
            System.out.println("You should be in a museum. Sheesh.");
        }
        else {
            System.out.println("You are not old enough to drive");
        }

        System.out.println("Please enter your weight");
        double weight = userInput.nextDouble();

        if (weight > 170.0){
            System.out.println("You chonky");
        }
        else if (weight == 170.0){
            System.out.println("You just right");
        }
        else {
            System.out.println("Seems legit");
        }


    }
}
