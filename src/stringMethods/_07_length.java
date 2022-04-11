package stringMethods;

public class _07_length {
    public static void main(String[] args) {
        /*
        Method Task: Counts the total number of characters in a String and returns its position as an int
        -It is a non-static method and can be called with object name
        -It is a return type method, and it returns an int (total number of characters/character position)
        -It does not take any arguments
         */

        String city = "Chicago";

        System.out.println(city.length()); // 7 letters
        System.out.println(city.length() + 3); // 7 letters + 3 spaces

        String company = "TechGlobal";
        int size = company.length(); // 10 letters

        System.out.println(size);
    }
}
