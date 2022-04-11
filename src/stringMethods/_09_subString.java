package stringMethods;

public class _09_subString {
    public static void main(String[] args) {
        /*
        Method Task: They are used to extract a substring from a larger string
        -They are non-static, and we call them with object name
        -They are return type, and they return another string
        -There are 2 overloaded substring methods
            1. substring(int beginIndex)
               -This method takes beginning index as an argument, and it extracts a substring starting from given index
               to the end of the String
            2. substring(int beginIndex, int endIndex)
               -This method takes 2 args to define which index to start from and which index to stop at extracting
               a substring
         NOTE: beginIndex is inclusive but endIndex is exclusive
         NOTE: if your beginIndex is equal to endIndex, then it will return empty string
         NOTE: if your beginIndex is less than endIndex, then it will throw StringIndexOutOfBoundsException
         */

        String result = "About 3,520,000,000 results (0.82 seconds)"; // taken from Google search page

        String num = result.substring(6, 19); //3,520,000,000

        System.out.println(num);
        System.out.println();

        // Use the substring method to get "(0.82 seconds)"
        System.out.println(result.substring(28, 42)); //   from 28th position to the 42nd
        System.out.println(result.substring(28, result.length())); //   from 28th position to the String length (42)
        System.out.println(result.substring(28)); //   from 28th position to the end of String since no end was given

        System.out.println("\n-------GET CREATIVE-------\n");
        // takes the index of '(' which is 28 then to the end
        System.out.println(result.substring(result.indexOf('(')));
        System.out.println(result.substring(result.lastIndexOf('(')));
        // takes the index of the length of the String and subtracts 14 positions
        System.out.println(result.substring(result.length() - 14));
        // takes the index of 'results' and adds 8 positions
        System.out.println(result.substring(result.indexOf("results") + 8));


        String name = "Lionel";

        System.out.println(name.substring(3, 4)); // "n" name.charAt(3) gives same result
    }
}
