package whiteboard_mock3;

public class _44_Reverse_Each_Word_In_A_String {

    public static String reversed (String sentence) {

        StringBuilder reversed = new StringBuilder();
        for (String word : sentence.split(" ")) {
            for (int i = word.length() - 1; i >= 0 ; i--) {
                reversed.append(word.charAt(i));
            }
            reversed.append(" ");
        }
        return reversed.toString();
    }

    public static void main(String[] args) {

        System.out.println(reversed("Java is fun"));
    }
}
