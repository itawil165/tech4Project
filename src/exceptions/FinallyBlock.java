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

        System.out.println("End of Program");
    }
}
