package whiteboard_mock3;

public class _08_Remove_Specials_From_String {

    public static String noSpecials (String str) {

        return str.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpecials("The price = $100.50"));
    }
}
