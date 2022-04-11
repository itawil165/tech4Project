package homework;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {

// TASK 1

        String name = ScannerHelper.getNameFromUser();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name is = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name is = " + name.substring(name.length() - 3));

        if(name.startsWith("a") || name.startsWith("A")){
            System.out.println("You are in the club!");
        }
        else System.out.println("Sorry, you are not in the club...");

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 2
        
        String address = ScannerHelper.getAddressFromUser();

        if (address.toLowerCase().contains("chicago")){
            System.out.println("You are in the club!");
        }
        else if (address.toLowerCase().contains("des plaines") || address.toLowerCase().contains("desplaines")){
            System.out.println("You are welcome to join the club.");
        }
        else System.out.println("Sorry, you will never be in the club.");

        System.out.println("\n\t-------TASK 02 END-------\n");


// TASK 03

        String colors = ScannerHelper.getStringFromUser();

        if (colors.toLowerCase().contains("green") && colors.toLowerCase().contains("red")){
            System.out.println("Green and red are in the list");
        }
        else if (colors.toLowerCase().contains("green") || colors.toLowerCase().contains("red")){
            if (colors.toLowerCase().contains("green")) System.out.println("Green is in the list");
            else if (colors.toLowerCase().contains("red")) System.out.println("Red is in the list");
            else System.out.println("Green and red are NOT in the list");
        }
        else System.out.println("Neither green nor red are in the list");

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        String str = "          Java is FUN          ";
        System.out.println(str);
        System.out.println();

        String first = str.trim().toLowerCase().substring(0, 4);
        System.out.println("The first word in the String is: " + first);

        String second = str.trim().toLowerCase().substring(5, 7);
        System.out.println("The second word in the String is: " + second);

        String third = str.trim().toLowerCase().substring(8, 11);
        System.out.println("The third word in the String is: " + third);

        System.out.println("\n\t-------TASK 04 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
