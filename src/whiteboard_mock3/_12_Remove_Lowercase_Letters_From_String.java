package whiteboard_mock3;

public class _12_Remove_Lowercase_Letters_From_String {

    public static String noConsonants (String str) {

        return str.replaceAll("[a-z]", "");
    }

    public static void main(String[] args) {

        System.out.println(noConsonants("Hello World!"));
    }
}
