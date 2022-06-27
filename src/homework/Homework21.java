package homework;

public class Homework21 {

    // TASK 01
    public static void fizzBuzz1 (int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) System.out.print("FizzBuzz, ");
            else if (i % 3 == 0) System.out.print("Fizz, ");
            else if (i % 5 == 0) System.out.print("Buzz, ");
            else System.out.print(i + ", ");
        }
        System.out.println();
    }

    // TASK 02
    public static String fizzBuzz2 (int num){
        String str = "";
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) str = "FizzBuzz";
            else if (i % 3 == 0) str = "Fizz";
            else if (i % 5 == 0) str = "Buzz";
            else str = String.valueOf(num);
        }
        return str;
    }

    // TASK 03
    public static int findSumNumbers (String str){
        int sum = 0;
        String temp = "0";
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))) temp += str.charAt(i);
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }return sum + Integer.parseInt(temp);
    }

    // TASK 04
    public static int findBiggestNumber (String str){
        int max = 0;
        String temp = str.replaceAll("[^\\d]", " ");
        String[] temp2 = temp.replaceAll("[\\s]+", " ").split(" ");
        for (String element: temp2){
            if (!element.isEmpty()){
                if (Integer.parseInt(element) > max) max = Integer.parseInt(element);
            }
        }
        return max;
    }

    // TASK 05
    public static String countSequenceOfCharacters (String str){
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
            }
            else {
                count ++;
                result.append(count).append(str.charAt(i));
                count = 0;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        // TASK 01
        fizzBuzz1(5);

        // TASK 02
        System.out.println(fizzBuzz2(5));

        // TASK 03
        System.out.println(findSumNumbers("a1b4c 6#"));

        // TASK 04
        System.out.println(findBiggestNumber("a1b4c 6#"));

        // TASK 05
        System.out.println(countSequenceOfCharacters("abbcca"));
    }
}
