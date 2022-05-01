package whiteboard_mock3;

public class _09_Remove_Vowels_From_String {

    public static String noVowel (String str) {

        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(noVowel("Hello World!"));
    }
}
