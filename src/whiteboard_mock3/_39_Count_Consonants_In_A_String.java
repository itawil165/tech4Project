package whiteboard_mock3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _39_Count_Consonants_In_A_String {

    public static int countConsonants1 (String sentence) {

        int count = 0;
        Pattern pattern = Pattern.compile("[a-zA-z&&[^aeiouAEIOU]]");

        for (char c : sentence.toCharArray()) {
            Matcher matcher = pattern.matcher(String.valueOf(c));
            if (matcher.matches()) count++;
        }
        return count;
    }

    public static int countConsonants2 (String sentence){

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.toLowerCase().charAt(i) != 'a' && sentence.toLowerCase().charAt(i) != 'e'
                    && sentence.toLowerCase().charAt(i) != 'i' && sentence.toLowerCase().charAt(i) != 'o'
                    && sentence.toLowerCase().charAt(i) != 'u' && sentence.charAt(i) != ' ') count++;

        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countConsonants1("Java is fun"));
        System.out.println(countConsonants2("Java is fun"));
    }
}
