package exceptions;

public class Example03_CheckedException {
    public static void main(String[] args) {

        // Checked Exception --> Compiler time exception (requires immediate handling mechanism before code is run

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000); // 2s
                System.out.println(i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
