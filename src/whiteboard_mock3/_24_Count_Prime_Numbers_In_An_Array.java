package whiteboard_mock3;

public class _24_Count_Prime_Numbers_In_An_Array {

    public static int countPrimes (int[] nums) {

        int count = 0;
        for (int num : nums) {
            if(num == 2 || num == 3) count++;
            else if (num > 3){
                boolean prime = true;
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countPrimes(new int[]{3, -5, 4, 11, 2}));
    }
}
