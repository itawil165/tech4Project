package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        double random = Math.random(); // If not specified, it will randomize  0-0.9999...

        // Will multiply the default range 0*10=0 and 0.9999...*10=9.999999 --> 0-9.9999...
        double randomRangeIncrease = Math.random() * 10;

        // Casts the return to give an int | the *11 will give returns over 10 (0.9999...*11=~10.999...)
        double randomRangeIncreaseInt = (int) (Math.random() * 11);

        System.out.println(random);
        System.out.println(randomRangeIncrease);
        System.out.println(randomRangeIncreaseInt);

        double randomRangeIncrease10to20 = (int) ((Math.random() * 11) + 10); // Adds 10 to the default range
        System.out.println(randomRangeIncrease10to20);

        /*

        To increase the range, take the difference between the range and add 1
        103 - 346 --> 346 - 103 = 243 + 1 --> 244
        Then multiply it by the result
        (Math.random() * 244)


        To change the starting point of the range, add the desired increase to the whole equation
        103-346 --> 113-346
        (Math.random() * x) + 10 --> 113-356
        This will also increase the ending point by the same amount, so be careful!
        (Math.random() * [x - 10]) + 10 --> 113-356

        [ Math.random() * (end pt - start pt) + 1 ] + (start pt)

        */
    }
}
