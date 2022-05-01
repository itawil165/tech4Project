package whiteboard_mock3;

public class _41_Count_Lower_Cases_In_A_String {

    public static int countLower (String sentence) {

        int count = 0;

        for (char c : sentence.toCharArray()) {
            if (Character.isLowerCase(c)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countLower("Java is fun"));
    }
}
