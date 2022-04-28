package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        /*
        Create a new txt file called objects
        Write below data in it:
            Computer
            Phone
            Table
            Chair
            Mouse
            Screen
            Remote
        Print objects that contain r or R
        EXPECTED OUTPUT
            Computer
            Chair
            Screen
            Remote
         */

        File objects = new File("objects.txt");

        try {
            objects.createNewFile();

            FileWriter objectWriter = new FileWriter("objects.txt"); // Also functions as a createNewFile();
            objectWriter.write("Computer\n");
            objectWriter.write("Phone\n");
            objectWriter.write("Table\n");
            objectWriter.write("Chair\n");
            objectWriter.write("Mouse\n");
            objectWriter.write("Screen\n");
            objectWriter.write("Remote");
            objectWriter.close();

            Scanner inputObjects = new Scanner(objects);

            while (inputObjects.hasNextLine()) {
                String next = inputObjects.nextLine();
                if (next.toLowerCase().contains("r")) {
                    System.out.println(next);
                }
            }

            Thread.sleep(5000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            objects.delete();
        }

        System.out.println("End of Program");
    }
}
