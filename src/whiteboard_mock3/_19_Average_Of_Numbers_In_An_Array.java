package whiteboard_mock3;

public class _19_Average_Of_Numbers_In_An_Array {

    public static double arrAvg (double[] numArr) {

        double sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }

        return sum / numArr.length ;
    }

    public static void main(String[] args) {

        System.out.println(arrAvg(new double[]{1, 5, 4}));
    }
}
