package homework;

import utilities.ScannerHelper;

public class Homework10 {
    public static void main(String[] args) {

// TASK 01

        String str1 = ScannerHelper.getStringFromUser();

        if (str1.length() > 0){
            System.out.println("The length of the String is = " + str1.length());
            System.out.println("The first character in the String is = " + str1.charAt(0));
            System.out.println("The last character in the String is = " + str1.charAt(str1.length() - 1));

            if (str1.contains("a") || str1.contains("e") || str1.contains("i") ||
                    str1.contains("o") || str1.contains("u")){
                System.out.println("This String contains a vowel.");
            }
            else System.out.println("This String does not contain a vowel");
        }
        else System.out.println("The length of the String is zero");

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        String str2 = ScannerHelper.getStringFromUser();

        if (str2.length() >= 3){
            System.out.println("The middle character(s) is(are) = " + ScannerHelper.getMiddle(str2));
        }
        else System.out.println("The length of the String is less than 3 characters long");

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        String str3 = ScannerHelper.getStringFromUser();


        if (str3.length() >= 4){
            System.out.println("The first letters are = " + str3.substring(0, 2));
            System.out.println("The last letters are = " + str3.substring(str3.length() - 2));
            System.out.println("The middle letters are = " + str3.substring(2, str3.length() - 2));
        }
        else System.out.println("INVALID INPUT!!!");

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        String str4 = ScannerHelper.getStringFromUser();

        String first2 = str4.substring(0, 2);
        String last2 = str4.substring(str4.length() - 2);

        if (str4.length() >= 2){
            if (first2.equalsIgnoreCase(last2)){
                System.out.println("True");
            }
            else System.out.println("False");

        }
        else System.out.println("The length of the String is less than 2 characters long");

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        String str51 = ScannerHelper.getStringFromUser();
        String str52 = ScannerHelper.getStringFromUser();

        String replaced1 = str51.replace("" + str51.charAt(0), "")
                .replace("" + str51.charAt(str51.length() -1), "");
        String replaced2 = str52.replace("" + str52.charAt(0), "")
                .replace("" + str52.charAt(str52.length() -1), "");


        if (str51.length() >= 2 && str52.length() >= 2){
            System.out.println(replaced1 + replaced2);
        }
        else System.out.println("INVALID INPUT!!!");

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        String str6 = ScannerHelper.getStringFromUser();

        if (str6.length() >= 4){
            if (str6.toLowerCase().startsWith("xx") && str6.toLowerCase().endsWith("xx")){
                System.out.println(true);
            }
            else System.out.println(false);
        }
        else System.out.println("INVALID INPUT!!!");

        System.out.println("\n\t-------TASK 06 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
