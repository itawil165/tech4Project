package stringMethods;

public class _03_equals_equalsIgnoreCase {
    public static void main(String[] args) {
        /*
        Method Task: It compares 2 strings with each other and tells if they are equal or not
        -It is non-static, and we call it with another String object
        -It is a return type and returns a boolean
        -It takes a String as an argument
        NOTE: This comparison is case-sensitive --> .equals()
        NOTE: This comparison is case-insensitive --> .equalsIgnoreCase()
         */

        System.out.println("Hello".equals("hello")); //false
        System.out.println("Hello".equalsIgnoreCase("hello")); // true
        System.out.println("Hello".equalsIgnoreCase(" hello")); // false

        String str1 = "Good";
        String str2 = "GOOD";

        boolean check = str1.equalsIgnoreCase(str2); // true
        System.out.println(check);
    }
}
