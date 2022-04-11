package projects;

public class Project03 {
    public static void main(String[] args) {

// TASK 01

        String str1 = "24", str2 = "5";
        int var1 = Integer.parseInt(str1), var2 = Integer.parseInt(str2);

        System.out.println("The sum of 24 and 5 is = " + (var1 + var2) +
                "\nThe product of 24 and 5 is = " + (var1 * var2) +
                "\nThe division of 24 and 5 is = "+ (var1 / var2) +
                "\nThe difference of 24 and 5 is = " + (var1 - var2) +
                "\nThe remainder of 24 and 5 is = " + (var1 % var2));

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        int prime = (int) (Math.random() * 35) + 1;

        System.out.println("Generated number = " + prime);

        if ((prime == 2) || (prime == 3) || (prime == 7) || (prime == 11) || (prime == 13) || (prime == 17) ||
                (prime == 19) || (prime == 23) || (prime == 29) || (prime == 31)){
            System.out.println("The generated number is a prime number");
        }
        else System.out.println("The generated number is NOT a prime number");

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        int ran1 = (int) (Math.random() * 50) + 1, ran2 = (int) (Math.random() * 50) + 1,
                ran3 = (int) (Math.random() * 50) + 1;

        System.out.println("Random number 1 = " + ran1);
        System.out.println("Random number 2 = " + ran2);
        System.out.println("Random number 3 = " + ran3);

        // Find smallest
        if (ran1 < ran2 && ran1 < ran3){
            System.out.println("The smallest number is = " + ran1);
        }
        else if (ran2 < ran1 && ran2 < ran3){
            System.out.println("The smallest number is = " + ran2);
        }
        else System.out.println("The smallest number is = " + ran3);

        // Find largest
        if (ran1 > ran2 && ran1 > ran3){
            System.out.println("The largest number is = " + ran1);
        }
        else if (ran2 > ran1 && ran2 > ran3){
            System.out.println("The largest number is = " + ran2);
        }
        else System.out.println("The largest number is = " + ran3);

        // Find middle
        if (ran1 < ran2 && ran1 > ran3){
            System.out.println("The middle number is = " + ran1);
        }
        else if (ran2 < ran1 && ran2 > ran3){
            System.out.println("The middle number is = " + ran2);
        }
        else System.out.println("The middle number is = " + ran3);

        System.out.println("\n\t-------TASK 03 END-------\n");



        // char letter = ##; --> Thought it would be fun and more useful to
        //                        randomize the ASCII value to make the code dynamic

// TASK 04

        char letter = (char) ((Math.random() * 127) + 32); // Randomize ASCII value and ranges from 32 to 127
        int charLetter = (int) letter;

        System.out.println("Generated character = " + letter);

        if (charLetter > 64 && charLetter < 91){
            System.out.println("The letter is uppercase");
        }
        else if (charLetter > 96 && charLetter < 123){
            System.out.println("The letter is lowercase");
        }
        else System.out.println("Invalid character detected!!!");

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        int charVowel = (int) letter;

        System.out.println(letter);

        if (charVowel == 65 || charVowel == 69 || charVowel == 73 || charVowel == 79 || charVowel == 85||
                charVowel == 97 || charVowel == 101 || charVowel == 105 || charVowel == 111 || charVowel == 117){
            System.out.println("The letter is a vowel");
        }
        else if (charVowel > 32 && charVowel < 65){
            System.out.println("Invalid character detected!!!");
        }
        else if (charVowel > 91 && charVowel < 96){
            System.out.println("Invalid character detected!!!");
        }
        else if (charVowel > 123){
            System.out.println("Invalid character detected!!!");
        }
        else System.out.println("The letter is consonant");

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        int charSpecial = (int) letter;

        System.out.println(letter);

        if (charSpecial > 32 && charSpecial < 48){
            System.out.println("The special character is = " + letter);
        }
        else if (charSpecial > 57 && charSpecial < 65){
            System.out.println("The special character is " + letter);
        }
        else if (charSpecial > 90 && charSpecial < 97){
            System.out.println("The special character is " + letter);
        }
        else if (charSpecial > 122 && charSpecial < 126){
            System.out.println("The special character is " + letter);
        }
        else System.out.println("Invalid character detected!!!");

        System.out.println("\n\t-------TASK 06 END-------\n");

// TASK 07

        int charFinal = (int) letter;

        System.out.println(letter);

        if (charFinal > 64 && charFinal < 91){
            System.out.println("The character is a letter");
        }
        else if (charFinal > 96 && charFinal < 123){
            System.out.println("The character is a letter");
        }
        else if (charFinal > 47 && charSpecial < 58){
            System.out.println("The character is a number");
        }
        else System.out.println("The character is a special character");

        System.out.println("\n\t-------TASK 07 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
