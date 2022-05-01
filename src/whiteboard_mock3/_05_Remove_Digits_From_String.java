package whiteboard_mock3;

public class _05_Remove_Digits_From_String {

    public static String noDigits (String str) {

        return str.replaceAll("[0-9]", "");
    }

    public static void main(String[] args) {
        System.out.println(noDigits("a1b2c3"));
    }
}
