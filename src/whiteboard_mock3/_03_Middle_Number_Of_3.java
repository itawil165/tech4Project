package whiteboard_mock3;

import java.util.Arrays;

public class _03_Middle_Number_Of_3 {

    public static int middle1 (int a, int b, int c) {
        int[] mid = {a, b, c};

        Arrays.sort(mid);

        return mid[1];
    }

    /*
    public static int middle2 (int a, int b, int c) {
        TreeSet<Integer> mid = new TreeSet<>();

        mid.add(a);
        mid.add(b);
        mid.add(c);

        Object[] midArr = mid.toArray();

        return (int) midArr[1];
    }
    */

    public static void main(String[] args) {

        System.out.println(middle1(2, 6, 1));
        // System.out.println(middle2(2, 6, 1));
    }
}
