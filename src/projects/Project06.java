package projects;

import utilities.ScannerHelper;

public class Project06 {
    public static void main(String[] args) {

// TASK 01

        String words = ScannerHelper.getStringFromUser();

        int spaceCount = 0;

        for (int i = 0; i < words.length(); i++) {
            char space = words.charAt(i);
            if (Character.isSpaceChar(space)){
                spaceCount++;
            }
       }
        if (spaceCount > 0) System.out.println("This sentence has " + (spaceCount + 1) + " words");
        else System.out.println("The entered text must be at least 2 sentences");

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        String palindrome = ScannerHelper.getStringFromUser();

        int check = 0;

        for (int i = 0; i < palindrome.length() - 1; i++) {
            if (palindrome.toLowerCase().charAt(i) == palindrome.toLowerCase().charAt(palindrome.length() - 1 - i))
                check++;
        }
        if (check == palindrome.length() - 1) System.out.println("This word is a palindrome");
        else System.out.println("This word is not a palindrome");

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        String aCheck = ScannerHelper.getStringFromUser();

        int aCount = 0;

        for (int i = 0; i < aCheck.length(); i++) {
            char a = aCheck.toLowerCase().charAt(i);
            if (a == 'a') aCount++;
            }

        if (aCount > 0) System.out.println("This sentence has " + aCount + " A or a characters");
        else System.out.println("There are no A or a characters");

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        int foobar = ScannerHelper.getNumberFromUser();

        for (int i = 0; i <= foobar; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 3 == 0) System.out.println("Bar");
            else if (i % 2 ==0) System.out.println("Foo");
            else System.out.println(i);
        }

        System.out.println("\n\t-------TASK 04 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
