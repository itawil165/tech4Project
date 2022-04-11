package loops.forLoops;

public class PrintCharsFromString {
    public static void main(String[] args) {
        /*
        Write a Java program to print each character of given String in a separate line:
            String str = “TechGlobal School”;

        firstChar = charAt(0)
        lastChar  = charAt(str.length())
         */

        String str = "TechGlobal School";

        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
}
