package exceptions;

public class Example02 {
    public static void main(String[] args) {

        int number = 45;


        try {
            // UNDEFINED, in Java, it's an exception
            System.out.println(number / 0); // ArithmeticException
        }
        catch (Exception intException) { // ArithmeticException will only catch arithmetic exceptions
            intException.printStackTrace();
        }

        System.out.println("End of Program");
    }
}
