package utilities;

public class MathHelper {

// Max/Min as various data types
    public static byte maxOf3Byte(byte var1, byte var2, byte var3) {
        return (byte) Math.max(Math.max(var1, var2), var3);
    }
    public static byte minOf3Byte(byte var1, byte var2, byte var3) {
        return (byte) Math.min(var1, Math.min(var2, var3));
    }

    public static int maxOf3Int(int var1, int var2, int var3) {
        return Math.max(Math.max(var1, var2), var3);
    }
    public static int minOf3Int(int var1, int var2, int var3) {
        return Math.min(var1, Math.min(var2, var3));
    }

    public static double maxOf3Doubles(double var1, double var2, double var3){
        return Math.max(var1, Math.max(var2, var3));
    }
    public static double minOf3Doubles(double var1, double var2, double var3){
        return Math.max(var1, Math.max(var2, var3));
    }

// Number Randomizer
    public static int getRandom(int start, int end, int rangeStart){
        return (int) (Math.random() * (end - start + 1) + rangeStart);
    }

// Number Averages
    public static int getAvg(int a, int b, int c, int d){
        return (a + b + c + d) / 4;
    }

// Even or Odd
    public static boolean isEven(int a){
        return a % 2 == 0;
    }

// Positive or Negative
    public static boolean isPositive(int a){
        return a > 0;
    }

}
