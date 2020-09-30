package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {
    public static void main(String args[]) {

        File file1 = new File("tesst.txt");

        // Try Catch blocks will 'try' the code within it, and if an exception occurs, code within the catch block will be executed.
        try {
            FileReader reader1 = new FileReader(file1);
            // Anything proceeding the line of code where exception thrown will not run.
            System.out.println("File Read");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file1.toString());
            System.out.println("Oh no! Anyway..");
        };

        System.out.println("Complete");
    }
}
