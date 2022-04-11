package arrays;

import java.util.Arrays;

public class IntroToArrays {
    public static void main(String[] args) {

        String[] names = {"Alex", "Abe", "Yakeen"};
        int[] ages = {20, 21, 22};
        char[] favCharacters = {'A', '%', 'G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        // HOW TO PRINT ARRAY
        System.out.println(names); // [Ljava.lang.String;@1540e19d - Prints location where your collection is stored

        System.out.println(Arrays.toString(names)); // [Alex, Abe, Yakeen]


        // HOW TO GET A SINGLE ELEMENT FROM ARRAY

        String nameAt1 = names[1];
        System.out.println(nameAt1); // Abe
        System.out.println(names[0]); // Alex
     // System.out.println(names[5]); // ArrayIndexOutOfBoundsException


        // HOW TO UPDATE AN ELEMENT -> Abe-> Abraham
        names[1] = "Abraham";
        System.out.println(Arrays.toString(names)); //[Alex, Abraham, Yakeen]

        //HOW TO LOOP ARRAY USING FORI LOOP
        for (int i = 0; i <= 2; i++) {
            System.out.println(names[i] + " 's age is " + ages[i] + " and his fav char is " + favCharacters[i] + ".");
        }
    }
}














