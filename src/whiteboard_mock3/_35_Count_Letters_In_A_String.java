package whiteboard_mock3;

public class _35_Count_Letters_In_A_String {

    public static int countLetters (String sentence) {

        int count = 0;

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countLetters("Java is fun"));
    }
}
