package exceptions;

public class Example03_Throws {
    public static void main(String[] args) throws InterruptedException {

        // throws keyword adds an exception to the entire method signature

        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000); // 2s
            System.out.println(i);
        }
    }
}
