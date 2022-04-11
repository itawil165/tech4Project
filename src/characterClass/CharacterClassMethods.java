package characterClass;

public class CharacterClassMethods {
    public static void main(String[] args) {
        System.out.println(Character.isDigit('9')); // true

        System.out.println(Character.isUpperCase('a')); // false
        System.out.println(Character.isUpperCase('B')); // true

        System.out.println(Character.isLowerCase('G')); // false
        System.out.println(Character.isLowerCase('h')); // true

        System.out.println(Character.isLetter('l')); // true
        System.out.println(Character.isLetter('Z')); // true

        System.out.println(Character.isLetterOrDigit('5')); // true
        System.out.println(Character.isLetterOrDigit('t')); // true
        System.out.println(Character.isLetterOrDigit(' ')); // false

        System.out.println(Character.isWhitespace(' ')); // true
        System.out.println(Character.isSpaceChar(' ')); // true
    }
}
