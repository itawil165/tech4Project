package projects;


import utilities.ScannerHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project08 {
    public static void main(String[] args) {

// TASK 01

        List<String> multiWord = new ArrayList<>();
        multiWord.add("foo"); multiWord.add(""); multiWord.add(" "); multiWord.add("foo bar"); multiWord.add("java is fun"); multiWord.add(" ruby ");

        int multiCount = 0;

        for (String multi : multiWord) {
            if (multi.trim().contains(" ")) multiCount++;
        }

        System.out.println(multiCount);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        int[] nums1 = {2, -5, 6, 7, -10, -78, 0, 15};

        System.out.println(Arrays.toString(nums1));

        List<Integer> negativesRemoved = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] >= 0) negativesRemoved.add(nums1[i]);
        }

        System.out.println(negativesRemoved);

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        String password = ScannerHelper.getStringFromUser();

        int upperCount = 0, lowerCount = 0, digitCount = 0, specialCount = 0;

        if (password.length() < 8 || password.length() > 16 || password.contains(" ")) {
            System.out.println("This password is invalid");
        }
        else
        {
            for(int i=0; i < password.length(); i++)
            {
                char cPass = password.charAt(i);
                if(Character.isUpperCase(cPass)) upperCount++;
                else if(Character.isLowerCase(cPass)) lowerCount++;
                else if(Character.isDigit(cPass)) digitCount++;
                else specialCount++;
            }
        }

        if(upperCount > 0 && lowerCount > 0 && digitCount > 0 && specialCount > 0)
            System.out.println("This password is valid");
        else
            System.out.println("This password is invalid");

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 04

        int atCount = 0, beforeCount = 0, afterCount = 0, afterDotCount = 0;

        String email = ScannerHelper.getStringFromUser();
        String beforeAt = email.substring(0, email.indexOf('@'));
        String afterAt = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
        String afterDot = email.substring(email.indexOf('.') + 1);


        if (!email.contains("@") || email.contains(" ")) System.out.println("This email is invalid");
        else {
            for (int i = 0; i < email.length(); i++) {
                char cMail = email.charAt(i);
                if (cMail == '@') atCount++;
                if (beforeAt.length() > 1) beforeCount++;
                if (afterAt.length() > 1) afterCount++;
                if (afterDot.length() > 1) afterDotCount++;
            }
        }

        if (atCount > 0 && beforeCount > 0 && afterCount > 0 && afterDotCount > 0){
            System.out.println("This email is valid");
        }
        else System.out.println("This email is invalid");

        System.out.println("\n\t-------TASK 03 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
