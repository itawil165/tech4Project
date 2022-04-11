package utilities;

public class CharacterHelper {

    // TASK 1 -- space
    public static boolean isSpace(char space){
        return space == 32;
    }
    // TASK 2 -- digit
    public static boolean isDigit(char digit){
        return digit >= 48 && digit <= 58;
    }
    // TASK 3 -- uppercase letter
    public static boolean isUppercase(char upper){
        return (upper >= 65 && upper <= 90);
    }
    // TASK 4 -- lowercase letter
    public static boolean isLowercase(char lower){
        return (lower >= 97 && lower <= 122);
    }
    // TASK 5 -- letter
    public static boolean isLetter(char letter){
        return isUppercase(letter) || isLowercase(letter);
    }
    // TASK 6 -- vowel
    public static boolean isVowel(char vowel){
        return vowel == 65 || vowel == 69 || vowel == 73 || vowel == 79 || vowel == 85 ||     // All ASCII vowel values
                vowel == 97 || vowel == 101 || vowel == 105 || vowel == 111 || vowel == 117;
    }
    // TASK 7 -- consonant
    public static boolean isConsonant(char consonant){
        return isLetter(consonant) && !isVowel(consonant);

    }

}
