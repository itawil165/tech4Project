package stringMethods;

public class _02_concat {
    public static void main(String[] args) {
        /*
        Method Task: It is used to combine multiple strings, and forms a new one
        -It is non-static, and we can call it with object name
        -It is a return type method, and it returns a new String that is the combination of others
        -It takes String as an argument
         */

        String str1 = "Tech"; // String object
        String str2 = "Global"; // String object

        // Combining by concat
        String str3 = str1.concat(str2); // String str3 = str1 + str2; // TechGlobal

        System.out.println(str3.concat(" School")); // TechGlobal School

        System.out.println("Hello".concat(" World!")); // Hello World!
        System.out.println("Hello".concat(" ").concat("World!")); // Hello World!
        System.out.println("Hello".concat(" ") + "World!"); // Hello World!

    }
}
