package homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework22 {

    // TASK 01
    public static int[] fibonacciSeries1 (int n) {
        int[] fibArr = new int[n];
        fibArr[0] = 0;
        fibArr[1] = 1;

        for (int i = 2; i < n; i++)
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
        return fibArr;
    }

    // TASK 02

    public static int fibonacciSeries2 (int n) {

        int n0 = 0, n1 = 1, sum = 0;

        for (int i = 2; i < n; i++) {

            sum = n0 + n1;
            n0 = n1;
            n1 = sum;
        }
        return sum;
    }

    // TASK 03
    public static int[] findUniques (int[] a, int[] b) {

        Set<Integer> duplicates = new HashSet<>();

        for (Integer firstArr : a) {
            for (Integer secondArr : b) {
                if (firstArr == secondArr) duplicates.add(firstArr);
            }
        }

        Set<Integer> nonDuplicates = new HashSet<>();

        for (int i : a) if (!duplicates.contains(i)) nonDuplicates.add(i);
        for (int i : b) if (!duplicates.contains(i)) nonDuplicates.add(i);


        int[] nonDupArr = new int[nonDuplicates.size()];
        int index = 0;
        for (Integer noDupes : nonDuplicates) nonDupArr[index++] = noDupes;

        return nonDupArr;
    }

    // TASK 04
    public static boolean isPowerOf3 (int num) {

        if (num < 1) return false;
        double dblNum = num;
        while (dblNum % 3 == 0) {
            dblNum /= 3;
        }
        return dblNum == 1.0;
    }

    // TASK 05
    public static int firstDuplicate (int[] nums) {
        int[] dupe = {-1, Integer.MAX_VALUE};

        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] == nums[j] && j - i < dupe[1]){
                    dupe[1] = j - i;
                    dupe[0] = nums[i];
                }
        return dupe[0];
    }


    public static void main(String[] args) {

        // TASK 01
        System.out.println(Arrays.toString(fibonacciSeries1(8)));

        // TASK 02
        System.out.println(fibonacciSeries2(8));

        // TASK 03
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3}, new int[]{1, 3, 5, 6, 2})));

        // TASK 04
        System.out.println(isPowerOf3(27));

        // TASK 05
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 7, 7, 8, 2, 7, 9, 7, 2}));
    }
}

