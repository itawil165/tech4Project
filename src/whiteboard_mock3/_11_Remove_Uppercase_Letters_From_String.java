package whiteboard_mock3;

public class _11_Remove_Uppercase_Letters_From_String {

    public static String noConsonants (String str) {

        return str.replaceAll("[A-Z]", "");
    }

    public static void main(String[] args) {

        System.out.println(noConsonants("Hello World!"));
    }
}
