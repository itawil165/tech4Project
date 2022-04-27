package exceptions;

public class ExceptionsIntro {
    public static void main(String[] args) {

        // unchecked exception --> Runtime exception (once program is ran)

        String name = "John"; // 0 1 2 3 --> 4 indexes

        // How to handle the exception
        try {
            System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException --> unchecked exception
        }
        catch (StringIndexOutOfBoundsException exception) {
            System.out.println("An exception has been found");
        }

        System.out.println("End of Program");
    }
}
