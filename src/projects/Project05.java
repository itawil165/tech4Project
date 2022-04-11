package projects;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class Project05 {
    public static void main(String[] args) {

// TASK 01

        String userInput1 = ScannerHelper.getStringFromUser();

        if (userInput1.length() >= 8) {
            String firstThree = userInput1.substring(0, 4);
            String lastThree = userInput1.substring(userInput1.length() - 4);
            String mid1 = userInput1.substring(4, userInput1.length() - 4);

            String letterSwap = lastThree + mid1 + firstThree;

            System.out.println(letterSwap);
        }
        else System.out.println("The entered String is too short! It must be more than 8 characters.");

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        String userInput2 = ScannerHelper.getStringFromUser();

        if (userInput2.contains(" ")){
            String firstWord = userInput2.substring(0, userInput2.indexOf(" "));
            String lastWord = userInput2.substring(userInput2.lastIndexOf(" ") + 1);
            String mid2 = userInput2.substring(userInput2.indexOf(" "), userInput2.lastIndexOf(" ") + 1);

            String wordSwap = lastWord + mid2 + firstWord;

            System.out.println(wordSwap);
        }
        else System.out.println("The entered String is too short! It must be more than 2 words.");

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        String userInput3 = ScannerHelper.getStringFromUser();

        if (userInput3.toLowerCase().contains("stupid") || userInput3.toLowerCase().contains("idiot")){
            System.out.println("You shouldn't use words like that. Be positive!");

            if (userInput3.toLowerCase().contains("stupid")){
                System.out.println(userInput3.toLowerCase().replace("stupid", "nice"));
            }
            else if (userInput3.toLowerCase().contains("idiot")){
                System.out.println(userInput3.toLowerCase().replace("idiot", "nice")
                        .toLowerCase().replace(" an", ""));
            }
        }
        else System.out.println("No negativity! Great job!");

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        String userInput4 = ScannerHelper.getNameFromUser();

        if (userInput4.length() <= 2) System.out.println("Invalid input! Please re-enter your name.");
        else if (userInput4.length() % 2 == 1) System.out.println("" + userInput4.charAt(userInput4.length()/2));
        else System.out.println(("" + userInput4.charAt(userInput4.length()/2-1)) + ("" + userInput1.charAt(userInput4.length()/2)));

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 05

        String userInput5 = ScannerHelper.getStringFromUser();

        if (userInput5.length() <= 5) System.out.println("Invalid input! Please re-enter the country.");
        else System.out.println(userInput5.replace(userInput5.substring(0, 2), "").replace(userInput5.substring(userInput5.length() - 2), ""));

        System.out.println("\n\t-------TASK 05 END-------\n");


// TASK 06

        String userInput6 = ScannerHelper.getAddressFromUser();

        if (userInput6.toLowerCase().contains("a") || userInput6.toLowerCase().contains("e") || userInput6.toLowerCase().contains("i") || userInput6.toLowerCase().contains("o") || userInput6.toLowerCase().contains("u")){
            System.out.println(userInput6.toLowerCase().replace("a", "*").replace("e", "#").replace("i", "+").replace("o", "@").replace("u", "$"));
        }
        else System.out.println("You cheeky bastard"); // for fun in case someone wants to be a smartypants

        System.out.println("\n\t-------TASK 06 END-------\n");

// TASK 07

        // Generate random numbers
        int random1 = MathHelper.getRandom(0, 25, 0),
                random2 = MathHelper.getRandom(0, 25, 0);

        // Manipulate the outputs so that the range can work in the loop
        int maxRan = Math.max(random1, random2),
                minRan = Math.min(random1, random2);

        System.out.println("The generated range is between " + minRan + " and " + maxRan);

        for (int i = minRan; i <= maxRan; i++){
            if (i % 5 != 1) System.out.print(i + ", ");
        }

        System.out.println("\n\t-------TASK 07 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
