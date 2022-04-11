package utilities;

import java.util.Scanner;

public class ScannerHelper {

    // Get String input from a user
    public static String getStringFromUser(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        return userInput.nextLine();
    }
    public static String getNameFromUser() {
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        return name.nextLine();
    }
    public static String getAddressFromUser(){
        Scanner address = new Scanner(System.in);
        System.out.println("Please enter an address: ");
        return address.nextLine();
    }
    public static int getNumberFromUser(){
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        return number.nextInt();
    }

    // Get middle letter from String input
    public static String getMiddle(String str){
        if(str.length() % 2 == 0)
        return "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2); // if even characters
        return "" + str.charAt(str.length()/2); // if odd characters
    }
}
