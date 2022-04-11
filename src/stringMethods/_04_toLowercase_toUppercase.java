package stringMethods;

public class _04_toLowercase_toUppercase {
    public static void main(String[] args) {
        /*
        Method Task: These methods are used to convert letters of a String to uppercase or lowercase
        -They are non-static methods that you can call with objects of String class
        -They are return type methods, and they return the modified String object back
        -They don't take any arguments
         */

        String str1 = "HELLO world 10$";

        // Change case as String is called
        System.out.println(str1); // HELLO world 10$
        System.out.println(str1.toLowerCase()); // hello world 10$
        System.out.println(str1.toUpperCase()); // HELLO WORLD 10$

        System.out.println("DFGSJJdfgk jdhfgsdflghis EW$TW%hjfij4856 erigldfk ".toUpperCase());


        String sentence = "I paid $100.99 to buy airpods";

        // Create String that changes case
        String str2 = sentence.toLowerCase(); // i paid $100.99 to buy airpods
        String str3 = sentence.toUpperCase(); // I PAID $100.99 TO BUT AIRPODS

        System.out.println(str2);
        System.out.println(str3);

        // Practice
        String str4 = sentence.toUpperCase(); // Use same sentence for test
        System.out.println(str4.toLowerCase().toUpperCase().toLowerCase()); //  <i paid $100.99 to buy airpods>
    }
}
