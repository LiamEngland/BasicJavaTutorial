package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {
    public static void main(String args[]) {
        try {
            openFile();
        } catch(FileNotFoundException e) {
            System.out.println("Coule not open file.");
        }

    }

    public static void openFile() throws FileNotFoundException { // Error is thrown out of openFile.
        File file1 = new File("test.txt");
        FileReader reader1 = new FileReader(file1);
    }
}
