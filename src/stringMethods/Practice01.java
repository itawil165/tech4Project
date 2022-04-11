package stringMethods;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {
        /*
        TASK 01
        Assume that you are given a String as below;
        String str = ”SDLC is step by step procedure to create an application”;
        Write a program to find length of given String and the indexes of “SDLC” and “application” words
         */

        String str1 = "SDLC is step-by-step procedure to create an application";

        System.out.println(str1.length());
        System.out.println(str1.indexOf("SDLC"));
        System.out.println(str1.indexOf("application"));

        System.out.println("\n\t-------TASK 01 END-------\n");

        /*
        TASK 02
        Assume that you are given a String as below;
        String str = “  I know how to code with Python  ”;
        •
        Write a program to manipulate given String and convert it to be:
        “I KNOW HOW TO CODE WITH JAVA”
         */

        String str2 = "  I know how to code with Python  ";

        System.out.println(str2.trim().toUpperCase().replace("PYTHON", "JAVA"));

        System.out.println("\n\t-------TASK 02 END-------\n");

        /*
        TASK 03
        Assume that you are given a String as below;
        String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
        1.Find the first character of given String which is not white space
        2.Find the last character of given String which is not white space
         */

        String str3 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();

        System.out.println(str3.charAt(0));
        System.out.println(str3.charAt(str3.length() - 1));

        System.out.println("\n\t-------TASK 03 END-------\n");

        /*
        TASK 04
        Assume you are given 3 Strings as below;
        String s1 = “  TECH ”;
        String s2 = “ glo  ”;
        String s3 = “ BAL       “;
        Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
        Note: The length of s4 will be 10 at the end!!!
         */

        String s1 = "  TECH ".trim().toLowerCase().replace("t", "T");
        String s2 = " glo  ".trim().replace("g", "G");
        String s3 = " BAL       ".trim().toLowerCase();

        String s4 = s1 + s2 + s3;

        System.out.println(s4);

        System.out.println("\n\t-------TASK 04 END-------\n");

        System.out.println("\n------------TASK-5------------\n");

        /*
        Write a program that asks user to enter their favorite color.
        Then, print the first and last characters of the color
        Also, print the first and last 3 characters of the color
        Test data:
        green
        Expected output:
        First character is = g
        Last character is = n
        First 3 characters are = gre
        Last 3 characters are = een
         */
        String color = ScannerHelper.getStringFromUser();

        System.out.println("First char in the color is = " + color.charAt(0)); // p
        System.out.println("Last char in the color is = " + color.charAt(color.length()-1)); // e
        System.out.println("First 3 chars in the is = " + color.substring(0, 3)); // pur
        System.out.println("Last 3 chars in the is = " + color.substring(color.length()-3)); // ple

        /*
        TASK 06
        Write a program that asks user to enter a full sentence
        Then, convert all sentence to lower case and print the first and last words in the given sentence
        Test data:
        JavA is an object-oriented programming LanguAGE
        Expected output:
        First word is = java
        Last word is = language
         */

        String sentence = ScannerHelper.getStringFromUser();

        System.out.println(sentence.substring(0, sentence.indexOf(' ')).toLowerCase());
        System.out.println(sentence.substring(sentence.lastIndexOf(' ') + 1).toLowerCase());



    }
}
