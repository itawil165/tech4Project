package primitives;

public class Long {
    public static void main(String[] args) {
            // dataType variable = data;
        long x = 35L;
        long y = 25L;
        System.out.println(y + x);

        long maxLong = 9223372036854775807L; // 0 and 1 to 9,223,372,036,854,775,807 (~9 quintillion)
        long minLong = -9223372036854775808L; // -9,223,372,036,854,775,8078 to -1 (~9 quintillion)
        System.out.println(maxLong);
        System.out.println(minLong);
    }
}
