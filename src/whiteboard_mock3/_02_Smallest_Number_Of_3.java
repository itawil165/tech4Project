package whiteboard_mock3;

import java.util.Arrays;
import java.util.TreeSet;

public class _02_Smallest_Number_Of_3 {

    public static int smallest1 (int a, int b, int c) {
        int smallest = Math.min(Math.min(a, b), c);

        return smallest;
    }

    public static int smallest2 (int a, int b, int c) {
        if (a <= b && a<= c) return a;
        else if (b <= a && b <= c) return b;
        else return c;
    }

    public static int smallest3 (int a, int b, int c) {
        int[] smaller = {a, b, c};

        Arrays.sort(smaller);

        return smaller[0];
    }

    public static int smallest4 (int a, int b, int c) {
        TreeSet<Integer> smaller = new TreeSet<>();
        smaller.add(a);
        smaller.add(b);
        smaller.add(c);

        return smaller.first();
    }

    public static void main(String[] args) {
        System.out.println(smallest1(2, 6, 1));
        System.out.println(smallest2(2, 6, 1));
        System.out.println(smallest3(2, 6, 1));
        System.out.println(smallest4(2, 6, 1));
    }

}
