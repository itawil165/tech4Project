package whiteboard_mock3;

public class _34_Count_Spaces_In_A_String {

    public static int countSpaces (String sentence) {

        int count = 0;

        for (char c : sentence.toCharArray()) {
            if (Character.isSpaceChar(c)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countSpaces("Java is fun"));
    }
}
