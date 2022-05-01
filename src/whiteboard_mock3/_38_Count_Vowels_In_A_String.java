package whiteboard_mock3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _38_Count_Vowels_In_A_String {

    public static int countVowels1 (String sentence) {

        int count = 0;
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");

        for (char c : sentence.toCharArray()) {
            Matcher matcher = pattern.matcher(String.valueOf(c));
            if (matcher.matches()) count++;
        }
        return count;
    }

    public static int countVowels2 (String sentence) {

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.toLowerCase().charAt(i) == 'a' || sentence.toLowerCase().charAt(i) == 'e'
                    || sentence.toLowerCase().charAt(i) == 'i' ||sentence.toLowerCase().charAt(i) == 'o'
                    || sentence.toLowerCase().charAt(i) == 'u') count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countVowels1("Java is fun"));
        System.out.println(countVowels2("Java is fun"));
    }
}
