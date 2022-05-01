package whiteboard_mock3;

public class _29_Find_If_String_Is_Palindrome {

    public static boolean isPalindrome1 (String word) {

        boolean check = false;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.toLowerCase().charAt(i) == word.toLowerCase().charAt(word.length() - 1)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static boolean isPalindrome2 (String word) {
        return word.equals((new StringBuilder(word).reverse().toString()));
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome1("civic")); // a toyota works here
        System.out.println(isPalindrome2("kayak")); // a toyota does NOT work here
    }
}
