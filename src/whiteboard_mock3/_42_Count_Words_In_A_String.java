package whiteboard_mock3;

public class _42_Count_Words_In_A_String {

    public static int countWords1 (String sentence) {

        int count = 0;

        for (char c : sentence.toCharArray()) {
            if (Character.isSpaceChar(c)) count++;
        }
        return count + 1;
    }

    public static int countWords2 (String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        System.out.println(countWords1("Java is fun"));
        System.out.println(countWords2("Java is fun"));
    }
}
