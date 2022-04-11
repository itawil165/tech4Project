package stringMethods;

import utilities.ScannerHelper;

public class _11_contains {
    public static void main(String[] args) {
        /*
        Method Task: It is used to find out if a String contains another string or character
        -It is non-static, and we can call it with an object
        -it is a return type, and it returns a boolean
        -It takes a String argument
        NOTE: This method is case-sensitive
         */

        String str = "Good Morning!";

        System.out.println(str.contains("Good")); // true
        System.out.println(str.contains("")); // true
        System.out.println(str.contains("123")); // false
        System.out.println(str.contains(str)); // true

        /*
        Ask user to enter an address
        If address contains "chicago" in any way, then print "You are in the club"
        else, print "You are not in the club"

        Chicago, CHICAGO, cHIcaGO

        123 abc st, chicago IL 12345 -> You are in the club
        123 abc st, CHicagO IL 12345 -> You are in the club
        123 abc st, Des Plaines IL 12345 -> You are not in the club
        2*2*2*2
         */

        String address = ScannerHelper.getStringFromUser();

        // changes input to all lowercase in case input had mixed cases
        if (address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else System.out.println("You are not in the club");

        // changes input to all uppercase in case input had mixed cases
        if (address.toUpperCase().contains("CHICAGO")) System.out.println("You are in the club");
        else System.out.println("You are not in the club");

        // same as above using ternary operators
        System.out.println(address.toLowerCase().contains("chicago") ? "You are in the club" : "You are not in the club");
        System.out.println(address.toUpperCase().contains("CHICAGO") ? "You are in the club" : "You are not in the club");
    }
}
