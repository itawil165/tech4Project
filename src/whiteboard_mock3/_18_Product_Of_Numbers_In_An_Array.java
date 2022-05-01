package whiteboard_mock3;

public class _18_Product_Of_Numbers_In_An_Array {

    public static int arrProd (int[] numArr) {

        int product = 1;

        for (int i = 0; i < numArr.length; i++) {
            product *= numArr[i];
        }

        return product;
    }

    public static void main(String[] args) {

        System.out.println(arrProd(new int[]{1, 5, 4}));
    }
}
