package whiteboard_mock3;

public class _07_Remove_Letters_From_String {

    public static String noLetters (String str) {

        return str.replaceAll("[a-zA-Z]", "");
    }

    public static void main(String[] args) {

        System.out.println(noLetters("It is 8 o'clock"));
    }
}
