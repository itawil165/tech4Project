package whiteboard_mock3;

public class _10_Remove_Consonants_From_String {

    public static String noConsonants (String str) {

        return str.replaceAll("[a-zA-Z&&[^AEIOUaeiou]]", "");
    }

    public static void main(String[] args) {

        System.out.println(noConsonants("Hello World!"));
    }
}
