package file_handling;

import java.io.File;
import java.io.FileWriter;

public class WriteData {
    public static void main(String[] args) {

        File studentList = new File("studentList.txt");

        try {
            System.out.println(studentList.createNewFile());
            Thread.sleep(5000);

            // Write some info in the created file
            FileWriter fileWriter = new FileWriter("studentList.txt");
            fileWriter.write("Abe\n");
            fileWriter.write("Vita\n");
            fileWriter.write("Torrie\n");
            fileWriter.write("Taylor");
            fileWriter.close();

            Thread.sleep(5000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            studentList.delete();
        }

        System.out.println("File created, updated then deleted");
    }
}
