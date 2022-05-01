package whiteboard_mock3;

public class _04_Reverse_String {

    public static String reversed1 (String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += String.valueOf(str.charAt(i));
        }
        return reverse;
    }

    public static String reversed2 (String str) {

        return new StringBuilder(str).reverse().toString();
    }

    public static StringBuilder reversed3 (String str) {

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));

        }
        return reversed;
    }

    public static void main(String[] args) {

        System.out.println(reversed1("Hello"));
        System.out.println(reversed2("Hello"));
        System.out.println(reversed3("Hello"));
    }
}
