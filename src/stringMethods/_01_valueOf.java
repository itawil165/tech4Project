package stringMethods;

import utilities.ScannerHelper;

public class _01_valueOf {
    public static void main(String[] args) {
        /*
        Method Task: Convert given variable to a String
        -it is static, and we call it with class name
        -it is a return type, and it returns a String
        -It takes different arguments as it is an overloaded method and converts given args to a String
         */

        int i = 5;
        // Convert to String
        String num = String.valueOf(i); // num = 5

        System.out.println(i + i); // 10
        System.out.println(num + num); // 55
        String st = "Hello World!";
        System.out.println(st.length());
    }
}
