package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        // Java provides classes to create files

        File myFile = new File("myFirstFile.txt");

        try {
            System.out.println("Status of file before creation: " + myFile.exists()); // false
            System.out.println("File created: " + myFile.createNewFile());
            System.out.println("Status of file after creation: " + myFile.exists()); // true
            System.out.println("File name: " + myFile.getName());
            System.out.println("File absolute path: " + myFile.getAbsolutePath());
            System.out.println("Can file write? " + myFile.canWrite());
            System.out.println("Can file read? " + myFile.canRead());
            System.out.println("File size: " + myFile.length());


            Thread.sleep(10000);
            System.out.println(myFile.delete());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("File deleted");
    }
}
