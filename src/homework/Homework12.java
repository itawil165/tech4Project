package homework;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

// TASK 01

        int[] numbers1 = new int[10];

        numbers1[2] = 23; numbers1[4] = 12; numbers1[7] = 34; numbers1[9] = 7; numbers1[6] = 15; numbers1[0] = 89;

        System.out.println(numbers1[3]);
        System.out.println(numbers1[0]);
        System.out.println(numbers1[9]);
        System.out.println(Arrays.toString(numbers1));

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        String[] letters = new String[5];

        letters[1] = "abc"; letters[4] = "xyz";

        System.out.println(letters[3]);
        System.out.println(letters[0]);
        System.out.println(letters[4]);
        System.out.println(Arrays.toString(letters));

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        int[] numbers2 = {23,-34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogs));

        boolean hasPluto = false;

        for (String object : dogs) {
            if (object.equalsIgnoreCase("pluto")) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 06

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        boolean hasGarfieldAndFelix = false;

        for (String object : cats){
            if (object.equalsIgnoreCase("Garfield") && object.equalsIgnoreCase("Felix")){
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasGarfieldAndFelix);

        System.out.println("\n\t-------TASK 06 END-------\n");

// TASK 07

        double[] doubles = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(doubles));

        for (int i = 0; i <= doubles.length - 1; i++) {
            System.out.println(doubles[i]);
        }

        System.out.println("\n\t-------TASK 07 END-------\n");

// TASK 08

        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int letterCount = 0, lowerCount1 = 0, upperCount1 = 0, digitCount = 0, specialCount = 0;

        System.out.println(Arrays.toString(chars));

        for (char character : chars) {
            if (Character.isLetter(character)) {
                letterCount++;
                if (Character.isUpperCase(character)) upperCount1++;
                else lowerCount1++;
            }
            else if (!Character.isLetter(character)) {
                if (Character.isDigit(character)) digitCount++;
                else specialCount++;
            }
        }
        System.out.println("Letters = " + letterCount);
        System.out.println("Uppercase letters = " + upperCount1);
        System.out.println("Lowercase letters = " + lowerCount1);
        System.out.println("Digits = " + digitCount);
        System.out.println("Special characters = " + specialCount);

        System.out.println("\n\t-------TASK 08 END-------\n");

// TASK 09

        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        int upperCount2 = 0, lowerCount2 = 0, startsWithBP = 0, bookOrPen = 0;

        System.out.println(Arrays.toString(objects));

        for (String object : objects) {
            if (Character.isUpperCase(object.charAt(0))) upperCount2++;
            else lowerCount2++;

            if (object.toLowerCase().startsWith("b") || object.toLowerCase().startsWith("p")) startsWithBP++;

            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) bookOrPen++;
        }

        System.out.println("Elements that start with uppercase = " + upperCount2);
        System.out.println("Elements that start with lowercase = " + lowerCount2);
        System.out.println("Elements that start with B or P = " + startsWithBP);
        System.out.println("Elements that have \"book\" or \"pen\" = " + bookOrPen);

        System.out.println("\n\t-------TASK 09 END-------\n");

// TASK 10

        int[] numbers3 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        int moreThan10 =0, lessThan10 = 0, equals10 = 0;

        System.out.println(Arrays.toString(numbers3));

        for (int number : numbers3) {
            if (number > 10) moreThan10++;
            else if (number < 10) lessThan10++;
            else equals10++;
        }

        System.out.println("Elements that are greater than 10 = " + moreThan10);
        System.out.println("Elements that are less than 10 = " + lessThan10);
        System.out.println("Elements that are equal to 10 = " + equals10);

        System.out.println("\n\t-------TASK 10 END-------\n");

// TASK 11

        int[] group1 = {5, 8, 13, 1, 2};
        int[] group2 = {9, 3, 67, 1, 0};
        int[] group3 = new int[5];

        for (int i = 0; i < group3.length; i++) {
            group3[i] = Math.max(group1[i], group2[i]);
        }

        System.out.println("The 1st array is = " + Arrays.toString(group1));
        System.out.println("The 1st array is = " + Arrays.toString(group2));
        System.out.println("The 1st array is = " + Arrays.toString(group3));

        System.out.println("\n\t-------TASK 11 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
