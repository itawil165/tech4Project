package whiteboard_mock3;

public class _36_Count_Digits_In_A_String {

    public static int countDigits (String sentence) {

        int count = 0;

        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countDigits("Happy 2022!"));
    }
}
