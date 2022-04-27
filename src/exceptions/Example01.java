package exceptions;

public class Example01 {
    public static void main(String[] args) {

        String[] names = {"Alex", "John", "Max"};
        try {
            System.out.println(names[100]); // ArrayIndexOutOfBoundsException
        }
        catch (Exception arrayException) { // ArrayIndexOutOfBoundException will only catch Array Index exceptions
            arrayException.printStackTrace(); // shows exception in output but still runs program
        }
        System.out.println("End of Program");
    }
}
