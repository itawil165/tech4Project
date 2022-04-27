package exceptions;

import java.util.ArrayList;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            ArrayList<String> objects = new ArrayList<>();
            objects.add("Computer");
            objects.add("Mouse");
            objects.add("Monitor");

            for (String object : objects) {
                objects.remove(object); // ConcurrentModificationException
            }
        }
        catch (Exception arrayException) {
            arrayException.printStackTrace();
        }
        finally { // will always be executed even if there is no exception but will NOT resolve the exception
            System.out.println("Exception has been reported");
        }

        System.out.println("End of Program");
    }
}
