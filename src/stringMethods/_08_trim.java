package stringMethods;

public class _08_trim {
    public static void main(String[] args) {
        /*
        Method Task: It is used to remove blank spaces from both ends of a String
        -It is non-static, and we can call with object name
        -It is return type and return a String
        -It does not take any argument
        NOTE: trim() method will not remove any space between words,
        it only removes spaces before and after the first and last chars in the String
         */

        String str = "    Hello   ";

        System.out.println(str); //     Hello
        System.out.println(str.length()); // 12
        System.out.println(str.trim()); // Hello
        System.out.println(str.trim().length()); // 5 --> trim then ask for length

        // Does not remove spaces in between words
        String str2 = "   Good      Morning    ";
        String str3 = str2.trim();

        System.out.println(str3); // Good      Morning
    }
}
