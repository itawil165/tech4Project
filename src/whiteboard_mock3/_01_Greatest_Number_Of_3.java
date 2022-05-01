package whiteboard_mock3;

import java.util.Arrays;
import java.util.TreeSet;

public class _01_Greatest_Number_Of_3 {

    public static int greatest1 (int a, int b, int c){

        int greater = Math.max(Math.max(a, b), c);

        return greater;
    }

    public static int greatest2 (int a, int b, int c) {

        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static int greatest3 (int a, int b ,int c) {
        int[] greater = {a, b, c};

        Arrays.sort(greater);

        return greater[greater.length - 1];
    }

    public static int greatest4 (int a, int b, int c) {

        TreeSet<Integer> greater = new TreeSet<>();
        greater.add(a);
        greater.add(b);
        greater.add(c);

        return greater.last();
    }


    public static void main(String[] args) {
        System.out.println(greatest1(2, 6, 1));
        System.out.println(greatest2(2, 6, 1));
        System.out.println(greatest3(2, 6, 1));
        System.out.println(greatest4(2, 6, 1));
    }
}
