package whiteboard_mock3;

public class _37_Count_Specials_In_A_String {

    public static int countSpecials (String sentence) {

        int count = 0;

        for (char c : sentence.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countSpecials("The date is 04/30/2022"));
    }
}
