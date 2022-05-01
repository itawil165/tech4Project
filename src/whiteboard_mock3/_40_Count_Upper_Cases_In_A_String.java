package whiteboard_mock3;

public class _40_Count_Upper_Cases_In_A_String {

    public static int countUpper (String sentence) {

        int count = 0;

        for (char c : sentence.toCharArray()) {
            if (Character.isUpperCase(c)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countUpper("Java is fun"));
    }
}
