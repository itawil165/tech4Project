package projects;

import utilities.CharacterHelper;

public class Project04 {
    public static void main(String[] args) {
        // Testing out method CharacterHelper
        char space = ' ';
        char digit = '9';
        char a = 'a';
        char D = 'D';

        System.out.println("Checking if space");
        System.out.println(space + " = " + CharacterHelper.isSpace(space));
        System.out.println(a + " = " + CharacterHelper.isSpace(a));

        System.out.println("Checking if digit");
        System.out.println("9 = " + CharacterHelper.isDigit(digit));
        System.out.println(a + " = " + CharacterHelper.isDigit(a));

        System.out.println("Checking if uppercase");
        System.out.println(D + " = " + CharacterHelper.isUppercase(D));
        System.out.println(a + " = " + CharacterHelper.isUppercase(a));

        System.out.println("Checking if lowercase");
        System.out.println(a + " = " + CharacterHelper.isLowercase(a));
        System.out.println(D + " = " + CharacterHelper.isLowercase(D));

        System.out.println("Checking if letter");
        System.out.println(a + " = " + CharacterHelper.isLetter(a));
        System.out.println("9 = " + CharacterHelper.isLetter(digit));

        System.out.println("Checking if vowel");
        System.out.println(a + " = " + CharacterHelper.isVowel(a));
        System.out.println(D + " = " + CharacterHelper.isVowel(D));

        System.out.println("Checking if consonant");
        System.out.println(D + " = " + CharacterHelper.isConsonant(D));
        System.out.println(a + " = " + CharacterHelper.isConsonant(a));

    }
}
